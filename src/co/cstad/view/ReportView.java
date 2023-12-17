package co.cstad.view;

import co.cstad.model.ItemDTO;
import co.cstad.model.ReportDTO;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

import java.util.Collection;

public class ReportView implements BoxBorder {

    public static void stockCountReport(Collection<ReportDTO> reports){
        System.out.println(yellow + "\t\tStock Count Report" + reset);
        Table table = new Table(4, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE, ShownBorders.ALL);
        table.setColumnWidth(0,15,20);
        table.setColumnWidth(1,15,20);
        table.setColumnWidth(2,15,20);
        table.setColumnWidth(3,15,20);

        table.addCell(" ".repeat(2)+ yellow + "Stock_Count_Id");
        table.addCell(" ".repeat(2)+ yellow +"Item_Id");
        table.addCell(" ".repeat(2)+ yellow +"Stock_Count_Date");
        table.addCell(" ".repeat(2)+ yellow +"Qty");

        for (ReportDTO report : reports) {
            table.addCell("   " + report.getStockCountId() + "   ");
            table.addCell("   " + report.getItemId() + "   ");
            table.addCell("   " + report.getStockCountDate() + "   ");
            table.addCell("   " + report.getQty() + "   ");
        }

        System.out.println(table.render());
    }

    public static void stockInReport(Collection<ReportDTO> reports){
        System.out.println(yellow + "\t\tStock In Report"+reset);
        Table table = new Table(5, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE, ShownBorders.ALL);
        table.setColumnWidth(0,15,20);
        table.setColumnWidth(1,15,20);
        table.setColumnWidth(2,15,20);
        table.setColumnWidth(3,15,20);
        table.setColumnWidth(4,15,20);

        table.addCell(" ".repeat(2)+ yellow + "Stock_In_Id");
        table.addCell(" ".repeat(2)+ yellow +"Item_Id");
        table.addCell(" ".repeat(2)+ yellow +"Stock_In_Date");
        table.addCell(" ".repeat(2)+ yellow +"Price_In");
        table.addCell(" ".repeat(2)+ yellow +"Item_Id" + reset);

        for (ReportDTO report : reports) {
            table.addCell("   " + report.getStockInId() + "   ");
            table.addCell("   " + report.getItemId() + "   ");
            table.addCell("   " + report.getStockInDate() + "   ");
            table.addCell("   " + report.getPriceIn() + "   ");
            table.addCell("   " + report.getItemId() + "   ");
        }
        System.out.println(table.render());
    }

    public static void stockOutReport(Collection<ReportDTO> reports){
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

        for (ReportDTO report : reports) {
            table.addCell("   " + report.getStockOutId() + "   ");
            table.addCell("   " + report.getItemId() + "   ");
            table.addCell("   " + report.getQty() + "   ");
            table.addCell("   " + report.getStockOutDate() + "   ");
            table.addCell("   " + report.getPriceOut() + "   ");
        }
        System.out.println(table.render());
    }

    public static void InvoiceDetail(Collection<ReportDTO> reports){
        System.out.println(yellow + "\t\tInvoice Details"+reset);
        Table table = new Table(5, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE, ShownBorders.ALL);
        table.setColumnWidth(0,15,20);
        table.setColumnWidth(1,15,20);
        table.setColumnWidth(2,15,20);
        table.setColumnWidth(3,15,20);
        table.setColumnWidth(4,15,20);

        table.addCell(" ".repeat(2)+ yellow + "Invoice_Detail_Id");
        table.addCell(" ".repeat(2)+ yellow +"Qty");
        table.addCell(" ".repeat(2)+ yellow +"Unit_Price");
        table.addCell(" ".repeat(2)+ yellow +"Item_Id");
        table.addCell(" ".repeat(2)+ yellow +"Invoice_Id" + reset);

        for (ReportDTO report : reports) {
            table.addCell("   " + report.getInvoiceDetailId() + "   ");
            table.addCell("   " + report.getQty() + "   ");
            table.addCell("   " + report.getUnitPrice()+ "   ");
            table.addCell("   " + report.getItemId() + "   ");
            table.addCell("   " + report.getInvoiceId()+ "   ");
        }
        System.out.println(table.render());
    }

    public static void InvoiceAdjustment(Collection<ReportDTO> reports){
        System.out.println(yellow + "\t\tInvoice Adjustment"+reset);
        Table table = new Table(6, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE, ShownBorders.ALL);
        table.setColumnWidth(0,15,20);
        table.setColumnWidth(1,15,20);
        table.setColumnWidth(2,15,20);
        table.setColumnWidth(3,15,20);
        table.setColumnWidth(4,15,20);
        table.setColumnWidth(5,15,20);

        table.addCell(" ".repeat(2)+ yellow + "Invoice_Adj_Id");
        table.addCell(" ".repeat(2)+ yellow +"Qty");
        table.addCell(" ".repeat(2)+ yellow +"Unit_Price");
        table.addCell(" ".repeat(2)+ yellow +"Return_Date");
        table.addCell(" ".repeat(2)+ yellow +"Item_Id");
        table.addCell(" ".repeat(2)+ yellow +"Invoice_Id" + reset);

        for (ReportDTO report : reports) {
            table.addCell("   " + report.getInvoiceAdjustmentId() + "   ");
            table.addCell("   " + report.getQty() + "   ");
            table.addCell("   " + report.getUnitPrice()+ "   ");
            table.addCell("   " + report.getReturnedDate()+ "   ");
            table.addCell("   " + report.getItemId() + "   ");
            table.addCell("   " + report.getInvoiceId()+ "   ");
        }
        System.out.println(table.render());
    }

    public static void itemPriceHistory(Collection<ReportDTO> reports){
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

        for (ReportDTO report : reports) {
            table.addCell("   " + report.getItemHistoryId() + "   ");
            table.addCell("   " + report.getPrice()+ "   ");
            table.addCell("   " + report.getUpdatedAt()+ "   ");
            table.addCell("   " + report.getItemId() + "   ");
        }
        System.out.println(table.render());
    }
    public static void stockAlert(Collection<ReportDTO> reports) {
        if (reports == null) {
            System.out.println("Reports collection is null.");
            return;
        }

        System.out.println(yellow + "\t\tStock Alert Report" + reset);
        Table table = new Table(4, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE, ShownBorders.ALL);
        table.setColumnWidth(0, 15, 20);
        table.setColumnWidth(1, 15, 20);
        table.setColumnWidth(2, 15, 20);

        table.addCell(" ".repeat(2) + yellow + "Alert_Id");
        table.addCell(" ".repeat(2) + yellow + "Name");
        table.addCell(" ".repeat(2) + yellow + "Qty_Alert");
        table.addCell(" ".repeat(2) + yellow + "Item_ID"+reset);

        for (ReportDTO report : reports) {
            if (report != null && report.getQytAlert() != null && report.getItem() != null) {
                if (report.getQytAlert() < 20) {
                    table.addCell("   " + report.getAlertId() + "   ");
                    table.addCell("   " + report.getItem().getItemDescription() + "   ");
                    table.addCell("   " + report.getQytAlert() + "   ");
                    table.addCell("   " + report.getItem().getItemId() + "   ");
                }
            } else {
                System.out.println("One or more reports have null values.");
            }
        }

        System.out.println(table.render());
    }
    public static void summaryReport(Collection<ReportDTO> reports) {
        if (reports == null) {
            System.out.println("Reports collection is null.");
            return;
        }

        System.out.println(yellow + "\t\tSummary Report" + reset);
        Table table = new Table(3, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE, ShownBorders.ALL);
        table.setColumnWidth(0, 15, 20);
        table.setColumnWidth(1, 15, 20);
        table.setColumnWidth(2, 15, 20);

        table.addCell(" ".repeat(2) + yellow + "Item_ID");
        table.addCell(" ".repeat(2) + yellow + "Total_Qty");
        table.addCell(" ".repeat(2) + yellow + "Description" + reset);

        for (ReportDTO report : reports) {
            if (report != null && report.getQty() != null && report.getItem() != null) {
                table.addCell("   " + report.getItemId() + "   ");
                table.addCell("   " + report.getQty() + "   ");

                // Add other relevant fields based on your ReportDTO

                table.addCell("   " + report.getItem().getItemDescription() + "   ");
            } else {
                System.out.println("One or more reports have null values.");
            }
        }

        System.out.println(table.render());
    }
}