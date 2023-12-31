package co.cstad.view;

import co.cstad.model.ItemDTO;
import co.cstad.model.StockInDTO;
import co.cstad.model.StockOutDTO;
import co.cstad.service.ItemService;
import co.cstad.util.Singleton;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import static co.cstad.view.BoxBorder.*;

public class ItemView {
    private final static Scanner scanner = Singleton.scanner();
    private static ItemService itemService;
    static {
        itemService = Singleton.itemService();
    }
    public static StockInDTO viewCreateStock(){
        StockInDTO stockInDTO = new StockInDTO();

        do {
            System.out.print("  Enter Item ID : ");
            try {
                Long itemId = Long.parseLong(scanner.nextLine());
                ItemDTO existingItem = itemService.selectById(itemId);

                if (existingItem != null) {
                    System.out.println("Current quantity for Item ID " + itemId + ": " + existingItem.getQty());

                    // Ask the user if they want to proceed with stock in
                    System.out.print("Do you want to proceed with stock in? (yes/no): ");
                    String proceed = scanner.nextLine().toLowerCase();

                    if ("yes".equals(proceed)) {
                        stockInDTO.setItemId(itemId);
                        break;
                    } else {
                        System.out.println("Stock in operation canceled.\n");
                    }
                } else {
                    System.out.println("Item with id : " + itemId + " doesn't exist.\n");
                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        System.out.print("  Enter Price : ");
        stockInDTO.setPriceIn(new BigDecimal(scanner.nextLine()));
        System.out.print("  Enter Qty : ");
        stockInDTO.setQtyIn(Integer.parseInt(scanner.nextLine()));

        return stockInDTO;
    }




    public static StockOutDTO viewCreateStockOut() {
        StockOutDTO stockOutDTO = new StockOutDTO();

        do {
            try {
                System.out.print("  Enter Item ID : ");
                Long itemId = Long.parseLong(scanner.nextLine());

                // Check if the item with the given item_id exists
                ItemDTO existingItem = itemService.selectById(itemId);

                if (existingItem != null && existingItem.isStatus()) {
                    // Check if quantity is greater than 0
                    if (existingItem.getQty() > 0) {
                        stockOutDTO.setItemId(itemId);

                        // Display current available quantity
                        System.out.println("Current available quantity: " + existingItem.getQty());

                        // Ask user for quantity to stock out
                        do {
                            try {
                                System.out.print("  Enter Qty : ");
                                int enteredQty = Integer.parseInt(scanner.nextLine());

                                // Check if entered quantity is valid
                                if (enteredQty > 0 && enteredQty <= existingItem.getQty()) {
                                    stockOutDTO.setQtyOut(enteredQty);
                                    return stockOutDTO;
                                } else {
                                    System.out.println("Invalid quantity. Please enter a valid quantity within the available stock.\n");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid input. Please enter a valid numeric quantity.\n");
                            }
                        } while (true);

                    } else {
                        System.out.println("Item with ID " + itemId + " has zero quantity.\n Please try again with a different item.\n");
                    }
                } else if (existingItem == null) {
                    System.out.println("Item with ID " + itemId + " doesn't exist. \n Please try again.\n");
                } else {
                    System.out.println("Item with ID " + itemId + " has status 'false'. \n Please try again with a different item.\n");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid numeric Item ID.\n");
            }
        } while (true);
    }


    public static ItemDTO collectNewItemInformation() {
        ItemDTO newItem = new ItemDTO();

        System.out.print("Enter item code: ");
        newItem.setItemCode(scanner.nextLine());

        System.out.print("Enter item description: ");
        newItem.setItemDescription(scanner.nextLine());

        System.out.print("Enter item unit: ");
        newItem.setItemUnit(scanner.nextLine());

        System.out.print("Enter item quantity: ");
        newItem.setQty(Integer.parseInt(scanner.nextLine()));

        System.out.print("Enter item price: ");
        BigDecimal price = new BigDecimal(scanner.nextLine());
        newItem.setItemPrice(price);

        System.out.print("Enter alert ID: ");
        newItem.setAlertId(Long.parseLong(scanner.nextLine()));

        // Calculate price_a, price_b, and price_c based on the input price
        newItem.setItemPrice_out_a(price.multiply(new BigDecimal("0.93")));
        newItem.setItemPrice_out_b(price.multiply(new BigDecimal("0.95")));
        newItem.setItemPrice_out_c(price.multiply(new BigDecimal("0.97")));

        System.out.print("Is the item active? (Enter 'y' for true, 'n' for false): ");
        newItem.setStatus(scanner.nextLine().equalsIgnoreCase("y"));

        return newItem;
    }

    public static void printItemDetails(Collection<ItemDTO> items) {
        Table table = new Table(10, BorderStyle.UNICODE_BOX, ShownBorders.ALL);
        table.addCell(yellow + "   Item ID   " + reset);
        table.addCell(yellow + "   Item Code   " + reset);
        table.addCell(yellow + "   Description   " + reset);
        table.addCell(yellow + "   Unit   " + reset);
        table.addCell(yellow + "   Quantity   " + reset);
        table.addCell(yellow + "   Price   " + reset);
        table.addCell(yellow + "   Price A   " + reset);
        table.addCell(yellow + "   Price B   " + reset);
        table.addCell(yellow + "   Price C   " + reset);
        table.addCell(yellow + "   Status   " + reset);

        for (ItemDTO item : items) {
            table.addCell(blue + String.valueOf(item.getItemId()));
            table.addCell(green + item.getItemCode());
            table.addCell(green + item.getItemDescription());
            table.addCell(green + item.getItemUnit());
            table.addCell(green + String.valueOf(item.getQty()));
            table.addCell(green + String.valueOf(item.getItemPrice()));
            table.addCell(green + String.valueOf(item.getItemPrice_out_a()));
            table.addCell(green + String.valueOf(item.getItemPrice_out_b()));
            table.addCell(green + String.valueOf(item.getItemPrice_out_c()));
            table.addCell(green + (item.getStatus() ? "Active" : "Inactive") + reset);
        }

        System.out.println(table.render());
    }

    public static void printItemList(List<ItemDTO> itemList) {
        System.out.println("Item List:");
        printItemDetails(itemList);
    }
}