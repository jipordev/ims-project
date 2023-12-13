package co.cstad.controller;

import co.cstad.model.InvoiceDTO;
import co.cstad.service.InvoiceServiceImpl;
import co.cstad.util.DbSingleton;
import co.cstad.view.InvoiceView;
import co.cstad.view.MenuViewAdmin;
import co.cstad.service.InvoiceService;
import co.cstad.util.Singleton;
import co.cstad.view.InvoiceView;

import java.util.Collections;
import java.util.List;

public class InvoiceController {
    private final MenuViewAdmin menuViewAdmin;
    private final InvoiceService invoiceService;
    private final InvoiceView invoiceView;

    public InvoiceController() {
        invoiceService = new InvoiceServiceImpl();
        menuViewAdmin = new MenuViewAdmin();
        invoiceView = new InvoiceView();
    }

    public void read() {
        List<InvoiceDTO> invoiceDTOList = invoiceService.select();
        InvoiceView.printInvoiceList(invoiceDTOList);
    }
    public void update() {
        System.out.print("Enter Invoice No: ");
        String no = Singleton.getInstance().scanner().nextLine();
        InvoiceDTO invoiceDTO = invoiceService.selectByNo(no);

        if (invoiceDTO != null) {
            List<InvoiceDTO> invoiceList = Collections.singletonList(invoiceDTO);
            invoiceView.printInvoiceList(invoiceList);
            invoiceDTO.setCancelled(true);
            invoiceDTO.setStatus(false);
        }

        else {
            System.out.println("Invoice not found.");
        }
    }
}