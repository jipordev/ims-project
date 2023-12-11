package co.cstad.service;

import co.cstad.model.InvoiceDTO;
import co.cstad.model.Item;

import java.util.List;

public interface InvoiceService {
    InvoiceDTO insert(InvoiceDTO invoice);
    List<InvoiceDTO> select();
    InvoiceDTO selectById(Long id);
    InvoiceDTO updateById(Item item);
    InvoiceDTO deleteById(Long id);
}
