package co.cstad.view;

import co.cstad.model.*;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

import java.util.Collection;

public class ReportView implements BoxBorder {



    public static void printItemCount(Collection<ItemDTO> items) {
        if (items == null) {
            System.out.println("Item list is null.");
            return;
        }

        Table table = new Table(10, BorderStyle.UNICODE_BOX, ShownBorders.ALL);
        table.addCell(yellow + "   Item ID   ");
        table.addCell(yellow + "   Item Code   ");
        table.addCell(yellow + "   Description   ");
        table.addCell(yellow + "   Unit   ");
        table.addCell(yellow + "   Quantity   ");
        table.addCell(yellow + "   Price    ");
        table.addCell(yellow + "   Price A   ");
        table.addCell(yellow + "   Price B   ");
        table.addCell(yellow + "   Price C   ");
        table.addCell(yellow + "   Status   ");

        for (ItemDTO item : items) {
            if (item.getStatus() != null && item.getStatus()) {
                table.addCell(green + "   " + String.valueOf(item.getItemId()) + "   ");
                table.addCell(green + "   " + item.getItemCode() + "   ");
                table.addCell(green + "   " + item.getItemDescription() + "   ");
                table.addCell(green + "   " + item.getItemUnit() + "   ");
                table.addCell(green + "   " + String.valueOf(item.getQty()) + "   ");
                table.addCell(green + "   " + String.valueOf(item.getItemPrice()));
                table.addCell(green + "   " + String.valueOf(item.getItemPrice_out_a()) + "   ");
                table.addCell(green + "   " + String.valueOf(item.getItemPrice_out_b()) + "   ");
                table.addCell(green + "   " + String.valueOf(item.getItemPrice_out_c()) + "   ");
                table.addCell(green + "   " + (item.getStatus() ? "Active" : "Inactive") + "   ");
            }
        }

        System.out.println(table.render());

    }
    public static void stockInReport(Collection<StockInDTO> reports){
        System.out.println(yellow + "\t\tStock In Report"+reset);
        Table table = new Table(5, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE, ShownBorders.ALL);
        table.setColumnWidth(0,15,20);
        table.setColumnWidth(1,15,20);
        table.setColumnWidth(2,15,20);
        table.setColumnWidth(3,15,20);
        table.setColumnWidth(4,15,20);

        table.addCell(" ".repeat(2)+ yellow + "Stock_In_Id");
        table.addCell(" ".repeat(2)+ yellow +"Item_Id");
        table.addCell(" ".repeat(2)+ yellow +"Qty");
        table.addCell(" ".repeat(2)+ yellow +"Price_In");
        table.addCell(" ".repeat(2)+ yellow +"Stock_In_Date" + reset);

        for (StockInDTO report : reports) {
            table.addCell("   " + green + report.getStockInID() + "   ");
            table.addCell("   " + green + report.getItemId() + "   ");
            table.addCell("   " + green + report.getQtyIn() + "   ");
            table.addCell("   " + green + report.getPriceIn() + "   ");
            table.addCell("   " + green + report.getStockInDate() + "   " + reset);
        }
        System.out.println(table.render());
    }

    public static void stockOutReport(Collection<StockOutDTO> reports){
        System.out.println(yellow + "\t\tStock Out Report"+reset);
        Table table = new Table(5, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE, ShownBorders.ALL);
        table.setColumnWidth(0,15,20);
        table.setColumnWidth(1,15,20);
        table.setColumnWidth(2,15,20);
        table.setColumnWidth(3,15,20);
        table.setColumnWidth(4,15,20);

        table.addCell(" ".repeat(2)+ yellow + "Stock_Out_Id");
        table.addCell(" ".repeat(2)+ yellow +"Item_Id");
        table.addCell(" ".repeat(2)+ yellow +"Qty");
        table.addCell(" ".repeat(2)+ yellow +"Stock_Out_Date");
        table.addCell(" ".repeat(2)+ yellow +"Price_Out" + reset);

        for (StockOutDTO report : reports) {
            table.addCell("   " + green + report.getStockOutID() + "   ");
            table.addCell("   " + green + report.getItemId() + "   ");
            table.addCell("   " + green + report.getQtyOut() + "   ");
            table.addCell("   " + green + report.getStockOutDate() + "   ");
            table.addCell("   " + green + report.getPriceOut() + "   " + reset);
        }
        System.out.println(table.render());
    }

//    public static void InvoiceDetail(Collection<ReportDTO> reports){
//        System.out.println(yellow + "\t\tInvoice Details"+reset);
//        Table table = new Table(5, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE, ShownBorders.ALL);
//        table.setColumnWidth(0,15,20);
//        table.setColumnWidth(1,15,20);
//        table.setColumnWidth(2,15,20);
//        table.setColumnWidth(3,15,20);
//        table.setColumnWidth(4,15,20);
//
//        table.addCell(" ".repeat(2)+ yellow + "Invoice_Detail_Id");
//        table.addCell(" ".repeat(2)+ yellow +"Qty");
//        table.addCell(" ".repeat(2)+ yellow +"Unit_Price");
//        table.addCell(" ".repeat(2)+ yellow +"Item_Id");
//        table.addCell(" ".repeat(2)+ yellow +"Invoice_Id" + reset);
//
//        for (ReportDTO report : reports) {
//            table.addCell("   " + report.getInvoiceDetailId() + "   ");
//            table.addCell("   " + report.getQty() + "   ");
//            table.addCell("   " + report.getUnitPrice()+ "   ");
//            table.addCell("   " + report.getItemId() + "   ");
//            table.addCell("   " + report.getInvoiceId()+ "   ");
//        }
//        System.out.println(table.render());
//    }

    public static void InvoiceAdjustment(Collection<AdjustmentDTO> reports){
        System.out.println(yellow + "\t\tInvoice Adjustment"+reset);
        Table table = new Table(12, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE, ShownBorders.ALL);
        table.setColumnWidth(0,15,20);
        table.setColumnWidth(1,15,20);
        table.setColumnWidth(2,15,20);
        table.setColumnWidth(3,15,20);
        table.setColumnWidth(4,15,20);
        table.setColumnWidth(5,15,20);
        table.setColumnWidth(6,15,20);
        table.setColumnWidth(7,15,20);
        table.setColumnWidth(8,15,20);
        table.setColumnWidth(9,15,20);
        table.setColumnWidth(10,15,25);
        table.setColumnWidth(11,15,20);

        table.addCell(" ".repeat(2)+ yellow + "Invoice_Adj_Id");
        table.addCell(" ".repeat(2) + yellow + "Item Code");
        table.addCell(" ".repeat(2) + yellow + "Description");
        table.addCell(" ".repeat(2) + yellow + " QTY ");
        table.addCell(" ".repeat(2) + yellow + " Unt ");
        table.addCell(" ".repeat(2) + yellow + " Price " );
        table.addCell(" ".repeat(2) + yellow + "Price A ");
        table.addCell(" ".repeat(2) + yellow + "Price B ");
        table.addCell(" ".repeat(2) + yellow + "Price C ");
        table.addCell(" ".repeat(2) + yellow + " Status");
        table.addCell(" ".repeat(2)+ yellow +"Adjustment Date");
        table.addCell(" ".repeat(2)+ yellow +" Cancelled " + reset);

        for (AdjustmentDTO report : reports) {
            table.addCell("   " + report.getAdjustmentId() + "   ");
            table.addCell("   " + report.getItemDTO().getItemCode() + "   ");
            table.addCell("   " + report.getItemDTO().getItemDescription() + "   ");
            table.addCell("   " + report.getItemDTO().getQty() + "   ");
            table.addCell("   " + report.getItemDTO().getItemUnit() + "   ");
            table.addCell("   " + report.getItemDTO().getItemPrice() + "   ");
            table.addCell("   " + report.getItemDTO().getItemPrice_out_a() + "   ");
            table.addCell("   " + report.getItemDTO().getItemPrice_out_b() + "   ");
            table.addCell("   " + report.getItemDTO().getItemPrice_out_c() + "   ");
            table.addCell("   " + (report.getItemDTO().getStatus() ? "Active" : "Inactive") + "   ");
            table.addCell("   " + report.getReturnDate() + "   ");
            table.addCell("   " + (report.getInvoiceDTO().getCancelled() ? " Cancelled" :" Don't Cancelled") + "   ");
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
            table.addCell("   " + report.getItemHistoryId() + "   ");
            table.addCell("   " + report.getPrice()+ "   ");
            table.addCell("   " + report.getUpdatedAt()+ "   ");
            table.addCell("   " + report.getItem() + "   ");
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
        table.setColumnWidth(0, 15, 20);
        table.setColumnWidth(1, 15, 20);
        table.setColumnWidth(2, 15, 20);
        table.setColumnWidth(3, 15, 20);
        table.setColumnWidth(4, 15, 20);
        table.setColumnWidth(5, 15, 20);
        table.setColumnWidth(6, 15, 20);

        table.addCell(" ".repeat(2) + yellow + "Alert_Id");
        table.addCell(" ".repeat(2) + yellow + "Item Code");
        table.addCell(" ".repeat(2) + yellow + "Description");
        table.addCell(" ".repeat(2) + yellow + "Qty");
        table.addCell(" ".repeat(2) + yellow + "Unit");
        table.addCell(" ".repeat(2) + yellow + " Item Price ");
        table.addCell(" ".repeat(2) + yellow + "Status");

        for (AlertDTO report : reports) {
            if ( report.getItem().getStatus()) {

                table.addCell("   " + "A" + report.getAlertId() + "   ");
                table.addCell("   " + report.getItem().getItemCode());
                table.addCell(" ".repeat(2) + report.getItem().getItemDescription());
                table.addCell("   " + report.getQytAlert());
                table.addCell("   " + report.getItem().getItemUnit());
                table.addCell("   " + report.getItem().getItemPrice());
                table.addCell("   " + (report.getItem().getStatus() ? "Active" : "Inactive") + "   ");
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


        table.addCell(" ".repeat(2) + yellow + "Item_ID");
        table.addCell(" ".repeat(2) + yellow + "Item Code");
        table.addCell(" ".repeat(2) + yellow + "Description");
        table.addCell(" ".repeat(2) + yellow + " QTY ");
        table.addCell(" ".repeat(2) + yellow + " Unt ");
        table.addCell(" ".repeat(2) + yellow + " Price " );
        table.addCell(" ".repeat(2) + yellow + "Price A ");
        table.addCell(" ".repeat(2) + yellow + "Price B ");
        table.addCell(" ".repeat(2) + yellow + "Price C ");
        table.addCell(" ".repeat(2) + yellow + "Total Stock In QTY");
        table.addCell(" ".repeat(2) + yellow + "Total Stock Out QTY");
        table.addCell(" ".repeat(2) + yellow + " Status");


        for (ItemDTO item : itemDTOS) {
            table.addCell("   " + item.getItemId() + "   ");
            table.addCell("   " + item.getItemCode() + "   ");
            table.addCell("   " + item.getItemDescription() + "   ");
            table.addCell("   " + item.getQty() + "   ");
            table.addCell("   " + item.getItemUnit() + "   ");
            table.addCell("   " + item.getItemPrice() + "   ");
            table.addCell("   " + item.getItemPrice_out_a() + "   ");
            table.addCell("   " + item.getItemPrice_out_b() + "   ");
            table.addCell("   " + item.getItemPrice_out_c() + "   ");
            table.addCell("   " + item.getStockInDTO().getQtyIn() + "   ");
            table.addCell("   " + item.getStockOutDTO().getQtyOut() + "   ");
            table.addCell("   " + (item.getStatus() ? "Active" : "Inactive") + "   ");
        }

        System.out.println(table.render());
    }
}
