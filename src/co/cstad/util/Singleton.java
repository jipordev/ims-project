package co.cstad.util;

import co.cstad.controller.InvoiceController;
import co.cstad.controller.ItemController;

import java.util.Scanner;

public class Singleton {
    private static Singleton instance;
    private ItemController itemController;
    private InvoiceController invoiceController;
    private Scanner scanner;

    private Singleton() {
        // Private constructor to prevent instantiation outside the class.
        itemController = new ItemController();
        invoiceController = new InvoiceController();
        scanner = new Scanner(System.in);
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public ItemController getItemController() {
        return itemController;
    }

    public InvoiceController getInvoiceController() {
        return invoiceController;
    }

    public Scanner getScanner() {
        return scanner;
    }
}