package co.cstad.service;

import co.cstad.model.InvoiceDTO;
import co.cstad.model.ItemDTO;

import java.util.List;
import java.util.Optional;

public interface InvoiceService {
    InvoiceDTO insert(InvoiceDTO invoice);
    List<InvoiceDTO> select();
    InvoiceDTO selectById(Long id);
    List<InvoiceDTO> selectByNo(String no);
    InvoiceDTO updateById(InvoiceDTO invoice);
    InvoiceDTO deleteById(Long id);
}