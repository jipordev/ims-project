
package co.cstad.view;

import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

import java.util.Scanner;

public class MenuViewAdmin implements BoxBorder {
    Scanner scanner = new Scanner(System.in);


    // Main Menu Admin
    public void mainMenuAdmin() {
        System.out.print(cyan);
        System.out.println(TOP_LEFT_CORNER + HORIZONTAL_BORDER.repeat(62) + TOP_RIGHT_CORNER);
        System.out.print(VERTICAL_BORDER + SPACE + TOP_LEFT_CORNER + HORIZONTAL_BORDER.repeat(28) + TOP_RIGHT_CORNER);
        System.out.println(TOP_LEFT_CORNER + HORIZONTAL_BORDER.repeat(28) + TOP_RIGHT_CORNER + SPACE + VERTICAL_BORDER);
        System.out.print(VERTICAL_BORDER + SPACE + VERTICAL_BORDER + " ".repeat(10) + yellow + "  MENU  " + " ".repeat(10) + cyan + VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER + " ".repeat(28) + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + HORIZONTAL_BORDER.repeat(28) + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(28) + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + " ".repeat(28) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + " ██████╗ ██████╗ " + reset + " ".repeat(5) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  1 > ITEM  " + " ".repeat(16) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + "██╔════╝ ╚════██╗" + reset + " ".repeat(5) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  2 > CUSTOMER " + " ".repeat(13) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + "██║  ███╗ █████╔╝" + reset + " ".repeat(5) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  3 > INVOICE " + " ".repeat(14) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + "██║   ██║ ╚═══██╗" + reset + " ".repeat(5) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  4 > USER " + " ".repeat(17) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + "╚██████╔╝██████╔╝" + reset + " ".repeat(5) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  5 > REPORT " + " ".repeat(15) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + "╚═════╝ ╚═════╝" + reset + " ".repeat(7) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  6 > SIGN OUT " + " ".repeat(13) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(28)  + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + " ".repeat(28) + cyan + VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER + " ".repeat(28) + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(VERTICAL_BORDER + SPACE + BOTTOM_LEFT_CORNER + "─".repeat(28) + BOTTOM_RIGHT_CORNER);
        System.out.println(BOTTOM_LEFT_CORNER + HORIZONTAL_BORDER.repeat(28) + BOTTOM_RIGHT_CORNER + SPACE + VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER + SPACE + TOP_LEFT_CORNER + HORIZONTAL_BORDER.repeat(58) + TOP_RIGHT_CORNER + SPACE + VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER + SPACE + VERTICAL_BORDER + " ".repeat(14) + yellow + "Choose Option Between : 1 - 6 " + " ".repeat(14) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER + SPACE + BOTTOM_LEFT_CORNER + HORIZONTAL_BORDER.repeat(58) + BOTTOM_RIGHT_CORNER + SPACE + VERTICAL_BORDER);
        System.out.println(BOTTOM_LEFT_CORNER + HORIZONTAL_BORDER.repeat(62) + BOTTOM_RIGHT_CORNER);
        System.out.print(reset);
    }


    // Customer
    public void customerMenu() {
        System.out.print(cyan);
        System.out.println(TOP_LEFT_CORNER + HORIZONTAL_BORDER.repeat(62) + TOP_RIGHT_CORNER);
        System.out.print(VERTICAL_BORDER + SPACE + TOP_LEFT_CORNER + HORIZONTAL_BORDER.repeat(28) + TOP_RIGHT_CORNER);
        System.out.println(TOP_LEFT_CORNER + HORIZONTAL_BORDER.repeat(28) + TOP_RIGHT_CORNER + SPACE + VERTICAL_BORDER);
        System.out.print(VERTICAL_BORDER + SPACE + VERTICAL_BORDER + " ".repeat(10) + yellow + "  MENU  " + " ".repeat(10) + cyan + VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER + " ".repeat(28) + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + HORIZONTAL_BORDER.repeat(28) + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(28) + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + " ".repeat(28) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + " ██████╗ ██████╗ " + reset + " ".repeat(5) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  1 > NEW CUSTOMER " + " ".repeat(9) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + "██╔════╝ ╚════██╗" + reset + " ".repeat(5) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  2 > CUSTOMER LIST " + " ".repeat(8) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + "██║  ███╗ █████╔╝" + reset + " ".repeat(5) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  3 > UPDATE CUSTOMER " + " ".repeat(6) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + "██║   ██║ ╚═══██╗" + reset + " ".repeat(5) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  4 > DELETE CUSTOMER " + " ".repeat(6) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + "╚██████╔╝██████╔╝" + reset + " ".repeat(5) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  5 > BACK TO MAIN MENU " + " ".repeat(4) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + "╚═════╝ ╚═════╝" + reset + " ".repeat(7) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + " ".repeat(28) + cyan + VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER + " ".repeat(28) + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(VERTICAL_BORDER + SPACE + BOTTOM_LEFT_CORNER + "─".repeat(28) + BOTTOM_RIGHT_CORNER);
        System.out.println(BOTTOM_LEFT_CORNER + HORIZONTAL_BORDER.repeat(28) + BOTTOM_RIGHT_CORNER + SPACE + VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER + SPACE + TOP_LEFT_CORNER + HORIZONTAL_BORDER.repeat(58) + TOP_RIGHT_CORNER + SPACE + VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER + SPACE + VERTICAL_BORDER + " ".repeat(14) + yellow + "Choose Option Between : 1 - 5 " + " ".repeat(14) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER + SPACE + BOTTOM_LEFT_CORNER + HORIZONTAL_BORDER.repeat(58) + BOTTOM_RIGHT_CORNER + SPACE + VERTICAL_BORDER);
        System.out.println(BOTTOM_LEFT_CORNER + HORIZONTAL_BORDER.repeat(62) + BOTTOM_RIGHT_CORNER);
        System.out.print(reset);
    }
    public void newCustomer(){
        Table table = new Table(1, BorderStyle.UNICODE_BOX, ShownBorders.SURROUND);
        table.setColumnWidth(0,50,200);


        System.out.println(green + "_".repeat(50) + reset);
        System.out.print(" Enter Customer ID : ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print(" Enter Customer Name : ");
        String name = scanner.nextLine();
        System.out.print(" Enter Customer Address : ");
        String address = scanner.nextLine();
        System.out.print(" Enter Customer Contact1 : ");
        int contact1 = scanner.nextInt();
        System.out.print(" Enter Customer Contact2 : ");
        int contact2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print(" Enter Customer Type : ");
        String type = scanner.nextLine();
        System.out.println(green + "_".repeat(50) + reset + "\n");


        table.addCell(yellow +"  - Customer ID : " + reset  + " ".repeat(9) + String.valueOf(id));
        table.addCell(yellow +"  - Customer Name : " + reset  + " ".repeat(7) + name + cyan);
        table.addCell(yellow +"  - Customer Address : " + reset  + " ".repeat(4) + address);
        table.addCell(yellow +"  - Customer Contact 1 : " + reset  + " ".repeat(2) + String.valueOf(contact1));
        table.addCell(yellow +"  - Customer Contact 1 : " + reset  + " ".repeat(2) + String.valueOf(contact2));
        table.addCell(yellow +"  - Customer Type : " + reset + " ".repeat(7) + type );
        System.out.print(table.render());
        System.out.println("\n");



    }
    public void customerList(){
        Table table = new Table(7, BorderStyle.UNICODE_BOX,ShownBorders.ALL);
        table.setColumnWidth(0,15,25);
        table.setColumnWidth(1,20,50);
        table.setColumnWidth(2,20,50);
        table.setColumnWidth(3,20,50);
        table.setColumnWidth(4,20,50);
        table.setColumnWidth(5,20,50);
        table.setColumnWidth(6,20,50);




        table.addCell(yellow +"   Customer ID  " + reset );
        table.addCell(yellow +"   Customer Name  " + reset );
        table.addCell(yellow +"   Customer Address  " + reset  );
        table.addCell(yellow +"   Customer Contact 1  " + reset );
        table.addCell(yellow +"   Customer Contact 1  " + reset );
        table.addCell(yellow +"   Customer Type  " + reset );
        table.addCell(yellow +"   Customer Status  " + reset );

        table.addCell("   1  ");
        table.addCell("   CoLa  ");
        table.addCell("   #PP - CAMBODIA  ");
        table.addCell("   01234444  ");
        table.addCell("   096223311  ");
        table.addCell("   VIP  ");
        table.addCell("     ");
        table.addCell("     ");
        table.addCell("     ");
        table.addCell("     ");
        table.addCell("     ");
        table.addCell("     ");
        table.addCell("     ");
        table.addCell("     ");

        System.out.print(table.render());
        System.out.println("\n");
//        System.out.print("  >> Choose [Yes/yes] OR [No/no] : ");
//        String choose = scanner.nextLine();


    }
    public void readCustomer(){
        Table table = new Table(1, BorderStyle.UNICODE_BOX,ShownBorders.SURROUND);
        table.setColumnWidth(0,50,200);

        table.addCell(yellow +"  - Customer ID : " + reset  + " ".repeat(9) +"1");
        table.addCell(yellow +"  - Customer Name : " + reset  + " ".repeat(7) + "CoLa");
        table.addCell(yellow +"  - Customer Address : " + reset  + " ".repeat(4) + "#PP - CAMBODIA");
        table.addCell(yellow +"  - Customer Contact 1 : " + reset  + " ".repeat(2) + "01234444");
        table.addCell(yellow +"  - Customer Contact 1 : " + reset  + " ".repeat(2) + "096223311");
        table.addCell(yellow +"  - Customer Type : " + reset + " ".repeat(7) + "VIP" );
        System.out.print(table.render());
        System.out.println("\n");

    }
    public void optionListUp(){
        Table table = new Table(4, BorderStyle.UNICODE_BOX,ShownBorders.SURROUND);
        table.setColumnWidth(0,20,20);
        table.setColumnWidth(1,20,20);
        table.setColumnWidth(2,20,20);
        table.setColumnWidth(3,20,20);

        table.addCell(yellow +"  1 > ALL " + reset  );
        table.addCell(yellow +"  2 > NAME " + reset  );
        table.addCell(yellow +"  3 > ADDRESS " + reset  );
        table.addCell(yellow +"  4 > CONTACT 1 " + reset  );
        table.addCell(yellow +"  5 > CONTACT 2 " + reset  );
        table.addCell(yellow +"  6 > TYPE " + reset  );
        table.addCell(yellow +"  7 > STATUS " + reset  );
        table.addCell(yellow +"  8 > EXIT " + reset  );
        System.out.print(table.render());
        System.out.println("\n");

    }
    public void upAllCustomer(){
        Table table = new Table(1, BorderStyle.UNICODE_BOX, ShownBorders.SURROUND);
        table.setColumnWidth(0,50,200);


        System.out.println(green + "_".repeat(50) + reset);
        System.out.print(" Enter Customer ID : ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print(" Enter Customer Name : ");
        String name = scanner.nextLine();
        System.out.print(" Enter Customer Address : ");
        String address = scanner.nextLine();
        System.out.print(" Enter Customer Contact1 : ");
        int contact1 = scanner.nextInt();
        System.out.print(" Enter Customer Contact2 : ");
        int contact2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print(" Enter Customer Type : ");
        String type = scanner.nextLine();
        System.out.println(green + "_".repeat(50) + reset + "\n");


        table.addCell(yellow +"  - Customer ID : " + reset  + " ".repeat(9) + String.valueOf(id));
        table.addCell(yellow +"  - Customer Name : " + reset  + " ".repeat(7) + name + cyan);
        table.addCell(yellow +"  - Customer Address : " + reset  + " ".repeat(4) + address);
        table.addCell(yellow +"  - Customer Contact 1 : " + reset  + " ".repeat(2) + String.valueOf(contact1));
        table.addCell(yellow +"  - Customer Contact 2 : " + reset  + " ".repeat(2) + String.valueOf(contact2));
        table.addCell(yellow +"  - Customer Type : " + reset + " ".repeat(7) + type );
        System.out.print(table.render());
        System.out.println("\n");



    }
    public void upNameCustomer(){
        Table table = new Table(1, BorderStyle.UNICODE_BOX, ShownBorders.SURROUND);
        table.setColumnWidth(0,50,200);


        System.out.println(green + "_".repeat(50) + reset);
        System.out.print(" Enter Customer Name : ");
        String name = scanner.nextLine();
        System.out.println(green + "_".repeat(50) + reset + "\n");


        table.addCell(yellow +"  - Customer ID : " + reset  + " ".repeat(9) +"1");
        table.addCell(yellow +"  - Customer Name : " + reset  + " ".repeat(7) + name);
        table.addCell(yellow +"  - Customer Address : " + reset  + " ".repeat(4) + "#PP - CAMBODIA");
        table.addCell(yellow +"  - Customer Contact 1 : " + reset  + " ".repeat(2) + "01234444");
        table.addCell(yellow +"  - Customer Contact 2 : " + reset  + " ".repeat(2) + "096223311");
        table.addCell(yellow +"  - Customer Type : " + reset + " ".repeat(7) + "VIP" );
        System.out.print(table.render());
        System.out.println("\n\n");



    }
    public void upAddressCustomer(){
        Table table = new Table(1, BorderStyle.UNICODE_BOX, ShownBorders.SURROUND);
        table.setColumnWidth(0,50,200);


        System.out.println(green + "_".repeat(50) + reset);

        System.out.print(" Enter Customer Address : ");
        String address = scanner.nextLine();

        System.out.println(green + "_".repeat(50) + reset + "\n");


        table.addCell(yellow +"  - Customer ID : " + reset  + " ".repeat(9) +"1");
        table.addCell(yellow +"  - Customer Name : " + reset  + " ".repeat(7) + "CoLa");
        table.addCell(yellow +"  - Customer Address : " + reset  + " ".repeat(4) + address);
        table.addCell(yellow +"  - Customer Contact 1 : " + reset  + " ".repeat(2) + "01234444");
        table.addCell(yellow +"  - Customer Contact 2 : " + reset  + " ".repeat(2) + "096223311");
        table.addCell(yellow +"  - Customer Type : " + reset + " ".repeat(7) + "VIP" );
        System.out.print(table.render());
        System.out.println("\n");



    }
    public void upContact1Customer(){
        Table table = new Table(1, BorderStyle.UNICODE_BOX, ShownBorders.SURROUND);
        table.setColumnWidth(0,50,200);


        System.out.println(green + "_".repeat(50) + reset);

        System.out.print(" Enter Customer Contact1 : ");
        int contact1 = scanner.nextInt();

        System.out.println(green + "_".repeat(50) + reset + "\n");


        table.addCell(yellow +"  - Customer ID : " + reset  + " ".repeat(9) +"1");
        table.addCell(yellow +"  - Customer Name : " + reset  + " ".repeat(7) + "CoLa");
        table.addCell(yellow +"  - Customer Address : " + reset  + " ".repeat(4) + "#PP - CAMBODIA");
        table.addCell(yellow +"  - Customer Contact 1 : " + reset  + " ".repeat(2) + contact1);
        table.addCell(yellow +"  - Customer Contact 2 : " + reset  + " ".repeat(2) + "096223311");
        table.addCell(yellow +"  - Customer Type : " + reset + " ".repeat(7) + "VIP" );
        System.out.print(table.render());
        System.out.println("\n\n");



    }
    public void upContact2Customer(){
        Table table = new Table(1, BorderStyle.UNICODE_BOX, ShownBorders.SURROUND);
        table.setColumnWidth(0,50,200);


        System.out.println(green + "_".repeat(50) + reset);

        System.out.print(" Enter Customer Contact2 : ");
        int contact2 = scanner.nextInt();

        System.out.println(green + "_".repeat(50) + reset + "\n");


        table.addCell(yellow +"  - Customer ID : " + reset  + " ".repeat(9) +"1");
        table.addCell(yellow +"  - Customer Name : " + reset  + " ".repeat(7) + "CoLa");
        table.addCell(yellow +"  - Customer Address : " + reset  + " ".repeat(4) + "#PP - CAMBODIA");
        table.addCell(yellow +"  - Customer Contact 1 : " + reset  + " ".repeat(2) + "01234444");
        table.addCell(yellow +"  - Customer Contact 2 : " + reset  + " ".repeat(2) + contact2);
        table.addCell(yellow +"  - Customer Type : " + reset + " ".repeat(7) + "VIP" );
        System.out.print(table.render());
        System.out.println("\n");



    }
    public void upTypeCustomer(){
        Table table = new Table(1, BorderStyle.UNICODE_BOX, ShownBorders.SURROUND);
        table.setColumnWidth(0,50,200);


        System.out.println(green + "_".repeat(50) + reset);
        System.out.print(" Enter Customer ID : ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print(" Enter Customer Name : ");
        String name = scanner.nextLine();
        System.out.print(" Enter Customer Address : ");
        String address = scanner.nextLine();
        System.out.print(" Enter Customer Contact1 : ");
        int contact1 = scanner.nextInt();
        System.out.print(" Enter Customer Contact2 : ");
        int contact2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print(" Enter Customer Type : ");
        String type = scanner.nextLine();
        System.out.println(green + "_".repeat(50) + reset + "\n");


        table.addCell(yellow +"  - Customer ID : " + reset  + " ".repeat(9) +"1");
        table.addCell(yellow +"  - Customer Name : " + reset  + " ".repeat(7) + "CoLa");
        table.addCell(yellow +"  - Customer Address : " + reset  + " ".repeat(4) + "#PP - CAMBODIA");
        table.addCell(yellow +"  - Customer Contact 1 : " + reset  + " ".repeat(2) + "01234444");
        table.addCell(yellow +"  - Customer Contact 2 : " + reset  + " ".repeat(2) + "096223311");
        table.addCell(yellow +"  - Customer Type : " + reset + " ".repeat(7) + type );
        System.out.print(table.render());
        System.out.println("\n");



    }
    public void upStatusCustomer(){
        Table table = new Table(1, BorderStyle.UNICODE_BOX, ShownBorders.SURROUND);
        table.setColumnWidth(0,50,200);


        System.out.println(green + "_".repeat(50) + reset);
        System.out.print(" Enter Customer ID : ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print(" Enter Customer Name : ");
        String name = scanner.nextLine();
        System.out.print(" Enter Customer Address : ");
        String address = scanner.nextLine();
        System.out.print(" Enter Customer Contact1 : ");
        int contact1 = scanner.nextInt();
        System.out.print(" Enter Customer Contact2 : ");
        int contact2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print(" Enter Customer Type : ");
        String type = scanner.nextLine();
        System.out.println(green + "_".repeat(50) + reset + "\n");


        table.addCell(yellow +"  - Customer ID : " + reset  + " ".repeat(9) + String.valueOf(id));
        table.addCell(yellow +"  - Customer Name : " + reset  + " ".repeat(7) + name + cyan);
        table.addCell(yellow +"  - Customer Address : " + reset  + " ".repeat(4) + address);
        table.addCell(yellow +"  - Customer Contact 1 : " + reset  + " ".repeat(2) + String.valueOf(contact1));
        table.addCell(yellow +"  - Customer Contact 1 : " + reset  + " ".repeat(2) + String.valueOf(contact2));
        table.addCell(yellow +"  - Customer Type : " + reset + " ".repeat(7) + type );
        System.out.print(table.render());
        System.out.println("\n");



        System.out.print(cyan);
        System.out.println(TOP_LEFT_CORNER + HORIZONTAL_BORDER.repeat(62) + TOP_RIGHT_CORNER);
        System.out.print(VERTICAL_BORDER + SPACE + TOP_LEFT_CORNER + HORIZONTAL_BORDER.repeat(28) + TOP_RIGHT_CORNER);
        System.out.println(TOP_LEFT_CORNER + HORIZONTAL_BORDER.repeat(28) + TOP_RIGHT_CORNER + SPACE + VERTICAL_BORDER);
        System.out.print(VERTICAL_BORDER + SPACE + VERTICAL_BORDER + " ".repeat(10) + yellow + "  MENU  " + " ".repeat(10) + cyan + VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER + " ".repeat(28) + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + HORIZONTAL_BORDER.repeat(28) + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(28) + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + " ".repeat(28) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + " ██████╗ ██████╗ " + reset + " ".repeat(5) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  1 > NEW CUSTOMER " + " ".repeat(9) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + "██╔════╝ ╚════██╗" + reset + " ".repeat(5) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  2 > CUSTOMER LIST " + " ".repeat(8) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + "██║  ███╗ █████╔╝" + reset + " ".repeat(5) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  3 > UPDATE CUSTOMER " + " ".repeat(6) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + "██║   ██║ ╚═══██╗" + reset + " ".repeat(5) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  4 > DELETE CUSTOMER " + " ".repeat(6) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + "╚██████╔╝██████╔╝" + reset + " ".repeat(5) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  5 > BACK TO MAIN MENU " + " ".repeat(4) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + "╚═════╝ ╚═════╝" + reset + " ".repeat(7) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + " ".repeat(28) + cyan + VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER + " ".repeat(28) + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(VERTICAL_BORDER + SPACE + BOTTOM_LEFT_CORNER + "─".repeat(28) + BOTTOM_RIGHT_CORNER);
        System.out.println(BOTTOM_LEFT_CORNER + HORIZONTAL_BORDER.repeat(28) + BOTTOM_RIGHT_CORNER + SPACE + VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER + SPACE + TOP_LEFT_CORNER + HORIZONTAL_BORDER.repeat(58) + TOP_RIGHT_CORNER + SPACE + VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER + SPACE + VERTICAL_BORDER + " ".repeat(14) + yellow + "Choose Option Between : 1 - 5 " + " ".repeat(14) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER + SPACE + BOTTOM_LEFT_CORNER + HORIZONTAL_BORDER.repeat(58) + BOTTOM_RIGHT_CORNER + SPACE + VERTICAL_BORDER);
        System.out.println(BOTTOM_LEFT_CORNER + HORIZONTAL_BORDER.repeat(62) + BOTTOM_RIGHT_CORNER);
        System.out.print(reset);
    }







    // User
    public void userMenu() {
        System.out.print(cyan);
        System.out.println(TOP_LEFT_CORNER + HORIZONTAL_BORDER.repeat(62) + TOP_RIGHT_CORNER);
        System.out.print(VERTICAL_BORDER + SPACE + TOP_LEFT_CORNER + HORIZONTAL_BORDER.repeat(28) + TOP_RIGHT_CORNER);
        System.out.println(TOP_LEFT_CORNER + HORIZONTAL_BORDER.repeat(28) + TOP_RIGHT_CORNER + SPACE + VERTICAL_BORDER);
        System.out.print(VERTICAL_BORDER + SPACE + VERTICAL_BORDER + " ".repeat(10) + yellow + "  MENU  " + " ".repeat(10) + cyan + VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER + " ".repeat(28) + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + HORIZONTAL_BORDER.repeat(28) + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(28) + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + " ".repeat(28) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + " ██████╗ ██████╗ " + reset + " ".repeat(5) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  1 > NEW USER " + " ".repeat(13) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + "██╔════╝ ╚════██╗" + reset + " ".repeat(5) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  2 > USER LIST " + " ".repeat(12) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + "██║  ███╗ █████╔╝" + reset + " ".repeat(5) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  3 > UPDATE USER " + " ".repeat(10) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + "██║   ██║ ╚═══██╗" + reset + " ".repeat(5) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  4 > DELETE USER " + " ".repeat(10) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + "╚██████╔╝██████╔╝" + reset + " ".repeat(5) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  5 > BACK TO MAIN MENU " + " ".repeat(4) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + "╚═════╝ ╚═════╝" + reset + " ".repeat(7) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + " ".repeat(28) + cyan + VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER + " ".repeat(28) + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(VERTICAL_BORDER + SPACE + BOTTOM_LEFT_CORNER + "─".repeat(28) + BOTTOM_RIGHT_CORNER);
        System.out.println(BOTTOM_LEFT_CORNER + HORIZONTAL_BORDER.repeat(28) + BOTTOM_RIGHT_CORNER + SPACE + VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER + SPACE + TOP_LEFT_CORNER + HORIZONTAL_BORDER.repeat(58) + TOP_RIGHT_CORNER + SPACE + VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER + SPACE + VERTICAL_BORDER + " ".repeat(14) + yellow + "Choose Option Between : 1 - 5 " + " ".repeat(14) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER + SPACE + BOTTOM_LEFT_CORNER + HORIZONTAL_BORDER.repeat(58) + BOTTOM_RIGHT_CORNER + SPACE + VERTICAL_BORDER);
        System.out.println(BOTTOM_LEFT_CORNER + HORIZONTAL_BORDER.repeat(62) + BOTTOM_RIGHT_CORNER);
        System.out.print(reset);
    }


}