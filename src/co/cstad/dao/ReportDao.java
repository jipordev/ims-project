package co.cstad.dao;


import co.cstad.model.ItemDTO;
import co.cstad.model.ReportDTO;

import java.util.List;
import java.util.Optional;

public interface ReportDao {

    List<ReportDTO> selectStockIn();
    List<ReportDTO> selectStockOut();
    List<ReportDTO> selectInvoiceDetail();
    List<ReportDTO> selectInvoiceAdjustment();
    List<ReportDTO> selectItemPriceHistory();
    List<ReportDTO> selectStockAlertReport();
    List<ReportDTO> selectSummaryReport();

}