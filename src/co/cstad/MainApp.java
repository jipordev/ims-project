// MainApp.java
package co.cstad;

import co.cstad.controller.*;
import co.cstad.exception.StringInputException;
import co.cstad.service.userservice.UserAuthentication;
import co.cstad.model.*;
import co.cstad.util.Singleton;
import co.cstad.model.ItemDTO;
import co.cstad.view.MenuView;
import co.cstad.view.MenuViewAdmin;
import co.cstad.view.MenuViewManager;
import co.cstad.view.MenuViewReport;

import java.util.Scanner;

public class MainApp {
    private static final Scanner scanner = new Scanner(System.in);
    private static final UserAuthentication userAuthentication = Singleton.userAuthentication() ;
    private static final MenuView menuView = new MenuView();
    private static final MenuViewAdmin menuViewAdmin = Singleton.menuViewAdmin();
    private static final MenuViewManager menuViewManager = Singleton.menuViewManager();
    private static final MenuViewReport menuViewReport = Singleton.menuViewReport();
    private static final ReportController reportController = Singleton.reportController();
    private static final ItemController itemController = Singleton.itemController();
    private static final UserController userController = Singleton.userController();
    private static final InvoiceController invoiceController = Singleton.invoiceController();
    private static final CustomerController customerController = Singleton.customerController();
    public static void main(String[] args) {
        //menuView.startInterface();
        handleLogIn();
    }
    private static void handleLogIn(){
        menuView.menuLogin();

        int option;
        do {
            try {
                System.out.print(" choose -> ");
                option = Integer.parseInt(Singleton.getInstance().getScanner().nextLine());
                switch (option) {
                    case 1 -> handleAuthentication();
                    case 2 -> menuView.menuAboutUs();
                    case 3 -> System.exit(0);
                    default -> {
                        System.out.println("\n" + " ".repeat(5) + "INPUT IS INVALID !");
                        System.out.println(" ".repeat(5) + "PLEASE CHOOSE AN OPTION FROM 1 TO 3 .");
                    }
                }
            } catch (StringInputException e){
                System.out.println(e.getMessage());
            } catch (NumberFormatException e){
                System.out.println("Invalid input. Please try again");
            }
        } while (true);
    }
    private static void handleAuthentication() {
        try {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            // Validate username input
            if (!validateStringInput(username)) {
                throw new StringInputException("Invalid username input.");
            }

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            // Validate password input
            if (!validateStringInput(password)) {
                throw new StringInputException("Invalid password input.");
            }

            if (userAuthentication.authenticateUser(username, password)) {
                String role = userAuthentication.getUserRole(username);
                System.out.println("User authenticated successfully.");

                if (role != null) {
                    handleRole(role);
                }
            } else {
                System.out.println("Invalid username or password.");
            }
        } catch (StringInputException e) {
            System.out.println(e.getMessage());
        }
    }

    // The validateStringInput method
    private static boolean validateStringInput(String input) throws StringInputException {
        if (input == null || input.trim().isEmpty()) {
            throw new StringInputException("Input cannot be null or empty.");
        }
        return true;
    }
    private static void handleRole(String role) {
        do {
            switch (role.toLowerCase()) {
                case "admin" -> handleAdminMenu();
                case "manager" -> handleManagerMenu();
                case "report" -> handleReport();
                default -> System.out.println("Unknown role");
            }
        } while (true);
    }
    private static void handleReport(){
        int op;
        do {
            try {
                menuViewReport.mainMenuReport();
                System.out.print("choose -> ");
                op = Integer.parseInt(scanner.nextLine());

                switch (op) {
                    case 1 -> handleReportMenu();
                    case 2 -> {
                        handleLogIn();
                        return;
                    }
                }
            } catch (StringInputException e){
                System.out.println(e.getMessage());
            } catch (NumberFormatException e){
                System.out.println("Invalid input. Please try again");
            }
        } while (true);
    }
    private static void handleManagerMenu(){
        int op;
        do {
            try {
                menuViewManager.mainMenuManager();
                System.out.print("choose -> ");
                op = Integer.parseInt(scanner.nextLine());

                switch (op){
                    case 1 -> handleItemMenu();
                    case 2 -> handleInvoiceMenu();
                    case 3 -> {
                        handleLogIn();
                        return;
                    }
                    default -> {
                        System.out.println("\n" + " ".repeat(5) + "INPUT IS INVALID !");
                        System.out.println(" ".repeat(5) + "PLEASE CHOOSE AN OPTION FROM 1 TO 3 .");
                    }
                }
            } catch (StringInputException e){
                System.out.println(e.getMessage());
            } catch (NumberFormatException e){
                System.out.println("Invalid input. Please try again");
            }
        } while (true);
    }
    private static void handleAdminMenu() {
        int op;
        do {
            try {
                menuViewAdmin.mainMenuAdmin();
                System.out.print("choose -> ");
                op = Integer.parseInt(scanner.nextLine());

                switch (op) {
                    case 1 -> handleItemMenu();
                    case 2 -> handleCustomerMenu();
                    case 3 -> handleInvoiceMenu();
                    case 4 -> handleUserMenu();
                    case 5 -> handleReportMenu();
                    case 6 -> {
                        handleLogIn();
                        return;
                    }
                    default -> {
                        System.out.println("\n" + " ".repeat(5) + "INPUT IS INVALID !");
                        System.out.println(" ".repeat(5) + "PLEASE CHOOSE AN OPTION FROM 1 TO 7 .");
                    }
                }
            } catch (StringInputException e){
                System.out.println(e.getMessage());
            } catch (NumberFormatException e){
                System.out.println("Invalid input. Please try again");
            }
        } while (true);
    }
    private static void handleUserMenu(){
        int opUser;
        do {
            try {
                menuViewAdmin.userMenu();
                System.out.print("choose -> ");
                opUser = Integer.parseInt(scanner.nextLine());
                switch (opUser) {
                    case 1 -> {
                        UserDTO createdUser = userController.create();
                        if (createdUser != null) {
                            userController.confirmation(createdUser);
                        }
                    }
                    case 2 -> userController.read();
                    case 3 -> handleMenuUserUpdate();
                    case 4 -> {
                        UserDTO deletedUser = userController.delete();
                        if (deletedUser != null) {
                            userController.confirmation(deletedUser);
                        }
                    }
                    case 5 -> {
                        return;
                    }
                    default -> {
                        System.out.println("\n" + " ".repeat(5) + "INPUT IS INVALID !");
                        System.out.println(" ".repeat(5) + "PLEASE CHOOSE AN OPTION FROM 1 TO 5 .");
                    }
                }
            } catch (StringInputException e){
                System.out.println(e.getMessage());
            } catch (NumberFormatException e){
                System.out.println("Invalid input. Please try again.");
            }
        } while (true);
    }

    private static void handleItemMenu() {
        int op2;
        do {
            try {
                menuView.itemMenu();
                System.out.print("choose -> ");
                op2 = Integer.parseInt(scanner.nextLine());

                switch (op2) {
                    case 1 -> {
                        ItemDTO createdItem = itemController.create();
                        if (createdItem != null) {
                            itemController.confirmation(createdItem);
                        }
                    }
                    case 2 -> handleMenuItemUpdate();
                    case 3 -> {
                        ItemDTO deletedItem = itemController.delete();
                        if (deletedItem != null) {
                            itemController.confirmation(deletedItem);
                        }
                    }
                    case 4 -> itemController.read();
                    case 5 -> itemController.stockIn();
                    case 6 -> itemController.stockOut();
                    case 7 -> {
                        return;
                    }
                    default -> {
                        System.out.println("\n" + " ".repeat(5) + "INPUT IS INVALID !");
                        System.out.println(" ".repeat(5) + "PLEASE CHOOSE AN OPTION FROM 1 TO 7 .");
                    }
                }
            } catch (StringInputException e){
                System.out.println(e.getMessage());
            } catch (NumberFormatException e){
                System.out.println("Invalid input. Please try again.");
            }
        } while (true);
    }
    private static void handleCustomerMenu(){
        int opCus;
        do {
            try {
                menuViewAdmin.customerMenu();
                System.out.print("choose -> ");
                opCus = Integer.parseInt(scanner.nextLine());
                switch (opCus) {
                    case 1 -> {
                        customerController.newCustomer();
                    }
                    case 2 -> customerController.read();
                    case 3 -> handleMenuCustomerUpdate();
                    case 4 -> {
                        CustomerDTO delete = customerController.delete();
                        if (delete != null) {
                            customerController.confirmation(delete);
                        }
                    }
                    case 5 -> {
                        return;
                    }
                    default -> {
                        System.out.println("\n" + " ".repeat(5) + "INPUT IS INVALID !");
                        System.out.println(" ".repeat(5) + "PLEASE CHOOSE AN OPTION FROM 1 TO 5 .");
                    }
                }
            } catch (StringInputException e){
                System.out.println(e.getMessage());
            } catch (NumberFormatException e){
                System.out.println("Invalid input. Please try again.");
            }
        } while (true);
    }
    private static void handleMenuUserUpdate(){
        int updateOp;
        do {
            try {
                menuViewAdmin.optionListUser();
                System.out.print("choose -> ");
                updateOp = Integer.parseInt(scanner.nextLine());
                switch (updateOp) {
                    case 1 -> userController.updateAll();
                    case 2 -> userController.updateUsername();
                    case 3 -> userController.updatePassword();
                    case 4 -> userController.updateEmail();
                    case 5 -> userController.updateContact();
                    case 6 -> userController.updateAddress();
                    case 7 -> userController.updateStatus();
                    case 8 -> userController.updateRole();
                    case 9 -> {
                        return;
                    }
                    default -> {
                        System.out.println("\n" + " ".repeat(5) + "INPUT IS INVALID !");
                        System.out.println(" ".repeat(5) + "PLEASE CHOOSE AN OPTION FROM 1 TO 9 .");
                    }
                }
            } catch (StringInputException e){
                System.out.println(e.getMessage());
            } catch (NumberFormatException e){
                System.out.println("Invalid input. Please try again.");
            }
        } while (true);
    }
    private static void handleMenuItemUpdate() {
        int updateOp;
        do {
            try {
                menuView.menuItemUpdate();
                System.out.print("choose -> ");
                updateOp = Integer.parseInt(scanner.nextLine());
                // Handle update options here...
                switch (updateOp) {
                    case 1 -> itemController.updateAll();
                    case 2 -> itemController.updateItemDescription();
                    case 3 -> itemController.updateItemUnit();
                    case 4 -> itemController.updateItemQty();
                    case 5 -> itemController.updateItemPriceA();
                    case 6 -> itemController.updateItemPriceB();
                    case 7 -> itemController.updateItemPriceC();
                    case 8 -> itemController.updateItemStatus();
                    case 9 -> {
                        return;
                    }
                    default -> {
                        System.out.println("\n" + " ".repeat(5) + "INPUT IS INVALID !");
                        System.out.println(" ".repeat(5) + "PLEASE CHOOSE AN OPTION FROM 1 TO 9 .");
                    }
                }
            } catch (StringInputException e){
                System.out.println(e.getMessage());
            } catch (NumberFormatException e){
                System.out.println("Invalid input. Please try again");
            }
        } while (true);
    }

    private static void handleInvoiceMenu() {
        int optInvoice;
        do {
            try {
                menuView.invoiceMenu();
                System.out.print("choose -> ");
                optInvoice = Integer.parseInt(scanner.nextLine());
                switch (optInvoice) {
                    case 1 -> invoiceController.update();
                    case 2 -> invoiceController.read();
                    case 3 -> {
                        return;
                    }
                    default -> {
                        System.out.println("\n" + " ".repeat(5) + "INPUT IS INVALID !");
                        System.out.println(" ".repeat(5) + "PLEASE CHOOSE AN OPTION FROM 1 TO 4 .");
                    }
                }
            } catch (StringInputException e){
                System.out.println(e.getMessage());
            } catch (NumberFormatException e){
                System.out.println("Invalid input. Please try again.");
            }
        } while (true);
    }
    private static void handleMenuCustomerUpdate() {
        int updateOp;
        do {
            try {
                menuViewAdmin.optionListUp();
                System.out.print("choose -> ");
                updateOp = Integer.parseInt(scanner.nextLine());
                // Handle update options here...
                switch (updateOp) {
                    case 1 -> customerController.updateAll();
                    case 2 -> customerController.updateCustomerName();
                    case 3 -> customerController.updateCustomerAddress();
                    case 4 -> customerController.updateCustomerContact1();
                    case 5 -> customerController.updateCustomerContact2();
                    case 6 -> customerController.updateCustomerType();
                    case 7 -> customerController.updateCustomerStatus();
                    case 8 -> {
                        return;
                    }
                    default -> {
                        System.out.println("\n" + " ".repeat(5) + "INPUT IS INVALID !");
                        System.out.println(" ".repeat(5) + "PLEASE CHOOSE AN OPTION FROM 1 TO 6 .");
                    }
                }
            } catch (StringInputException e){
                System.out.println(e.getMessage());
            } catch (NumberFormatException e){
                System.out.println("Invalid input. Please try again.");
            }
        } while (true);
    }
    private static void handleReportMenu(){
        int opReport;
        do {
            try {
                menuView.reportMenu();
                System.out.print("Choose ➡\uFE0F ");
                opReport = Integer.parseInt(scanner.nextLine());
                switch (opReport){
                    case 1 -> reportController.stockCountReport();
                    case 2 -> reportController.stockInReport();
                    case 3 -> reportController.stockOutReport();
                    case 4 -> reportController.invoiceDetail();
                    case 5 -> reportController.invoiceAdjustment();
                    case 6 -> reportController.itemPriceHistory();
                    case 7 -> reportController.stockAlert();
                    case 8 -> reportController.summaryReport();
                    case 9 -> {
                        return;
                    }
                    default -> {
                        System.out.println("\n" + " ".repeat(5) + "INPUT IS INVALID !");
                        System.out.println(" ".repeat(5) + "PLEASE CHOOSE AN OPTION FROM 1 TO 9 .");
                    }
                }
            } catch (StringInputException e){
                System.out.println(e.getMessage());
            } catch (NumberFormatException e){
                System.out.println("Invalid input. Please try again");
            }
        }while (true);
    }
}
