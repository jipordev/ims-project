package co.cstad.service;

import co.cstad.model.InvoiceDTO;
import co.cstad.model.ItemDTO;

import java.util.List;

public interface InvoiceService {
    InvoiceDTO insert(InvoiceDTO invoice);
    List<InvoiceDTO> select();
    InvoiceDTO selectById(Long id);
    InvoiceDTO selectByNo(String no);
    InvoiceDTO updateById(ItemDTO item);
    InvoiceDTO deleteById(Long id);
}
