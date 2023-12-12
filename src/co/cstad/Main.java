package co.cstad;

import co.cstad.view.MenuView;
import co.cstad.view.MenuViewAdmin;
import co.cstad.view.MenuViewManager;
import co.cstad.view.MenuViewReport;

import java.awt.*;
import java.net.URI;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    int option;
    static MenuView menuView = new MenuView();
    static MenuViewAdmin menuViewAdmin = new MenuViewAdmin();
    static MenuViewManager menuViewManager = new MenuViewManager();
    static MenuViewReport menuViewReport = new MenuViewReport();

    // scanner
    private static Scanner scanner;
    public Main() {
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        boolean check = false;
        menuView.startInterface();
        try {
            Thread.sleep(2000);
            System.out.println("\n".repeat(10));
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
                    System.out.println("_".repeat(50) + "\n".repeat(4));

                    // Admin logic
                    if (username.equals("admin") && password.equals("123")) {

                        int optionAdmin;
                        do{
                            MenuViewAdmin.mainMenuAdmin();
                            optionAdmin = Integer.parseInt(inputValue("  >> Choose Option Between [ 1 - 6 ] : "));
                            System.out.println("\n".repeat(3));
                            switch (optionAdmin){

                                // Item Menu
                                case 1 ->{

                                    int optionItem;
                                    do {
                                        menuView.itemMenu();
                                        optionItem = Integer.parseInt(inputValue("  >> Choose Option Between [ 1 - 5 ] : "));
                                        System.out.println("\n".repeat(5));
                                        switch (optionItem){
                                            case 1 -> {

                                            }
                                            case 2 -> {
                                                int optionItemUpdate;
                                                do {
                                                    menuView.menuItemUpdate();
                                                    optionItemUpdate = Integer.parseInt(inputValue("  >> Choose Option Between [ 1 - 9 ] : "));
                                                    System.out.println("\n".repeat(5));
                                                    switch (optionItemUpdate){
                                                        case 1 -> {


                                                        }
                                                        case 2 -> {

                                                        }

                                                        case 3 -> {

                                                        }
                                                        case 4 -> {

                                                        }
                                                        case 5 -> {

                                                        }
                                                        case 6 -> {

                                                        }
                                                        case 7 -> {

                                                        }
                                                        case 8 -> {

                                                        }
                                                        case 9->{

                                                        }
                                                        default -> System.out.println("Invalid Option Update...!");
                                                    }
                                                }while(optionItemUpdate !=9);
                                            }
                                            case 3 ->{

                                            }
                                            case 4 -> {

                                            }
                                            case 5 -> {
                                                System.out.println(
                                                        " ".repeat(40)+"███████╗██╗  ██╗██╗████████╗    ██╗████████╗███████╗███╗   ███╗    ███╗   ███╗███████╗███╗   ██╗██╗   ██╗\n" +
                                                                " ".repeat(40)+"██╔════╝╚██╗██╔╝██║╚══██╔══╝    ██║╚══██╔══╝██╔════╝████╗ ████║    ████╗ ████║██╔════╝████╗  ██║██║   ██║\n" +
                                                                " ".repeat(40)+"█████╗   ╚███╔╝ ██║   ██║       ██║   ██║   █████╗  ██╔████╔██║    ██╔████╔██║█████╗  ██╔██╗ ██║██║   ██║\n" +
                                                                " ".repeat(40)+"██╔══╝   ██╔██╗ ██║   ██║       ██║   ██║   ██╔══╝  ██║╚██╔╝██║    ██║╚██╔╝██║██╔══╝  ██║╚██╗██║██║   ██║\n" +
                                                                " ".repeat(40)+"███████╗██╔╝ ██╗██║   ██║       ██║   ██║   ███████╗██║ ╚═╝ ██║    ██║ ╚═╝ ██║███████╗██║ ╚████║╚██████╔╝\n" +
                                                                " ".repeat(40)+"╚══════╝╚═╝  ╚═╝╚═╝   ╚═╝       ╚═╝   ╚═╝   ╚══════╝╚═╝     ╚═╝    ╚═╝     ╚═╝╚══════╝╚═╝  ╚═══╝ ╚═════╝ " + "\n".repeat(5));

                                            }
                                            default -> System.out.println("Invalid Option Item...!");
                                        }
                                    }while (optionItem!=5);
                                }

                                //Customer Menu
                                case 2 ->{
                                    System.out.println(
                                            " ".repeat(40)+ " ██████╗██╗   ██╗███████╗████████╗ ██████╗ ███╗   ███╗███████╗██████╗     ███╗   ███╗███████╗███╗   ██╗██╗   ██╗\n" +
                                                    " ".repeat(40)+ "██╔════╝██║   ██║██╔════╝╚══██╔══╝██╔═══██╗████╗ ████║██╔════╝██╔══██╗    ████╗ ████║██╔════╝████╗  ██║██║   ██║\n" +
                                                    " ".repeat(40)+ "██║     ██║   ██║███████╗   ██║   ██║   ██║██╔████╔██║█████╗  ██████╔╝    ██╔████╔██║█████╗  ██╔██╗ ██║██║   ██║\n" +
                                                    " ".repeat(40)+ "██║     ██║   ██║╚════██║   ██║   ██║   ██║██║╚██╔╝██║██╔══╝  ██╔══██╗    ██║╚██╔╝██║██╔══╝  ██║╚██╗██║██║   ██║\n" +
                                                    " ".repeat(40)+ "╚██████╗╚██████╔╝███████║   ██║   ╚██████╔╝██║ ╚═╝ ██║███████╗██║  ██║    ██║ ╚═╝ ██║███████╗██║ ╚████║╚██████╔╝\n" +
                                                    " ".repeat(40)+ " ╚═════╝ ╚═════╝ ╚══════╝   ╚═╝    ╚═════╝ ╚═╝     ╚═╝╚══════╝╚═╝  ╚═╝    ╚═╝     ╚═╝╚══════╝╚═╝  ╚═══╝ ╚═════╝ ");
                                    int optionCustomer;
                                    do{
                                        menuViewAdmin.customerMenu();
                                        optionCustomer = Integer.parseInt(inputValue("  >> Choose Option Between [ 1 - 5 ] : "));
                                        System.out.println("\n".repeat(5));
                                        switch (optionCustomer){
                                            case 1 ->{

                                            }
                                            case 2 ->{


                                            }
                                            case 3 ->{
                                                int updateID = Integer.parseInt(inputValue("  >> Enter Customer ID to Update : "));
                                                if(updateID==1){
                                                    menuViewAdmin.readCustomer();
                                                    int chooseUpdate;
                                                    do{
                                                        menuViewAdmin.optionListUp();
                                                        chooseUpdate = Integer.parseInt(inputValue("  >> Choose Option Between [ 1 - 8 ] : "));
                                                        System.out.println("\n".repeat(5));
                                                        switch (chooseUpdate){
                                                            case 1 ->{

                                                            }
                                                            case 2 ->{

                                                            }
                                                            case 3 ->{

                                                            }
                                                            case 4 ->{

                                                            }
                                                            case 5 ->{

                                                            }
                                                            case 6 ->{

                                                            }
                                                            case 7 ->{

                                                            }
                                                            case 8 ->{

                                                            }
                                                            default -> {
                                                                System.out.println("\n" + " ".repeat(5) + "INPUT IS INVALID !");
                                                                System.out.println(" ".repeat(5) + "PLEASE CHOOSE AN OPTION FROM 1 TO 5 .");
                                                            }
                                                        }
                                                    }while(chooseUpdate!=8);
                                                }



                                            }
                                            case 4 ->{


                                            }
                                            case 5 ->{
                                                System.out.println(
                                                        " ".repeat(40)+"███████╗██╗  ██╗██╗████████╗     ██████╗██╗   ██╗███████╗████████╗ ██████╗ ███╗   ███╗███████╗██████╗     ███╗   ███╗███████╗███╗   ██╗██╗   ██╗\n" +
                                                                " ".repeat(40)+"██╔════╝╚██╗██╔╝██║╚══██╔══╝    ██╔════╝██║   ██║██╔════╝╚══██╔══╝██╔═══██╗████╗ ████║██╔════╝██╔══██╗    ████╗ ████║██╔════╝████╗  ██║██║   ██║\n" +
                                                                " ".repeat(40)+"█████╗   ╚███╔╝ ██║   ██║       ██║     ██║   ██║███████╗   ██║   ██║   ██║██╔████╔██║█████╗  ██████╔╝    ██╔████╔██║█████╗  ██╔██╗ ██║██║   ██║\n" +
                                                                " ".repeat(40)+"██╔══╝   ██╔██╗ ██║   ██║       ██║     ██║   ██║╚════██║   ██║   ██║   ██║██║╚██╔╝██║██╔══╝  ██╔══██╗    ██║╚██╔╝██║██╔══╝  ██║╚██╗██║██║   ██║\n" +
                                                                " ".repeat(40)+"███████╗██╔╝ ██╗██║   ██║       ╚██████╗╚██████╔╝███████║   ██║   ╚██████╔╝██║ ╚═╝ ██║███████╗██║  ██║    ██║ ╚═╝ ██║███████╗██║ ╚████║╚██████╔╝\n" +
                                                                " ".repeat(40)+"╚══════╝╚═╝  ╚═╝╚═╝   ╚═╝        ╚═════╝ ╚═════╝ ╚══════╝   ╚═╝    ╚═════╝ ╚═╝     ╚═╝╚══════╝╚═╝  ╚═╝    ╚═╝     ╚═╝╚══════╝╚═╝  ╚═══╝ ╚═════╝ \n");
                                            }
                                            default -> {
                                                System.out.println("\n" + " ".repeat(5) + "INPUT IS INVALID !");
                                                System.out.println(" ".repeat(5) + "PLEASE CHOOSE AN OPTION FROM 1 TO 5 .");
                                            }
                                        }

                                    }while (optionCustomer!=5);
                                }

                                //Invoice Menu
                                case 3 ->{
                                    System.out.println(
                                            " ".repeat(40)+         "██╗███╗   ██╗██╗   ██╗ ██████╗ ██╗ ██████╗███████╗    ███╗   ███╗███████╗███╗   ██╗██╗   ██╗\n" +
                                                    " ".repeat(40)+        "██║████╗  ██║██║   ██║██╔═══██╗██║██╔════╝██╔════╝    ████╗ ████║██╔════╝████╗  ██║██║   ██║\n" +
                                                    " ".repeat(40)+        "██║██╔██╗ ██║██║   ██║██║   ██║██║██║     █████╗      ██╔████╔██║█████╗  ██╔██╗ ██║██║   ██║\n" +
                                                    " ".repeat(40)+        "██║██║╚██╗██║╚██╗ ██╔╝██║   ██║██║██║     ██╔══╝      ██║╚██╔╝██║██╔══╝  ██║╚██╗██║██║   ██║\n" +
                                                    " ".repeat(40)+        "██║██║ ╚████║ ╚████╔╝ ╚██████╔╝██║╚██████╗███████╗    ██║ ╚═╝ ██║███████╗██║ ╚████║╚██████╔╝\n" +
                                                    " ".repeat(40)+        "╚═╝╚═╝  ╚═══╝  ╚═══╝   ╚═════╝ ╚═╝ ╚═════╝╚══════╝    ╚═╝     ╚═╝╚══════╝╚═╝  ╚═══╝ ╚═════╝ ");
                                    int chooseInvoice;
                                    do{
                                        menuView.invoiceMenu();
                                        chooseInvoice = Integer.parseInt(inputValue("  >> Choose Option Between [ 1 - 3 ] : "));
                                        System.out.println("\n".repeat(5));
                                        switch (chooseInvoice){
                                            case 1 ->{


                                            }
                                            case 2 ->{


                                            }
                                            case 3->{
                                                System.out.println(" ".repeat(40)+"███████╗██╗  ██╗██╗████████╗    ██╗███╗   ██╗██╗   ██╗ ██████╗ ██╗ ██████╗███████╗    ███╗   ███╗███████╗███╗   ██╗██╗   ██╗\n" +
                                                        " ".repeat(40)+"██╔════╝╚██╗██╔╝██║╚══██╔══╝    ██║████╗  ██║██║   ██║██╔═══██╗██║██╔════╝██╔════╝    ████╗ ████║██╔════╝████╗  ██║██║   ██║\n" +
                                                        " ".repeat(40)+"█████╗   ╚███╔╝ ██║   ██║       ██║██╔██╗ ██║██║   ██║██║   ██║██║██║     █████╗      ██╔████╔██║█████╗  ██╔██╗ ██║██║   ██║\n" +
                                                        " ".repeat(40)+"██╔══╝   ██╔██╗ ██║   ██║       ██║██║╚██╗██║╚██╗ ██╔╝██║   ██║██║██║     ██╔══╝      ██║╚██╔╝██║██╔══╝  ██║╚██╗██║██║   ██║\n" +
                                                        " ".repeat(40)+"███████╗██╔╝ ██╗██║   ██║       ██║██║ ╚████║ ╚████╔╝ ╚██████╔╝██║╚██████╗███████╗    ██║ ╚═╝ ██║███████╗██║ ╚████║╚██████╔╝\n" +
                                                        " ".repeat(40)+"╚══════╝╚═╝  ╚═╝╚═╝   ╚═╝       ╚═╝╚═╝  ╚═══╝  ╚═══╝   ╚═════╝ ╚═╝ ╚═════╝╚══════╝    ╚═╝     ╚═╝╚══════╝╚═╝  ╚═══╝ ╚═════╝ ");
                                            }
                                            default -> {
                                                System.out.println("\n" + " ".repeat(5) + "INPUT IS INVALID !");
                                                System.out.println(" ".repeat(5) + "PLEASE CHOOSE AN OPTION FROM 1 TO 3 .");
                                            }
                                        }

                                    }while(chooseInvoice!=3);

                                }


                                // User Menu
                                case 4 ->{
                                    System.out.println(" ".repeat(40)+"██╗   ██╗███████╗███████╗██████╗     ███╗   ███╗███████╗███╗   ██╗██╗   ██╗\n" +
                                            " ".repeat(40)+"██║   ██║██╔════╝██╔════╝██╔══██╗    ████╗ ████║██╔════╝████╗  ██║██║   ██║\n" +
                                            " ".repeat(40)+"██║   ██║███████╗█████╗  ██████╔╝    ██╔████╔██║█████╗  ██╔██╗ ██║██║   ██║\n" +
                                            " ".repeat(40)+"██║   ██║╚════██║██╔══╝  ██╔══██╗    ██║╚██╔╝██║██╔══╝  ██║╚██╗██║██║   ██║\n" +
                                            " ".repeat(40)+"╚██████╔╝███████║███████╗██║  ██║    ██║ ╚═╝ ██║███████╗██║ ╚████║╚██████╔╝\n" +
                                            " ".repeat(40)+" ╚═════╝ ╚══════╝╚══════╝╚═╝  ╚═╝    ╚═╝     ╚═╝╚══════╝╚═╝  ╚═══╝ ╚═════╝ ");
                                    int chooseUser;
                                    do {
                                        menuViewAdmin.userMenu();
                                        chooseUser = Integer.parseInt(inputValue("  >> Choose Option Between [ 1 - 5 ] : "));
                                        System.out.println("\n".repeat(5));
                                        switch (chooseUser) {
                                            case 1 -> {
                                                int chooseRole;
                                                do{
                                                    menuViewAdmin.optionListUser();
                                                    chooseRole = Integer.parseInt(inputValue("  >> Choose Option Between [ 1 - 4 ] : "));
                                                    System.out.println("\n".repeat(5));
                                                    switch (chooseRole){
                                                        case 1,2,3 ->{

                                                        }
                                                        case 4 ->{

                                                        }
                                                        default -> {
                                                            System.out.println("\n" + " ".repeat(5) + "INPUT IS INVALID !");
                                                            System.out.println(" ".repeat(5) + "PLEASE CHOOSE AN OPTION FROM 1 TO 3 .");
                                                        }
                                                    }

                                                }while (chooseRole != 4);
                                            }
                                            case 2 -> {

                                            }
                                            case 3 -> {
                                                int chooseUpdate;
                                                do{
                                                    menuViewAdmin.optionListUser();
                                                    chooseUpdate = Integer.parseInt(inputValue("  >> Choose Option Between [ 1 - 6 ] : "));
                                                    System.out.println("\n".repeat(5));
                                                    switch (chooseUpdate){
                                                        case 1 ->{

                                                        }
                                                        case 2 ->{

                                                        }
                                                        case 3 ->{

                                                        }
                                                        case 4 ->{

                                                        }
                                                        case 5 ->{

                                                        }
                                                        case 6 ->{

                                                        }
                                                        default -> {
                                                            System.out.println("\n" + " ".repeat(5) + "INPUT IS INVALID !");
                                                            System.out.println(" ".repeat(5) + "PLEASE CHOOSE AN OPTION FROM 1 TO 3 .");
                                                        }
                                                    }

                                                }while (chooseUpdate != 6);
                                            }
                                            case 4 -> {

                                            }
                                            case 5 -> {
                                                System.out.println(" ".repeat(40)+"███████╗██╗  ██╗██╗████████╗    ██╗   ██╗███████╗███████╗██████╗     ███╗   ███╗███████╗███╗   ██╗██╗   ██╗\n" +
                                                        " ".repeat(40)+"██╔════╝╚██╗██╔╝██║╚══██╔══╝    ██║   ██║██╔════╝██╔════╝██╔══██╗    ████╗ ████║██╔════╝████╗  ██║██║   ██║\n" +
                                                        " ".repeat(40)+"█████╗   ╚███╔╝ ██║   ██║       ██║   ██║███████╗█████╗  ██████╔╝    ██╔████╔██║█████╗  ██╔██╗ ██║██║   ██║\n" +
                                                        " ".repeat(40)+"██╔══╝   ██╔██╗ ██║   ██║       ██║   ██║╚════██║██╔══╝  ██╔══██╗    ██║╚██╔╝██║██╔══╝  ██║╚██╗██║██║   ██║\n" +
                                                        " ".repeat(40)+"███████╗██╔╝ ██╗██║   ██║       ╚██████╔╝███████║███████╗██║  ██║    ██║ ╚═╝ ██║███████╗██║ ╚████║╚██████╔╝\n" +
                                                        " ".repeat(40)+"╚══════╝╚═╝  ╚═╝╚═╝   ╚═╝        ╚═════╝ ╚══════╝╚══════╝╚═╝  ╚═╝    ╚═╝     ╚═╝╚══════╝╚═╝  ╚═══╝ ╚═════╝ ");
                                            }
                                            default -> {
                                                System.out.println("\n" + " ".repeat(5) + "INPUT IS INVALID !");
                                                System.out.println(" ".repeat(5) + "PLEASE CHOOSE AN OPTION FROM 1 TO 5 .");
                                            }
                                        }
                                    } while (chooseUser != 5);
                                }


                                // Report Menu
                                case 5 ->{
                                    System.out.println(" ".repeat(40)+"██████╗ ███████╗██████╗  ██████╗ ██████╗ ████████╗    ███╗   ███╗███████╗███╗   ██╗██╗   ██╗\n" +
                                            " ".repeat(40)+"██╔══██╗██╔════╝██╔══██╗██╔═══██╗██╔══██╗╚══██╔══╝    ████╗ ████║██╔════╝████╗  ██║██║   ██║\n" +
                                            " ".repeat(40)+"██████╔╝█████╗  ██████╔╝██║   ██║██████╔╝   ██║       ██╔████╔██║█████╗  ██╔██╗ ██║██║   ██║\n" +
                                            " ".repeat(40)+"██╔══██╗██╔══╝  ██╔═══╝ ██║   ██║██╔══██╗   ██║       ██║╚██╔╝██║██╔══╝  ██║╚██╗██║██║   ██║\n" +
                                            " ".repeat(40)+"██║  ██║███████╗██║     ╚██████╔╝██║  ██║   ██║       ██║ ╚═╝ ██║███████╗██║ ╚████║╚██████╔╝\n" +
                                            " ".repeat(40)+"╚═╝  ╚═╝╚══════╝╚═╝      ╚═════╝ ╚═╝  ╚═╝   ╚═╝       ╚═╝     ╚═╝╚══════╝╚═╝  ╚═══╝ ╚═════╝ ");


                                    do {
                                        menuView.reportMenu();
                                        try {

                                            option =Integer.parseInt(inputValue("  >> Choose Option Between [ 1 - 9 ] : "));

                                            switch (option) {
                                                case 1 -> {}
                                                case 2 -> {}
                                                case 3 -> {}
                                                case 4 -> {}
                                                case 5 -> {}
                                                case 6 -> {}
                                                case 7 -> {}
                                                case 8 -> {}
                                                case 9 -> System.out.println("Back to Main Menu");
                                                default -> {
                                                    System.out.println("\n" + " ".repeat(5) + "INPUT IS INVALID !");
                                                    System.out.println(" ".repeat(5) + "PLEASE CHOOSE AN OPTION FROM 1 TO 5 .");
                                                }
                                            }

                                        } catch (InputMismatchException e) {
                                            System.out.println("  INVALID INPUT .\n PLEASE ENTER INTEGER AGAIN .");
                                            scanner.nextLine(); // Clear the input buffer
                                        }

                                        System.out.println("Press Enter key to continue...");
                                        scanner.nextLine();

                                    } while (option != 9);
                                }
                                case 6 ->{
                                    System.out.println(" ".repeat(30) + "██████╗  █████╗  ██████╗██╗  ██╗    ██╗      ██████╗  ██████╗ ██╗███╗   ██╗    ███╗   ███╗███████╗███╗   ██╗██╗   ██╗\n" +
                                            " ".repeat(30) +"██╔══██╗██╔══██╗██╔════╝██║ ██╔╝    ██║     ██╔═══██╗██╔════╝ ██║████╗  ██║    ████╗ ████║██╔════╝████╗  ██║██║   ██║\n" +
                                            " ".repeat(30) +"██████╔╝███████║██║     █████╔╝     ██║     ██║   ██║██║  ███╗██║██╔██╗ ██║    ██╔████╔██║█████╗  ██╔██╗ ██║██║   ██║\n" +
                                            " ".repeat(30) +"██╔══██╗██╔══██║██║     ██╔═██╗     ██║     ██║   ██║██║   ██║██║██║╚██╗██║    ██║╚██╔╝██║██╔══╝  ██║╚██╗██║██║   ██║\n" +
                                            " ".repeat(30) +"██████╔╝██║  ██║╚██████╗██║  ██╗    ███████╗╚██████╔╝╚██████╔╝██║██║ ╚████║    ██║ ╚═╝ ██║███████╗██║ ╚████║╚██████╔╝\n" +
                                            " ".repeat(30) +"╚═════╝ ╚═╝  ╚═╝ ╚═════╝╚═╝  ╚═╝    ╚══════╝ ╚═════╝  ╚═════╝ ╚═╝╚═╝  ╚═══╝    ╚═╝     ╚═╝╚══════╝╚═╝  ╚═══╝ ╚═════╝ ");
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

                    try {
                        Thread.sleep(2000);
                        System.out.println("\n".repeat(10));
                        Desktop desktop = java.awt.Desktop.getDesktop();
                        URI oURL = new URI("http://192.168.1.222:5501/src/aboutUs.html");
                        desktop.browse(oURL);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                // Case 3 : Exit Program
                case 3 -> {
                    System.out.println(" ".repeat(60) + "██████╗ ██╗   ██╗███████╗    ██████╗ ██╗   ██╗███████╗\n" +
                            " ".repeat(60) + "██╔══██╗╚██╗ ██╔╝██╔════╝    ██╔══██╗╚██╗ ██╔╝██╔════╝\n" +
                            " ".repeat(60) + "██████╔╝ ╚████╔╝ █████╗      ██████╔╝ ╚████╔╝ █████╗  \n" +
                            " ".repeat(60) + "██╔══██╗  ╚██╔╝  ██╔══╝      ██╔══██╗  ╚██╔╝  ██╔══╝  \n" +
                            " ".repeat(60) + "██████╔╝   ██║   ███████╗    ██████╔╝   ██║   ███████╗\n" +
                            " ".repeat(60) + "╚═════╝    ╚═╝   ╚══════╝    ╚═════╝    ╚═╝   ╚══════╝");
                    System.exit(0);
                }
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