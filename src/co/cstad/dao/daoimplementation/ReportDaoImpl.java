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
                SELECT si.stock_in_id, si.qty,si.item_id, si.stock_in_date, CAST(si.price_in AS numeric) AS "pr"
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
                reportDTO.setPriceIn(resultSet.getBigDecimal("pr"));
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
        String sql = """
        SELECT so.stock_out_id, so.qty,so.item_id, so.stock_out_date, CAST(so.price_out as numeric) AS "pr"
                FROM stock_out AS so
                INNER JOIN item AS i
                ON so.item_id = i.item_id
        """;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<StockOutDTO> reportDTOS = new ArrayList<>();
            while (resultSet.next()) {
                StockOutDTO reportDTO = new StockOutDTO();
                ItemDTO item = new ItemDTO();
                reportDTO.setStockOutID(resultSet.getLong("stock_out_id"));
                reportDTO.setItemId(resultSet.getLong("item_id"));
                reportDTO.setQtyOut(resultSet.getInt("qty"));
                reportDTO.setStockOutDate(resultSet.getDate("stock_out_date"));
                reportDTO.setPriceOut(resultSet.getBigDecimal("pr"));
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

    @Override
    public List<AdjustmentDTO> selectInvoiceAdjustment() {
        String sql = """
                SELECT 
                    ad.invoice_adj_id, 
                    i.item_code,
                    i.description,
                    CAST(price AS numeric) AS "pr",
                    CAST(price_a AS numeric) AS "pr_a",
                    CAST(price_b AS numeric) AS "pr_b",
                    CAST(price_c AS numeric) AS "pr_c",
                    i.qty,
                    i.unit,
                    ad.return_date,
                    i.status ,inv.is_cancelled ,
                    ad.return_date
                    
                FROM invoice_adjustment AS ad
                INNER JOIN item AS i
                ON i.item_id = ad.item_id
                INNER JOIN invoice AS inv
                ON ad.invoice_id = inv.invoice_id
                WHERE inv.is_cancelled = 't';
                """;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<AdjustmentDTO> reportDTOS = new ArrayList<>();
            while (resultSet.next()) {
                ItemDTO item = new ItemDTO();
                AdjustmentDTO reportDTO = new AdjustmentDTO();
                InvoiceDTO invoice = new InvoiceDTO();
                reportDTO.setAdjustmentId(resultSet.getLong("invoice_adj_id"));
                reportDTO.setReturnDate(resultSet.getDate("return_date"));
                item.setItemCode(resultSet.getString("item_code"));
                item.setItemDescription(resultSet.getString("description"));
                item.setItemUnit(resultSet.getString("unit"));
                item.setQty(resultSet.getInt("qty"));
                item.setItemPrice(resultSet.getBigDecimal("pr"));
                item.setItemPrice_out_a(resultSet.getBigDecimal("pr_a"));
                item.setItemPrice_out_b(resultSet.getBigDecimal("pr_b"));
                item.setItemPrice_out_c(resultSet.getBigDecimal("pr_c"));
                item.setStatus(resultSet.getBoolean("status"));
                invoice.setCancelled(resultSet.getBoolean("is_cancelled"));
                // Set the ItemDTO in AdjustmentDTO
                reportDTO.setItemDTO(item);

                // Set the InvoiceDTO in AdjustmentDTO
                reportDTO.setInvoiceDTO(invoice);

                reportDTOS.add(reportDTO);
            }
            return reportDTOS;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

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


    @Override
    public List<ItemDTO> selectSummaryReport() {
        String sql = """
                            
                    SELECT i.item_id, 
                    i.item_code, 
                    i.description, 
                    CAST(price AS numeric) AS "pr", 
                    CAST(price_a AS numeric) AS "pr_a", 
                    CAST(price_b AS numeric) AS "pr_b", 
                    CAST(price_c AS numeric) AS "pr_c", 
                    i.qty, 
                    i.unit, 
                    COALESCE(stockIn.stockIn_qty, 0) AS stockIn_qty,
                    COALESCE(stockOut.stockOut_qty, 0) AS stockOut_qty,
                    i.status
                    FROM item AS i
                    LEFT JOIN (
                    SELECT item_id, SUM(qty) AS stockIn_qty
                    FROM stock_in
                    GROUP BY item_id
                   ) AS stockIn ON i.item_id = stockIn.item_id
                   LEFT JOIN (
                   SELECT item_id, SUM(qty) AS stockOut_qty
                   FROM stock_out
                   GROUP BY item_id
                                ) AS stockOut ON i.item_id = stockOut.item_id
                                WHERE i.status = 't'
                                ORDER BY i.item_id ASC;
                """;

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<ItemDTO> reportDTOS = new ArrayList<>();

            while (resultSet.next()) {
                ItemDTO item = new ItemDTO();
                item.setItemId(resultSet.getLong("item_id"));
                item.setItemCode(resultSet.getString("item_code"));
                item.setItemDescription(resultSet.getString("description"));
                item.setItemUnit(resultSet.getString("unit"));
                item.setQty(resultSet.getInt("qty"));
                item.setItemPrice(resultSet.getBigDecimal("pr"));
                item.setItemPrice_out_a(resultSet.getBigDecimal("pr_a"));
                item.setItemPrice_out_b(resultSet.getBigDecimal("pr_b"));
                item.setItemPrice_out_c(resultSet.getBigDecimal("pr_c"));
                item.setStatus(resultSet.getBoolean("status"));

                // Create StockInDTO and set its quantity
                StockInDTO stockIn = new StockInDTO();
                stockIn.setQtyIn(resultSet.getInt("stockIn_qty"));

                // Create StockOutDTO and set its quantity
                StockOutDTO stockOut = new StockOutDTO();
                stockOut.setQtyOut(resultSet.getInt("stockOut_qty"));

                // Set StockInDTO and StockOutDTO in the ItemDTO
                item.setStockInDTO(stockIn);
                item.setStockOutDTO(stockOut);

                reportDTOS.add(item);
            }

            return reportDTOS;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }



}