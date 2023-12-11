package co.cstad.dao;

import co.cstad.model.InvoiceDTO;

import java.util.List;
import java.util.Optional;

public interface InvoiceDao {
    InvoiceDTO insert(InvoiceDTO invoice);
    List<InvoiceDTO> select();
    Optional<InvoiceDTO> selectById(Long id);
    Optional<InvoiceDTO> selectByNo(String invoiceNo);
    InvoiceDTO updateById(InvoiceDTO invoice);
    InvoiceDTO deleteById(Long id);
}
