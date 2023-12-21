package co.cstad.service;

import co.cstad.model.ItemDTO;
import co.cstad.model.ReportDTO;
import co.cstad.model.StockInDTO;
import co.cstad.model.StockOutDTO;

import java.util.List;

public interface ReportService {


    List<ItemDTO> selectStockCount();
    List<StockInDTO> selectStockIn();
    List<StockOutDTO> selectStockOut();
    List<ReportDTO> selectInvoiceDetail();
    List<ReportDTO> selectInvoiceAdjustment();
    List<ReportDTO> selectItemPriceHistory();
    List<ReportDTO> selectStockAlertReport();
    List<ReportDTO> selectSummaryReport();
}