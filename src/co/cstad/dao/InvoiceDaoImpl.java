package co.cstad.dao;

import co.cstad.model.InvoiceDTO;
import co.cstad.util.DbSingleton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InvoiceDaoImpl implements InvoiceDao{
    private static Connection connection;
    public InvoiceDaoImpl(){
        connection = DbSingleton.instance();
    }
    @Override
    public InvoiceDTO insert(InvoiceDTO invoice) {

            String sql = "INSERT INTO invoice (invoice_no, purchase_date, discount, is_cancelled, status, is_paid) VALUES (?, ?, ?, ?, ?, ?)";
            try {
                PreparedStatement pst = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                pst.setString(1, invoice.getInvoiceNo());
                pst.setDate(2, java.sql.Date.valueOf(invoice.getPurchaseDate()));
                pst.setDouble(3, invoice.getDiscount());
                pst.setBoolean(4, invoice.getCancelled());
                pst.setBoolean(5, invoice.getStatus());
                pst.setBoolean(6, invoice.getPaid());

                int affectedRows = pst.executeUpdate();

                if (affectedRows > 0) {
                    try (ResultSet generatedKeys = pst.getGeneratedKeys()) {
                        if (generatedKeys.next()) {
                            invoice.setInvoiceId(generatedKeys.getLong(1));
                        }
                    }
                }
            }catch (SQLException e){
                throw new RuntimeException();
            }
        return null;
    }

    @Override
    public List<InvoiceDTO> select() {
        List<InvoiceDTO> invoices = new ArrayList<>();
        String sql = "SELECT * FROM invoice";


            try {
                Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    InvoiceDTO invoice = mapResultSetToInvoice(rs);
                    invoices.add(invoice);
                }
            }catch (SQLException e){
                throw new RuntimeException();
            }

        return invoices;
    }

    @Override
    public Optional<InvoiceDTO> selectById(Long id) {
        return Optional.empty();
    }


    @Override
    public Optional<InvoiceDTO> selectByNo(String invoiceNo) {
            String sql = "SELECT * FROM invoice WHERE invoice_no = ? AND is_cancelled = false AND status = true";
            try {
                PreparedStatement pst = connection.prepareStatement(sql);
                pst.setString(1, invoiceNo);
                try (ResultSet rs = pst.executeQuery()) {
                    if (rs.next()) {
                        return Optional.of(mapResultSetToInvoice(rs));
                    }
                }
            }catch (SQLException e ){
                throw new RuntimeException();
            }

        return Optional.empty();
    }

    @Override
    public InvoiceDTO updateById(InvoiceDTO invoice) {
            String sql = "UPDATE invoice SET is_cancelled = ?, status = ? WHERE invoice_id = ?";
            try {
                PreparedStatement pst = connection.prepareStatement(sql);
                pst.setBoolean(1, true);
                pst.setBoolean(2, false);
                pst.setLong(3, invoice.getInvoiceId());
                int affectedRows = pst.executeUpdate();

                if (affectedRows > 0) {
                    return invoice;
                }
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
        invoice.setDiscount(rs.getString("discount"));
        invoice.setCancelled(rs.getBoolean("is_cancelled"));
        invoice.setStatus(rs.getBoolean("status"));
        invoice.setPaid(rs.getBoolean("is_paid"));
        return invoice;
    }
}
