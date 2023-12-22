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

    }
}