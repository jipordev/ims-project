package co.cstad.service;

import co.cstad.model.ReportDTO;

import java.util.List;

public interface ReportService {

    /*List<ReportDTO> selectStockCount();
    List<ReportDTO> selectStockIn();
    List<ReportDTO> selectStockOut();*/
    List<ReportDTO> selectInvoiceDetail();
    List<ReportDTO> selectInvoiceAdjustment();
    List<ReportDTO> selectItemPriceHistory();
    List<ReportDTO> selectStockAlertReport();
    List<ReportDTO> selectSummaryReport();
}
