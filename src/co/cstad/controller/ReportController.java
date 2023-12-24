package co.cstad.controller;

import co.cstad.model.*;
import co.cstad.service.AlertService;
import co.cstad.service.ItemService;
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
    private final ItemService itemService;
    private final Scanner scanner;
    private final AlertService alertService;

    public ReportController(){
        alertService = Singleton.alertService();
        itemService= Singleton.itemService();
        reportView = Singleton.reportView();
        scanner = Singleton.scanner();
        reportService = Singleton.reportService();
        menuViewAdmin = Singleton.menuViewAdmin();
    }

    public void stockCountReport(){
        List<ItemDTO> reportDTOList = reportService.selectStockCount();
        ReportView.printItemCount(reportDTOList);
    }

    public void stockInReport(){
        List<StockInDTO> reportDTOList = reportService.selectStockIn();
        reportView.stockInReport(reportDTOList);
    }

    public void stockOutReport(){
        List<StockOutDTO> reportDTOList = reportService.selectStockOut();
        reportView.stockOutReport(reportDTOList);
    }

//    public void invoiceDetail(){
//        List<ReportDTO> reportDTOList = reportService.selectInvoiceDetail();
//        reportView.InvoiceDetail(reportDTOList);
//    }

    public void invoiceAdjustment(){
        List<AdjustmentDTO> reportDTOList = reportService.selectAdjustment();
        reportView.InvoiceAdjustment(reportDTOList);
    }

    public void itemPriceHistory(){
        List<HistoryDTO> reportDTOList = reportService.selectItemPriceHistory();
        reportView.itemPriceHistory(reportDTOList);
    }
    public void stockAlert(){
        List<AlertDTO> reportDTOList = alertService.selectStockAlertReport();
        reportView.stockAlert(reportDTOList);
    }
    public void summaryReport(){
        List<ItemDTO> reportDTOList = reportService.selectSummaryReport();
        reportView.summaryReport(reportDTOList);
    }
}
