package co.cstad;

import co.cstad.view.MenuView;
import co.cstad.view.MenuViewAdmin;
import co.cstad.view.MenuViewManager;

import java.util.Scanner;

public class Main {
    static MenuView menuView = new MenuView();
    static MenuViewAdmin menuViewAdmin = new MenuViewAdmin();
    static MenuViewManager menuViewManager = new MenuViewManager();
    public static void main(String[] args) {
        menuView.startInterface();
        try {
            Thread.sleep(2000);
            System.out.println("\n".repeat(20));
            menuView.menuLogin();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        int option = Integer.parseInt(inputValue("Choose Option Between : 1 - 3: "));
        switch (option) {
            case 1 -> {
                String username = inputValue("Enter Username: ");
                String password = inputValue("Enter Password: ");

                if (username.equals("admin") && password.equals("123")) {
                    menuViewAdmin.mainMenu();
                } else if (username.equals("manager") && password.equals("123")) {

                    while (true) {
                        menuViewManager.mainMenu();
                        int optionManager = Integer.parseInt(inputValue("Choose Option Between : 1 - 4: "));
                        switch (optionManager) {
                            case 1 ->
                        }
                    }
                } else {
                    System.out.println("Invalid Username or Password");
                }
            }
            case 2 -> menuView.menuAboutUs();
            case 3 -> System.exit(0);
        }
    }
    public static String inputValue(String message) {
        System.out.print(message);
        return new Scanner(System.in).nextLine();
    }
}
