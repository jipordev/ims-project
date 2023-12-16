package co.cstad.dao;

import co.cstad.model.ItemDTO;
import co.cstad.model.ReportDTO;
import co.cstad.util.DbSingleton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class ReportDaoImpl implements ReportDao{

    private final Connection connection;
    public ReportDaoImpl(){
        connection = DbSingleton.instance();
    }

    @Override
    public List<ReportDTO> selectStockCount() {
        String sql = "SELECT * FROM stock_count";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<ReportDTO> reportDTOS = new ArrayList<>();
            while (resultSet.next()) {
                ReportDTO reportDTO = new ReportDTO();
                reportDTO.setStockCountId(resultSet.getLong("stock_id"));
                reportDTO.setQty(resultSet.getInt("qty"));
                reportDTO.setStockCountDate(resultSet.getDate("stock_count_date").toLocalDate());
                reportDTO.setItemId( resultSet.getInt("item_id"));
                reportDTOS.add(reportDTO);
            }
            return reportDTOS;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
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
                reportDTO.setStockInId(resultSet.getInt("stock_in_id"));
                reportDTO.setQty(resultSet.getInt("qty"));
                reportDTO.setStockInDate(resultSet.getDate("stock_in_date").toLocalDate());
                reportDTO.setPriceIn(resultSet.getBigDecimal("price_in"));
                reportDTO.setItemId(resultSet.getInt("item_id"));
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
                reportDTO.setStockOutId(resultSet.getInt("stock_out_id"));
                reportDTO.setItemId(resultSet.getInt("item_id"));
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
                reportDTO.setItemId(resultSet.getInt("item_id"));
                reportDTO.setInvoiceId(resultSet.getInt("invoice_id"));
                reportDTOS.add(reportDTO);
            }
            return reportDTOS;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public List<ReportDTO> selectInvoiceAdjustment() {
        String sql = "SELECT * FROM invoice_adjustment";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            List<ReportDTO> reportDTOS = new ArrayList<>();
            while (resultSet.next()) {
                ReportDTO reportDTO = new ReportDTO();
                reportDTO.setInvoiceAdjustmentId(resultSet.getInt("invoice_adj_id"));
                reportDTO.setInvoiceId(resultSet.getInt("invoice_id"));
                reportDTO.setItemId(resultSet.getInt("item_id"));
                reportDTO.setUnitPrice(resultSet.getBigDecimal("unit_price"));
                reportDTO.setQty(resultSet.getInt("qty"));
                Date returnDate = resultSet.getDate("return_date");
                if (returnDate != null) {
                    reportDTO.setReturnedDate(((java.sql.Date) returnDate).toLocalDate());
                }
                reportDTOS.add(reportDTO);
            }
            return reportDTOS;
        } catch (SQLException e) {
            System.out.println("Error executing SQL query: " + e.getMessage());
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
                reportDTO.setItemId(resultSet.getInt("item_id"));
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
        /*String sql = "SELECT " +
                "group_alert.alert_id AS group_alert_id, " +
                "item.item_id, " +
                "item.qty, " +
                "item.item_code, " +  // Change to the correct column name
                "item.item_description " +
                "FROM group_alert " +
                "INNER JOIN item ON group_alert.alert_id = item.alert_id " +
                "WHERE group_alert.alert_id = item.alert_id";*/
        String sql = "SELECT from item";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            List<ReportDTO> reportDTOS = new ArrayList<>();
            while (resultSet.next()) {
                ReportDTO reportDTO = new ReportDTO();
                reportDTO.setAlertId(resultSet.getInt("alert_id"));

                reportDTOS.add(reportDTO);
            }

            return reportDTOS;

        } catch (SQLException e) {
            System.out.println("Error executing SQL query: " + e.getMessage());
        }

        return null;
    }


    @Override
    public List<ReportDTO> selectSummaryReport() {
        return null;
    }

}
