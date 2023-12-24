package co.cstad.dao;


import co.cstad.model.*;

import java.util.List;
import java.util.Optional;

public interface ReportDao {



    List<ItemDTO> selectStockCount();
    List<StockInDTO> selectStockIn();
    List<StockOutDTO> selectStockOut();
    //List<ReportDTO> selectInvoiceDetail();
    List<AdjustmentDTO> selectInvoiceAdjustment();
    List<HistoryDTO> selectItemPriceHistory();
    List<ItemDTO> selectSummaryReport();

}