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
    private final ReportView reportView;
    private final Scanner scanner;

    public ReportController(){
        reportView = Singleton.reportView();
        scanner = Singleton.scanner();
        reportService = Singleton.reportService();
        menuViewAdmin = Singleton.menuViewAdmin();
    }

    public void stockCountReport(){
        List<ReportDTO> reportDTOList = reportService.selectStockCount();
        reportView.stockCountReport(reportDTOList);
    }

    public void stockInReport(){
        List<ReportDTO> reportDTOList = reportService.selectStockIn();
        reportView.stockInReport(reportDTOList);
    }

    public void stockOutReport(){
        List<ReportDTO> reportDTOList = reportService.selectStockOut();
        reportView.stockOutReport(reportDTOList);
    }

    public void invoiceDetail(){
        List<ReportDTO> reportDTOList = reportService.selectInvoiceDetail();
        reportView.InvoiceDetail(reportDTOList);
    }

    public void invoiceAdjustment(){
        List<ReportDTO> reportDTOList = reportService.selectInvoiceDetail();
        reportView.InvoiceAdjustment(reportDTOList);
    }

    public void itemPriceHistory(){
        List<ReportDTO> reportDTOList = reportService.selectItemPriceHistory();
        reportView.itemPriceHistory(reportDTOList);
    }
    public void stockAlert(){
        List<ReportDTO> reportDTOList = reportService.selectStockAlertReport();
        reportView.stockAlert(reportDTOList);
    }
    public void summaryReport(){
        List<ReportDTO> reportDTOList = reportService.selectSummaryReport();
        reportView.summaryReport(reportDTOList);
    }

//    public void stockAlertReport(){
//        List<ReportDTO> reportDTOList = reportService.selectStockAlertReport();
//        ReportView.stockAlert(reportDTOList);
//    }
}
