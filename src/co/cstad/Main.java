package co.cstad;

import co.cstad.view.MenuView;
import co.cstad.view.MenuViewAdmin;
import co.cstad.view.MenuViewManager;
import co.cstad.view.MenuViewReport;

import java.util.Scanner;

public class Main {
    static MenuView menuView = new MenuView();
    static MenuViewAdmin menuViewAdmin = new MenuViewAdmin();
    static MenuViewManager menuViewManager = new MenuViewManager();
    static MenuViewReport menuViewReport = new MenuViewReport();
    public static void main(String[] args) {
        boolean check = false;
        menuView.startInterface();
        try {
            Thread.sleep(2000);
            System.out.println("\n".repeat(20));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



        do{

            menuView.menuLogin();
            int option = Integer.parseInt(inputValue("  >> Choose Option Between [ 1 - 3 ] : "));

            switch (option) {

            // Case 1 : Log In
                case 1 -> {

                    System.out.println( " \n" + "_".repeat(50));
                    String username = inputValue("  => Enter Username : ");
                    String password = inputValue("  => Enter Password : ");
                    System.out.println("_".repeat(50) + " \n");

                // Admin logic
                    if (username.equals("admin") && password.equals("123")) {
                        menuViewAdmin.mainMenuAdmin();
                        int optionAdmin;
                        do{
                            optionAdmin = Integer.parseInt(inputValue("  >> Choose Option Between [ 1 - 6 ] : "));
                            switch (optionAdmin){
                                case 1 ->{
                                    menuView.itemMenu();
                                }
                                case 2 ->{
                                    menuViewAdmin.customerMenu();
                                }
                                case 3 ->{
                                    menuView.invoiceMenu();
                                }
                                case 4 ->{
                                    menuViewAdmin.userMenu();
                                }
                                case 5 ->{
                                    menuView.reportMenu();
                                }
                                case 6 ->{

                                }
                                default -> {
                                    System.out.println("\n" + " ".repeat(5) + "INPUT IS INVALID !");
                                    System.out.println(" ".repeat(5) + "PLEASE CHOOSE AN OPTION FROM 1 TO 6 .");
                                }
                            }

                        }while(optionAdmin!=6);

                    }


                // Manager Logic
                    else if (username.equals("manager") && password.equals("123")) {
                        int optionManager;
                        do{
                            menuViewManager.mainMenuManager();
                            optionManager = Integer.parseInt(inputValue("Choose Option Between [ 1 - 3 ] : "));
                            switch (optionManager) {
                                case 1 ->{
                                    menuView.itemMenu();
                                }
                                case 2 ->{
                                    menuView.invoiceMenu();
                                }
                                case 3 ->{
                                    System.out.println("\n Back to Main Menu ");
                                }
                                default -> {
                                    System.out.println("\n" + " ".repeat(5) + "INPUT IS INVALID !");
                                    System.out.println(" ".repeat(5) + "PLEASE CHOOSE AN OPTION FROM 1 TO 3 .");
                                }
                            }
                        }while(optionManager!=3);

                    }



                // Report Logic
                    else if (username.equals("report") && password.equals("123")) {
                        System.out.println("\n".repeat(20));
                        menuViewReport.mainMenuReport();
                        int optionReport;

                        do{
                            optionReport = Integer.parseInt(inputValue("Choose Option Between [ 1 - 2 ] : "));

                            switch (optionReport){
                                case 1 ->{
                                    menuView.reportMenu();
                                }
                                case 2 -> {

                                }
                                default -> {
                                    System.out.println("\n" + " ".repeat(5) + "INPUT IS INVALID !");
                                    System.out.println(" ".repeat(5) + "PLEASE CHOOSE AN OPTION FROM 1 TO 2 .");
                                }
                            }
                        }while (optionReport!=2);
                    }
                    else {
                        System.out.println("Invalid Username or Password");
                    }
                }


            // Case 2 : Display Information About Us
                case 2 -> {
                    System.out.println("\n".repeat(20));
                    menuView.menuAboutUs();

                }

            // Case 3 : Exit Program
                case 3 -> System.exit(0);




                default -> {
                    System.out.println("\n" + " ".repeat(5) + "INPUT IS INVALID !");
                    System.out.println(" ".repeat(5) + "PLEASE CHOOSE AN OPTION FROM 1 TO 3 .");                }
            }
        }while(!check);
    }
    public static String inputValue(String message) {
        System.out.print(message);
        return new Scanner(System.in).nextLine();
    }
}
