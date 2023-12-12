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
}
