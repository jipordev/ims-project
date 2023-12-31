package co.cstad.view.staticmenu;

import co.cstad.model.CustomerDTO;
import co.cstad.model.ItemDTO;
import co.cstad.model.UserDTO;
import co.cstad.view.staticmenu.BoxBorder;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

public class MenuViewAdmin implements BoxBorder {


    // Main Menu Admin
    public static void mainMenuAdmin() {
        System.out.print(cyan);
        System.out.println(TOP_LEFT_CORNER + HORIZONTAL_BORDER.repeat(62) + TOP_RIGHT_CORNER);
        System.out.print(VERTICAL_BORDER + SPACE + TOP_LEFT_CORNER + HORIZONTAL_BORDER.repeat(28) + TOP_RIGHT_CORNER);
        System.out.println(TOP_LEFT_CORNER + HORIZONTAL_BORDER.repeat(28) + TOP_RIGHT_CORNER + SPACE + VERTICAL_BORDER);
        System.out.print(VERTICAL_BORDER + SPACE + VERTICAL_BORDER + " ".repeat(7) + yellow + " MAIN MENU  " + " ".repeat(9) + cyan + VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER + " ".repeat(28) + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + HORIZONTAL_BORDER.repeat(28) + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(28) + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + " ".repeat(28) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + " ██████╗ ██████╗ " + reset + " ".repeat(5) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  1\uFE0F⃣ ➡ ITEM " + " ".repeat(15) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + "██╔════╝ ╚════██╗" + reset + " ".repeat(5) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  2\uFE0F⃣ ➡ CUSTOMER " + " ".repeat(11) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + "██║  ███╗ █████╔╝" + reset + " ".repeat(5) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  3\uFE0F⃣ ➡ INVOICE " + " ".repeat(12) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + "██║   ██║ ╚═══██╗" + reset + " ".repeat(5) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  4\uFE0F⃣ ➡ USER " + " ".repeat(15) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + "╚██████╔╝██████╔╝" + reset + " ".repeat(5) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  5\uFE0F⃣ ➡ REPORT " + " ".repeat(13) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + "╚═════╝ ╚═════╝" + reset + " ".repeat(7) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  6\uFE0F⃣ ➡ SIGN OUT " + " ".repeat(11) + cyan + VERTICAL_BORDER);
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
    public void itemConfirmation(ItemDTO newItem) {
        System.out.println();
        Table table = new Table(2, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE, ShownBorders.SURROUND);
        table.setColumnWidth(0, 30, 30);
        table.setColumnWidth(1, 30, 30);
        table.addCell(" ".repeat(3) + yellow + "Description:" + reset);
        table.addCell(" ".repeat(3) + cyan + newItem.getItemDescription() + reset);
        table.addCell(" ".repeat(3) + yellow + "Code:" + reset);
        table.addCell(" ".repeat(3) + cyan + newItem.getItemCode() + reset);
        table.addCell(" ".repeat(3) + yellow + "Unit:" + reset);
        table.addCell(" ".repeat(3) + cyan + newItem.getItemUnit() + reset);
        table.addCell(" ".repeat(3) + yellow + "Quantity:" + reset);
        table.addCell(" ".repeat(3) + cyan + newItem.getQty() + reset);
        table.addCell(" ".repeat(3) + yellow + "Price:" + reset);
        table.addCell(" ".repeat(3) + cyan + newItem.getItemPrice() + reset);
        table.addCell(" ".repeat(3) + yellow + "Price_A:" + reset);
        table.addCell(" ".repeat(3) + cyan + newItem.getItemPrice_out_a() + reset);
        table.addCell(" ".repeat(3) + yellow + "Price_B:" + reset);
        table.addCell(" ".repeat(3) + cyan + newItem.getItemPrice_out_b() + reset);
        table.addCell(" ".repeat(3) + yellow + "Price_C:" + reset);
        table.addCell(" ".repeat(3) + cyan + newItem.getItemPrice_out_c() + reset);
        if (newItem.getStatus() != null) {
            table.addCell(" ".repeat(3) + yellow + "Status:" + reset);
            table.addCell(" ".repeat(3) + cyan + (newItem.getStatus() ? "Active" : "Inactive") + reset);
        }
        System.out.println(table.render());
    }
    public void cutomerConfirmation(CustomerDTO newCustomer) {
        System.out.println();
        Table table = new Table(2, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE, ShownBorders.SURROUND);
        table.setColumnWidth(0, 30, 30);
        table.setColumnWidth(1, 30, 30);
        table.addCell(" ".repeat(3) + yellow + "Customer ID :" + reset);
        table.addCell(" ".repeat(3) + cyan + newCustomer.getCustomersId() + reset);
        table.addCell(" ".repeat(3) + yellow + "Customer Name :" + reset);
        table.addCell(" ".repeat(3) + cyan + newCustomer.getCustomerName() + reset);
        table.addCell(" ".repeat(3) + yellow + "Customer Address :" + reset);
        table.addCell(" ".repeat(3) + cyan + newCustomer.getAddress() + reset);
        table.addCell(" ".repeat(3) + yellow + "Customer Contact 1 :" + reset);
        table.addCell(" ".repeat(3) + cyan + newCustomer.getContact1() + reset);
        table.addCell(" ".repeat(3) + yellow + "Customer Contact 2 :" + reset);
        table.addCell(" ".repeat(3) + cyan + newCustomer.getContact2() + reset);

        if (newCustomer.getStatus() != null) {
            table.addCell(" ".repeat(3) + yellow + "Status:" + reset);
            table.addCell(" ".repeat(3) + cyan + (newCustomer.getStatus() ? "Active" : "Inactive") + reset);
        }
        table.addCell(" ".repeat(3) + yellow + "Customer Type :" + reset);
        table.addCell(" ".repeat(3) + cyan + newCustomer.getCustomerType() + reset);

        System.out.println(table.render());
    }
    public void userConfirmation(UserDTO newUser) {
        System.out.println();
        Table table = new Table(2, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE, ShownBorders.SURROUND);
        table.setColumnWidth(0, 30, 30);
        table.setColumnWidth(1, 30, 30);
        table.addCell(" ".repeat(3) + yellow + "Username:" + reset);
        table.addCell(" ".repeat(3) + cyan + newUser.getUsername() + reset);
        table.addCell(" ".repeat(3) + yellow + "Password:" + reset);
        table.addCell(" ".repeat(3) + cyan + "*****" + reset); // Displaying asterisks for password
        table.addCell(" ".repeat(3) + yellow + "Email:" + reset);
        table.addCell(" ".repeat(3) + cyan + newUser.getEmail() + reset);
        table.addCell(" ".repeat(3) + yellow + "Contact:" + reset);
        table.addCell(" ".repeat(3) + cyan + newUser.getContact() + reset);
        table.addCell(" ".repeat(3) + yellow + "Address:" + reset);
        table.addCell(" ".repeat(3) + cyan + newUser.getAddress() + reset);
        table.addCell(" ".repeat(3) + yellow + "Role ID:" + reset);
        table.addCell(" ".repeat(3) + cyan + newUser.getRoleId() + reset);
        if (newUser.getStatus() != null) {
            table.addCell(" ".repeat(3) + yellow + "Status:" + reset);
            table.addCell(" ".repeat(3) + cyan + (newUser.getStatus() ? "Active" : "Inactive") + reset);
        }
        System.out.println(table.render());
    }


    // Customer
    public void customerMenu() {
        System.out.print(cyan);
        System.out.println(TOP_LEFT_CORNER + HORIZONTAL_BORDER.repeat(62) + TOP_RIGHT_CORNER);
        System.out.print(VERTICAL_BORDER + SPACE + TOP_LEFT_CORNER + HORIZONTAL_BORDER.repeat(28) + TOP_RIGHT_CORNER);
        System.out.println(TOP_LEFT_CORNER + HORIZONTAL_BORDER.repeat(28) + TOP_RIGHT_CORNER + SPACE + VERTICAL_BORDER);
        System.out.print(VERTICAL_BORDER + SPACE + VERTICAL_BORDER + " ".repeat(7) + yellow + " CUSTOMER MENU  " + " ".repeat(5) + cyan + VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER + " ".repeat(28) + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + HORIZONTAL_BORDER.repeat(28) + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(28) + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + " ".repeat(28) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + " ██████╗ ██████╗ " + reset + " ".repeat(5) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  1\uFE0F⃣ ➡ NEW CUSTOMER " + " ".repeat(7) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + "██╔════╝ ╚════██╗" + reset + " ".repeat(5) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  2\uFE0F⃣ ➡ CUSTOMER LIST " + " ".repeat(6) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + "██║  ███╗ █████╔╝" + reset + " ".repeat(5) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  3\uFE0F⃣ ➡ UPDATE CUSTOMER " + " ".repeat(4) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + "██║   ██║ ╚═══██╗" + reset + " ".repeat(5) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  4\uFE0F⃣ ➡ DELETE CUSTOMER " + " ".repeat(4) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + "╚██████╔╝██████╔╝" + reset + " ".repeat(5) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  5\uFE0F⃣ ➡ BACK TO MAIN MENU " + " ".repeat(2) + cyan + VERTICAL_BORDER);
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
        Table table = new Table(4, BorderStyle.UNICODE_BOX_DOUBLE_BORDER,ShownBorders.SURROUND);
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



    // 5.Report


    // User
    public void userMenu() {
        System.out.print(cyan);
        System.out.println(TOP_LEFT_CORNER + HORIZONTAL_BORDER.repeat(62) + TOP_RIGHT_CORNER);
        System.out.print(VERTICAL_BORDER + SPACE + TOP_LEFT_CORNER + HORIZONTAL_BORDER.repeat(28) + TOP_RIGHT_CORNER);
        System.out.println(TOP_LEFT_CORNER + HORIZONTAL_BORDER.repeat(28) + TOP_RIGHT_CORNER + SPACE + VERTICAL_BORDER);
        System.out.print(VERTICAL_BORDER + SPACE + VERTICAL_BORDER + " ".repeat(7) + yellow + " USER MENU  " + " ".repeat(9) + cyan + VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER + " ".repeat(28) + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + HORIZONTAL_BORDER.repeat(28) + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(28) + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + " ".repeat(28) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + " ██████╗ ██████╗ " + reset + " ".repeat(5) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  1\uFE0F⃣ ➡ NEW USER " + " ".repeat(11) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + "██╔════╝ ╚════██╗" + reset + " ".repeat(5) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  2\uFE0F⃣ ➡ USER LIST " + " ".repeat(10) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + "██║  ███╗ █████╔╝" + reset + " ".repeat(5) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  3\uFE0F⃣ ➡ UPDATE USER " + " ".repeat(8) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + "██║   ██║ ╚═══██╗" + reset + " ".repeat(5) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  4\uFE0F⃣ ➡ DELETE USER " + " ".repeat(8) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + "╚██████╔╝██████╔╝" + reset + " ".repeat(5) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  5\uFE0F⃣ ➡ BACK TO MAIN MENU " + " ".repeat(2) + cyan + VERTICAL_BORDER);
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
        Table table = new Table(4, BorderStyle.UNICODE_BOX_DOUBLE_BORDER,ShownBorders.SURROUND);
        table.setColumnWidth(0,20,20);
        table.setColumnWidth(1,20,20);
        table.setColumnWidth(2,20,20);
        table.setColumnWidth(3,20,20);

        table.addCell(yellow +"  1 > All " + reset  );
        table.addCell(yellow +"  2 > Username " + reset  );
        table.addCell(yellow +"  3 > Password " + reset  );
        table.addCell(yellow +"  4 > Email  " + reset  );
        table.addCell(yellow +"  5 > Contact  " + reset  );
        table.addCell(yellow +"  6 > Address  " + reset  );
        table.addCell(yellow +"  7 > Status  " + reset  );
        table.addCell(yellow +"  8 > Role  " + reset  );
        table.addCell(yellow +"  9 > Back to Menu  " + reset  );
        System.out.print(table.render());
        System.out.println("\n");

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


}
