package co.cstad.dao;

import co.cstad.model.ItemDTO;
import co.cstad.model.ReportDTO;
import co.cstad.util.DbSingleton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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

//    @Override
//    public List<ReportDTO> selectStockCount() {
//        return null;
//    }
//
//    @Override
//    public List<ReportDTO> selectStockIn() {
//        return null;
//    }
//
//    @Override
//    public List<ReportDTO> selectStockOut() {
//        return null;
//    }

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

    @Override
    public List<ReportDTO> selectItemPriceHistory() {
        String sql = "SELECT * FROM item_price_history";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<ReportDTO> reportDTOS = new ArrayList<>();
            while (resultSet.next()) {
                ReportDTO reportDTO = new ReportDTO();
                reportDTO.setItemHistoryId(resultSet.getInt("item_history_id)"));
                reportDTO.setPrice(resultSet.getBigDecimal("price"));
                reportDTO.setUpdatedAt(resultSet.getDate("updated_at").toLocalDate());
                reportDTO.setItemId(resultSet.getInt("item_id"));
            }
            return reportDTOS;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public List<ReportDTO> selectStockAlertReport() {
        return null;
    }

    @Override
    public List<ReportDTO> selectSummaryReport() {
        return null;
    }

}
