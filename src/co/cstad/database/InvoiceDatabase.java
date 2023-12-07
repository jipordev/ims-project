package co.cstad.database;

import co.cstad.model.Invoice;

import java.util.ArrayList;
import java.util.List;

public class InvoiceDatabase {
    private final List<Invoice> invoiceList;
    public InvoiceDatabase(){
        invoiceList = new ArrayList<>();
    }

    public List<Invoice> getInvoiceList() {
        return invoiceList;
    }
}
