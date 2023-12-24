package co.cstad.controller;

import co.cstad.exception.StringInputException;
import co.cstad.model.ItemDTO;
import co.cstad.model.StockInDTO;
import co.cstad.model.StockOutDTO;
import co.cstad.service.ItemService;
import co.cstad.util.Singleton;
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
        scanner = Singleton.scanner();
        itemService = Singleton.itemService();
        menuViewAdmin = Singleton.menuViewAdmin();
    }

    public void read() {
        List<ItemDTO> itemDTOList = itemService.select();
        ItemView.printItemList(itemDTOList);
    }
    public StockInDTO stockIn(){
        StockInDTO newStockIn = ItemView.viewCreateStock();

        if (newStockIn != null) {
            StockInDTO stockIn = itemService.stockIn(newStockIn);

            if (stockIn != null){
                System.out.println("Restock successfully");
                return stockIn;
            } else {
                System.out.println("Failed to restock");
            }
        } else {
            System.out.println("Invalid input for restock the item.");
        }
        return null;
    }
    public void stockOut() {
        while (true) {
            StockOutDTO newStockOut = ItemView.viewCreateStockOut();

            if (newStockOut != null) {
                StockOutDTO stockOutResult = itemService.stockout(newStockOut);

                if (stockOutResult != null) {
                    System.out.println("Restock successfully");
                } else {
                    System.out.println("Failed to restock");
                }

                System.out.print("Do you want to perform another restock? (yes/no): ");
                String userChoice = scanner.nextLine().toLowerCase();

                if (!userChoice.equals("yes")) {
                    break;
                }
            } else {
                System.out.println("Invalid input for restock the item.");
                break;
            }
        }
    }
    public ItemDTO create() {
        ItemDTO newItem = ItemView.collectNewItemInformation();

        if (newItem != null) {
            ItemDTO createdItem = itemService.insert(newItem);

            if (createdItem != null) {
                System.out.println("Item created successfully:");
                return createdItem;
            } else {
                System.out.println("Failed to create the item.");
            }
        } else {
            System.out.println("Invalid input for creating a new item.");
        }
        return null;
    }

    public void updateAll() {
        try {
            System.out.print("Enter the ID of the item to update: ");
            Long itemId = Long.parseLong(scanner.nextLine());

            ItemDTO existingItem = itemService.selectById(itemId);

            if (existingItem != null) {
                System.out.println("Existing Item Details:");
                menuViewAdmin.itemConfirmation(existingItem);

                System.out.print("Enter the new item description: ");
                String newItemDescription = scanner.nextLine();

                System.out.print("Enter the new item unit: ");
                String newItemUnit = scanner.nextLine();

                // Validate the new item description and unit inputs
                if (validateStringInput(newItemDescription) && validateStringInput(newItemUnit)) {
                    ItemDTO newItem = new ItemDTO();

                    System.out.print("Enter the new item qty: ");
                    Integer newItemQty = Integer.parseInt(scanner.nextLine());

                    System.out.print("Enter the new item price: ");
                    BigDecimal newItemPrice = new BigDecimal(scanner.nextLine());

                    System.out.print("Is the item active? (Enter 'y' for true, 'n' for false): ");
                    Boolean newItemStatus = Boolean.parseBoolean(scanner.nextLine());

                    if (newItem != null) {
                        // Update the existing item with the new information
                        existingItem.setItemDescription(newItemDescription);
                        existingItem.setItemUnit(newItemUnit);
                        existingItem.setQty(newItemQty);
                        existingItem.setItemPrice(newItemPrice);
                        existingItem.setItemPrice_out_a(newItemPrice.multiply(new BigDecimal("0.93")));
                        existingItem.setItemPrice_out_b(newItemPrice.multiply(new BigDecimal("0.95")));
                        existingItem.setItemPrice_out_c(newItemPrice.multiply(new BigDecimal("0.97")));
                        existingItem.setStatus(newItemStatus);

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
                    System.out.println("Invalid input for the new item description or unit.");
                }
            } else {
                System.out.println("Item with ID " + itemId + " not found.");
            }
        } catch (StringInputException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID input. Please try again");
        }
    }
    public void updateItemDescription(){
        try {
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
        } catch (StringInputException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID input. Please try again.");
        }
    }

    public void updatePrice() {
        try {
            System.out.print("Enter the ID of the item to update: ");
            Long itemId = Long.parseLong(scanner.nextLine());

            ItemDTO existingItem = itemService.selectById(itemId);

            if (existingItem != null) {
                System.out.println("Existing Item Details:");
                menuViewAdmin.itemConfirmation(existingItem);

                System.out.print("Enter the new item price : ");
                BigDecimal newItemPrice = new BigDecimal(scanner.nextLine());

                existingItem.setItemPrice(newItemPrice);
                existingItem.setItemPrice_out_a(newItemPrice.multiply(new BigDecimal("0.97")));
                existingItem.setItemPrice_out_b(newItemPrice.multiply(new BigDecimal("0.95")));
                existingItem.setItemPrice_out_c(newItemPrice.multiply(new BigDecimal("0.93")));

                // Call the service to update the item
                ItemDTO updatedItem = itemService.updateById(existingItem);

                if (updatedItem != null) {
                    System.out.println("Item price updated successfully:");
                    menuViewAdmin.itemConfirmation(updatedItem);
                } else {
                    System.out.println("Failed to update item price.");
                }
            } else {
                System.out.println("Item with ID " + itemId + " not found.");
            }
        } catch (StringInputException e){
            System.out.println(e.getMessage());
        } catch (NumberFormatException e){
            System.out.println("Invalid ID input. Please try again.");
        }
    }
    public void updateItemUnit(){
        try {
            System.out.print("Enter the ID of the item to update: ");
            Long itemId = Long.parseLong(scanner.nextLine());

            ItemDTO existingItem = itemService.selectById(itemId);

            if (existingItem != null) {
                System.out.println("Existing Item Details:");
                menuViewAdmin.itemConfirmation(existingItem);

                System.out.print("Enter the new item unit: ");
                String newItemUnit = scanner.nextLine();

                if (validateStringInput(newItemUnit)) {
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
                    System.out.println("Invalid input for the new description");
                }
            } else {
                System.out.println("Item with ID " + itemId + " not found.");
            }
        } catch (StringInputException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID input. Please try again");
        }
    }
    public void updateItemQty () {
        try {
            System.out.print("Enter the ID of the item to update: ");
            Long itemId = Long.parseLong(scanner.nextLine());

            ItemDTO existingItem = itemService.selectById(itemId);

            if (existingItem != null) {
                System.out.println("Existing Item Details:");
                menuViewAdmin.itemConfirmation(existingItem);

                System.out.print("Enter the new item qty: ");
                int newItemQty = Integer.parseInt(scanner.nextLine());

                existingItem.setQty(newItemQty);

                // Call the service to update the itemu
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
        } catch (StringInputException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e){
            System.out.println("Invalid ID input. Please try again.");
        }
    }
    public void updateItemPriceA() {
        try {
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
        } catch (StringInputException e){
            System.out.println(e.getMessage());
        } catch (NumberFormatException e){
            System.out.println("Invalid ID input. Please try again.");
        }
    }
    public void updateItemPriceB() {
        try {
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
        } catch (StringInputException e){
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID input. Please try again.");
        }
    }
    public void updateItemPriceC() {
        try {
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
        } catch (StringInputException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID input. Please try again");
        }
    }

    public void updateItemStatus() {
        try {
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
        } catch (StringInputException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e){
            System.out.println("Invalid input. Please try again");
        }
    }
    public ItemDTO delete() {
        try {
            System.out.print("Enter the ID of the item to delete: ");
            Long itemId = Long.parseLong(scanner.nextLine());

            ItemDTO itemToDelete = itemService.selectById(itemId);

            if (itemToDelete != null) {
                System.out.println("Confirmation before deletion.");
                menuViewAdmin.itemConfirmation(itemToDelete);
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
        } catch (StringInputException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e){
            System.out.println("Invalid input. Please try again");
        }
        return null;
    }
    public void confirmation(ItemDTO createdItem) {
        menuViewAdmin.itemConfirmation(createdItem);
    }
    public void closeScanner() {
        scanner.close();
    }
    private boolean validateStringInput(String input) throws StringInputException {
        if (input == null || input.trim().isEmpty()) {
            throw new StringInputException("Input cannot be null or empty.");
        }
        return true;
    }
}
