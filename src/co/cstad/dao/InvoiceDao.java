package co.cstad.dao;

import co.cstad.model.CustomerDTO;
import co.cstad.model.Invoice;

import java.util.List;
import java.util.Optional;

public interface InvoiceDao {
    Invoice insert(Invoice invoice);
    List<Invoice> select();
    Optional<Invoice> selectById(Long id);
    Invoice updateById(Invoice invoice);
    Invoice deleteById(Long id);
}
