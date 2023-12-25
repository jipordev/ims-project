package co.cstad.view;

import co.cstad.model.AlertDTO;
import co.cstad.model.ItemDTO;
import co.cstad.model.StockInDTO;
import co.cstad.model.StockOutDTO;
import co.cstad.model.*;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.CellStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

import java.util.Collection;

public class ReportView implements BoxBorder {



    public static void printItemCount(Collection<ItemDTO> items) {
        if (items == null) {
            System.out.println("Item list is null.");
            return;
        }

        Table table = new Table(10, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE, ShownBorders.ALL);
        CellStyle cellStyle = new CellStyle(CellStyle.HorizontalAlign.center);
        table.setColumnWidth(0, 15, 25);
        table.setColumnWidth(1, 20, 50);
        table.setColumnWidth(2, 20, 50);
        table.setColumnWidth(3, 20, 50);
        table.setColumnWidth(4, 20, 50);
        table.setColumnWidth(5, 20, 50);
        table.setColumnWidth(6, 15, 25);
        table.setColumnWidth(7, 20, 50);
        table.setColumnWidth(8, 20, 50);
        table.setColumnWidth(9, 20, 50);
        table.addCell(yellow + "Item ID", cellStyle);
        table.addCell(yellow + "Item Code", cellStyle);
        table.addCell(yellow + "Description", cellStyle);
        table.addCell(yellow + "Unit", cellStyle);
        table.addCell(yellow + "Quantity", cellStyle);
        table.addCell(yellow + "Price", cellStyle);
        table.addCell(yellow + "Price A", cellStyle);
        table.addCell(yellow + "Price B", cellStyle);
        table.addCell(yellow + "Price C", cellStyle);
        table.addCell(yellow + "Status", cellStyle);

        for (ItemDTO item : items) {
            if (item.getStatus() != null && item.getStatus()) {
                table.addCell(green + item.getItemId(), cellStyle);
                table.addCell(green + item.getItemCode(), cellStyle);
                table.addCell(green + item.getItemDescription(), cellStyle);
                table.addCell(green + item.getItemUnit(), cellStyle);
                table.addCell(green + String.valueOf(item.getQty()), cellStyle);
                table.addCell(green + String.valueOf(item.getItemPrice()), cellStyle);
                table.addCell(green + String.valueOf(item.getItemPrice_out_a()), cellStyle);
                table.addCell(green + String.valueOf(item.getItemPrice_out_b()), cellStyle);
                table.addCell(green + String.valueOf(item.getItemPrice_out_c()), cellStyle);
                table.addCell(green + (item.getStatus() ? "Active" : "Inactive"), cellStyle);
            }
        }

        System.out.println(table.render());
    }


    public static void stockInReport(Collection<StockInDTO> reports) {
        System.out.println(yellow + "\t\tStock In Report" + reset);
        Table table = new Table(5, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE, ShownBorders.ALL);
        table.setColumnWidth(0, 15, 20);
        table.setColumnWidth(1, 15, 20);
        table.setColumnWidth(2, 15, 20);
        table.setColumnWidth(3, 15, 20);
        table.setColumnWidth(4, 15, 20);

        CellStyle cellStyle = new CellStyle(CellStyle.HorizontalAlign.center);

        table.addCell(yellow + "Stock_In_Id", cellStyle);
        table.addCell(yellow + "Item_Id", cellStyle);
        table.addCell(yellow + "Qty", cellStyle);
        table.addCell(yellow + "Price_In", cellStyle);
        table.addCell(yellow + "Stock_In_Date" + reset, cellStyle);

        for (StockInDTO report : reports) {
            table.addCell(green + report.getStockInID(), cellStyle);
            table.addCell(green + report.getItemId(), cellStyle);
            table.addCell(green + report.getQtyIn(), cellStyle);
            table.addCell(green + report.getPriceIn(), cellStyle);
            table.addCell(green + report.getStockInDate() + reset, cellStyle);
        }

        System.out.println(table.render());
    }

    public static void stockOutReport(Collection<StockOutDTO> reports) {
        System.out.println(yellow + "\t\tStock Out Report" + reset);
        Table table = new Table(5, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE, ShownBorders.ALL);
        CellStyle cellStyle = new CellStyle(CellStyle.HorizontalAlign.center);
        table.setColumnWidth(0, 15, 20);
        table.setColumnWidth(1, 15, 20);
        table.setColumnWidth(2, 15, 20);
        table.setColumnWidth(3, 15, 20);
        table.setColumnWidth(4, 15, 20);

        table.addCell(yellow+"Stock_Out_Id", cellStyle);
        table.addCell(yellow+"Item_Id", cellStyle);
        table.addCell(yellow+"Qty", cellStyle);
        table.addCell(yellow+"Stock_Out_Date", cellStyle);
        table.addCell(yellow+"Price_Out", cellStyle);

        for (StockOutDTO report : reports) {
            table.addCell(green + report.getStockOutID(), cellStyle);
            table.addCell(green + report.getItemId(), cellStyle);
            table.addCell(green + report.getQtyOut(), cellStyle);
            table.addCell(green + report.getStockOutDate(), cellStyle);
            table.addCell(green + report.getPriceOut() + reset, cellStyle);
        }
        System.out.println(table.render());
    }

    public static void invoiceDetail(Collection<DetailDTO> reports) {
        System.out.println(yellow + "\t\tInvoice Details" + reset);
        Table table = new Table(11, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE, ShownBorders.ALL);
        CellStyle cellStyle = new CellStyle(CellStyle.HorizontalAlign.center);
        table.setColumnWidth(0, 15, 20);
        table.setColumnWidth(1, 15, 20);
        table.setColumnWidth(2, 15, 20);
        table.setColumnWidth(3, 15, 20);
        table.setColumnWidth(4, 15, 20);
        table.setColumnWidth(5, 15, 20);
        table.setColumnWidth(6, 15, 20);
        table.setColumnWidth(7, 15, 20);
        table.setColumnWidth(8, 15, 20);
        table.setColumnWidth(9, 15, 20);
        table.setColumnWidth(10, 15, 20);

        table.addCell(yellow+"Invoice_Detail_Id", cellStyle);
        table.addCell(yellow+"Invoice_No", cellStyle);
        table.addCell(yellow+"Item_Code", cellStyle);
        table.addCell(yellow+"Description", cellStyle);
        table.addCell(yellow+"Customer_Name", cellStyle);
        table.addCell(yellow+"QTY", cellStyle);
        table.addCell(yellow+"Stock_Out_Date", cellStyle);
        table.addCell(yellow+"Payment_Name", cellStyle);
        table.addCell(yellow+"Is_Paid", cellStyle);
        table.addCell(yellow+"Is_Cancelled", cellStyle);
        table.addCell(yellow+"Status", cellStyle);

        for (DetailDTO report : reports) {
            table.addCell(green + report.getDetailId(), cellStyle);
            table.addCell(green + report.getInvoiceDTO().getInvoiceNo(),cellStyle);
            table.addCell(green + report.getItemDTO().getItemCode(),cellStyle);
            table.addCell(green + report.getItemDTO().getItemDescription(),cellStyle);
            table.addCell(green + report.getCustomerDTO().getCustomerName(),cellStyle);
            table.addCell(green + report.getStockOutDTO().getQtyOut(),cellStyle);
            table.addCell(green + report.getStockOutDTO().getStockOutDate(),cellStyle);
            table.addCell(green + report.getPaymentMethodDTO().getPaymentMethodName(),cellStyle);
            table.addCell(green + report.getInvoiceDTO().getPaid(),cellStyle);
            table.addCell(green + report.getInvoiceDTO().getCancelled(),cellStyle);
            table.addCell(green + report.getItemDTO().getStatus(),cellStyle);
        }
        System.out.println(table.render());
    }

    public static void invoiceAdjustment(Collection<AdjustmentDTO> reports) {
        System.out.println(yellow + "\t\tInvoice Adjustment" + reset);
        Table table = new Table(12, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE, ShownBorders.ALL);
        CellStyle cellStyle = new CellStyle(CellStyle.HorizontalAlign.center);
        table.setColumnWidth(0, 15, 20);
        table.setColumnWidth(1, 15, 20);
        table.setColumnWidth(2, 15, 20);
        table.setColumnWidth(3, 15, 20);
        table.setColumnWidth(4, 15, 20);
        table.setColumnWidth(5, 15, 20);
        table.setColumnWidth(6, 15, 20);
        table.setColumnWidth(7, 15, 20);
        table.setColumnWidth(8, 15, 20);
        table.setColumnWidth(9, 15, 20);
        table.setColumnWidth(10, 15, 25);
        table.setColumnWidth(11, 15, 22);

        table.addCell(yellow + "Invoice_Adj_Id", cellStyle);
        table.addCell(yellow + "Item Code", cellStyle);
        table.addCell(yellow + "Description", cellStyle);
        table.addCell(yellow + "QTY", cellStyle);
        table.addCell(yellow + "Unt", cellStyle);
        table.addCell(yellow + "Price", cellStyle);
        table.addCell(yellow + "Price A", cellStyle);
        table.addCell(yellow + "Price B", cellStyle);
        table.addCell(yellow + "Price C", cellStyle);
        table.addCell(yellow + "Status", cellStyle);
        table.addCell(yellow + "Adjustment Date", cellStyle);
        table.addCell(yellow + "Cancelled" + reset, cellStyle);

        for (AdjustmentDTO report : reports) {
            table.addCell(green + report.getAdjustmentId(), cellStyle);
            table.addCell(green + report.getItemDTO().getItemCode(), cellStyle);
            table.addCell(green + report.getItemDTO().getItemDescription(), cellStyle);
            table.addCell(green + report.getItemDTO().getQty(), cellStyle);
            table.addCell(green + report.getItemDTO().getItemUnit(), cellStyle);
            table.addCell(green + report.getItemDTO().getItemPrice(), cellStyle);
            table.addCell(green + report.getItemDTO().getItemPrice_out_a(), cellStyle);
            table.addCell(green + report.getItemDTO().getItemPrice_out_b(), cellStyle);
            table.addCell(green + report.getItemDTO().getItemPrice_out_c(), cellStyle);
            table.addCell(green + (report.getItemDTO().getStatus() ? "Active" : "Inactive"), cellStyle);
            table.addCell(green + report.getReturnDate(), cellStyle);
            table.addCell(green + (report.getInvoiceDTO().getCancelled() ? "Cancelled" : "Don't Cancelled"), cellStyle);
        }
        System.out.println(table.render());
    }

    public static void itemPriceHistory(Collection<HistoryDTO> reports){
        System.out.println(yellow + "\t\tInvoice Adjustment"+reset);
        Table table = new Table(4, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE, ShownBorders.ALL);
        table.setColumnWidth(0,15,20);
        table.setColumnWidth(1,15,20);
        table.setColumnWidth(2,15,20);
        table.setColumnWidth(3,15,20);

        table.addCell(" ".repeat(2)+ yellow + "Item_History_Id");
        table.addCell(" ".repeat(2)+ yellow +"Price");
        table.addCell(" ".repeat(2)+ yellow +"Updated_at");
        table.addCell(" ".repeat(2)+ yellow +"Item_Id");

        for (HistoryDTO report : reports) {
            table.addCell("   " +green + report.getItemHistoryId() + "   ");
            table.addCell("   " +green + report.getPrice()+ "   ");
            table.addCell("   " +green + report.getUpdatedAt()+ "   ");
            table.addCell("   " +green + report.getItem() + "   ");
        }
        System.out.println(table.render());
    }

    public static void stockAlert(Collection<AlertDTO> reports) {
        if (reports == null) {
            System.out.println("Reports collection is null.");
            return;
        }
        System.out.println(yellow + "\t\tStock Alert Report" + reset);
        Table table = new Table(7, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE, ShownBorders.ALL);
        CellStyle cellStyle = new CellStyle(CellStyle.HorizontalAlign.center);
        table.setColumnWidth(0, 15, 20);
        table.setColumnWidth(1, 15, 20);
        table.setColumnWidth(2, 15, 20);
        table.setColumnWidth(3, 15, 20);
        table.setColumnWidth(4, 15, 20);
        table.setColumnWidth(5, 15, 20);
        table.setColumnWidth(6, 15, 20);

        table.addCell(yellow + "Alert_Id", cellStyle);
        table.addCell(yellow + "Item Code", cellStyle);
        table.addCell(yellow + "Description", cellStyle);
        table.addCell(yellow + "Qty", cellStyle);
        table.addCell(yellow + "Unit", cellStyle);
        table.addCell(yellow + "Item Price", cellStyle);
        table.addCell(yellow + "Status", cellStyle);

        for (AlertDTO report : reports) {
            if (report.getItem().getStatus()) {
                table.addCell(green + "A" + report.getAlertId(), cellStyle);
                table.addCell(green + report.getItem().getItemCode(), cellStyle);
                table.addCell(green + report.getItem().getItemDescription(), cellStyle);
                table.addCell(green + report.getQytAlert(), cellStyle);
                table.addCell(green + report.getItem().getItemUnit(), cellStyle);
                table.addCell(green + report.getItem().getItemPrice(), cellStyle);
                table.addCell(green + (report.getItem().getStatus() ? "Active" : "Inactive"), cellStyle);
            }
        }

        System.out.println(table.render());
    }

    public static void summaryReport(Collection<ItemDTO> itemDTOS) {
        if (itemDTOS == null) {
            System.out.println("Reports collection is null.");
            return;
        }

        System.out.println(yellow + "\t\tSummary Report" + reset);
        Table table = new Table(12, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE, ShownBorders.ALL);
        CellStyle cellStyle = new CellStyle(CellStyle.HorizontalAlign.center);
        table.setColumnWidth(0, 15, 20);
        table.setColumnWidth(1, 15, 20);
        table.setColumnWidth(2, 15, 20);
        table.setColumnWidth(3, 15, 20);
        table.setColumnWidth(4, 15, 20);
        table.setColumnWidth(5, 15, 20);
        table.setColumnWidth(6, 15, 20);
        table.setColumnWidth(7, 15, 20);
        table.setColumnWidth(8, 15, 20);
        table.setColumnWidth(9, 15, 20);
        table.setColumnWidth(10, 15, 22);
        table.setColumnWidth(11, 15, 20);

        table.addCell(yellow + "Item_ID", cellStyle);
        table.addCell(yellow + "Item Code", cellStyle);
        table.addCell(yellow + "Description", cellStyle);
        table.addCell(yellow + "QTY", cellStyle);
        table.addCell(yellow + "Unt", cellStyle);
        table.addCell(yellow + "Price", cellStyle);
        table.addCell(yellow + "Price A", cellStyle);
        table.addCell(yellow + "Price B", cellStyle);
        table.addCell(yellow + "Price C", cellStyle);
        table.addCell(yellow + "Total Stock In QTY", cellStyle);
        table.addCell(yellow + "Total Stock Out QTY", cellStyle);
        table.addCell(yellow + "Status", cellStyle);

        for (ItemDTO item : itemDTOS) {
            table.addCell(green + item.getItemId(), cellStyle);
            table.addCell(green + item.getItemCode(), cellStyle);
            table.addCell(green + item.getItemDescription(), cellStyle);
            table.addCell(green + item.getQty(), cellStyle);
            table.addCell(green + item.getItemUnit(), cellStyle);
            table.addCell(green + item.getItemPrice(), cellStyle);
            table.addCell(green + item.getItemPrice_out_a(), cellStyle);
            table.addCell(green + item.getItemPrice_out_b(), cellStyle);
            table.addCell(green + item.getItemPrice_out_c(), cellStyle);
            table.addCell(green + item.getStockInDTO().getQtyIn(), cellStyle);
            table.addCell(green + item.getStockOutDTO().getQtyOut(), cellStyle);
            table.addCell(green + (item.getStatus() ? "Active" : "Inactive"), cellStyle);
        }

        System.out.println(table.render());
    }
}
