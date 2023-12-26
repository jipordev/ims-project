package co.cstad.controller;

import co.cstad.exception.StringInputException;
import co.cstad.model.CustomerDTO;
import co.cstad.service.CustomerService;
import co.cstad.util.Singleton;
import co.cstad.view.CustomerView;
import co.cstad.view.MenuViewAdmin;

import java.util.List;
import java.util.Scanner;

public class CustomerController {
    private final Scanner scanner ;
    private final MenuViewAdmin menuViewAdmin;
    private final CustomerDTO customerDTO;
    private final CustomerService customerService;
    public CustomerController(){
        scanner = Singleton.scanner();
        customerDTO = new CustomerDTO();
        customerService = Singleton.customerService();
        menuViewAdmin = Singleton.menuViewAdmin();
    }

    public void read(){
        List<CustomerDTO> customerDTOList = customerService.select();
        CustomerView.printCustomerList(customerDTOList);
    }

    public void newCustomer(){
        CustomerDTO customerDTO = new CustomerDTO();
        CustomerView.viewCreateCustomer(customerDTO,scanner);
        customerDTO=customerService.insert(customerDTO);
        System.out.println(" Successfully saved ");
    }
    private boolean validateStringInput(String input) throws StringInputException {
        if (input == null || input.trim().isEmpty()) {
            throw new StringInputException("Input cannot be null or empty.");
        }
        return true;
    }
    public void updateAll() {
        try {
            System.out.print(" Enter the ID to update : ");
            Long upID = Long.parseLong(scanner.nextLine());

            CustomerDTO customerDTO1 = customerService.selectById(upID);
            if (customerDTO1 != null) {
                CustomerView.readOneCustomer(customerDTO1);

                CustomerDTO customer = CustomerView.viewCreateCustomer(customerDTO1, scanner);
                if (customer != null) {
                    // Validate string inputs before updating
                    if (validateStringInput(customer.getCustomerName()) && validateStringInput(customer.getAddress())) {
                        // Update the existing item with the new information
                        customerDTO1.setCustomerName(customer.getCustomerName());
                        customerDTO1.setAddress(customer.getAddress());
                        customerDTO1.setContact1(customer.getContact1());
                        customerDTO1.setContact2(customer.getContact2());
                        customerDTO1.setStatus(customer.getStatus());
                        customerDTO1.setCustomerType(customer.getCustomerType());

                        // Call the service to update the item
                        CustomerDTO updatedItem = customerService.updateById(customerDTO1);

                        if (updatedItem != null) {
                            System.out.println("Item updated successfully:");
                            CustomerView.readOneCustomer(customerDTO1);
                        } else {
                            System.out.println("Failed to update item.");
                        }
                    } else {
                        System.out.println("Invalid input for updating the item.");
                    }
                } else {
                    System.out.println("Invalid input for updating the item.");
                }
            } else {
                System.out.println("Item with ID " + upID + " not found.");
            }
        } catch (StringInputException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID format. Please enter a valid number.");
        }

    }

    public void updateCustomerName(){
        try {
            System.out.print("Enter the ID of the customer to update : ");
            Long customerID = Long.parseLong(scanner.nextLine());

            CustomerDTO customerDTO1 = customerService.selectById(customerID);

            if (customerDTO1 != null) {

                CustomerView.readOneCustomer(customerDTO1);

                System.out.print("Enter the new customer name : ");
                String newName = scanner.nextLine();

                if (validateStringInput(newName)) {
                    customerDTO1.setCustomerName(newName);

                    CustomerDTO updatedCustomer = customerService.updateById(customerDTO1);

                    if (updatedCustomer != null) {
                        System.out.println("The Customer updated successfully:");
                        CustomerView.readOneCustomer(customerDTO1);
                    } else {
                        System.out.println("Failed to update customer");
                    }
                } else {
                    System.out.println("Invalid Input for customer name");
                }
            } else {
                System.out.println("Customer ID " + customerID + " not found.");
            }
        } catch (StringInputException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID format. Please enter a valid number.");
        }
    }
    public void updateCustomerAddress() {
        try {
            System.out.print("Enter the ID of the customer to update : ");
            Long customerID = Long.parseLong(scanner.nextLine());

            CustomerDTO customerDTO1 = customerService.selectById(customerID);

            if (customerDTO1 != null) {
                CustomerView.readOneCustomer(customerDTO1);

                System.out.print("Enter the new customer address : ");
                String newAddress = scanner.nextLine();

                // Validate the new address input
                if (validateStringInput(newAddress)) {
                    customerDTO1.setAddress(newAddress);

                    CustomerDTO updatedCustomer = customerService.updateById(customerDTO1);

                    if (updatedCustomer != null) {
                        System.out.println("The Customer updated successfully:");
                        CustomerView.readOneCustomer(customerDTO1);
                    } else {
                        System.out.println("Failed to update customer");
                    }
                } else {
                    System.out.println("Invalid input for the new customer address.");
                }
            } else {
                System.out.println("Customer ID " + customerID + " not found.");
            }
        } catch (StringInputException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID format. Please enter a valid number.");
        }
    }
    public void updateCustomerContact1() {
        try {
            System.out.print("Enter the ID of the customer to update : ");
            Long customerID = Long.parseLong(scanner.nextLine());

            CustomerDTO customerDTO1 = customerService.selectById(customerID);

            if (customerDTO1 != null) {
                CustomerView.readOneCustomer(customerDTO1);

                System.out.print("Enter the new customer Contact 1 : ");
                String newContact1 = scanner.nextLine();

                // Validate the new contact 1 input
                if (validateStringInput(newContact1)) {
                    customerDTO1.setContact1(newContact1);

                    CustomerDTO updatedCustomer = customerService.updateById(customerDTO1);

                    if (updatedCustomer != null) {
                        System.out.println("The Customer updated successfully:");
                        CustomerView.readOneCustomer(customerDTO1);
                    } else {
                        System.out.println("Failed to update customer");
                    }
                } else {
                    System.out.println("Invalid input for the new customer Contact 1.");
                }
            } else {
                System.out.println("Customer ID " + customerID + " not found.");
            }
        } catch (StringInputException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID format. Please enter a valid number.");
        }
    }
    public void updateCustomerContact2() {
        try {
            System.out.print("Enter the ID of the customer to update : ");
            Long customerID = Long.parseLong(scanner.nextLine());

            CustomerDTO customerDTO1 = customerService.selectById(customerID);

            if (customerDTO1 != null) {
                CustomerView.readOneCustomer(customerDTO1);

                System.out.print("Enter the new customer Contact 2 : ");
                String newContact2 = scanner.nextLine();

                // Validate the new contact 2 input
                if (validateStringInput(newContact2)) {
                    customerDTO1.setContact2(newContact2);

                    CustomerDTO updatedCustomer = customerService.updateById(customerDTO1);

                    if (updatedCustomer != null) {
                        System.out.println("The Customer updated successfully:");
                        CustomerView.readOneCustomer(customerDTO1);
                    } else {
                        System.out.println("Failed to update customer");
                    }
                } else {
                    System.out.println("Invalid input for the new customer Contact 2.");
                }
            } else {
                System.out.println("Customer ID " + customerID + " not found.");
            }
        } catch (StringInputException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID format. Please enter a valid number.");
        }
    }


    public void updateCustomerStatus(){
        try {
            System.out.print("Enter the ID of the customer to update : ");
            Long customerID = Long.parseLong(scanner.nextLine());

            CustomerDTO customerDTO1 = customerService.selectById(customerID);

            if (customerDTO1 != null) {

                CustomerView.readOneCustomer(customerDTO1);

                System.out.print("Enter the new customer status : ");
                Boolean newStatus = Boolean.parseBoolean(scanner.nextLine());

                customerDTO1.setStatus(newStatus);

                CustomerDTO updatedCustomer = customerService.updateById(customerDTO1);

                if (updatedCustomer != null) {
                    System.out.println("The Customer updated successfully:");
                    CustomerView.readOneCustomer(customerDTO1);
                } else {
                    System.out.println("Failed to update customer");
                }
            } else {
                System.out.println("Customer ID " + customerID + " not found.");
            }
        } catch (StringInputException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID format. Please enter a valid number.");
        }
    }


    public void updateCustomerType(){
        try {
            System.out.print("Enter the ID of the customer to update : ");
            Long customerID = Long.parseLong(scanner.nextLine());

            CustomerDTO customerDTO1 = customerService.selectById(customerID);

            if (customerDTO1 != null) {

                CustomerView.readOneCustomer(customerDTO1);

                System.out.print("Enter the new customer type : ");
                String newType = scanner.nextLine();

                customerDTO1.setAddress(newType);

                CustomerDTO updatedCustomer = customerService.updateById(customerDTO1);

                if (updatedCustomer != null) {
                    System.out.println("The Customer updated successfully:");
                    CustomerView.readOneCustomer(customerDTO1);
                } else {
                    System.out.println("Failed to update customer");
                }
            } else {
                System.out.println("Customer ID " + customerID + " not found.");
            }
        } catch (StringInputException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID format. Please enter a valid number.");
        }
    }


    public CustomerDTO delete() {
        try {
            System.out.print("Enter the ID of the item to delete: ");
            Long customerID = Long.parseLong(scanner.nextLine());

            CustomerDTO customerToDelete = customerService.selectById(customerID);

            if (customerToDelete != null) {
                System.out.println("Confirmation before deletion.");
                CustomerView.readOneCustomer(customerToDelete);
                System.out.print("Do you want to proceed with the deletion? (yes/no): ");
                String confirmation = scanner.nextLine().toLowerCase();

                if (confirmation.equals("yes")) {
                    CustomerDTO deletedItem = customerService.deleteById(customerID);

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
                System.out.println("Item with ID " + customerID + " not found.");
            }
        } catch ( StringInputException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID format. Please enter a valid number.");
        }
        return null;
    }    public void confirmation(CustomerDTO createdCustomer) {
        menuViewAdmin.cutomerConfirmation(createdCustomer);
    }
}