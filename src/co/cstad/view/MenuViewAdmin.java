package co.cstad.view;

import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

import java.util.Scanner;

public class MenuViewAdmin implements BoxBorder {
    static Scanner scanner = new Scanner(System.in);




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


    // 1.Item
    public void itemConfirmation(){
        System.out.println();
        Table table = new Table(2, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE, ShownBorders.ALL);
        table.setColumnWidth(0,30,30);
        table.setColumnWidth(1,30,30);
        table.addCell(" ".repeat(3) + yellow + "Description:" +reset);
        table.addCell(" ".repeat(3) + cyan + "111" + reset);
        table.addCell(" ".repeat(3)+ yellow + "Code:" + reset);
        table.addCell(" ".repeat(3)+ cyan + "CSTAD111222" + reset);
        table.addCell(" ".repeat(3)+ yellow + "Name:" + reset);
        table.addCell(" ".repeat(3)+ cyan + "Hanuman Beer:"  + reset);
        table.addCell(" ".repeat(3)+ yellow +"Unit:" + reset);
        table.addCell(" ".repeat(3)+ cyan +"0.25$" + reset);
        table.addCell(" ".repeat(3)+ yellow +"Quantity:" + reset);
        table.addCell(" ".repeat(3)+ cyan +"400" + reset);
        table.addCell(" ".repeat(3)+ yellow +"Price_A:" + reset);
        table.addCell(" ".repeat(3)+ cyan +"0.25$" + reset);
        table.addCell(" ".repeat(3)+ yellow +"Price_B:" + reset);
        table.addCell(" ".repeat(3)+ cyan +"0.27$" + reset);
        table.addCell(" ".repeat(3)+ yellow +"Price_C:");
        table.addCell(" ".repeat(3)+ cyan +"0.30$" + reset);
        table.addCell(" ".repeat(3)+ yellow +"Status:" + reset);
        table.addCell(" ".repeat(3)+ cyan +"Active" + reset);
        System.out.println( table.render());
    }

    public void itemStockIn(){
        System.out.println("Enter Description:");
        System.out.println("Enter Unit:");
        System.out.println("Enter Quantity:");
        System.out.println("Enter Capacity:");
        System.out.println("Enter Price_A:");
        System.out.println("Enter Price_B:");
        System.out.println("Enter Price_C:");
        System.out.println();
        itemConfirmation();
    }

    public void menuItemUpdate(){
        System.out.print("Enter Item id to update: ");
        int idItempUpdate = scanner.nextInt();
        Table table = new Table(6, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE, ShownBorders.ALL);
        table.setColumnWidth(0,15,30);
        table.setColumnWidth(1,15,30);
        table.setColumnWidth(2,15,30);
        table.setColumnWidth(3,15,30);
        table.setColumnWidth(4,15,30);
        table.setColumnWidth(5,15,30);
        table.addCell(" ".repeat(3)+"1.All");
        table.addCell(" ".repeat(3)+"2.Name");
        table.addCell(" ".repeat(3)+"3.Uit");
        table.addCell(" ".repeat(3)+"4.Qty");
        table.addCell(" ".repeat(3)+"5.Status");
        table.addCell(" ".repeat(3)+"6.Price");
        System.out.println(table.render());
    }

    public void itemUpdateAll(){
        System.out.println("Enter New Description:");
        System.out.println("Enter New Unit:");
        System.out.println("Enter New Quantity:");
        System.out.println("Enter New Capacity:");
        System.out.println("Enter New Price_A:");
        System.out.println("Enter New Price_B:");
        System.out.println("Enter New Price_C:");
    }

    public void itemUpdateName(){
        System.out.print("Enter New Item Name to Update: ");
        itemConfirmation();
    }

    public void itemUpdateUint(){
        System.out.print("Enter New Item Unit to Update: ");
        itemConfirmation();
    }

    public void itemUpdateQty(){
        System.out.print("Enter New Item Qty to Update: ");
        itemConfirmation();
    }

    public void itemUpdateStatus(){
        System.out.print("Enter New Item Statues to Update: ");
        itemConfirmation();
    }

    public void itemUpdatePrice(){
        System.out.print("Enter New Item Price to Update: ");
        itemConfirmation();
    }

    public void itemDelete(){
        System.out.print("Enter Item id to delete: ");
        int idItemDelete = scanner.nextInt();
        itemConfirmation();
    }

    public void itemRead(){
        Table table = new Table(9, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE, ShownBorders.ALL);
        table.setColumnWidth(0,15,20);
        table.setColumnWidth(1,15,20);
        table.setColumnWidth(2,15,20);
        table.setColumnWidth(3,15,20);
        table.setColumnWidth(4,15,20);
        table.setColumnWidth(5,15,20);
        table.setColumnWidth(6,15,20);
        table.setColumnWidth(7,15,20);
        table.setColumnWidth(8,15,20);

        table.addCell(" ".repeat(2)+ yellow + "ID");
        table.addCell(" ".repeat(2)+ yellow +"CODE");
        table.addCell(" ".repeat(2)+ yellow +"Name");
        table.addCell(" ".repeat(2)+ yellow +"Unit");
        table.addCell(" ".repeat(2)+ yellow +"Qty");
        table.addCell(" ".repeat(2)+ yellow +"Price_A");
        table.addCell(" ".repeat(2)+ yellow +"Price_B");
        table.addCell(" ".repeat(2)+ yellow +"Price_C");
        table.addCell(" ".repeat(2)+ yellow +"Status");

        table.addCell(" ".repeat(2)+blue+"111");
        table.addCell(" ".repeat(2)+blue+"CSTAD1123");
        table.addCell(" ".repeat(2)+blue+"Sting");
        table.addCell(" ".repeat(2)+blue+"000");
        table.addCell(" ".repeat(2)+blue+"000");
        table.addCell(" ".repeat(2)+blue+"1.02$");
        table.addCell(" ".repeat(2)+blue+"1.0$");
        table.addCell(" ".repeat(2)+blue+"0.99S");
        table.addCell(" ".repeat(2)+blue+"Active");

        table.addCell(" ".repeat(2)+blue+"222");
        table.addCell(" ".repeat(2)+blue+"CSTAD1124");
        table.addCell(" ".repeat(2)+blue+"Hanuman");
        table.addCell(" ".repeat(2)+blue+"000");
        table.addCell(" ".repeat(2)+blue+"000");
        table.addCell(" ".repeat(2)+blue+"1.02$");
        table.addCell(" ".repeat(2)+blue+"1.0$");
        table.addCell(" ".repeat(2)+blue+"0.99S");
        table.addCell(" ".repeat(2)+blue+"Active");

        table.addCell(" ".repeat(2)+ blue +" ");
        table.addCell(" ".repeat(2)+ blue +" ");
        table.addCell(" ".repeat(2)+ blue +" ");
        table.addCell(" ".repeat(2)+ blue +" ");
        table.addCell(" ".repeat(2)+ blue +" ");
        table.addCell(" ".repeat(2)+ blue +" ");
        table.addCell(" ".repeat(2)+ blue +" ");
        table.addCell(" ".repeat(2)+ blue +" ");
        table.addCell(" ".repeat(2)+ blue +" ");

        System.out.println(table.render());
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


    // 5.Report
    public void stockCountReport(){
        System.out.println(yellow + "\t\tStock Count Report" + reset);
        Table table = new Table(4, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE, ShownBorders.ALL);
        table.setColumnWidth(0,15,20);
        table.setColumnWidth(1,15,20);
        table.setColumnWidth(2,15,20);
        table.setColumnWidth(3,15,20);

        table.addCell(" ".repeat(2)+ yellow + "Stock_Count_Id");
        table.addCell(" ".repeat(2)+ yellow +"Item_Id");
        table.addCell(" ".repeat(2)+ yellow +"Stock_Count_Date");
        table.addCell(" ".repeat(2)+ yellow +"Qty");

        table.addCell(" ".repeat(2)+blue+"1");
        table.addCell(" ".repeat(2)+blue+"111");
        table.addCell(" ".repeat(2)+blue+"2023-01-02");
        table.addCell(" ".repeat(2)+blue+"1.02$");
        table.addCell(" ".repeat(2)+blue+"2");
        table.addCell(" ".repeat(2)+blue+"222");
        table.addCell(" ".repeat(2)+blue+"2023-01-03");
        table.addCell(" ".repeat(2)+blue+"1.25$");

        table.addCell(" ".repeat(2)+ blue +" ");
        table.addCell(" ".repeat(2)+ blue +" ");
        table.addCell(" ".repeat(2)+ blue +" ");
        table.addCell(" ".repeat(2)+ blue +" ");

        System.out.println(table.render());
    }

    public void stockInReport(){
        System.out.println(yellow + "\t\tStock In Report"+reset);
        Table table = new Table(5, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE, ShownBorders.ALL);
        table.setColumnWidth(0,15,20);
        table.setColumnWidth(1,15,20);
        table.setColumnWidth(2,15,20);
        table.setColumnWidth(3,15,20);
        table.setColumnWidth(4,15,20);

        table.addCell(" ".repeat(2)+ yellow + "Stock_In_Id");
        table.addCell(" ".repeat(2)+ yellow +"Item_Id");
        table.addCell(" ".repeat(2)+ yellow +"Stock_Count_Date");
        table.addCell(" ".repeat(2)+ yellow +"Price_In");
        table.addCell(" ".repeat(2)+ yellow +"Last_Qty" + reset);

        table.addCell(" ".repeat(2)+blue+"1");
        table.addCell(" ".repeat(2)+blue+"111");
        table.addCell(" ".repeat(2)+blue+"2023-01-02");
        table.addCell(" ".repeat(2)+blue+"1.02$");
        table.addCell(" ".repeat(2)+blue+"50");
        table.addCell(" ".repeat(2)+blue+"2");
        table.addCell(" ".repeat(2)+blue+"222");
        table.addCell(" ".repeat(2)+blue+"2023-01-03");
        table.addCell(" ".repeat(2)+blue+"1.25$");
        table.addCell(" ".repeat(2)+blue+"1200" + reset);

        table.addCell(" ".repeat(2)+ blue +" ");
        table.addCell(" ".repeat(2)+ blue +" ");
        table.addCell(" ".repeat(2)+ blue +" ");
        table.addCell(" ".repeat(2)+ blue +" ");
        table.addCell(" ".repeat(2)+ blue +" "+reset);

        System.out.println(table.render());
    }

    public void stockOutReport(){
        System.out.println(yellow + "\t\tStock Out Report"+reset);
        Table table = new Table(5, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE, ShownBorders.ALL);
        table.setColumnWidth(0,15,20);
        table.setColumnWidth(1,15,20);
        table.setColumnWidth(2,15,20);
        table.setColumnWidth(3,15,20);
        table.setColumnWidth(4,15,20);

        table.addCell(" ".repeat(2)+ yellow + "Stock_In_Id");
        table.addCell(" ".repeat(2)+ yellow +"Item_Id");
        table.addCell(" ".repeat(2)+ yellow +"Stock_Count_Date");
        table.addCell(" ".repeat(2)+ yellow +"Price_In");
        table.addCell(" ".repeat(2)+ yellow +"Last_Qty" + reset);

        table.addCell(" ".repeat(2)+blue+"1");
        table.addCell(" ".repeat(2)+blue+"111");
        table.addCell(" ".repeat(2)+blue+"2023-01-02");
        table.addCell(" ".repeat(2)+blue+"1.02$");
        table.addCell(" ".repeat(2)+blue+"50");
        table.addCell(" ".repeat(2)+blue+"2");
        table.addCell(" ".repeat(2)+blue+"222");
        table.addCell(" ".repeat(2)+blue+"2023-01-03");
        table.addCell(" ".repeat(2)+blue+"1.25$");
        table.addCell(" ".repeat(2)+blue+"1200" + reset);

        table.addCell(" ".repeat(2)+ blue +" ");
        table.addCell(" ".repeat(2)+ blue +" ");
        table.addCell(" ".repeat(2)+ blue +" ");
        table.addCell(" ".repeat(2)+ blue +" ");
        table.addCell(" ".repeat(2)+ blue +" "+reset);

        System.out.println(table.render());
    }

    public void invoiceDetail(){
        System.out.println(yellow + "\t\tInvoice Detail"+reset);
        Table table = new Table(5, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE, ShownBorders.ALL);
        table.setColumnWidth(0,15,20);
        table.setColumnWidth(1,15,20);
        table.setColumnWidth(2,15,20);
        table.setColumnWidth(3,15,20);
        table.setColumnWidth(4,15,20);

        table.addCell(" ".repeat(2)+ yellow + "Invoice_Detail_Id");
        table.addCell(" ".repeat(2)+ yellow +"Invoice_Id");
        table.addCell(" ".repeat(2)+ yellow +"Item_Id");
        table.addCell(" ".repeat(2)+ yellow +"Qty");
        table.addCell(" ".repeat(2)+ yellow +"Unit_Price" + reset);

        table.addCell(" ".repeat(2)+blue+"1");
        table.addCell(" ".repeat(2)+blue+"111");
        table.addCell(" ".repeat(2)+blue+"111");
        table.addCell(" ".repeat(2)+blue+"200");
        table.addCell(" ".repeat(2)+blue+"4000");

        table.addCell(" ".repeat(2)+blue+"2");
        table.addCell(" ".repeat(2)+blue+"222");
        table.addCell(" ".repeat(2)+blue+"222");
        table.addCell(" ".repeat(2)+blue+"1200");
        table.addCell(" ".repeat(2)+blue+"3000");

        table.addCell(" ".repeat(2)+ blue +" ");
        table.addCell(" ".repeat(2)+ blue +" ");
        table.addCell(" ".repeat(2)+ blue +" ");
        table.addCell(" ".repeat(2)+ blue +" ");
        table.addCell(" ".repeat(2)+ blue +" "+reset);

        System.out.println(table.render());
    }

    public void invoideAdjustment(){
        System.out.println(yellow + "\t\tInvoice Adjustment"+reset);
        Table table = new Table(6, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE, ShownBorders.ALL);
        table.setColumnWidth(0,15,20);
        table.setColumnWidth(1,15,20);
        table.setColumnWidth(2,15,20);
        table.setColumnWidth(3,15,20);
        table.setColumnWidth(4,15,20);
        table.setColumnWidth(5,15,20);

        table.addCell(" ".repeat(1)+ yellow + "Invoice_Adjustment");
        table.addCell(" ".repeat(2)+ yellow +"Invoice_Id");
        table.addCell(" ".repeat(2)+ yellow +"Item_Id");
        table.addCell(" ".repeat(2)+ yellow +"Qty");
        table.addCell(" ".repeat(2)+ yellow +"Unit_Price");
        table.addCell(" ".repeat(2)+ yellow +"Returned_Date" + reset);

        table.addCell(" ".repeat(2)+blue+" ");
        table.addCell(" ".repeat(2)+blue+"1");
        table.addCell(" ".repeat(2)+blue+"111");
        table.addCell(" ".repeat(2)+blue+"50");
        table.addCell(" ".repeat(2)+blue+"500");
        table.addCell(" ".repeat(2)+blue+"2023-11-12");

        table.addCell(" ".repeat(2)+blue+" ");
        table.addCell(" ".repeat(2)+blue+"2");
        table.addCell(" ".repeat(2)+blue+"222");
        table.addCell(" ".repeat(2)+blue+"50");
        table.addCell(" ".repeat(2)+blue+"500");
        table.addCell(" ".repeat(2)+blue+"2023-11-12");

        table.addCell(" ".repeat(2)+ blue +" ");
        table.addCell(" ".repeat(2)+ blue +" ");
        table.addCell(" ".repeat(2)+ blue +" ");
        table.addCell(" ".repeat(2)+ blue +" ");
        table.addCell(" ".repeat(2)+ blue +" ");
        table.addCell(" ".repeat(2)+ blue +" "+reset);

        System.out.println(table.render());
    }

    public void itemsPriceHistory(){
        System.out.println(yellow + "\t\tItems Price History"+reset);
        Table table = new Table(4, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE, ShownBorders.ALL);
        table.setColumnWidth(0,15,20);
        table.setColumnWidth(1,15,20);
        table.setColumnWidth(2,15,20);
        table.setColumnWidth(3,15,20);

        table.addCell(" ".repeat(2)+ yellow +"Id");
        table.addCell(" ".repeat(2)+ yellow +"Item_Id");
        table.addCell(" ".repeat(2)+ yellow +"Price");
        table.addCell(" ".repeat(2)+ yellow +"Update_At" + reset);

        table.addCell(" ".repeat(2)+blue+"1");
        table.addCell(" ".repeat(2)+blue+"111");
        table.addCell(" ".repeat(2)+blue+"5000");
        table.addCell(" ".repeat(2)+blue+"50");

        table.addCell(" ".repeat(2)+blue+"2");
        table.addCell(" ".repeat(2)+blue+"222");
        table.addCell(" ".repeat(2)+blue+"4500");
        table.addCell(" ".repeat(2)+blue+"150");

        table.addCell(" ".repeat(2)+ blue +" ");
        table.addCell(" ".repeat(2)+ blue +" ");
        table.addCell(" ".repeat(2)+ blue +" ");
        table.addCell(" ".repeat(2)+ blue +" "+reset);

        System.out.println(table.render());
    }

    public void stockAlertReport(){
        System.out.println(yellow + "\t\tStock Alert Report"+reset);
        Table table = new Table(3, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE, ShownBorders.ALL);
        table.setColumnWidth(0,15,20);
        table.setColumnWidth(1,15,20);
        table.setColumnWidth(2,15,20);

        table.addCell(" ".repeat(2)+ yellow +"Id");
        table.addCell(" ".repeat(2)+ yellow +"Item_Id");
        table.addCell(" ".repeat(2)+ yellow +"Qty_Alert" + reset);

        table.addCell(" ".repeat(2)+blue+"1");
        table.addCell(" ".repeat(2)+blue+"111");
        table.addCell(" ".repeat(2)+blue+"10");

        table.addCell(" ".repeat(2)+blue+"2");
        table.addCell(" ".repeat(2)+blue+"222");
        table.addCell(" ".repeat(2)+blue+"5");

        table.addCell(" ".repeat(2)+ blue +" ");
        table.addCell(" ".repeat(2)+ blue +" ");
        table.addCell(" ".repeat(2)+ blue +" "+reset);

        System.out.println(table.render());
    }

    public void summaryReport(){
        System.out.println(yellow + "\t\tSummary Report"+reset);
        Table table = new Table(3, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE, ShownBorders.ALL);
        table.setColumnWidth(0,15,20);
        table.setColumnWidth(1,15,20);
        table.setColumnWidth(2,15,20);

        table.addCell(" ".repeat(2)+ yellow +"Id");
        table.addCell(" ".repeat(2)+ yellow +"Item_Id");
        table.addCell(" ".repeat(2)+ yellow +"Qty_Alert" + reset);

        table.addCell(" ".repeat(2)+blue+"1");
        table.addCell(" ".repeat(2)+blue+"111");
        table.addCell(" ".repeat(2)+blue+"10");

        table.addCell(" ".repeat(2)+blue+"2");
        table.addCell(" ".repeat(2)+blue+"222");
        table.addCell(" ".repeat(2)+blue+"5");

        table.addCell(" ".repeat(2)+ blue +" ");
        table.addCell(" ".repeat(2)+ blue +" ");
        table.addCell(" ".repeat(2)+ blue +" "+reset);

        System.out.println(table.render());
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
    public void optionListUser(){
        Table table = new Table(4, BorderStyle.UNICODE_BOX,ShownBorders.SURROUND);
        table.setColumnWidth(0,20,20);
        table.setColumnWidth(1,20,20);
        table.setColumnWidth(2,20,20);
        table.setColumnWidth(3,20,20);

        table.addCell(yellow +"  1 > Admin " + reset  );
        table.addCell(yellow +"  2 > Manager " + reset  );
        table.addCell(yellow +"  3 > Report " + reset  );
        table.addCell(yellow +"  4 > Back  " + reset  );
        System.out.print(table.render());
        System.out.println("\n");

    }
    public void inputUserList(){
        Table table = new Table(1, BorderStyle.UNICODE_BOX_DOUBLE_BORDER,ShownBorders.SURROUND);
        table.setColumnWidth(0,40,50);


        System.out.println(green + "_".repeat(50) + reset);
        System.out.print("Enter UserName : ");
        String des = scanner.nextLine();
        System.out.print("Enter Address : ");
        double unit = scanner.nextDouble();
        System.out.print("Enter Email : ");
        int qty = scanner.nextInt();
        System.out.print("Enter Contact : ");
        int priceA = scanner.nextInt();
        System.out.print("Enter Password : ");
        int priceB = scanner.nextInt();
        System.out.print("Enter Confirm Password : ");
        int priceC = scanner.nextInt();
        System.out.println(green + "_".repeat(50) + reset + "\n");


        table.addCell(yellow +"  - Description Item " + reset  + " ".repeat(0) + ": " + des);
        table.addCell(yellow +"  - Unit Item " + reset  + " ".repeat(7) + ": " + unit);
        table.addCell(yellow +"  - Quantity Item " + reset  + " ".repeat(3) + ": " + qty);
        table.addCell(yellow +"  - Price_A  Item " + reset  + " ".repeat(3) + ": " + priceA);
        table.addCell(yellow +"  - Price_B  Item " + reset  + " ".repeat(3) + ": " + priceB);
        table.addCell(yellow +"  - Price_C  Item " + reset + " ".repeat(3) + ": " + priceC );
        System.out.print(table.render());
        System.out.println("\n");

    }
    public void readUser(){
        Table table = new Table(7, BorderStyle.UNICODE_BOX,ShownBorders.ALL);
        table.setColumnWidth(0,15,25);
        table.setColumnWidth(1,20,50);
        table.setColumnWidth(2,20,50);
        table.setColumnWidth(3,20,50);
        table.setColumnWidth(4,20,50);
        table.setColumnWidth(5,20,50);
        table.setColumnWidth(6,20,50);





        table.addCell(yellow +"   ID  " + reset);
        table.addCell(yellow +"   Role  " + reset  );
        table.addCell(yellow +"   Name  " + reset);
        table.addCell(yellow +"   Address  "+ reset );
        table.addCell(yellow +"   Email  "+ reset );
        table.addCell(yellow +"   Contact  " + reset );
        table.addCell(yellow +"   Password   "+ reset );



        table.addCell("   101  ");
        table.addCell("   Admin  ");
        table.addCell("   Delo  ");
        table.addCell("   #PP CAMBODIA ");
        table.addCell("   delo11@gmail.com  ");
        table.addCell("   010 199 000 ");
        table.addCell("   123  ");
        table.addCell("   201  ");
        table.addCell("   Manager  ");
        table.addCell("   Java ");
        table.addCell("   #PP CAMBODIA ");
        table.addCell("   java111@gmail.com  ");
        table.addCell("   010 099 200 ");
        table.addCell("   1234  ");


        table.addCell("     ");
        table.addCell("     ");
        table.addCell("     ");
        table.addCell("     ");
        table.addCell("     ");
        table.addCell("     ");
        table.addCell("     ");

        System.out.print(table.render());
        System.out.println("\n");
        System.out.print("  >> Choose [Yes/yes] OR [No/no] : ");
        String choose = scanner.nextLine();


    }
    public void optionListUpUser(){
        Table table = new Table(3, BorderStyle.UNICODE_BOX,ShownBorders.SURROUND);
        table.setColumnWidth(0,20,20);
        table.setColumnWidth(1,20,20);
        table.setColumnWidth(2,20,20);
        table.setColumnWidth(3,20,20);

        table.addCell(yellow +"  1 > ALL " + reset  );
        table.addCell(yellow +"  2 > USER NAME " + reset  );
        table.addCell(yellow +"  3 > PASSWORD " + reset  );
        table.addCell(yellow +"  4 > ROLE " + reset  );
        table.addCell(yellow +"  5 > STATUS " + reset  );
        table.addCell(yellow +"  6 > EXIT " + reset  );
        System.out.print(table.render());
        System.out.println("\n");

    }

    public void userUpdateAll(){
        Table table = new Table(1, BorderStyle.UNICODE_BOX_DOUBLE_BORDER,ShownBorders.SURROUND);
        table.setColumnWidth(0,50,200);


        System.out.println(green + "_".repeat(50) + reset);
        System.out.println("Enter New User Name : ");
        String des = scanner.nextLine();
        System.out.println("Enter New Role : ");
        String unit = scanner.nextLine();
        System.out.println("Enter New Status : ");
        String qty = scanner.nextLine();
        System.out.println("Enter New Password : ");
        String priceA = scanner.nextLine();
        System.out.println("Enter New Confirm Password : ");
        String priceB = scanner.nextLine();

        System.out.println(green + "_".repeat(50) + reset + "\n");


        table.addCell(yellow +"  - User Name " + reset  + " ".repeat(0) + ": " + des);
        table.addCell(yellow +"  - Role " + reset  + " ".repeat(7) + ": " + unit);
        table.addCell(yellow +"  - Status " + reset  + " ".repeat(3) + ": " + qty);
        table.addCell(yellow +"  - Password " + reset  + " ".repeat(3) + ": " + priceA);

        System.out.print(table.render());
        System.out.println("\n");


    }
    public void userUpdateName(){
        Table table = new Table(1, BorderStyle.UNICODE_BOX_DOUBLE_BORDER,ShownBorders.SURROUND);
        table.setColumnWidth(0,50,200);


        System.out.println(green + "_".repeat(50) + reset);
        System.out.println("Enter New User Name : ");
        String des = scanner.nextLine();
        System.out.println(green + "_".repeat(50) + reset + "\n");


        table.addCell(yellow +"  - User Name " + reset  + " ".repeat(0) + ": " + des);
        table.addCell(yellow +"  - Role " + reset  + " ".repeat(7) + ": " + "Admin");
        table.addCell(yellow +"  - Status " + reset  + " ".repeat(3) + ": " + "Active");
        table.addCell(yellow +"  - Password " + reset  + " ".repeat(3) + ": " + "123");


        System.out.print(table.render());
        System.out.println("\n");

    }

    public void userUpdateRole(){
        Table table = new Table(1, BorderStyle.UNICODE_BOX_DOUBLE_BORDER,ShownBorders.SURROUND);
        table.setColumnWidth(0,50,200);


        System.out.println(green + "_".repeat(50) + reset);
        System.out.println("Enter New User Role : ");
        String des = scanner.nextLine();
        System.out.println(green + "_".repeat(50) + reset + "\n");


        table.addCell(yellow +"  - User Name " + reset  + " ".repeat(0) + ": " + "DaJa");
        table.addCell(yellow +"  - Role " + reset  + " ".repeat(7) + ": " + des);
        table.addCell(yellow +"  - Status " + reset  + " ".repeat(3) + ": " + "Active");
        table.addCell(yellow +"  - Password " + reset  + " ".repeat(3) + ": " + "123");


        System.out.print(table.render());
        System.out.println("\n");

    }

    public void userUpdatePassword(){
        Table table = new Table(1, BorderStyle.UNICODE_BOX_DOUBLE_BORDER,ShownBorders.SURROUND);
        table.setColumnWidth(0,50,200);


        System.out.println(green + "_".repeat(50) + reset);
        System.out.println("Enter New User Password : ");
        String des = scanner.nextLine();
        System.out.println(green + "_".repeat(50) + reset + "\n");


        table.addCell(yellow +"  - User Name " + reset  + " ".repeat(0) + ": " + "Daja" );
        table.addCell(yellow +"  - Role " + reset  + " ".repeat(7) + ": " + "Admin");
        table.addCell(yellow +"  - Status " + reset  + " ".repeat(3) + ": " + "Active");
        table.addCell(yellow +"  - Password " + reset  + " ".repeat(3) + ": " + des);


        System.out.print(table.render());
        System.out.println("\n");



    }

    public void userUpdateStatus(){
        Table table = new Table(1, BorderStyle.UNICODE_BOX_DOUBLE_BORDER,ShownBorders.SURROUND);
        table.setColumnWidth(0,50,200);


        System.out.println(green + "_".repeat(50) + reset);
        System.out.println("Enter New User Status : ");
        String des = scanner.nextLine();
        System.out.println(green + "_".repeat(50) + reset + "\n");


        table.addCell(yellow +"  - User Name " + reset  + " ".repeat(0) + ": " + "Daja");
        table.addCell(yellow +"  - Role " + reset  + " ".repeat(7) + ": " + "Admin");
        table.addCell(yellow +"  - Status " + reset  + " ".repeat(3) + ": " + des);
        table.addCell(yellow +"  - Password " + reset  + " ".repeat(3) + ": " + "123");


        System.out.print(table.render());
        System.out.println("\n");


    }
    public void disUser(){
        Table table = new Table(1, BorderStyle.UNICODE_BOX,ShownBorders.SURROUND);
        table.setColumnWidth(0,50,200);

        table.addCell(yellow +"  - User ID : " + reset  + " ".repeat(9) +"101");
        table.addCell(yellow +"  - User Role : " + reset  + " ".repeat(9) +"Admin");
        table.addCell(yellow +"  - User Name : " + reset  + " ".repeat(7) + "Daja");
        table.addCell(yellow +"  - User Address : " + reset  + " ".repeat(4) + "#PP - CAMBODIA");
        table.addCell(yellow +"  - User Contact : " + reset  + " ".repeat(2) + "01234444");
        table.addCell(yellow +"  - User Password : " + reset  + " ".repeat(2) + "123");

        System.out.print(table.render());
        System.out.println("\n");

    }




}
