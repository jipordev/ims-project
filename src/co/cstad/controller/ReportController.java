package co.cstad.controller;

import co.cstad.model.ItemDTO;
import co.cstad.model.ReportDTO;
import co.cstad.service.ReportService;
import co.cstad.service.UserService;
import co.cstad.util.Singleton;
import co.cstad.view.ItemView;
import co.cstad.view.MenuViewAdmin;
import co.cstad.view.ReportView;

import java.util.List;
import java.util.Scanner;

public class ReportController {
    private final MenuViewAdmin menuViewAdmin;
    private final ReportService reportService;
    private final Scanner scanner;

    public ReportController(){
        scanner = Singleton.scanner();
        reportService = Singleton.reportService();
        menuViewAdmin = Singleton.menuViewAdmin();
    }

    /*public void stockCountReport(){
        List<ReportDTO> reportDTOList = reportService.selectStockCount();
        ReportView.stockCountReport(reportDTOList);
    }

    public void stockInReport(){
        List<ReportDTO> reportDTOList = reportService.selectStockIn();
        ReportView.stockInReport(reportDTOList);
    }

    public void StockOutReport(){
        List<ReportDTO> reportDTOList = reportService.selectStockOut();
        ReportView.stockOutReport(reportDTOList);
    }*/

    public void invoiceDetail(){
        List<ReportDTO> reportDTOList = reportService.selectInvoiceDetail();
        ReportView.InvoiceDetail(reportDTOList);
    }

    public void invoiceAdjustment(){
        List<ReportDTO> reportDTOList = reportService.selectInvoiceDetail();
        ReportView.InvoiceAdjustment(reportDTOList);
    }

    public void itemPriceHistory(){
        List<ReportDTO> reportDTOList = reportService.selectItemPriceHistory();
        ReportView.itemPriceHistory(reportDTOList);
    }
}
