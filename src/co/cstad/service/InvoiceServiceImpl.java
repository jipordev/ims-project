package co.cstad.service;

import co.cstad.dao.InvoiceDao;
import co.cstad.dao.InvoiceDaoImpl;
import co.cstad.database.ConnectionFactory;
import co.cstad.model.InvoiceDTO;
import co.cstad.model.Item;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class InvoiceServiceImpl implements InvoiceService {
    private static InvoiceDaoImpl instance;
    public InvoiceServiceImpl() {
        instance = new InvoiceDaoImpl();
    }

    @Override
    public InvoiceDTO insert(InvoiceDTO invoice) {
        return null;
    }

    @Override
    public List<InvoiceDTO> select() {
        return null;
    }

    @Override
    public InvoiceDTO selectById(Long id) {
        InvoiceDTO invoice = null;
        try (Connection con = ConnectionFactory.getConnection()) {
            String sql = "SELECT * FROM invoice WHERE invoice_id = " + id;
            try (Statement stmt = con.createStatement();
                 ResultSet rs = stmt.executeQuery(sql)) {
                if (rs.next()) {
                    invoice = new InvoiceDTO();
                    // Assuming InvoiceDTO has id, product, and discount properties.
                    invoice.setInvoiceId(rs.getLong("invoice_id"));
                    invoice.setInvoiceNo(rs.getString("invoice_no"));
                    invoice.customer.setCustomersId(rs.getLong("customer_id"));
                    invoice.setDiscount(rs.getString("discount"));
                    invoice.setCancelled(rs.getBoolean("is_cancelled"));
                    invoice.setStatus(rs.getBoolean("status"));
                    invoice.setPaid(rs.getBoolean("is_paid"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return invoice;
    }


    @Override
    public InvoiceDTO updateById(Item item) {
        return null;
    }

    @Override
    public InvoiceDTO deleteById(Long id) {
        return null;
    }
}
