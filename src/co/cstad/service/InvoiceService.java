package co.cstad.service;

import co.cstad.model.Invoice;
import co.cstad.model.Item;
import org.postgresql.ssl.SingleCertValidatingFactory;

import java.util.List;

public interface InvoiceService {
    Invoice insert(Invoice invoice);
    List<Invoice> select();
    Invoice selectById(Long id);
    Invoice updateById(Item item);
    Invoice deleteById(Long id);
}
