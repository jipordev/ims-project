package co.cstad.view;

import co.cstad.model.CustomerDTO;
import co.cstad.model.ItemDTO;
import co.cstad.util.Singleton;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class CustomerView {
    private static Scanner scanner;
    public CustomerView(){
        scanner = Singleton.scanner();
    }

    public static CustomerDTO collectNewCustomerInformation() {
        CustomerDTO newCustomer = new CustomerDTO();

        System.out.print("Enter customer name:");
        newCustomer.setCustomerName(scanner.nextLine());

        System.out.print("Enter customer address:");
        newCustomer.setAddress(scanner.nextLine());

        System.out.print("Enter customer contact 1:");
        newCustomer.setContact1(scanner.nextLine());

        System.out.print("Enter customer contact 2:");
        newCustomer.setContact2(scanner.nextLine());

        System.out.print("Enter customer type:");
        newCustomer.setCustomerType(scanner.nextLine());

        System.out.print("Is the item active? (Enter 'y' for true, 'n' for false): ");
        newCustomer.setStatus(scanner.nextLine().equalsIgnoreCase("y"));

        return newCustomer;
    }

    public static void printCustomerDetails(Collection<CustomerDTO> customerDTOS) {
        Table table = new Table(7, BorderStyle.UNICODE_BOX_DOUBLE_BORDER, ShownBorders.ALL);
        table.addCell("   Customer ID   ");
        table.addCell("   Customer Name   ");
        table.addCell("   Customer Address   ");
        table.addCell("   Contact 1   ");
        table.addCell("   Contact 2   ");
        table.addCell("   Customer Type   ");
        table.addCell("   Customer Status   ");

        for (CustomerDTO customerDTO : customerDTOS) {
            table.addCell("   " + String.valueOf(customerDTO.getCustomersId()) + "   ");
            table.addCell("   " + customerDTO.getCustomerName() + "   ");
            table.addCell("   " + customerDTO.getAddress() + "   ");
            table.addCell("   " + customerDTO.getContact1() + "   ");
            table.addCell("   " + customerDTO.getContact2() + "   ");
            table.addCell("   " + customerDTO.getCustomerType() + "   ");
            table.addCell("   " + (customerDTO.getStatus() ? "Active" : "Inactive") + "   ");
        }

        System.out.println(table.render());
    }


    public static void printCustomerList(List<CustomerDTO> customerDTOList) {
        System.out.println("Customer List:");
        printCustomerDetails(customerDTOList);
    }
}