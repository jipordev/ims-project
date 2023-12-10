package co.cstad.controller;

import co.cstad.model.ItemDTO;
import co.cstad.service.ItemService;
import co.cstad.service.ItemServiceImpl;
import co.cstad.view.ItemView;
import co.cstad.view.MenuViewAdmin;

import java.util.List;
import java.util.Scanner;

public class ItemController {
    private final MenuViewAdmin menuViewAdmin;
    private final ItemService itemService;
    private final Scanner scanner;

    public ItemController() {
        scanner = new Scanner(System.in);
        itemService = new ItemServiceImpl();
        menuViewAdmin = new MenuViewAdmin();
    }

    public void read() {
        List<ItemDTO> itemDTOList = itemService.select();
        ItemView.printItemList(itemDTOList);
    }

    public void update() {
        // Implement update logic
    }

//    public void delete() {
//        System.out.print("Enter the ID of the item to delete: ");
//        Long itemId = Long.parseLong(scanner.nextLine());
//
//        ItemDTO itemToDelete = itemService.selectById(itemId);
//
//        if (itemToDelete != null) {
//            System.out.println("Confirmation before deletion:");
//            ItemView.printItemDetails(itemToDelete);
//
//            System.out.print("Do you want to proceed with the deletion? (yes/no): ");
//            String confirmation = scanner.nextLine().toLowerCase();
//
//            if (confirmation.equals("yes")) {
//                ItemDTO deletedItem = itemService.deleteById(itemId);
//
//                if (deletedItem != null) {
//                    System.out.println("Item deleted successfully:");
//                    ItemView.printItemDetails(deletedItem);
//                    menuViewAdmin.itemConfirmation(deletedItem);  // Pass the correct item for confirmation
//                } else {
//                    System.out.println("Failed to delete the item.");
//                }
//            } else {
//                System.out.println("Deletion canceled by user.");
//            }
//        } else {
//            System.out.println("Item with ID " + itemId + " not found.");
//        }
//    }

    public ItemDTO delete() {
        System.out.print("Enter the ID of the item to delete: ");
        Long itemId = Long.parseLong(scanner.nextLine());

        ItemDTO itemToDelete = itemService.selectById(itemId);

        if (itemToDelete != null) {
            System.out.println("Confirmation before deletion:");
            ItemView.printItemDetails(itemToDelete);

            System.out.print("Do you want to proceed with the deletion? (yes/no): ");
            String confirmation = scanner.nextLine().toLowerCase();

            if (confirmation.equals("yes")) {
                ItemDTO deletedItem = itemService.deleteById(itemId);

                if (deletedItem != null) {
                    System.out.println("Item deleted successfully:");
                    return deletedItem;
                } else {
                    System.out.println("Failed to delete the item.");
                }
            } else {
                System.out.println("Deletion canceled by user.");
            }
        } else {
            System.out.println("Item with ID " + itemId + " not found.");
        }

        return null;
    }

    public ItemDTO create() {
        ItemDTO newItem = ItemView.collectNewItemInformation();

        if (newItem != null) {
            ItemDTO createdItem = itemService.insert(newItem);

            if (createdItem != null) {
                System.out.println("Item created successfully:");
                ItemView.printItemDetails(createdItem);
                return createdItem;
            } else {
                System.out.println("Failed to create the item.");
            }
        } else {
            System.out.println("Invalid input for creating a new item.");
        }
        return null;
    }

    public void confirmation(ItemDTO createdItem) {
        menuViewAdmin.itemConfirmation(createdItem);
    }

    public void closeScanner() {
        scanner.close();
    }
}
