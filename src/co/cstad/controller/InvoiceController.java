package co.cstad.controller;

import co.cstad.exception.StringInputException;
import co.cstad.model.InvoiceDTO;
import co.cstad.service.serviceimplementation.InvoiceServiceImpl;
import co.cstad.view.InvoiceView;
import co.cstad.view.MenuViewAdmin;
import co.cstad.service.InvoiceService;
import co.cstad.util.Singleton;

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
        try {
            System.out.print("Enter Invoice No: ");
            String no = Singleton.getInstance().getScanner().nextLine();
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
        } catch (StringInputException e){
            System.out.println(e.getMessage());
        } catch (NumberFormatException e){
            System.out.println("Invalid input. Please try again");
        }
    }
}