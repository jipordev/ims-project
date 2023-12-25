package co.cstad.view;

import co.cstad.model.CustomerDTO;
import co.cstad.view.staticmenu.BoxBorder;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

import java.util.Collection;
import java.util.Scanner;

public class CustomerView implements BoxBorder {
    public static CustomerDTO viewCreateCustomer(CustomerDTO  customerDTO , Scanner scanner){

        System.out.print("  Enter Name : ");
        customerDTO.setCustomerName(scanner.nextLine());
        System.out.print("  Enter Address : ");
        customerDTO.setAddress(scanner.nextLine());
        System.out.print("  Enter Contact 1 : ");
        customerDTO.setContact1(scanner.nextLine());
        System.out.print("  Enter Contact 2 : ");
        customerDTO.setContact2(scanner.nextLine());
        System.out.print("  Enter Type : ");
        customerDTO.setCustomerType(scanner.nextLine());
        System.out.print("  Is the Customer active? (Enter 'y' for true, 'n' for false) : ");
        customerDTO.setStatus(scanner.nextLine().equalsIgnoreCase("y"));
        scanner.nextLine();

        return customerDTO;
    }
    public static void printCustomerList(Collection<CustomerDTO> customers) {
        Table table = new Table(7, BorderStyle.UNICODE_BOX, ShownBorders.ALL);
        table.setColumnWidth(0,15,25);
        table.setColumnWidth(1,20,50);
        table.setColumnWidth(2,20,50);
        table.setColumnWidth(3,20,50);
        table.setColumnWidth(4,20,50);
        table.setColumnWidth(5,20,50);
        table.setColumnWidth(6,20,50);

        table.addCell(yellow + "   Customer ID  " + reset );
        table.addCell(yellow + "   Customer Name  " + reset );
        table.addCell(yellow + "   Customer Address  " + reset  );
        table.addCell(yellow + "   Customer Contact 1  " + reset );
        table.addCell(yellow + "   Customer Contact 1  " + reset );
        table.addCell(yellow + "   Customer Status  "+ reset );
        table.addCell(yellow + "   Customer Type  "+ reset );

        for(CustomerDTO customer : customers ) {
            table.addCell(blue + String.valueOf(customer.getCustomersId()));
            table.addCell(green +customer.getCustomerName());
            table.addCell(green +customer.getAddress());
            table.addCell(green +customer.getContact1());
            table.addCell(green +customer.getContact2());
            table.addCell(green +  (customer.getStatus() ? "Active" : "Inactive") + "   ");
            table.addCell(green +customer.getCustomerType() + reset);
        }
        System.out.println(table.render());
    }

    public static void readOneCustomer(CustomerDTO customerRead) {
        System.out.println();
        Table table = new Table(2, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE, ShownBorders.SURROUND);
        table.setColumnWidth(0, 30, 30);
        table.setColumnWidth(1, 30, 30);
        table.addCell(" ".repeat(3) + yellow + "Customer ID :" + reset);
        table.addCell(" ".repeat(3) + green + customerRead.getCustomersId() + reset);
        table.addCell(" ".repeat(3) + yellow + "Customer Name :" + reset);
        table.addCell(" ".repeat(3) + green + customerRead.getCustomerName()+ reset);
        table.addCell(" ".repeat(3) + yellow + "Customer Address :" + reset);
        table.addCell(" ".repeat(3) + green + customerRead.getAddress() + reset);
        table.addCell(" ".repeat(3) + yellow + "Customer Contact 1 :" + reset);
        table.addCell(" ".repeat(3) + green + customerRead.getContact1() + reset);
        table.addCell(" ".repeat(3) + yellow + "Customer Contact 2 :" + reset);
        table.addCell(" ".repeat(3) + green + customerRead.getContact2() + reset);
        table.addCell(" ".repeat(3) + yellow + "Customer Status :" + reset);
        table.addCell(" ".repeat(3)  + green +  (customerRead.getStatus() ? "Active" : "Inactive") + "   ");
        table.addCell(" ".repeat(3) + yellow + "Customer Type :" + reset);
        table.addCell(" ".repeat(3) + green + customerRead.getCustomerType() + reset);

        System.out.println(table.render());
    }

}