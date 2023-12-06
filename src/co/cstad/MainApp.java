package co.cstad;

import co.cstad.loggingin.UserAuthentication;

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
            System.out.println("User authenticated successfully.");
        } else {
            System.out.println("Invalid username or password.");
        }

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
