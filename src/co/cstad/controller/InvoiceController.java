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
            System.out.print("Enter Invoice id you want to return: ");
            Long id = Long.parseLong(scanner.nextLine());

            // Retrieve the existing invoice
            InvoiceDTO existingInvoice = invoiceService.selectById(id);

            if (existingInvoice != null) {
                // Display existing invoice details (optional)
                System.out.println("Existing Invoice Details:");
                System.out.println(existingInvoice);

                // Perform the update (assuming you have the updated details)
                existingInvoice.setCancelled(true);
                existingInvoice.setStatus(false);

                // Call the service layer to update the invoice
                InvoiceDTO updatedInvoice = invoiceService.updateById(existingInvoice);

                if (updatedInvoice != null) {
                    System.out.println("Invoice updated successfully!");
                } else {
                    System.out.println("Failed to update the invoice.");
                }
            } else {
                System.out.println("Invoice not found with ID: " + id);
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid numeric ID.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
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