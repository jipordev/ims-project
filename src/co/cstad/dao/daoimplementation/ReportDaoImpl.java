package co.cstad.dao.daoimplementation;

import co.cstad.dao.ReportDao;
import co.cstad.model.ItemDTO;
import co.cstad.model.ReportDTO;
import co.cstad.util.DbSingleton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class ReportDaoImpl implements ReportDao {

    private final Connection connection;
    public ReportDaoImpl(){
        connection = DbSingleton.instance();
    }


    @Override
    public List<ReportDTO> selectStockIn() {
        String sql = "SELECT * FROM stock_in";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<ReportDTO> reportDTOS = new ArrayList<>();
            while (resultSet.next()) {
                ReportDTO reportDTO = new ReportDTO();
                reportDTO.setStockInId(resultSet.getLong("stock_in_id"));
                reportDTO.setQty(resultSet.getInt("qty"));
                reportDTO.setStockInDate(resultSet.getDate("stock_in_date").toLocalDate());
                reportDTO.setPriceIn(resultSet.getBigDecimal("price_in"));
                reportDTO.setItemId(resultSet.getLong("item_id"));
                reportDTOS.add(reportDTO);
            }
            return reportDTOS;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public List<ReportDTO> selectStockOut() {
        String sql = "SELECT * FROM stock_out";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<ReportDTO> reportDTOS = new ArrayList<>();
            while (resultSet.next()) {
                ReportDTO reportDTO = new ReportDTO();
                reportDTO.setStockOutId(resultSet.getLong("stock_out_id"));
                reportDTO.setItemId(resultSet.getLong("item_id"));
                reportDTO.setQty(resultSet.getInt("qty"));
                reportDTO.setStockOutDate(resultSet.getDate("stock_out_date").toLocalDate());
                reportDTO.setPriceOut(resultSet.getBigDecimal("price_out"));
                reportDTOS.add(reportDTO);
            }
            return reportDTOS;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public List<ReportDTO> selectInvoiceDetail() {
        String sql = "SELECT * FROM invoice_detail";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<ReportDTO> reportDTOS = new ArrayList<>();
            while (resultSet.next()) {
                ReportDTO reportDTO = new ReportDTO();
                reportDTO.setInvoiceDetailId(resultSet.getInt("invoice_detail_id"));
                reportDTO.setQty(resultSet.getInt("qty"));
                reportDTO.setUnitPrice(resultSet.getBigDecimal("unit_price"));
                reportDTO.setItemId(resultSet.getLong("item_id"));
                reportDTO.setInvoiceId(resultSet.getInt("invoice_id"));
                reportDTOS.add(reportDTO);
            }
            return reportDTOS;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public List<ReportDTO> selectInvoiceAdjustment() {
        String sql = "SELECT * FROM invoice_adjustment";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<ReportDTO> reportDTOS = new ArrayList<>();
            while (resultSet.next()) {
                ReportDTO reportDTO = new ReportDTO();
                reportDTO.setInvoiceAdjustmentId(resultSet.getInt("invoice_adj_id"));
                reportDTO.setQty(resultSet.getInt("qty"));
                reportDTO.setUnitPrice(resultSet.getBigDecimal("unit_price"));
                reportDTO.setReturnedDate(resultSet.getDate("return_date").toLocalDate());
                reportDTO.setItemId(resultSet.getLong("item_id"));
                reportDTO.setInvoiceId(resultSet.getInt("invoice_id"));
                reportDTOS.add(reportDTO);
            }
            return reportDTOS;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public List<ReportDTO> selectItemPriceHistory() {
        String sql = "SELECT * FROM item_price_history";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<ReportDTO> reportDTOS = new ArrayList<>();
            while (resultSet.next()) {
                ReportDTO reportDTO = new ReportDTO();
                reportDTO.setItemHistoryId(resultSet.getLong("item_history_id"));
                reportDTO.setPrice(resultSet.getBigDecimal("price"));
                reportDTO.setUpdatedAt(resultSet.getDate("update_at").toLocalDate());
                reportDTO.setItemId(resultSet.getLong("item_id"));
                reportDTOS.add(reportDTO);
            }
            return reportDTOS;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }


    @Override
    public List<ReportDTO> selectStockAlertReport() {
        String sql = """
                SELECT ga.alert_id, ga.name, ga.qty_alert , i.qty
                FROM group_alert ga
                INNER JOIN item i ON ga.alert_id = i.alert_id
                WHERE i.qty IS NOT NULL AND i.qty < 20
            """;

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            List<ReportDTO> reportDTOS = new ArrayList<>();


            while (resultSet.next()) {
                ReportDTO reportDTO = new ReportDTO();
                ItemDTO item = new ItemDTO();

                item.setQty(resultSet.getInt("qty"));
                reportDTO.setAlertId(resultSet.getLong("alert_id"));
                reportDTO.setQytAlert(item.getQty());
                reportDTO.setName(resultSet.getString("name"));


                reportDTOS.add(reportDTO);

            }

            return reportDTOS;
        } catch (SQLException e) {
            System.out.println("Error executing query: " + e.getMessage());
            e.printStackTrace(); // Print the stack trace for debugging
        }

        return null;
    }

    @Override
    public List<ReportDTO> selectSummaryReport() {
        String sql = "SELECT item_id, SUM(qty) AS total_qty " +
                "FROM ( " +
                "   SELECT item_id, qty FROM stock_count " +
                "   UNION ALL " +
                "   SELECT item_id, qty FROM stock_in " +
                "   UNION ALL " +
                "   SELECT item_id, -qty AS qty FROM stock_out " +
                ") AS stock_summary " +
                "GROUP BY item_id";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<ReportDTO> reportDTOS = new ArrayList<>();

            while (resultSet.next()) {
                ReportDTO reportDTO = new ReportDTO();
                reportDTO.setItemId(resultSet.getLong("item_id"));
                reportDTO.setQty(resultSet.getInt("total_qty"));

                // You may want to fetch additional item details and set them in the reportDTO

                reportDTOS.add(reportDTO);
            }

            return reportDTOS;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }


}
