package co.cstad.view;

import co.cstad.model.InvoiceDTO;
import co.cstad.model.ItemDTO;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class InvoiceView {


    public static InvoiceDTO collectNewInvoiceInformation() {
        InvoiceDTO newInvoice = new InvoiceDTO();

        System.out.print("Enter invoice NO : ");
        newInvoice.setInvoiceNo(scanner.nextLine());

        System.out.print("Is the invoice cancelled ? (Enter 'y' for true, 'n' for false) : ");
        newInvoice.setCancelled(scanner.nextLine().equalsIgnoreCase("y"));

        System.out.print("Is the invoice active? (Enter 'y' for true, 'n' for false) : ");
        newInvoice.setStatus(scanner.nextLine().equalsIgnoreCase("y"));

        System.out.print("Is the invoice paid? (Enter 'y' for true, 'n' for false) : ");
        newInvoice.setPaid(scanner.nextLine().equalsIgnoreCase("y"));

        System.out.print("Enter customer id : ");
        newInvoice.setCustomerId(scanner.nextLong());

        System.out.print("Enter stockOut id : ");
        newInvoice.setStockOutId(scanner.nextLong());
        ItemDTO itemDTO = new ItemDTO();


        return newInvoice;
    }


//    public static InvoiceDTO collectNewInvoiceInformation(Long id) {
//        InvoiceDTO newInvoice = new InvoiceDTO();
//        newInvoice.setInvoiceId(id);
//        newInvoice.setInvoiceNo("CSTAD" + id.toString());
//        newInvoice.setCancelled(false);
//        newInvoice.setStatus(true);
//        newInvoice.setPaid(true);
//
//        return newInvoice;
//    }
    public static void printInvoiceDetails(Collection<InvoiceDTO> invoices) {
        Table table = new Table(7, BorderStyle.UNICODE_BOX_DOUBLE_BORDER, ShownBorders.ALL);
        table.addCell("   Invoice ID   ");
        table.addCell("   Invoice No   ");
        table.addCell("   Customer ID   ");
        table.addCell("   Discount   ");
        table.addCell("   IS Cancelled   ");
        table.addCell("   Paid Payment   ");
        table.addCell("   Status   ");

        for (InvoiceDTO invoice : invoices) {
            table.addCell("   " + String.valueOf(invoice.getInvoiceId()) + "   ");
            table.addCell("   " + invoice.getInvoiceNo() + "   ");
            table.addCell("   " + invoice.getCustomer().getCustomersId() + "   ");
            table.addCell("   " + invoice.getDiscount() + "   ");
            table.addCell("   " + invoice.getCancelled() + "   ");
            table.addCell("   " + invoice.getPaid() + "   ");
            table.addCell("   " + (invoice.getStatus() ? "Active" : "Inactive") + "   ");
        }
        System.out.println(table.render());
    }

    public static void printInvoiceList(List<InvoiceDTO> invoiceList) {
        System.out.println("Invoice List");
        printInvoiceDetails(invoiceList);
    }
}