package co.cstad.dao;

import co.cstad.model.InvoiceDTO;

import java.util.List;
import java.util.Optional;

public class InvoiceDaoImpl implements InvoiceDao{
    @Override
    public InvoiceDTO insert(InvoiceDTO invoice) {
        return null;
    }

    @Override
    public List<InvoiceDTO> select() {
        return null;
    }

    @Override
    public Optional<InvoiceDTO> selectById(Long id) {
        return Optional.empty();
    }

    @Override
    public InvoiceDTO updateById(InvoiceDTO invoice) {
        return null;
    }

    @Override
    public InvoiceDTO deleteById(Long id) {
        return null;
    }
}
