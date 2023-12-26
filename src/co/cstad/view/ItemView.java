package co.cstad.view;

import co.cstad.model.ItemDTO;
import co.cstad.model.StockInDTO;
import co.cstad.model.StockOutDTO;
import co.cstad.service.ItemService;
import co.cstad.util.Singleton;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.CellStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import static co.cstad.view.BoxBorder.*;
import org.nocrala.tools.texttablefmt.CellStyle;

public class ItemView {
    private final static Scanner scanner = Singleton.scanner();
    private static ItemService itemService = Singleton.itemService();
    public static StockInDTO viewCreateStock(){
        StockInDTO stockInDTO = new StockInDTO();

        do {
            System.out.print("  Enter Item ID : ");
            try {
                Long itemId = Long.parseLong(scanner.nextLine());
                ItemDTO existingItem = itemService.selectById(itemId);

                if(existingItem != null ){
                    if (existingItem.isStatus()){
                        stockInDTO.setItemId(itemId);
                        break;
                    } else
                        System.out.println("Item with ID " + itemId + " has status 'false'. \n Please try again with a different item.\n");
                }
                else
                    System.out.println("Item with id : "+ itemId + " doesn't exist.");

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
                        System.out.println("  => ItemID " +itemId + " have quantity : "+ existingItem.getQty());

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
        Table table = new Table(10, BorderStyle.UNICODE_BOX_DOUBLE_BORDER, ShownBorders.ALL);
        CellStyle cellStyle = new CellStyle(CellStyle.HorizontalAlign.center);
        table.setColumnWidth(0,25,25);
        table.setColumnWidth(1,25,25);
        table.setColumnWidth(2,25,25);
        table.setColumnWidth(3,25,25);
        table.setColumnWidth(4,25,25);
        table.setColumnWidth(5,25,25);
        table.setColumnWidth(6,25,25);
        table.setColumnWidth(7,25,25);
        table.setColumnWidth(8,25,25);
        table.setColumnWidth(9,25,25);
        table.addCell(yellow + "   Item ID   " + reset, cellStyle);
        table.addCell(yellow + "   Item Code   " + reset, cellStyle);
        table.addCell(yellow + "   Description   " + reset, cellStyle);
        table.addCell(yellow + "   Unit   " + reset, cellStyle);
        table.addCell(yellow + "   Quantity   " + reset, cellStyle);
        table.addCell(yellow + "   Price   " + reset, cellStyle);
        table.addCell(yellow + "   Price A   " + reset, cellStyle);
        table.addCell(yellow + "   Price B   " + reset, cellStyle);
        table.addCell(yellow + "   Price C   " + reset, cellStyle);
        table.addCell(yellow + "   Status   " + reset, cellStyle);

        for (ItemDTO item : items) {
            table.addCell(blue + String.valueOf(item.getItemId()), cellStyle);
            table.addCell(green + item.getItemCode(), cellStyle);
            table.addCell(green + item.getItemDescription(), cellStyle);
            table.addCell(green + item.getItemUnit(), cellStyle);
            table.addCell(green + String.valueOf(item.getQty()), cellStyle);
            table.addCell(green + String.valueOf(item.getItemPrice()), cellStyle);
            table.addCell(green + String.valueOf(item.getItemPrice_out_a()), cellStyle);
            table.addCell(green + String.valueOf(item.getItemPrice_out_b()), cellStyle);
            table.addCell(green + String.valueOf(item.getItemPrice_out_c()), cellStyle);
            table.addCell(green + (item.getStatus() ? "Active" : "Inactive") + reset, cellStyle);
        }
        System.out.println(table.render());
    }

    public static void printItemList(List<ItemDTO> itemList) {
        System.out.println("Item List:");
        printItemDetails(itemList);
    }
}