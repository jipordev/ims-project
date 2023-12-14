package co.cstad.database;

import co.cstad.model.InvoiceDTO;

import java.util.ArrayList;
import java.util.List;

public class InvoiceDatabase {
    private final List<InvoiceDTO> invoiceDTOList;
    public InvoiceDatabase() {
        invoiceDTOList = new ArrayList<>();
    }

    public List<InvoiceDTO> getCustomerDTOList() {
        return invoiceDTOList;
    }
}
