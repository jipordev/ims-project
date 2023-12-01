package co.cstad.view;

import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

public class MenuView implements BoxBorder {


    //First Interface (CSTAD)
    public void startInterface() {
        for (int i = 0; i <= 100; i+=2) {
            int totalBlocks = 50;
            int blocksToShow = (i * totalBlocks) / 100;
            System.out.print(" ".repeat(20) + " Loading [ " + i + "% ]");
            System.out.print(" ".repeat(10) + getProgressBar(blocksToShow, totalBlocks) + "\r");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.print(cyan);

        System.out.println(TOP_LEFT_CORNER + HORIZONTAL_BORDER.repeat(72) + TOP_RIGHT_CORNER);
        System.out.println(VERTICAL_BORDER + SPACE + TOP_LEFT_CORNER + HORIZONTAL_BORDER.repeat(68) + TOP_RIGHT_CORNER + SPACE + VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER + SPACE + VERTICAL_BORDER + SPACE.repeat(4) + TOP_LEFT_CORNER + TOP_RIGHT_CORNER + SPACE.repeat(56) + TOP_LEFT_CORNER + TOP_RIGHT_CORNER + SPACE.repeat(4) + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER + SPACE + VERTICAL_BORDER + SPACE.repeat(2) + TOP_LEFT_CORNER + TOP_RIGHT_CORNER + VERTICAL_BORDER + VERTICAL_BORDER + TOP_LEFT_CORNER + TOP_RIGHT_CORNER + SPACE.repeat(6) + magenta + " ██████╗███████╗████████╗ █████╗ ██████╗ " + cyan + SPACE.repeat(5) + TOP_LEFT_CORNER + TOP_RIGHT_CORNER + VERTICAL_BORDER + VERTICAL_BORDER + TOP_LEFT_CORNER + TOP_RIGHT_CORNER + SPACE.repeat(2) + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER + SPACE + VERTICAL_BORDER + SPACE.repeat(2) + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + SPACE.repeat(6) + magenta + "██╔════╝██╔════╝╚══██╔══╝██╔══██╗██╔══██╗" + cyan + SPACE.repeat(5) + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + SPACE.repeat(2) + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER + SPACE + VERTICAL_BORDER + SPACE.repeat(2) + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + SPACE.repeat(6) + magenta + "██║     ███████╗   ██║   ███████║██║  ██║" + cyan + SPACE.repeat(5) + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + SPACE.repeat(2) + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER + SPACE + VERTICAL_BORDER + SPACE.repeat(2) + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + SPACE.repeat(6) + magenta + "██║     ╚════██║   ██║   ██╔══██║██║  ██║" + cyan + SPACE.repeat(5) + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + SPACE.repeat(2) + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER + SPACE + VERTICAL_BORDER + SPACE.repeat(2) + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + SPACE.repeat(6) + magenta + "╚██████╗███████║   ██║   ██║  ██║██████╔╝" + cyan + SPACE.repeat(5) + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + SPACE.repeat(2) + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER + SPACE + VERTICAL_BORDER + SPACE.repeat(2) + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + SPACE.repeat(6) + magenta + " ╚═════╝╚══════╝   ╚═╝   ╚═╝  ╚═╝╚═════╝ " + cyan + SPACE.repeat(5) + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + SPACE.repeat(2) + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER + SPACE + VERTICAL_BORDER + SPACE.repeat(2) + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + SPACE.repeat(6) + magenta +HORIZONTAL_BORDER.repeat(41) + cyan + SPACE.repeat(5) + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + SPACE.repeat(2) + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER + SPACE + VERTICAL_BORDER + SPACE.repeat(2) + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + SPACE.repeat(6) + magenta + "CENTER OF SCIENCE TECHNOLOGY AND ADVANCED" + cyan + SPACE.repeat(5) + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + VERTICAL_BORDER + SPACE.repeat(2) + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER + SPACE + VERTICAL_BORDER + SPACE.repeat(2) + BOTTOM_LEFT_CORNER + BOTTOM_RIGHT_CORNER + VERTICAL_BORDER + VERTICAL_BORDER + BOTTOM_LEFT_CORNER + BOTTOM_RIGHT_CORNER + SPACE.repeat(21) + magenta + "DEVELOPMENT" + cyan + SPACE.repeat(20) + BOTTOM_LEFT_CORNER + BOTTOM_RIGHT_CORNER + VERTICAL_BORDER + VERTICAL_BORDER + BOTTOM_LEFT_CORNER + BOTTOM_RIGHT_CORNER + SPACE.repeat(2) + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER + SPACE + VERTICAL_BORDER + SPACE.repeat(4) +  BOTTOM_LEFT_CORNER + BOTTOM_RIGHT_CORNER + SPACE.repeat(56) + BOTTOM_LEFT_CORNER + BOTTOM_RIGHT_CORNER + SPACE.repeat(4) + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER + SPACE + BOTTOM_LEFT_CORNER + HORIZONTAL_BORDER.repeat(68) + BOTTOM_RIGHT_CORNER + SPACE + VERTICAL_BORDER);
        System.out.println(BOTTOM_LEFT_CORNER + HORIZONTAL_BORDER.repeat(72) + BOTTOM_RIGHT_CORNER);
        System.out.print(reset);
    }



    // Log In
    public void menuLogin(){
        System.out.print(cyan);
        System.out.println("┌" + "─".repeat(62) + "┐");

        System.out.print("│ ┌" + "─".repeat(28) + "┐");
        System.out.println("┌" + "─".repeat(28) + "┐ │");
        System.out.print("│ │" + " ".repeat(10)+yellow + "  MENU  "+" ".repeat(10) +cyan + "│");
        System.out.println("│" + " ".repeat(6) + yellow +"██████╗ ██████╗" + reset +  " ".repeat(7) +cyan + "│ │");
        System.out.print(cyan + "│ │"+"─".repeat(28)+"│");
        System.out.println(cyan + "│"+" ".repeat(6)+yellow + "██╔════╝ ╚════██╗"+ reset + " ".repeat(5) +cyan + "│ │");
        System.out.print(cyan + "│ │"+" ".repeat(28)+"│");
        System.out.println(cyan + "│"+" ".repeat(6)+yellow + "██║  ███╗ █████╔╝" +reset + " ".repeat(5)  +cyan + "│ │");
        System.out.print(cyan + "│ │"+yellow + "  1 > LOGIN " + " ".repeat(16) +cyan + "│");
        System.out.println(cyan + "│"+" ".repeat(6)+yellow + "██║   ██║ ╚═══██╗" +reset + " ".repeat(5)  +cyan + "│ │");
        System.out.print(cyan + "│ │"+ yellow + "  2 > ABOUT US " + " ".repeat(13) + cyan + "│");
        System.out.println(cyan + "│"+" ".repeat(6)+yellow + "╚██████╔╝██████╔╝" +reset + " ".repeat(5)  +cyan +  "│ │");
        System.out.print(cyan + "│ │"+ yellow + "  3 > EXIT PROGRAM " + " ".repeat(9) + cyan + "│");
        System.out.println("│"+" ".repeat(6)+yellow + "╚═════╝ ╚═════╝" +reset + " ".repeat(7)  +cyan + "│ │");
        System.out.print("│ └" + "─".repeat(28) + "┘");
        System.out.println("└" + "─".repeat(28) + "┘ │");

        System.out.println("│ ┌" + "─".repeat(58) + "┐ │");
        System.out.println("│ │"+" ".repeat(14)+ yellow + "Choose Option Between : 1 - 3 " +  " ".repeat(14) + cyan + "│ │");
        System.out.println("│ └" + "─".repeat(58) + "┘ │");

        System.out.println("└" + "─".repeat(62) + "┘");
        System.out.print(reset);
    }
    public void menuAboutUs(){
        System.out.print(cyan);
        System.out.println(TOP_LEFT_CORNER + HORIZONTAL_BORDER.repeat(62) + TOP_RIGHT_CORNER);

        System.out.print(VERTICAL_BORDER +SPACE + TOP_LEFT_CORNER + HORIZONTAL_BORDER.repeat(28) + TOP_RIGHT_CORNER);
        System.out.println(TOP_LEFT_CORNER + HORIZONTAL_BORDER.repeat(28) + TOP_RIGHT_CORNER + SPACE + VERTICAL_BORDER);
        System.out.print(VERTICAL_BORDER + SPACE + VERTICAL_BORDER + " ".repeat(10)+yellow + "  MENU  "+" ".repeat(10) +cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER +yellow + " 1 >> Sreng Chipor "+ reset + SPACE.repeat(9) +cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER +HORIZONTAL_BORDER.repeat(28)+VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER +yellow + " 2 >> Ly Meansreang "+ reset + " ".repeat(8) +cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + " ".repeat(28)+VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER +yellow + " 3 >> Seang Mengkheang " +reset + " ".repeat(5)  +cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER );
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER  + yellow + "  1 > LOGIN " + " ".repeat(16) +cyan + VERTICAL_BORDER );
        System.out.println(cyan + VERTICAL_BORDER +yellow + " 4 >> Pov Sokny " +reset + " ".repeat(12)  +cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER );
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + red + "  2 > ABOUT US " + " ".repeat(13) + cyan + VERTICAL_BORDER );
        System.out.println(cyan + VERTICAL_BORDER +yellow + " 5 >> Hom pheakakvotey " +reset + " ".repeat(5)  +cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  3 > EXIT PROGRAM " + " ".repeat(9) + cyan + VERTICAL_BORDER );
        System.out.println(cyan + VERTICAL_BORDER +yellow + " 6 >> Nheom Tevy " +reset + " ".repeat(11)  +cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + " ".repeat(28)+VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER +yellow + " 7 >> Long Piseth " +reset + " ".repeat(10)  +cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + " ".repeat(28)+VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER +yellow + " 8 >> Srong Sokcheat " +reset + " ".repeat(7)  +cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(VERTICAL_BORDER + SPACE + BOTTOM_LEFT_CORNER + "─".repeat(28) + BOTTOM_RIGHT_CORNER);
        System.out.println(BOTTOM_LEFT_CORNER + HORIZONTAL_BORDER.repeat(28) + BOTTOM_RIGHT_CORNER + SPACE + VERTICAL_BORDER);

        System.out.println(VERTICAL_BORDER + SPACE + TOP_LEFT_CORNER+ HORIZONTAL_BORDER.repeat(58) + TOP_RIGHT_CORNER + SPACE + VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER + SPACE + VERTICAL_BORDER+" ".repeat(14)+ yellow + "Choose Option Between : 1 - 3 " +  " ".repeat(14) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER + SPACE + BOTTOM_LEFT_CORNER + HORIZONTAL_BORDER.repeat(58) + BOTTOM_RIGHT_CORNER + SPACE + VERTICAL_BORDER);

        System.out.println(BOTTOM_LEFT_CORNER + HORIZONTAL_BORDER.repeat(62) + BOTTOM_RIGHT_CORNER);
        System.out.print(reset);
    }



    // Item
    public void itemMenu() {
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
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  1 > STOCK IN  " + " ".repeat(12) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + "██╔════╝ ╚════██╗" + reset + " ".repeat(5) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  2 > UPDATE ITEM " + " ".repeat(10) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + "██║  ███╗ █████╔╝" + reset + " ".repeat(5) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  3 > DELETE ITEM " + " ".repeat(10) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + "██║   ██║ ╚═══██╗" + reset + " ".repeat(5) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  4 > READ ITEM " + " ".repeat(12) + cyan + VERTICAL_BORDER);
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



    // Invoice
    public void invoiceMenu(){
        int option;
        System.out.print(cyan);
        System.out.println(TOP_LEFT_CORNER + HORIZONTAL_BORDER.repeat(62) + TOP_RIGHT_CORNER);
        System.out.print(VERTICAL_BORDER +SPACE + TOP_LEFT_CORNER + HORIZONTAL_BORDER.repeat(28) + TOP_RIGHT_CORNER);
        System.out.println(TOP_LEFT_CORNER + HORIZONTAL_BORDER.repeat(28) + TOP_RIGHT_CORNER + SPACE + VERTICAL_BORDER);
        System.out.print(VERTICAL_BORDER + SPACE + VERTICAL_BORDER + " ".repeat(10)+yellow + "  MENU  "+" ".repeat(10) +cyan + VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER+ " ".repeat(6) + yellow +"██████╗ ██████╗" + reset +  " ".repeat(7) +cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER +HORIZONTAL_BORDER.repeat(28)+VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6)+yellow + "██╔════╝ ╚════██╗"+ reset + " ".repeat(5) +cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + " ".repeat(28)+VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER +" ".repeat(6)+yellow + "██║  ███╗ █████╔╝" +reset + " ".repeat(5)  +cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER );
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  1 > INVOICE RETURN " + " ".repeat(7) +cyan + VERTICAL_BORDER );
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6)+yellow + "██║   ██║ ╚═══██╗" +reset + " ".repeat(5)  +cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER );
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  2 > INVOICE LIST " + " ".repeat(9) + cyan + VERTICAL_BORDER );
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6)+yellow + "╚██████╔╝██████╔╝" +reset + " ".repeat(5)  +cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  3 > BACK TO MAIN MENU " + " ".repeat(4) + cyan + VERTICAL_BORDER );
        System.out.println(VERTICAL_BORDER+" ".repeat(6)+yellow + "╚═════╝ ╚═════╝" +reset + " ".repeat(7)  +cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(VERTICAL_BORDER + SPACE + BOTTOM_LEFT_CORNER + "─".repeat(28) + BOTTOM_RIGHT_CORNER);
        System.out.println(BOTTOM_LEFT_CORNER + HORIZONTAL_BORDER.repeat(28) + BOTTOM_RIGHT_CORNER + SPACE + VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER + SPACE + TOP_LEFT_CORNER+ HORIZONTAL_BORDER.repeat(58) + TOP_RIGHT_CORNER + SPACE + VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER + SPACE + VERTICAL_BORDER+" ".repeat(14)+ yellow + "Choose Option Between : 1 - 3 " + " ".repeat(14) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER );
        System.out.println(VERTICAL_BORDER + SPACE + BOTTOM_LEFT_CORNER + HORIZONTAL_BORDER.repeat(58) + BOTTOM_RIGHT_CORNER + SPACE + VERTICAL_BORDER);

        System.out.println(BOTTOM_LEFT_CORNER + HORIZONTAL_BORDER.repeat(62) + BOTTOM_RIGHT_CORNER);
        System.out.print(reset);
    }
    public void readInvoice(){
        Table table = new Table(1, BorderStyle.UNICODE_BOX, ShownBorders.SURROUND);
        table.setColumnWidth(0,50,200);

        table.addCell(yellow +"  - Invoice ID : " + reset  + " ".repeat(9) +"101");
        table.addCell(yellow +"  - Item ID : " + reset  + " ".repeat(7) + "1111");
        table.addCell(yellow +"  - Qty : " + reset  + " ".repeat(4) + "100");
        table.addCell(yellow +"  - Unit Price  : " + reset  + " ".repeat(2) + "50");
        table.addCell(yellow +"  - Return Back : " + reset  + " ".repeat(2) + "2023-12-01");
        table.addCell(yellow +"  - ID : " + reset + " ".repeat(7) + "9099" );
        System.out.print(table.render());
        System.out.println("\n");

    }
    public void invoiceList(){
        Table table = new Table(7, BorderStyle.UNICODE_BOX,ShownBorders.ALL);
        table.setColumnWidth(0,15,25);
        table.setColumnWidth(1,20,50);
        table.setColumnWidth(2,20,50);
        table.setColumnWidth(3,20,50);
        table.setColumnWidth(4,20,50);
        table.setColumnWidth(5,20,50);
        table.setColumnWidth(6,20,50);




        table.addCell(yellow +"  - Invoice ID : " + reset);
        table.addCell(yellow +"  - Item ID : " + reset  );
        table.addCell(yellow +"  - Qty : " + reset);
        table.addCell(yellow +"  - Unit Price  : "+ reset );
        table.addCell(yellow +"  - Return Back : "+ reset );
        table.addCell(yellow +"  - ID : " + reset );



        table.addCell("   101  ");
        table.addCell("   1111  ");
        table.addCell("   100  ");
        table.addCell("   50  ");
        table.addCell("   2023-12-01  ");
        table.addCell("   9099  ");
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






    // Report
    public void reportMenu() {
        System.out.print(cyan);
        System.out.println(TOP_LEFT_CORNER + HORIZONTAL_BORDER.repeat(62) + TOP_RIGHT_CORNER);
        System.out.print(VERTICAL_BORDER + SPACE + TOP_LEFT_CORNER + HORIZONTAL_BORDER.repeat(28) + TOP_RIGHT_CORNER);
        System.out.println(TOP_LEFT_CORNER + HORIZONTAL_BORDER.repeat(28) + TOP_RIGHT_CORNER + SPACE + VERTICAL_BORDER);
        System.out.print(VERTICAL_BORDER + SPACE + VERTICAL_BORDER + " ".repeat(10) + yellow + "  MENU  " + " ".repeat(10) + cyan + VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER + " ".repeat(28) + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + HORIZONTAL_BORDER.repeat(28) + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(28) + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  1 > STOCK COUNT REPORT " + " ".repeat(3) + cyan + VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER + " ".repeat(28) + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  2 > STOCK IN REPORT " + " ".repeat(6) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + " ██████╗ ██████╗ " + reset + " ".repeat(5) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  3 > STOCK OUT REPORT " + " ".repeat(5) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + "██╔════╝ ╚════██╗" + reset + " ".repeat(5) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  4 > INVOICE DETAIL " + " ".repeat(7) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + "██║  ███╗ █████╔╝" + reset + " ".repeat(5) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  5 > INVOICE ADJUSTMENT " + " ".repeat(3) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + "██║   ██║ ╚═══██╗" + reset + " ".repeat(5) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  6 > ITEMS PRICE HISTORY " + " ".repeat(2) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + "╚██████╔╝██████╔╝" + reset + " ".repeat(5) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  7 > STOCK ALERT REPORT " + " ".repeat(3) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + "╚═════╝ ╚═════╝" + reset + " ".repeat(7) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  8 > SUMMARY REPORT " + " ".repeat(7) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(28) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  9 > BACK TO MAIN MENU " + " ".repeat(4) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(28) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(VERTICAL_BORDER + SPACE + BOTTOM_LEFT_CORNER + "─".repeat(28) + BOTTOM_RIGHT_CORNER);
        System.out.println(BOTTOM_LEFT_CORNER + HORIZONTAL_BORDER.repeat(28) + BOTTOM_RIGHT_CORNER + SPACE + VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER + SPACE + TOP_LEFT_CORNER + HORIZONTAL_BORDER.repeat(58) + TOP_RIGHT_CORNER + SPACE + VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER + SPACE + VERTICAL_BORDER + " ".repeat(14) + yellow + "Choose Option Between : 1 - 9 " + " ".repeat(14) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER + SPACE + BOTTOM_LEFT_CORNER + HORIZONTAL_BORDER.repeat(58) + BOTTOM_RIGHT_CORNER + SPACE + VERTICAL_BORDER);
        System.out.println(BOTTOM_LEFT_CORNER + HORIZONTAL_BORDER.repeat(62) + BOTTOM_RIGHT_CORNER);
        System.out.print(reset);
    }




    private static String getProgressBar(int blocksToShow, int totalBlocks) {
        String progressBar = "█".repeat(Math.max(0, blocksToShow)) +
                " ".repeat(Math.max(0, totalBlocks - blocksToShow));
        return green + progressBar;
    }

    public void confirmation(){
        System.out.println(cyan + TOP_LEFT_CORNER + HORIZONTAL_BORDER.repeat(50) + TOP_RIGHT_CORNER);
        System.out.println(VERTICAL_BORDER + SPACE.repeat(15)+ reset + yellow + "{ - CONFIRMATION - }"+ reset + cyan + SPACE.repeat(15)+VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER+ HORIZONTAL_BORDER.repeat(50)+ VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER+ SPACE.repeat(7) + yellow +"Are you sure ? [Yes/yes] or [No/no] "+ reset + cyan + SPACE.repeat(7)+ VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER   + SPACE.repeat(50) + VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER+" ".repeat(5) + blueBackGround + black + " Yes/yes "+ reset + SPACE.repeat(24) + redBackGround + black + " No/no "+ reset+ cyan + SPACE.repeat(5)+ VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER   + SPACE.repeat(50) + VERTICAL_BORDER);
        System.out.println(BOTTOM_LEFT_CORNER + HORIZONTAL_BORDER.repeat(50) + BOTTOM_RIGHT_CORNER + reset);

    }


    public void inputValidation(){
        System.out.println(cyan + TOP_LEFT_CORNER + HORIZONTAL_BORDER.repeat(40) + TOP_RIGHT_CORNER);
        System.out.println(VERTICAL_BORDER+ SPACE.repeat(40)+ VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER + SPACE.repeat(7) + TOP_LEFT_CORNER + HORIZONTAL_BORDER.repeat(24) + TOP_RIGHT_CORNER+ SPACE.repeat(7) + VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER + SPACE.repeat(7)+ VERTICAL_BORDER+ reset + red + " Input invalid data...!"+ reset + cyan + SPACE + VERTICAL_BORDER + SPACE.repeat(7)+VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER + SPACE.repeat(7) + BOTTOM_LEFT_CORNER + HORIZONTAL_BORDER.repeat(24) + BOTTOM_RIGHT_CORNER+ SPACE.repeat(7) + VERTICAL_BORDER);

        System.out.println(VERTICAL_BORDER+ SPACE.repeat(40)+ VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER + SPACE.repeat(2) + TOP_LEFT_CORNER + HORIZONTAL_BORDER.repeat(34) + TOP_RIGHT_CORNER+ SPACE.repeat(2) + VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER + SPACE.repeat(2)+ VERTICAL_BORDER+ reset + yellow + " Press Enter key to Try again...!"+ reset + cyan + SPACE + VERTICAL_BORDER + SPACE.repeat(2)+VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER + SPACE.repeat(2) + BOTTOM_LEFT_CORNER + HORIZONTAL_BORDER.repeat(34) + BOTTOM_RIGHT_CORNER+ SPACE.repeat(2) + VERTICAL_BORDER);
        System.out.println(VERTICAL_BORDER   + SPACE.repeat(40) + VERTICAL_BORDER);
        System.out.println(BOTTOM_LEFT_CORNER + HORIZONTAL_BORDER.repeat(40) + BOTTOM_RIGHT_CORNER);
    }

    public void itemConfirmation(){
        System.out.println();
        Table table = new Table(2, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE, ShownBorders.ALL);
        table.setColumnWidth(0,30,30);
        table.setColumnWidth(1,30,30);
        table.addCell(" ".repeat(3) + cyan + "Description:");
        table.addCell(" ".repeat(3) + cyan + "111");
        table.addCell(" ".repeat(3)+ cyan + "Code:");
        table.addCell(" ".repeat(3)+ cyan + "CSTAD111222");
        table.addCell(" ".repeat(3)+ cyan + "Name:");
        table.addCell(" ".repeat(3)+ cyan +"Hanuman Beer:");
        table.addCell(" ".repeat(3)+ cyan +"Unit:");
        table.addCell(" ".repeat(3)+ cyan +"0.25$");
        table.addCell(" ".repeat(3)+ cyan +"Quantity:");
        table.addCell(" ".repeat(3)+ cyan +"400");
        table.addCell(" ".repeat(3)+ cyan +"Price_A:");
        table.addCell(" ".repeat(3)+ cyan +"0.25$");
        table.addCell(" ".repeat(3)+ cyan +"Price_B:");
        table.addCell(" ".repeat(3)+ cyan +"0.27$");
        table.addCell(" ".repeat(3)+ cyan +"Price_C:");
        table.addCell(" ".repeat(3)+ cyan +"0.30$");
        table.addCell(" ".repeat(3)+ cyan +"Status:");
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
        confirmation();
    }

    public void menuItemUpdate(){
        System.out.println("Enter Item id to update: ");
        Table table = new Table(2, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE, ShownBorders.ALL);
        table.setColumnWidth(0,15,30);
        table.setColumnWidth(1,15,30);
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
        confirmation();
    }

    public void itemUpdateUint(){
        System.out.print("Enter New Item Unit to Update: ");
        itemConfirmation();
        confirmation();
    }

    public void itemUpdateQty(){
        System.out.print("Enter New Item Qty to Update: ");
        itemConfirmation();
        confirmation();
    }

    public void itemUpdateStatus(){
        System.out.print("Enter New Item Statues to Update: ");
        itemConfirmation();
        confirmation();
    }

    public void itemUpdatePrice(){
        System.out.print("Enter New Item Price to Update: ");
        itemConfirmation();
        confirmation();
    }

    public void itemDelete(){
        System.out.println("Enter Item id to delete");
        itemConfirmation();
        confirmation();
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

        table.addCell(" ".repeat(2)+cyan+ "ID");
        table.addCell(" ".repeat(2)+cyan+"CODE");
        table.addCell(" ".repeat(2)+cyan+"Name");
        table.addCell(" ".repeat(2)+cyan+"Unit");
        table.addCell(" ".repeat(2)+cyan+"Qty");
        table.addCell(" ".repeat(2)+cyan+"Price_A");
        table.addCell(" ".repeat(2)+cyan+"Price_B");
        table.addCell(" ".repeat(2)+cyan+"Price_C");
        table.addCell(" ".repeat(2)+cyan+"Status");

        table.addCell(" ".repeat(2)+blue+"111");
        table.addCell(" ".repeat(2)+blue+"CSTAD1122");
        table.addCell(" ".repeat(2)+blue+"Sting");
        table.addCell(" ".repeat(2)+blue+"000");
        table.addCell(" ".repeat(2)+blue+"000");
        table.addCell(" ".repeat(2)+blue+"1.02$");
        table.addCell(" ".repeat(2)+blue+"1.0$");
        table.addCell(" ".repeat(2)+blue+"0.99S");
        table.addCell(" ".repeat(2)+blue+"Active");
        System.out.println(cyan+ table.render());
    }
}
