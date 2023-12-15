package co.cstad.controller;

import co.cstad.model.CustomerDTO;
import co.cstad.service.CustomerService;
import co.cstad.service.CustomerServiceImpl;
import co.cstad.view.CustomerView;

import java.util.List;
import java.util.Scanner;

public class CustomerController {
    private final Scanner scanner ;
    private final CustomerDTO customerDTO;
    private final CustomerService customerService;
    public CustomerController(){
        scanner = new Scanner(System.in);
        customerDTO = new CustomerDTO();
        customerService = new CustomerServiceImpl();
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
        System.out.println(customerDTO);
    }
    public void updateAll(){
        System.out.print(" Enter the ID to update : ");
        Long upID = Long.parseLong(scanner.nextLine());

        CustomerDTO customerDTO1 = customerService.selectById(upID);
        if(customerDTO1 != null){
            CustomerView.readOneCustomer(customerDTO1);

            CustomerDTO customer = CustomerView.viewCreateCustomer(customerDTO1,scanner);
            if (customer != null) {
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
            System.out.println("Item with ID " + upID + " not found.");
        }

    }

    public void updateCustomerName(){
        System.out.print("Enter the ID of the customer to update : ");
        Long customerID = Long.parseLong(scanner.nextLine());

        CustomerDTO customerDTO1 = customerService.selectById(customerID);

        if (customerDTO1 != null) {

            CustomerView.readOneCustomer(customerDTO1);

            System.out.print("Enter the new customer name : ");
            String newName = scanner.nextLine();

            customerDTO1.setCustomerName(newName);

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
    }


    public void updateCustomerAddress(){
        System.out.print("Enter the ID of the customer to update : ");
        Long customerID = Long.parseLong(scanner.nextLine());

        CustomerDTO customerDTO1 = customerService.selectById(customerID);

        if (customerDTO1 != null) {

            CustomerView.readOneCustomer(customerDTO1);

            System.out.print("Enter the new customer address : ");
            String newAddress = scanner.nextLine();

            customerDTO1.setAddress(newAddress);

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
    }


    public void updateCustomerContact1(){
        System.out.print("Enter the ID of the customer to update : ");
        Long customerID = Long.parseLong(scanner.nextLine());

        CustomerDTO customerDTO1 = customerService.selectById(customerID);

        if (customerDTO1 != null) {

            CustomerView.readOneCustomer(customerDTO1);

            System.out.print("Enter the new customer Contact 1 : ");
            String newContact1 = scanner.nextLine();

            customerDTO1.setContact1(newContact1);

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
    }


    public void updateCustomerContact2(){
        System.out.print("Enter the ID of the customer to update : ");
        Long customerID = Long.parseLong(scanner.nextLine());

        CustomerDTO customerDTO1 = customerService.selectById(customerID);

        if (customerDTO1 != null) {

            CustomerView.readOneCustomer(customerDTO1);

            System.out.print("Enter the new customer contact 2 : ");
            String newContact2 = scanner.nextLine();

            customerDTO1.setContact2(newContact2);

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
    }


    public void updateCustomerStatus(){
        System.out.print("Enter the ID of the customer to update : ");
        Long customerID = Long.parseLong(scanner.nextLine());

        CustomerDTO customerDTO1 = customerService.selectById(customerID);

        if (customerDTO1 != null) {

            CustomerView.readOneCustomer(customerDTO1);

            System.out.print("Enter the new customer status : ");
            Boolean newStatus = scanner.hasNext();

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
    }


    public void updateCustomerType(){
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
    }

    public CustomerDTO delete() {
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

        return null;
    }
}
/**/