package co.cstad.dao.daoimplementation;

import co.cstad.dao.InvoiceDao;
import co.cstad.model.InvoiceDTO;
import co.cstad.model.ItemDTO;
import co.cstad.util.DbSingleton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InvoiceDaoImpl implements InvoiceDao {
    private final Connection connection;

    public InvoiceDaoImpl() {
        connection = DbSingleton.instance();
    }

    @Override
    public InvoiceDTO insert(InvoiceDTO invoice) {
        try {
            String sql = """
            INSERT INTO invoice (invoice_no, is_cancelled, status, is_paid, customer_id, stock_out_id) 
            VALUES (?, ?, ?, ?, ?, ?)
            """;
            PreparedStatement pst = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            pst.setString(1, invoice.getInvoiceNo());
            pst.setBoolean(2, invoice.getCancelled());
            pst.setBoolean(3, invoice.getStatus());
            pst.setBoolean(4, invoice.getPaid());
            pst.setLong(5,invoice.getCustomerId());
            pst.setLong(6,invoice.getStockOutId());

            int affectedRows = pst.executeUpdate();

            if (affectedRows > 0) {
                ResultSet generatedKeys = pst.getGeneratedKeys();
                if (generatedKeys.next()) {
                    invoice.setInvoiceId(generatedKeys.getLong(1));
                }
                generatedKeys.close();
            }

            pst.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return invoice;
    }

    @Override
    public List<InvoiceDTO> select() {
        List<InvoiceDTO> invoices = new ArrayList<>();

        try {
            String sql = "SELECT * FROM invoice";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                InvoiceDTO invoice = mapResultSetToInvoice(rs);
                invoices.add(invoice);
            }

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return invoices;
    }

    @Override
    public Optional<InvoiceDTO> selectById(Long id) {
        String sql = "SELECT * FROM invoice WHERE invoice_id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                InvoiceDTO invoiceDTO = new InvoiceDTO();
                // Populate itemDTO fields from resultSet
                invoiceDTO.setInvoiceId(resultSet.getLong("invoice_id"));
                invoiceDTO.setInvoiceNo(resultSet.getString("invoice_no"));
                invoiceDTO.setCancelled(resultSet.getBoolean("is_cancelled"));
                invoiceDTO.setStatus(resultSet.getBoolean("status"));
                invoiceDTO.setPaid(resultSet.getBoolean("is_paid"));
                invoiceDTO.setCustomerId(resultSet.getLong("customer_id"));
                invoiceDTO.setStockOutId(resultSet.getLong("stock_out_id"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return Optional.empty();
    }

    @Override
    public List<InvoiceDTO> selectByNo(String invoiceNo) {
        List<InvoiceDTO> invoiceList = new ArrayList<>();

        try {
            String sql = "SELECT * FROM invoice WHERE invoice_no = ? AND is_cancelled = false AND status = true";
            PreparedStatement pst = connection.prepareStatement(sql);

            pst.setString(1, invoiceNo);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                invoiceList.add(mapResultSetToInvoice(rs));
            }

            rs.close();
            pst.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }


    @Override
    public InvoiceDTO updateById(InvoiceDTO invoice) {
        try {
            String sql = "UPDATE invoice SET is_cancelled = ?, status = ? WHERE invoice_id = ?";
            PreparedStatement pst = connection.prepareStatement(sql);

            pst.setBoolean(1, true);
            pst.setBoolean(2, false);
            pst.setLong(3, invoice.getInvoiceId());
            int affectedRows = pst.executeUpdate();

            if (affectedRows > 0) {
                return invoice;
            }

            pst.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public InvoiceDTO deleteById(Long id) {
        // Implement delete logic
        return null;
    }

    private InvoiceDTO mapResultSetToInvoice(ResultSet rs) throws SQLException {
        InvoiceDTO invoice = new InvoiceDTO();
        invoice.setInvoiceId(rs.getLong("invoice_id"));
        invoice.setInvoiceNo(rs.getString("invoice_no"));
        invoice.setDiscount(rs.getDouble("discount"));
        invoice.setCancelled(rs.getBoolean("is_cancelled"));
        invoice.setStatus(rs.getBoolean("status"));
        invoice.setPaid(rs.getBoolean("is_paid"));
        return invoice;
    }
}