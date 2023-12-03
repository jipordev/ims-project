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

    // scanner
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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

                        int optionAdmin;
                        do{
                            menuViewAdmin.mainMenuAdmin();
                            optionAdmin = Integer.parseInt(inputValue("  >> Choose Option Between [ 1 - 6 ] : "));
                            switch (optionAdmin){

                                // Item start
                                case 1 ->{
                                    int optionItem;
                                    do {
                                        menuView.itemMenu();
                                        System.out.print("Choose option(1-5): ");
                                        optionItem = scanner.nextInt();
                                        switch (optionItem){
                                            case 1 -> {
                                                menuViewAdmin.itemStockIn();
                                                menuView.confirmation();
                                            }
                                            case 2 -> {
                                                menuViewAdmin.menuItemUpdate();
                                                System.out.println("Choose option to update(1-6): ");
                                                int optionItemUpdate = scanner.nextInt();
                                                switch (optionItemUpdate){
                                                    case 1 -> {
                                                        menuViewAdmin.itemUpdateAll();
                                                        menuView.confirmation();
                                                    }
                                                    case 2 -> {
                                                        menuViewAdmin.itemUpdateName();
                                                        menuView.confirmation();
                                                    }
                                                    case 3 -> {
                                                        menuViewAdmin.itemUpdateUint();
                                                        menuView.confirmation();
                                                    }
                                                    case 4 -> {
                                                        menuViewAdmin.itemUpdateQty();
                                                        menuView.confirmation();
                                                    }
                                                    case 5 -> {
                                                        menuViewAdmin.itemUpdateStatus();
                                                        menuView.confirmation();
                                                    }
                                                    case 6 -> {
                                                        menuViewAdmin.itemUpdatePrice();
                                                        menuView.confirmation();
                                                    }
                                                    default -> System.out.println("Invalid Option Update...!");
                                                }
                                            }
                                            case 3 -> {
                                                menuViewAdmin.itemDelete();
                                                menuView.confirmation();
                                            }
                                            case 4 -> {
                                                menuViewAdmin.itemRead();
                                            }
                                            case 5 -> {
                                                System.out.println("\n".repeat(20));
                                            }
                                            default -> System.out.println("Invalid Option Item...!");
                                        }
                                    }while (optionItem != 5);
                                }
                                // Item end


                                // Costumer start
                                case 2 ->{

                                    int optionCustomer;
                                    do{
                                        menuViewAdmin.customerMenu();
                                        optionCustomer = Integer.parseInt(inputValue("  >> Choose Option Between [ 1 - 5 ] : "));
                                        switch (optionCustomer){
                                            case 1 ->{
                                                menuViewAdmin.newCustomer();
                                                menuView.confirmation();

                                                System.out.println("\n".repeat(2));
                                            }
                                            case 2 ->{
                                                menuViewAdmin.customerList();

                                                System.out.println("\n".repeat(2));

                                            }
                                            case 3 ->{
                                                    int updateID = Integer.parseInt(inputValue("  >> Enter Customer ID to Update : "));
                                                    if(updateID==1){
                                                        menuViewAdmin.readCustomer();
                                                        int chooseUpdate;
                                                        do{
                                                            menuViewAdmin.optionListUp();
                                                            chooseUpdate = Integer.parseInt(inputValue("  >> Choose Option Between [ 1 - 8 ] : "));
                                                            switch (chooseUpdate){
                                                                case 1 ->{
                                                                    menuViewAdmin.upAllCustomer();
                                                                    menuView.confirmation();
                                                                    System.out.print("  >> Choose [Yes/yes] OR [No/no] : ");
                                                                    String choose = scanner.nextLine();
                                                                }
                                                                case 2 ->{
                                                                    menuViewAdmin.upNameCustomer();
                                                                    menuView.confirmation();
                                                                    System.out.print("  >> Choose [Yes/yes] OR [No/no] : ");
                                                                    String choose = scanner.nextLine();
                                                                }
                                                                case 3 ->{
                                                                    menuViewAdmin.upAddressCustomer();
                                                                    menuView.confirmation();
                                                                    System.out.print("  >> Choose [Yes/yes] OR [No/no] : ");
                                                                    String choose = scanner.nextLine();
                                                                }
                                                                case 4 ->{
                                                                    menuViewAdmin.upContact1Customer();
                                                                    menuView.confirmation();
                                                                    System.out.print("  >> Choose [Yes/yes] OR [No/no] : ");
                                                                    String choose = scanner.nextLine();
                                                                }
                                                                case 5 ->{
                                                                    menuViewAdmin.upContact2Customer();
                                                                    menuView.confirmation();
                                                                    System.out.print("  >> Choose [Yes/yes] OR [No/no] : ");
                                                                    String choose = scanner.nextLine();
                                                                }
                                                                case 6 ->{
                                                                    menuViewAdmin.upTypeCustomer();
                                                                    menuView.confirmation();
                                                                    System.out.print("  >> Choose [Yes/yes] OR [No/no] : ");
                                                                    String choose = scanner.nextLine();
                                                                }
                                                                case 7 ->{
                                                                    //menuViewAdmin.upStatusCustomer();
                                                                    //menuView.confirmation();
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
                                                int deleteID = Integer.parseInt(inputValue("  >> Enter Customer ID to Delete : "));
                                                if(deleteID==1){
                                                    menuViewAdmin.readCustomer();
                                                    menuView.confirmation();
                                                    System.out.print("  >> Choose [Yes/yes] OR [No/no] : ");
                                                    String choose = scanner.nextLine();

                                                }

                                            }
                                            case 5 ->{

                                            }
                                            default -> {
                                                System.out.println("\n" + " ".repeat(5) + "INPUT IS INVALID !");
                                                System.out.println(" ".repeat(5) + "PLEASE CHOOSE AN OPTION FROM 1 TO 5 .");
                                            }
                                        }

                                    }while (optionCustomer!=5);
                                }
                                case 3 ->{
                                    int chooseInvoice;
                                    do{
                                        menuView.invoiceMenu();
                                        chooseInvoice = Integer.parseInt(inputValue("  >> Choose Option Between [ 1 - 3 ] : "));
                                        switch (chooseInvoice){
                                            case 1 ->{
                                                int invoiceID = Integer.parseInt(inputValue("  >> Enter Customer ID to Return : "));
                                                if(invoiceID==101){
                                                    menuView.readInvoice();
                                                    menuView.confirmation();
                                                    System.out.print("  >> Choose [Yes/yes] OR [No/no] : ");
                                                    String choose = scanner.nextLine();
                                                }

                                            }
                                            case 2 ->{
                                                menuView.invoiceList();

                                            }
                                            case 3->{

                                            }
                                            default -> {
                                                System.out.println("\n" + " ".repeat(5) + "INPUT IS INVALID !");
                                                System.out.println(" ".repeat(5) + "PLEASE CHOOSE AN OPTION FROM 1 TO 3 .");
                                            }
                                        }

                                    }while(chooseInvoice!=3);

                                }
                                case 4 ->{
                                    int chooseUser;
                                    do{
                                        menuViewAdmin.userMenu();
                                        chooseUser = Integer.parseInt(inputValue("  >> Choose Option Between [ 1 - 5 ] : "));
                                        switch (chooseUser){
                                            case 1 ->{
                                                int invoiceID = Integer.parseInt(inputValue("  >> Enter Customer ID to Return : "));
                                                if(invoiceID==101){
                                                    menuView.readInvoice();
                                                    menuView.confirmation();
                                                    System.out.print("  >> Choose [Yes/yes] OR [No/no] : ");
                                                    String choose = scanner.nextLine();
                                                }

                                            }
                                            case 2 ->{
                                                menuView.invoiceList();

                                            }
                                            case 3->{

                                            }
                                            case 4 ->{

                                            }
                                            case 5 -> {

                                            }
                                            default -> {
                                                System.out.println("\n" + " ".repeat(5) + "INPUT IS INVALID !");
                                                System.out.println(" ".repeat(5) + "PLEASE CHOOSE AN OPTION FROM 1 TO 3 .");
                                            }
                                        }

                                    }while(chooseUser!=3);
                                }

                                // Report
                                case 5 ->{
                                    int optionReport;
                                    do{
                                        menuView.reportMenu();
                                        System.out.print("Please option(1-9): ");
                                        optionReport = scanner.nextInt();
                                        switch (optionReport){
                                            case 1 -> menuViewAdmin.stockCountReport();
                                            case 2 -> menuViewAdmin.stockInReport();
                                            case 3 -> menuViewAdmin.stockOutReport();
                                            case 4 -> menuViewAdmin.invoiceDetail();
                                            case 5 -> menuViewAdmin.invoideAdjustment();
                                            case 6 -> menuViewAdmin.itemsPriceHistory();
                                            case 7 -> menuViewAdmin.stockAlertReport();
                                            case 8 -> menuViewAdmin.summaryReport();
                                            case 9 -> System.out.println("Back to Main Menu");
                                            default -> System.out.println("Invalid option, please try again...!");
                                        }
                                        System.out.println("Press Enter key to continue...");
                                        scanner.nextLine();
                                        scanner.nextLine();
                                    }while (optionReport != 9);
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
