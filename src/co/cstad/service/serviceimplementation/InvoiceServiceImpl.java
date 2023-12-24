package co.cstad.service.serviceimplementation;

import co.cstad.dao.daoimplementation.InvoiceDaoImpl;
import co.cstad.model.InvoiceDTO;
import co.cstad.model.ItemDTO;
import co.cstad.service.InvoiceService;
import co.cstad.util.Singleton;

import java.util.List;
import java.util.Optional;

public class InvoiceServiceImpl implements InvoiceService {

    private static InvoiceDaoImpl invoiceDao;

    public InvoiceServiceImpl() {
        invoiceDao = Singleton.invoiceDao();
    }

    @Override
    public InvoiceDTO insert(InvoiceDTO invoice) {
        return invoiceDao.insert(invoice);
    }

    @Override
    public List<InvoiceDTO> select() {
        return invoiceDao.select();
    }

    @Override
    public Optional<InvoiceDTO> selectById(Long id) {
        return invoiceDao.selectById(id);
    }

    @Override
    public List<InvoiceDTO> selectByNo(String no) {
        return invoiceDao.selectByNo(no);
    public InvoiceDTO selectByNo(String invoiceNo) {
        InvoiceDTO invoice = null;
        try (Connection con = DbSingleton.instance()) {
            String sql = "SELECT * FROM invoice WHERE invoice_no = ? AND is_cancelled = false AND status = true";
            try (Statement stmt = con.createStatement();
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
        // Implement update logic
        return null;
    }

    @Override
    public InvoiceDTO deleteById(Long id) {
        // Implement delete logic
        return null;
    }
}
