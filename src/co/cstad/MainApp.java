// MainApp.java
package co.cstad;

import co.cstad.controller.ItemController;
import co.cstad.loggingin.UserAuthentication;
import co.cstad.util.Singleton;
import co.cstad.view.MenuView;
import co.cstad.view.MenuViewAdmin;
import co.cstad.view.MenuViewManager;
import co.cstad.view.MenuViewReport;

import java.util.Scanner;

import static co.cstad.Main.inputValue;

public class MainApp {
    private static Scanner scanner;
    private static UserAuthentication userAuthentication;
    private static MenuView menuView;
    private static final ItemController itemController;

    static {
        menuView = new MenuView();
        scanner = new Scanner(System.in);
        userAuthentication = new UserAuthentication();
        itemController = Singleton.itemController();
    }

    public static void main(String[] args) {
        menuView.startInterface();
        menuView.menuLogin();
        int option = Integer.parseInt(inputValue("  >> Choose Option Between [ 1 - 3 ] : "));
        switch (option) {
            case 1 -> {
                System.out.print("Enter username: ");
                String username = scanner.nextLine();
                System.out.print("Enter password: ");
                String password = scanner.nextLine();
                if (UserAuthentication.authenticateUser(username, password)) {
                    String role = UserAuthentication.getUserRole(username);
                    System.out.println("User authenticated successfully.");
                    if (role != null) {
                        switch (role.toLowerCase()) {
                            case "admin":
                                MenuViewAdmin.mainMenuAdmin();
                                System.out.print("choose -> ");
                                int op = Integer.parseInt(scanner.nextLine());
                                switch (op) {
                                    case 1 -> {
                                        menuView.itemMenu();
                                        System.out.print("choose -> ");
                                        int op2 = Integer.parseInt(scanner.nextLine());
                                        switch (op2) {
                                            case 4 -> itemController.index();
                                        }
                                    }
                                }
                                break;
                            case "manager":
                                MenuViewManager.mainMenuManager();
                                break;
                            case "report":
                                MenuViewReport.mainMenuReport();
                                break;
                            default:
                                System.out.println("Unknown role");
                        }
                    }
                } else {
                    System.out.println("Invalid username or password.");
                }
            }
            case 2 -> menuView.menuAboutUs();
            case 3 -> System.exit(0);
        }

        // Close resources to avoid leaks
        scanner.close();
    }
}
