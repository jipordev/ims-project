package co.cstad.view;

import co.cstad.model.ItemDTO;
import co.cstad.model.StockInDTO;
import co.cstad.service.ItemService;
import co.cstad.util.Singleton;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class ItemView {
    private static Scanner scanner = new Scanner(System.in);
    private static ItemService itemService;
    public ItemView(){
        itemService = Singleton.itemService();
    }
    public static StockInDTO viewCreateStock(){
        StockInDTO stockInDTO = new StockInDTO();

        System.out.print("  Enter Item ID : ");

        Long itemId = Long.parseLong(scanner.nextLine());
        ItemDTO existingItem = itemService.selectById(itemId);

        if (existingItem != null ){
            stockInDTO.setItemId(Long.parseLong(scanner.nextLine()));
        } else {
            System.out.println("Item with id : "+ itemId + " doesn't exist.");
        }

        System.out.print("  Enter Price : ");
        stockInDTO.setPriceIn(new BigDecimal(scanner.nextLine()));
        System.out.print("  Enter Qty : ");
        stockInDTO.setQtyIn(Integer.parseInt(scanner.nextLine()));

        return stockInDTO;
    }

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

    public static void printItemDetails(Collection<ItemDTO> items) {
        Table table = new Table(9, BorderStyle.UNICODE_BOX_DOUBLE_BORDER, ShownBorders.ALL);
        table.addCell("   Item ID   ");
        table.addCell("   Item Code   ");
        table.addCell("   Description   ");
        table.addCell("   Unit   ");
        table.addCell("   Quantity   ");
        table.addCell("   Price A   ");
        table.addCell("   Price B   ");
        table.addCell("   Price C   ");
        table.addCell("   Status   ");

        for (ItemDTO item : items) {
            table.addCell("   " + String.valueOf(item.getItemId()) + "   ");
            table.addCell("   " + item.getItemCode() + "   ");
            table.addCell("   " + item.getItemDescription() + "   ");
            table.addCell("   " + item.getItemUnit() + "   ");
            table.addCell("   " + String.valueOf(item.getQty()) + "   ");
            table.addCell("   " + String.valueOf(item.getItemPrice_out_a()) + "   ");
            table.addCell("   " + String.valueOf(item.getItemPrice_out_b()) + "   ");
            table.addCell("   " + String.valueOf(item.getItemPrice_out_c()) + "   ");
            table.addCell("   " + (item.getStatus() ? "Active" : "Inactive") + "   ");
        }

        System.out.println(table.render());
    }

    public static void printItemList(List<ItemDTO> itemList) {
        System.out.println("Item List:");
        printItemDetails(itemList);
    }
}