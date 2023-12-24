package co.cstad.controller;
import co.cstad.model.InvoiceDTO;
import co.cstad.view.InvoiceView;
import co.cstad.view.MenuViewAdmin;
import co.cstad.service.InvoiceService;
import co.cstad.util.Singleton;

import java.util.List;

public class InvoiceController {
    private final MenuViewAdmin menuViewAdmin;
    private final InvoiceService invoiceService;
    private final InvoiceView invoiceView;

    public InvoiceController() {
        invoiceService = Singleton.invoiceService();
        menuViewAdmin = new MenuViewAdmin();
        invoiceView = new InvoiceView();
    }

    public InvoiceDTO newInvoice(){
        InvoiceDTO newInvoice = InvoiceView.collectNewInvoiceInformation();
        if (newInvoice != null) {
            InvoiceDTO createdInvoice = invoiceService.insert(newInvoice);

            if (createdInvoice != null) {
                System.out.println("Item created successfully:");
                return createdInvoice;
            } else {
                System.out.println("Failed to create the item.");
            }
        } else {
            System.out.println("Invalid input for creating a new item.");
        }
        return null;
    }

    public void read() {
        List<InvoiceDTO> invoiceDTOList = invoiceService.select();
        InvoiceView.printInvoiceList(invoiceDTOList);
    }
    public void update() {
//        System.out.print("Enter Invoice No: ");
//        String no = Singleton.getInstance().getScanner().nextLine();
//        InvoiceDTO invoiceDTO = invoiceService.selectByNo(no);
//
//        if (invoiceDTO != null) {
//            List<InvoiceDTO> invoiceList = Collections.singletonList(invoiceDTO);
//            invoiceView.printInvoiceList(invoiceList);
//            invoiceDTO.setCancelled(true);
//            invoiceDTO.setStatus(false);
//        }
//
//        else {
//            System.out.println("Invoice not found.");
//        }
    }






}