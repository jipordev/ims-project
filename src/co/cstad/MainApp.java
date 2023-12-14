// MainApp.java
package co.cstad;

import co.cstad.controller.InvoiceController;
import co.cstad.controller.ItemController;
import co.cstad.controller.UserController;
import co.cstad.dao.InvoiceDaoImpl;
import co.cstad.loggingin.UserAuthentication;
import co.cstad.model.ItemDTO;
import co.cstad.model.StockInDTO;
import co.cstad.model.UserDTO;
import co.cstad.dao.UserDao;
import co.cstad.model.InvoiceDTO;
import co.cstad.util.Singleton;
import co.cstad.model.ItemDTO;
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
    private static final MenuViewAdmin menuViewAdmin = Singleton.menuViewAdmin();
    private static final ItemController itemController = Singleton.itemController();
    private static final UserController userController = Singleton.userController();
    private static final InvoiceController invoiceController = new InvoiceController();
    public static void main(String[] args) {
        //menuView.startInterface();
        menuView.menuLogin();

        int option;
        do {
            System.out.print(" choose -> ");
            option = Integer.parseInt(Singleton.getInstance().getScanner().nextLine());
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
                case 3 -> handleInvoiceMenu();
                case 4 -> handleUserMenu();
                case 5 -> menuView.reportMenu();
                case 6 -> {
                    menuView.menuLogin();
                    return;
                }
            }
        } while (op != 0);
    }
    private static void handleUserMenu(){
        int opUser;
        do {
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
            }
        } while (opUser != 0);
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
                case 5 -> itemController.stockIn();
                case 6 -> {
                    menuView.menuLogin();
                    return;
                }
            }
        } while (op2 != 0);
    }

    private static void handleMenuUserUpdate(){
        int updateOp;
        do {
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
            }
        } while (updateOp != 0);
    }
    private static void handleMenuItemUpdate() {
        int updateOp;
        do {
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
            }
        } while (updateOp != 0);
    }

    private static void handleInvoiceMenu() {
        int optInvoice;
        do {
            menuView.invoiceMenu();
            System.out.print("choose -> ");
            optInvoice = Integer.parseInt(scanner.nextLine());
            switch (optInvoice) {
                case 1 -> invoiceController.update();
                case 2 -> invoiceController.read();
                case 3 -> {
                    return;
                }
            }
        } while (optInvoice != 3);
    }
}
