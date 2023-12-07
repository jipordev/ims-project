package co.cstad;

import co.cstad.loggingin.UserAuthentication;
import co.cstad.util.Singleton;
import co.cstad.view.*;

import java.util.Scanner;

public class MainApp {
    private static final Scanner scanner = new Scanner(System.in);
    private static final UserAuthentication userAuthentication = new UserAuthentication();
    private static final MenuView menuView = new MenuView();

    public static void main(String[] args) {
        menuView.startInterface();
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
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        if (UserAuthentication.authenticateUser(username, password)) {
            handleUserRole(UserAuthentication.getUserRole(username));
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    private static void handleUserRole(String role) {
        if (role != null) {
            switch (role.toLowerCase()) {
                case "admin" -> MenuViewAdmin.mainMenuAdmin();
                case "manager" -> MenuViewManager.mainMenuManager();
                case "report" -> MenuViewReport.mainMenuReport();
                default -> System.out.println("Unknown role");
            }
        }
    }
}
