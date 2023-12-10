package co.cstad;

import co.cstad.controller.ItemController;
import co.cstad.loggingin.UserAuthentication;
import co.cstad.model.ItemDTO;
import co.cstad.util.Singleton;
import co.cstad.view.MenuView;
import co.cstad.view.MenuViewAdmin;
import co.cstad.view.MenuViewManager;
import co.cstad.view.MenuViewReport;

import java.util.Scanner;

import static co.cstad.Main.inputValue;

public class MainApp {
    private static final Scanner scanner = new Scanner(System.in);
    private static final UserAuthentication userAuthentication = new UserAuthentication();
    private static final MenuView menuView = new MenuView();
    private static final MenuViewAdmin menuViewAdmin = new MenuViewAdmin();
    private static final ItemController itemController = Singleton.itemController();

    public static void main(String[] args) {
        menuView.startInterface();
        menuView.menuLogin();

        int option;
        do {
            option = Integer.parseInt(inputValue("  >> Choose Option Between [ 1 - 3 ] : "));
            switch (option) {
                case 1 -> handleAuthentication();
                case 2 -> menuView.menuAboutUs();
                case 3 -> System.exit(0);
            }
        } while (true);
    }

    private static void handleAuthentication() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (userAuthentication.authenticateUser(username, password)) {
            String role = userAuthentication.getUserRole(username);
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
                case 1 -> handleItemMenu();
                case 2 -> menuViewAdmin.customerMenu();
                case 3 -> menuView.invoiceMenu();
                case 4 -> menuViewAdmin.userMenu();
                case 5 -> menuView.reportMenu();
            }
        } while (op != 0);
    }

    private static void handleItemMenu() {
        int op2;
        do {
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
                case 5 -> {
                    menuView.menuLogin();
                    return;
                }
            }
        } while (op2 != 0);
    }


    private static void handleMenuItemUpdate() {
        int updateOp;
        do {
            menuView.menuItemUpdate();
            System.out.print("choose -> ");
            updateOp = Integer.parseInt(scanner.nextLine());
            // Handle update options here...
            switch (updateOp) {
                case 9 -> {
                    return;
                }
            }
        } while (updateOp != 0);
    }
}
