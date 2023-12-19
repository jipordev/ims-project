package co.cstad.service.serviceimplementation;

import co.cstad.dao.daoimplementation.InvoiceDaoImpl;
import co.cstad.model.InvoiceDTO;
import co.cstad.model.ItemDTO;
import co.cstad.service.InvoiceService;
import co.cstad.util.DbSingleton;

import java.sql.*;
import java.util.ArrayList;
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
        List<InvoiceDTO> invoices = new ArrayList<>();

        try (Connection con = DbSingleton.instance()) {
            String sql = "SELECT * FROM invoice ORDER BY invoice_id ASC;";
            try (Statement stmt = con.createStatement();
                 ResultSet rs = stmt.executeQuery(sql)) {

                while (rs.next()) {
                    InvoiceDTO invoice = new InvoiceDTO();
                    // Assuming InvoiceDTO has id, product, and discount properties.
                    invoice.setInvoiceId(rs.getLong("invoice_id"));
                    invoice.setInvoiceNo(rs.getString("invoice_no"));
                    invoice.customer.setCustomersId(rs.getLong("customer_id"));
                    invoice.setDiscount(rs.getString("discount"));
                    invoice.setCancelled(rs.getBoolean("is_cancelled"));
                    invoice.setStatus(rs.getBoolean("status"));
                    invoice.setPaid(rs.getBoolean("is_paid"));

                    invoices.add(invoice);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return invoices;
    }

    @Override
    public InvoiceDTO selectById(Long id) {
        InvoiceDTO invoice = null;
        try (Connection con = DbSingleton.instance()) {
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
    public InvoiceDTO selectByNo(String invoiceNo) {
        InvoiceDTO invoice = null;
        try (Connection con = DbSingleton.instance()) {
            String sql = "SELECT * FROM invoice WHERE invoice_no = ? AND is_cancelled = false AND status = true";
            try (Statement stmt = con.  createStatement();
                 ResultSet rs = stmt.executeQuery(sql)) {
                if (rs.next()) {
                    invoice = new InvoiceDTO();
                    // Assuming InvoiceDTO has id, product, and discount properties.
                    invoice.setInvoiceId(rs.getLong("invoice_id"));
                    invoice.setInvoiceNo(rs.getString("invoice_no").toUpperCase());
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
    public InvoiceDTO updateById(ItemDTO item) {
        return null;
    }

    @Override
    public InvoiceDTO deleteById(Long id) {
        return null;
    }
}
