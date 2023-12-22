package co.cstad.service;

import co.cstad.model.*;

import java.util.List;

public interface ReportService {


    List<ItemDTO> selectStockCount();
    List<StockInDTO> selectStockIn();
    List<StockOutDTO> selectStockOut();
    List<HistoryDTO> selectItemPriceHistory();

    //List<ReportDTO> selectSummaryReport();
}