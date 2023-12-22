package co.cstad.service.serviceimplementation;
import co.cstad.dao.daoimplementation.InvoiceDaoImpl;
import co.cstad.model.InvoiceDTO;
import co.cstad.service.InvoiceService;
import co.cstad.util.Singleton;
import java.util.List;
import java.util.Optional;

public class InvoiceServiceImpl implements InvoiceService {
    private static InvoiceDaoImpl invoiceDao;

    public InvoiceServiceImpl() {
        invoiceDao = Singleton.getInvoiceDao();
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
    }


    @Override
    public InvoiceDTO updateById(InvoiceDTO invoiceDTO) {
        return invoiceDao.updateById(invoiceDTO);
    }


    @Override
    public InvoiceDTO deleteById(Long id) {
        return invoiceDao.deleteById(id);
    }
}
