package co.cstad;

import co.cstad.dao.InvoiceDao;
import co.cstad.dao.InvoiceDaoImpl;
import co.cstad.loggingin.UserAuthentication;
import co.cstad.dao.UserDao;
import co.cstad.model.InvoiceDTO;
import co.cstad.util.Singleton;
import co.cstad.view.*;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import static co.cstad.Main.menuViewManager;

public class MainApp {
    private static final Scanner scanner = new Scanner(System.in);
    private static final UserAuthentication userAuthentication = new UserAuthentication();
    private static final MenuView menuView = new MenuView();
    private static final InvoiceDaoImpl invoiceDaoImpl = new InvoiceDaoImpl();

    public static void main(String[] args) {
//        menuView.startInterface();
        menuView.menuLogin();
        int option = Integer.parseInt(Singleton.inputValue("  >> Choose Option Between [ 1 - 3 ] : "));
        handleOption(option);

        // Close resources to avoid leaks
        scanner.close();
    }
    private static void handleOption(int option) {
        switch (option) {
            case 1 -> authenticateUser();
            case 2 -> menuView.menuAboutUs();
            case 3 -> System.exit(0);
        }
    }
    private static void authenticateUser() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine().toLowerCase();
        System.out.print("Enter password: ");
        String password = scanner.nextLine().toLowerCase();
        if (UserAuthentication.authenticateUser(username, password)) {
            handleUserRole(UserAuthentication.getUserRole(username));
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    private static void handleUserRole(String role) {
        InvoiceDao invoiceDao = new InvoiceDaoImpl();
        if (role != null) {
            switch (role.toLowerCase()) {
                case "admin" -> {
                    MenuViewAdmin.mainMenuAdmin();
                }
                case "manager" -> {
                    int optionManager;
                    do{
                        menuViewManager.mainMenuManager();
                        optionManager = Integer.parseInt(Singleton.inputValue("Choose Option Between [ 1 - 3 ] : "));
                        switch (optionManager) {
                            case 1 -> menuView.itemMenu();
                            case 2 -> {
                                menuView.invoiceMenu();
                                int option = Integer.parseInt(Singleton.inputValue("Choose Option Between [ 1 - 3 ] : "));
                                switch (option) {
                                    case 1 -> {
                                        String invoiceCode = Singleton.inputValue("Enter Invoice Code : ");
                                        Optional<InvoiceDTO> optionalInvoice = invoiceDao.selectByNo(String.valueOf(invoiceCode));
                                        if (optionalInvoice.isPresent()) {
                                            InvoiceDTO invoice = optionalInvoice.get();
                                            System.out.println("Invoice ID: " + invoice.getInvoiceId());
                                            System.out.println("Invoice No: " + invoice.getInvoiceNo());
                                            System.out.println("Discount: " + invoice.getDiscount());
                                            System.out.println("Cancelled: " + invoice.getCancelled());
                                            System.out.println("Status: " + invoice.getStatus());
                                            System.out.println("Paid: " + invoice.getPaid());
                                            System.out.println();

                                            menuView.confirmation();
                                            String optionConfirmation = Singleton.inputValue("Choose Option Between [ YES / NO ] : ").toLowerCase();
                                            if (optionConfirmation.equals("yes") || optionConfirmation.equals("y")) {
                                                invoiceDao.updateById(invoice);
                                                System.out.println("Invoice Returned Successfully !");
                                            } else {
                                                System.out.println("Invoice Cannot be Return !");
                                            }

                                        } else {
                                            System.out.println("Invoice Code Not Found !");
                                        }
                                    }

                                    case 2 -> {
                                        List<InvoiceDTO> invoices = invoiceDao.select();
                                        for (InvoiceDTO invoice : invoices) {
                                            System.out.println("Invoice ID: " + invoice.getInvoiceId());
                                            System.out.println("Invoice No: " + invoice.getInvoiceNo());
                                            System.out.println("Discount: " + invoice.getDiscount());
                                            System.out.println("Cancelled: " + invoice.getCancelled());
                                            System.out.println("Status: " + invoice.getStatus());
                                            System.out.println("Paid: " + invoice.getPaid());
                                            System.out.println();
                                        }
                                    }
                                }
                            }
                            case 3 -> System.out.println("\n Back to Main Menu ");
                            default -> {
                                System.out.println("\n" + " ".repeat(5) + "INPUT IS INVALID !");
                                System.out.println(" ".repeat(5) + "PLEASE CHOOSE AN OPTION FROM 1 TO 3 .");
                            }
                        }
                    }while(optionManager!=3);
                }
                case "report" -> MenuViewReport.mainMenuReport();
                default -> System.out.println("Unknown role");
            }
        }
    }
}
