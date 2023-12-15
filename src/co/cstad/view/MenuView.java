package co.cstad.view;

import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

import java.util.Scanner;



public class MenuView implements BoxBorder {
    Scanner scanner = new Scanner(System.in);

    //First Interface (CSTAD)
    public void startInterface() {
//        for (int i = 0; i <= 100; i+=2) {
//            int totalBlocks = 50;
//            int blocksToShow = (i * totalBlocks) / 100;
//            System.out.print(" ".repeat(20) + " Loading [ " + i + "% ]");
//            System.out.print(" ".repeat(10) + getProgressBar(blocksToShow, totalBlocks) + "\r");
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
        System.out.println("\n".repeat(5));
        System.out.print(cyan);
        System.out.println( TOP_LEFT_CORNER + HORIZONTAL_BORDER.repeat(72) + TOP_RIGHT_CORNER);
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
        System.out.print(cyan + "│ │"+yellow + " 1\uFE0F⃣ \uD83D\uDD10 LOGIN ㅤㅤㅤㅤㅤ" + " ".repeat(6) +cyan + "│");
        System.out.println(cyan + "│"+" ".repeat(6)+yellow + "██║   ██║ ╚═══██╗" +reset + " ".repeat(5)  +cyan + "│ │");
        System.out.print(cyan + "│ │"+ yellow + " 1\uFE0F⃣ \uD83D\uDC64 ABOUT US ㅤㅤㅤㅤㅤ" + " ".repeat(3) + cyan + "│");
        System.out.println(cyan + "│"+" ".repeat(6)+yellow + "╚██████╔╝██████╔╝" +reset + " ".repeat(5)  +cyan +  "│ │");
        System.out.print(cyan + "│ │"+ yellow + " 3\uFE0F⃣ ↩\uFE0F EXIT PROGRAMㅤㅤㅤㅤㅤ" + cyan + "│");
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
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  1 > NEW ITEM "+ " ".repeat(13) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + "██╔════╝ ╚════██╗" + reset + " ".repeat(5) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  2 > UPDATE ITEM " +" ".repeat(10) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + "██║  ███╗ █████╔╝" + reset + " ".repeat(5) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  3 > DELETE ITEM " + " ".repeat(10) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + "██║   ██║ ╚═══██╗" + reset + " ".repeat(5) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  4 > READ ITEM " + " ".repeat(12) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + "╚██████╔╝██████╔╝" + reset + " ".repeat(5) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  5 > STOCK IN " + " ".repeat(13) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(6) + yellow + "╚═════╝ ╚═════╝" + reset + " ".repeat(7) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  6 > STOCK OUT " + " ".repeat(12) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(28) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
        System.out.print(cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER + yellow + "  7 > BACK TO MENU " + " ".repeat(9) + cyan + VERTICAL_BORDER);
        System.out.println(cyan + VERTICAL_BORDER + " ".repeat(28) + cyan + VERTICAL_BORDER + SPACE + VERTICAL_BORDER);
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





    public void menuItemUpdate(){
        Table table = new Table(3, BorderStyle.UNICODE_BOX,ShownBorders.SURROUND);
        table.setColumnWidth(0,25,25);
        table.setColumnWidth(1,25,25);
        table.setColumnWidth(2,25,25);

        table.addCell(yellow +"  1 > ALL " + reset  );
        table.addCell(yellow +"  2 > DESCRIPTION " + reset  );
        table.addCell(yellow +"  3 > UNIT " + reset  );
        table.addCell(yellow +"  4 > QUANTITY " + reset  );
        table.addCell(yellow +"  5 > PRICE_A " + reset  );
        table.addCell(yellow +"  6 > PRICE_B " + reset  );
        table.addCell(yellow +"  7 > PRICE_C " + reset  );
        table.addCell(yellow +"  8 > STATUS " + reset  );
        table.addCell(yellow +"  9 > EXIT " + reset  );
        System.out.print(table.render());
        System.out.println("\n");

    }




}
