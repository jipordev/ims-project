package co.cstad.controller;

import co.cstad.model.ItemDTO;
import co.cstad.service.ItemService;
import co.cstad.service.ItemServiceImpl;
import co.cstad.view.ItemView;
import co.cstad.view.MenuViewAdmin;

import java.math.BigDecimal;
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
    public void updateAll() {
        System.out.print("Enter the ID of the item to update: ");
        Long itemId = Long.parseLong(scanner.nextLine());

        ItemDTO existingItem = itemService.selectById(itemId);

        if (existingItem != null) {
            System.out.println("Existing Item Details:");
            menuViewAdmin.itemConfirmation(existingItem);

            ItemDTO newItem = ItemView.collectNewItemInformation();

            if (newItem != null) {
                // Update the existing item with the new information
                existingItem.setItemDescription(newItem.getItemDescription());
                existingItem.setItemUnit(newItem.getItemUnit());
                existingItem.setQty(newItem.getQty());
                existingItem.setItemPrice_out_a(newItem.getItemPrice_out_a());
                existingItem.setItemPrice_out_b(newItem.getItemPrice_out_b());
                existingItem.setItemPrice_out_c(newItem.getItemPrice_out_c());
                existingItem.setStatus(newItem.isStatus());

                // Call the service to update the item
                ItemDTO updatedItem = itemService.updateById(existingItem);

                if (updatedItem != null) {
                    System.out.println("Item updated successfully:");
                    menuViewAdmin.itemConfirmation(updatedItem);
                } else {
                    System.out.println("Failed to update item.");
                }
            } else {
                System.out.println("Invalid input for updating the item.");
            }
        } else {
            System.out.println("Item with ID " + itemId + " not found.");
        }
    }
    public void updateItemDescription(){
        System.out.print("Enter the ID of the item to update: ");
        Long itemId = Long.parseLong(scanner.nextLine());

        ItemDTO existingItem = itemService.selectById(itemId);

        if (existingItem != null) {
            System.out.println("Existing Item Details:");
            menuViewAdmin.itemConfirmation(existingItem);

            System.out.print("Enter the new item description: ");
            String newItemDescription = scanner.nextLine();

            existingItem.setItemDescription(newItemDescription);

            // Call the service to update the item
            ItemDTO updatedItem = itemService.updateById(existingItem);

            if (updatedItem != null) {
                System.out.println("Item description updated successfully:");
                menuViewAdmin.itemConfirmation(updatedItem);
            } else {
                System.out.println("Failed to update item description.");
            }
        } else {
            System.out.println("Item with ID " + itemId + " not found.");
        }
    }
    public void updateItemUnit(){
        System.out.print("Enter the ID of the item to update: ");
        Long itemId = Long.parseLong(scanner.nextLine());

        ItemDTO existingItem = itemService.selectById(itemId);

        if (existingItem != null) {
            System.out.println("Existing Item Details:");
            menuViewAdmin.itemConfirmation(existingItem);

            System.out.print("Enter the new item unit: ");
            String newItemUnit = scanner.nextLine();

            existingItem.setItemUnit(newItemUnit);

            // Call the service to update the item
            ItemDTO updatedItem = itemService.updateById(existingItem);

            if (updatedItem != null) {
                System.out.println("Item unit updated successfully:");
                menuViewAdmin.itemConfirmation(updatedItem);
            } else {
                System.out.println("Failed to update item unit.");
            }
        } else {
            System.out.println("Item with ID " + itemId + " not found.");
        }
    }
    public void updateItemQty () {
        System.out.print("Enter the ID of the item to update: ");
        Long itemId = Long.parseLong(scanner.nextLine());

        ItemDTO existingItem = itemService.selectById(itemId);

        if (existingItem != null) {
            System.out.println("Existing Item Details:");
            menuViewAdmin.itemConfirmation(existingItem);

            System.out.print("Enter the new item qty: ");
            int newItemQty = Integer.parseInt(scanner.nextLine());

            existingItem.setQty(newItemQty);

            // Call the service to update the item
            ItemDTO updatedItem = itemService.updateById(existingItem);

            if (updatedItem != null) {
                System.out.println("Item qty updated successfully:");
                menuViewAdmin.itemConfirmation(updatedItem);
            } else {
                System.out.println("Failed to update item qty.");
            }
        } else {
            System.out.println("Item with ID " + itemId + " not found.");
        }
    }
    public void updateItemPriceA() {
        System.out.print("Enter the ID of the item to update: ");
        Long itemId = Long.parseLong(scanner.nextLine());

        ItemDTO existingItem = itemService.selectById(itemId);

        if (existingItem != null) {
            System.out.println("Existing Item Details:");
            menuViewAdmin.itemConfirmation(existingItem);

            System.out.print("Enter the new item price_a : ");
            BigDecimal newItemPriceA = new BigDecimal(scanner.nextLine());

            existingItem.setItemPrice_out_a(newItemPriceA);

            // Call the service to update the item
            ItemDTO updatedItem = itemService.updateById(existingItem);

            if (updatedItem != null) {
                System.out.println("Item price_a updated successfully:");
                menuViewAdmin.itemConfirmation(updatedItem);
            } else {
                System.out.println("Failed to update item price_a.");
            }
        } else {
            System.out.println("Item with ID " + itemId + " not found.");
        }
    }
    public void updateItemPriceB() {
        System.out.print("Enter the ID of the item to update: ");
        Long itemId = Long.parseLong(scanner.nextLine());

        ItemDTO existingItem = itemService.selectById(itemId);

        if (existingItem != null) {
            System.out.println("Existing Item Details:");
            menuViewAdmin.itemConfirmation(existingItem);

            System.out.print("Enter the new item price_b : ");
            BigDecimal newItemPriceB = new BigDecimal(scanner.nextLine());

            existingItem.setItemPrice_out_b(newItemPriceB);

            // Call the service to update the item
            ItemDTO updatedItem = itemService.updateById(existingItem);

            if (updatedItem != null) {
                System.out.println("Item price_b updated successfully:");
                menuViewAdmin.itemConfirmation(updatedItem);
            } else {
                System.out.println("Failed to update item price_b.");
            }
        } else {
            System.out.println("Item with ID " + itemId + " not found.");
        }
    }
    public void updateItemPriceC() {
        System.out.print("Enter the ID of the item to update: ");
        Long itemId = Long.parseLong(scanner.nextLine());

        ItemDTO existingItem = itemService.selectById(itemId);

        if (existingItem != null) {
            System.out.println("Existing Item Details:");
            menuViewAdmin.itemConfirmation(existingItem);

            System.out.print("Enter the new item price_c : ");
            BigDecimal newItemPriceC = new BigDecimal(scanner.nextLine());

            existingItem.setItemPrice_out_c(newItemPriceC);

            // Call the service to update the item
            ItemDTO updatedItem = itemService.updateById(existingItem);

            if (updatedItem != null) {
                System.out.println("Item price_c updated successfully:");
                menuViewAdmin.itemConfirmation(updatedItem);
            } else {
                System.out.println("Failed to update item price_c.");
            }
        } else {
            System.out.println("Item with ID " + itemId + " not found.");
        }
    }
    public void updateItemStatus() {
        System.out.print("Enter the ID of the item to update: ");
        Long itemId = Long.parseLong(scanner.nextLine());

        ItemDTO existingItem = itemService.selectById(itemId);

        if (existingItem != null) {
            System.out.println("Existing Item Details:");
            menuViewAdmin.itemConfirmation(existingItem);

            System.out.print("Enter the new item status (true/false): ");
            boolean newItemStatus = Boolean.parseBoolean(scanner.nextLine());

            existingItem.setStatus(newItemStatus);

            // Call the service to update the item
            ItemDTO updatedItem = itemService.updateById(existingItem);

            if (updatedItem != null) {
                System.out.println("Item status updated successfully:");
                menuViewAdmin.itemConfirmation(updatedItem);
            } else {
                System.out.println("Failed to update item status.");
            }
        } else {
            System.out.println("Item with ID " + itemId + " not found.");
        }
    }



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
