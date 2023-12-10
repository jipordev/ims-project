package co.cstad.view;

import co.cstad.model.ItemDTO;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class ItemView {
    private static Scanner scanner = new Scanner(System.in);

    public static ItemDTO collectNewItemInformation() {
        ItemDTO newItem = new ItemDTO();

        System.out.print("Enter item code:");
        newItem.setItemCode(scanner.nextLine());

        System.out.print("Enter item description:");
        newItem.setItemDescription(scanner.nextLine());

        System.out.print("Enter item unit:");
        newItem.setItemUnit(scanner.nextLine());

        System.out.print("Enter item quantity:");
        newItem.setQty(Integer.parseInt(scanner.nextLine()));

        System.out.print("Enter item price A:");
        newItem.setItemPrice_out_a(new BigDecimal(scanner.nextLine()));

        System.out.print("Enter item price B:");
        newItem.setItemPrice_out_b(new BigDecimal(scanner.nextLine()));

        System.out.print("Enter item price C:");
        newItem.setItemPrice_out_c(new BigDecimal(scanner.nextLine()));

        System.out.print("Is the item active? (Enter 'y' for true, 'n' for false): ");
        newItem.setStatus(scanner.nextLine().equalsIgnoreCase("y"));

        return newItem;
    }

    public static void printItemDetails(ItemDTO item) {
        System.out.println("Item details:");
        System.out.println("Item ID: " + item.getItemId());
        System.out.println("Item Code: " + item.getItemCode());
        System.out.println("Description: " + item.getItemDescription());
        System.out.println("Unit: " + item.getItemUnit());
        System.out.println("Quantity: " + item.getQty());
        System.out.println("Price A: " + item.getItemPrice_out_a());
        System.out.println("Price B: " + item.getItemPrice_out_b());
        System.out.println("Price C: " + item.getItemPrice_out_c());
        System.out.println("Status: " + item.getStatus());
    }

    public static void printItemList(List<ItemDTO> itemList) {
        System.out.println("Item List:");
        for (ItemDTO item : itemList) {
            printItemDetails(item);
            System.out.println("--------------");
        }
    }
}
