package co.cstad.controller;

import co.cstad.model.ItemDTO;
import co.cstad.model.ReportDTO;
import co.cstad.service.ItemService;
import co.cstad.service.ReportService;
import co.cstad.service.UserService;
import co.cstad.util.Singleton;
import co.cstad.view.ItemView;
import co.cstad.view.MenuViewAdmin;
import co.cstad.view.ReportView;

import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class ReportController {
    private final MenuViewAdmin menuViewAdmin;
    private final ItemService itemService;
    private final ReportService reportService;
    private final Scanner scanner;

    public ReportController(){
        itemService = Singleton.itemService();
        scanner = Singleton.scanner();
        reportService = Singleton.reportService();
        menuViewAdmin = Singleton.menuViewAdmin();
    }

    public void stockCountReport(){
        List<ItemDTO> itemDTOList = itemService.select();
        ItemView.printItemCount(itemDTOList);
    }


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
