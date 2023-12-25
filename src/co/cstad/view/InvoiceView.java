package co.cstad.view;

import co.cstad.model.InvoiceDTO;
import co.cstad.model.ItemDTO;
import co.cstad.util.Singleton;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.CellStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class InvoiceView implements BoxBorder {
    private static Scanner scanner = new Scanner(System.in);
public class InvoiceView {
    private final static Scanner scanner = Singleton.scanner();

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
        newInvoice.setCustomerId(Long.parseLong(scanner.nextLine()));

        System.out.print("Enter stockOut id : ");
        newInvoice.setStockOutId(Long.parseLong(scanner.nextLine()));

        return newInvoice;
    }

    public static void printInvoiceDetails(Collection<InvoiceDTO> invoices) {
        Table table = new Table(7, BorderStyle.UNICODE_BOX_DOUBLE_BORDER, ShownBorders.ALL);
        table.addCell("   Invoice ID   ");
        table.addCell("   Invoice No   ");
        table.addCell("   Customer ID   ");
        table.addCell("   Stock OUT ID   ");
        table.addCell("   IS Cancelled   ");
        table.addCell("   Paid Payment   ");
        table.addCell("   Status   ");
        Table table = new Table(6, BorderStyle.UNICODE_BOX_DOUBLE_BORDER, ShownBorders.ALL);
        CellStyle cellStyle = new CellStyle(CellStyle.HorizontalAlign.center);
        table.setColumnWidth(0, 15, 25);
        table.setColumnWidth(1, 20, 25);
        table.setColumnWidth(2, 20, 25);
        table.setColumnWidth(3, 20, 25);
        table.setColumnWidth(4, 20, 25);
        table.setColumnWidth(5, 20, 25);
        table.addCell(yellow + "Invoice ID", cellStyle);
        table.addCell(yellow + "Invoice No", cellStyle);
        table.addCell(yellow + "Discount", cellStyle);
        table.addCell(yellow + "IS Cancelled", cellStyle);
        table.addCell(yellow + "Paid Payment", cellStyle);
        table.addCell(yellow + "Status", cellStyle);

        for (InvoiceDTO invoice : invoices) {
            table.addCell("   " + String.valueOf(invoice.getInvoiceId()) + "   ");
            table.addCell("   " + invoice.getInvoiceNo() + "   ");
            table.addCell("   " + invoice.getCustomerId() + "   ");
            table.addCell("   " + invoice.getStockOutId() + "   ");
            table.addCell("   " + invoice.getCancelled() + "   ");
            table.addCell("   " + invoice.getPaid() + "   ");
            table.addCell("   " + (invoice.getStatus() ? "Active" : "Inactive") + "   ");
            table.addCell(green + String.valueOf(invoice.getInvoiceId()), cellStyle);
            table.addCell(green + invoice.getInvoiceNo(), cellStyle);
            table.addCell(green + invoice.getDiscount(), cellStyle);
            table.addCell(green + invoice.getCancelled(), cellStyle);
            table.addCell(green + invoice.getPaid(), cellStyle);
            table.addCell(green + (invoice.getStatus() ? "Active" : "Inactive"), cellStyle);
        }
        System.out.println(table.render());
    }

    public static void printInvoiceList(List<InvoiceDTO> invoiceList) {
        System.out.println("Invoice List");
        printInvoiceDetails(invoiceList);
    }
}
