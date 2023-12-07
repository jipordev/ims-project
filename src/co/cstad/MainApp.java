// MainApp.java
package co.cstad;

import co.cstad.loggingin.UserAuthentication;
import co.cstad.view.MenuViewAdmin;
import co.cstad.view.MenuViewManager;
import co.cstad.view.MenuViewReport;

import java.util.Scanner;

public class MainApp {
    private static Scanner scanner;
    private static UserAuthentication userAuthentication;

    static {
        scanner = new Scanner(System.in);
        userAuthentication = new UserAuthentication();
    }

    public static void main(String[] args) {
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

        // Close resources to avoid leaks
        scanner.close();
    }
}
