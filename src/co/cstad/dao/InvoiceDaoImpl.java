package co.cstad.dao;

import co.cstad.model.Invoice;

import java.util.List;
import java.util.Optional;

public class InvoiceDaoImpl implements InvoiceDao{
    @Override
    public Invoice insert(Invoice invoice) {
        return null;
    }

    @Override
    public List<Invoice> select() {
        return null;
    }

    @Override
    public Optional<Invoice> selectById(Long id) {
        return Optional.empty();
    }

    @Override
    public Invoice updateById(Invoice invoice) {
        return null;
    }

    @Override
    public Invoice deleteById(Long id) {
        return null;
    }
}
