package co.cstad;

import co.cstad.controller.CustomerController;
import co.cstad.loggingin.UserAuthentication;
import co.cstad.util.Singleton;
import co.cstad.view.*;

import java.util.Scanner;

import static co.cstad.util.Singleton.inputValue;

public class MainApp {
    private static final Scanner scanner = new Scanner(System.in);
    private static final UserAuthentication userAuthentication = new UserAuthentication();
    static MenuView menuView = new MenuView();
    static MenuViewAdmin menuViewAdmin = new MenuViewAdmin();
    static MenuViewManager menuViewManager = new MenuViewManager();
    static MenuViewReport menuViewReport = new MenuViewReport();
    static CustomerController customerController = new CustomerController();

    public static void main(String[] args) {
        menuView.startInterface();
        menuView.menuLogin();

        int option;
        do {
            option = Integer.parseInt(inputValue("  >> Choose Option Between [ 1 - 3 ] : "));
            switch (option) {
                case 1 -> handleOption(option);
                case 2 -> menuView.menuAboutUs();
                case 3 -> System.exit(0);
            }
        } while (true);
    }

    private static void handleOption(int option) {
        switch (option) {
            case 1 -> authenticateUser();
            case 2 -> menuView.menuAboutUs();
            case 3 -> System.exit(0);
        }
    }

    private static void authenticateUser() {
        System.out.println("\n" + "=".repeat(60) );
        System.out.print("   Enter username : ");
        String username = scanner.nextLine();
        System.out.print("   Enter password : ");
        String password = scanner.nextLine();
        System.out.println("=".repeat(60) );

        if (UserAuthentication.authenticateUser(username, password)) {
            String role = UserAuthentication.getUserRole(username);
            System.out.println("User authenticated successfully.");

            if (role != null) {
                handleRole(role);
            }
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    private static void handleRole(String role) {
        do {
            switch (role.toLowerCase()) {
                case "admin" -> handleAdminMenu();
                case "manager" -> MenuViewManager.mainMenuManager();
                case "report" -> MenuViewReport.mainMenuReport();
                default -> System.out.println("Unknown role");
            }
        } while (true);
    }
        private static void handleAdminMenu() {
        int op;
        do {
            MenuViewAdmin.mainMenuAdmin();
            System.out.print("choose -> ");
            op = Integer.parseInt(scanner.nextLine());

            switch (op) {
                case 1 -> {}
                case 2 -> menuViewAdmin.customerMenu();
                case 3 -> menuView.invoiceMenu();
                case 4 -> {

                }
                case 5 -> menuView.reportMenu();
                case 6 -> {
                    return;
                }
            }
        } while (op != 0);
    }

    private static void handleMenuCustomerUpdate() {
        int updateOp;
        do {
            menuView.menuItemUpdate();
            System.out.print("choose -> ");
            updateOp = Integer.parseInt(scanner.nextLine());
            // Handle update options here...
            switch (updateOp) {
                case 1 -> customerController.updateAll();
                case 2 -> customerController.updateCustomerName();
                case 3 -> customerController.updateCustomerAddress();
                case 4 -> customerController.updateCustomerContact1();
                case 5 -> customerController.updateCustomerContact2();
                case 6 -> customerController.updateCustomerStatus();
                case 7 -> customerController.updateCustomerType();
                case 8 -> {
                    return;
                }
            }
        } while (updateOp != 8);
    }
}
