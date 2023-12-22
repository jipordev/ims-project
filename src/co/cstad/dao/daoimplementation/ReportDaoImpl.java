package co.cstad.dao.daoimplementation;

import co.cstad.dao.ReportDao;
import co.cstad.model.*;
import co.cstad.util.DbSingleton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ReportDaoImpl implements ReportDao {

    private final Connection connection;
    public ReportDaoImpl(){
        connection = DbSingleton.instance();
    }




    @Override
    public List<ItemDTO> selectStockCount() {
        String sql = """
                SELECT *, CAST( price as numeric ) as "pr",
                CAST( price_a as numeric ) as "pr_a",
                CAST( price_b as numeric ) as "pr_b",
                CAST( price_c as numeric ) as "pr_c"
                FROM item; 
                """;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<ItemDTO> itemDTOS = new ArrayList<>();
            while (resultSet.next()) {
                ItemDTO itemDTO = new ItemDTO();
                itemDTO.setItemId(resultSet.getLong("item_id"));
                itemDTO.setItemCode(resultSet.getString("item_code"));
                itemDTO.setItemDescription(resultSet.getString("description"));
                itemDTO.setItemUnit(resultSet.getString("unit"));
                itemDTO.setItemPrice(resultSet.getBigDecimal("pr"));
                itemDTO.setQty(resultSet.getInt("qty"));
                itemDTO.setItemPrice_out_a(resultSet.getBigDecimal("pr_a"));
                itemDTO.setItemPrice_out_b(resultSet.getBigDecimal("pr_b"));
                itemDTO.setItemPrice_out_c(resultSet.getBigDecimal("pr_c"));
                itemDTO.setStatus(resultSet.getBoolean("status"));

                itemDTOS.add(itemDTO);
            }
            return itemDTOS;
        } catch (SQLException e) {
            System.out.println( "error : " + e.getMessage());
        }
        return null;
    }
    @Override
    public List<StockInDTO> selectStockIn() {

        String sql = """
                SELECT si.stock_in_id, si.qty,si.item_id, si.stock_in_date, si.price_in
                FROM stock_in AS si
                INNER JOIN item AS i
                ON si.item_id = i.item_id;
                """;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<StockInDTO> reportDTOS = new ArrayList<>();
            while (resultSet.next()) {
                StockInDTO reportDTO = new StockInDTO();
                reportDTO.setStockInID(resultSet.getLong("stock_in_id"));
                reportDTO.setItemId(resultSet.getLong("item_id"));
                reportDTO.setQtyIn(resultSet.getInt("qty"));
                reportDTO.setStockInDate(resultSet.getDate("stock_in_date"));
                reportDTO.setPriceIn(resultSet.getBigDecimal("price_in"));
                reportDTOS.add(reportDTO);
            }
            return reportDTOS;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public List<StockOutDTO> selectStockOut() {
        String sql = "SELECT * FROM stock_out";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<StockOutDTO> reportDTOS = new ArrayList<>();
            while (resultSet.next()) {
                StockOutDTO reportDTO = new StockOutDTO();
                reportDTO.setStockOutID(resultSet.getLong("stock_out_id"));
                reportDTO.setItemId(resultSet.getLong("item_id"));
                reportDTO.setQtyOut(resultSet.getInt("qty"));
                reportDTO.setStockOutDate(resultSet.getDate("stock_out_date"));
                reportDTO.setPriceOut(resultSet.getBigDecimal("price_out"));
                reportDTOS.add(reportDTO);
            }
            return reportDTOS;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

//    @Override
//    public List<ReportDTO> selectInvoiceDetail() {
//        String sql = "SELECT * FROM invoice_detail";
//        try {
//            PreparedStatement preparedStatement = connection.prepareStatement(sql);
//            ResultSet resultSet = preparedStatement.executeQuery();
//            List<ReportDTO> reportDTOS = new ArrayList<>();
//            while (resultSet.next()) {
//                ReportDTO reportDTO = new ReportDTO();
//                reportDTO.setInvoiceDetailId(resultSet.getInt("invoice_detail_id"));
//                reportDTO.setQty(resultSet.getInt("qty"));
//                reportDTO.setUnitPrice(resultSet.getBigDecimal("unit_price"));
//                reportDTO.setItemId(resultSet.getLong("item_id"));
//                reportDTO.setInvoiceId(resultSet.getInt("invoice_id"));
//                reportDTOS.add(reportDTO);
//            }
//            return reportDTOS;
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//        return null;
//    }

//    @Override
//    public List<ReportDTO> selectInvoiceAdjustment() {
//        String sql = "SELECT * FROM invoice_adjustment";
//        try {
//            PreparedStatement preparedStatement = connection.prepareStatement(sql);
//            ResultSet resultSet = preparedStatement.executeQuery();
//            List<ReportDTO> reportDTOS = new ArrayList<>();
//            while (resultSet.next()) {
//                ReportDTO reportDTO = new ReportDTO();
//                reportDTO.setInvoiceAdjustmentId(resultSet.getInt("invoice_adj_id"));
//                reportDTO.setQty(resultSet.getInt("qty"));
//                reportDTO.setUnitPrice(resultSet.getBigDecimal("unit_price"));
//                reportDTO.setReturnedDate(resultSet.getDate("return_date").toLocalDate());
//                reportDTO.setItemId(resultSet.getLong("item_id"));
//                reportDTO.setInvoiceId(resultSet.getInt("invoice_id"));
//                reportDTOS.add(reportDTO);
//            }
//            return reportDTOS;
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//        return null;
//    }

    @Override
    public List<HistoryDTO> selectItemPriceHistory() {
        String sql = "SELECT * FROM item_price_history";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            List<HistoryDTO> reportDTOS = new ArrayList<>();
            while (resultSet.next()) {
                HistoryDTO historyDTO = new HistoryDTO();
                ItemDTO itemDTO = new ItemDTO();
                historyDTO.setItemHistoryId(resultSet.getLong("item_history_id"));
                historyDTO.setPrice(resultSet.getBigDecimal("price"));
                historyDTO.setUpdatedAt(resultSet.getDate("update_at"));
                historyDTO.setItem(itemDTO);
                reportDTOS.add(historyDTO);
            }
            return reportDTOS;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

//
//    @Override
//    public List<ReportDTO> selectSummaryReport() {
//        String sql = "SELECT item_id, SUM(qty) AS total_qty " +
//                "FROM ( " +
//                "   SELECT item_id, qty FROM stock_count " +
//                "   UNION ALL " +
//                "   SELECT item_id, qty FROM stock_in " +
//                "   UNION ALL " +
//                "   SELECT item_id, -qty AS qty FROM stock_out " +
//                ") AS stock_summary " +
//                "GROUP BY item_id";
//
//        try {
//            PreparedStatement preparedStatement = connection.prepareStatement(sql);
//            ResultSet resultSet = preparedStatement.executeQuery();
//            List<ReportDTO> reportDTOS = new ArrayList<>();
//
//            while (resultSet.next()) {
//                AlertDTO reportDTO = new AlertDTO();
//                reportDTO.setItemId(resultSet.getLong("item_id"));
//                reportDTO.setQty(resultSet.getInt("total_qty"));
//
//                // You may want to fetch additional item details and set them in the reportDTO
//
//                reportDTOS.add(reportDTO);
//            }
//
//            return reportDTOS;
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//
//        return null;
//    }


}
