package co.cstad.controller;

import co.cstad.exception.StringInputException;
import co.cstad.model.InvoiceDTO;
import co.cstad.model.ItemDTO;
import co.cstad.service.serviceimplementation.InvoiceServiceImpl;
import co.cstad.view.InvoiceView;
import co.cstad.view.ItemView;
import co.cstad.view.MenuViewAdmin;
import co.cstad.service.InvoiceService;
import co.cstad.util.Singleton;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class InvoiceController {
    private final MenuViewAdmin menuViewAdmin;
    private final InvoiceService invoiceService;
    private final InvoiceView invoiceView;
    private final Scanner scanner;

    public InvoiceController() {
        scanner = Singleton.scanner();
        invoiceService = Singleton.invoiceService();
        menuViewAdmin = Singleton.menuViewAdmin();
        invoiceView = Singleton.invoiceView();
    }

    public void read() {
        List<InvoiceDTO> invoiceDTOList = invoiceService.select();
        InvoiceView.printInvoiceList(invoiceDTOList);
    }
    public void update() {
        try {

            System.out.print("Enter Invoice id you want to return : ");
            Long id = Long.parseLong(scanner.nextLine());

//            InvoiceDTO existingInvoice = invoiceService.selectById(id);


        } catch (StringInputException e){
            System.out.println(e.getMessage());
        }
    }
    public InvoiceDTO create() {
        InvoiceDTO newInvoice = invoiceView.collectNewInvoiceInformation();

        if (newInvoice != null) {
            InvoiceDTO createdInvoice = invoiceService.insert(newInvoice);

            if (createdInvoice != null) {
                System.out.println("Invoice created successfully:");
                return createdInvoice;
            } else {
                System.out.println("Failed to create the invoice.");
            }
        } else {
            System.out.println("Invalid input for creating a new invoice.");
        }
        return null;
    }
}