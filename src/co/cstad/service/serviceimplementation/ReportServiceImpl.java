package co.cstad.service.serviceimplementation;

import co.cstad.dao.daoimplementation.ReportDaoImpl;
import co.cstad.model.*;
import co.cstad.service.ReportService;
import co.cstad.util.Singleton;

import java.util.List;

public class ReportServiceImpl implements ReportService {

    private static ReportDaoImpl reportDao;
    public ReportServiceImpl(){
        reportDao = Singleton.getReportDao();
    }


    @Override
    public List<ItemDTO> selectStockCount() {
        return reportDao.selectStockCount();
    }
    @Override
    public List<StockInDTO> selectStockIn() {
        return reportDao.selectStockIn();
    }

    @Override
    public List<StockOutDTO> selectStockOut() {
        return reportDao.selectStockOut();
    }

//    @Override
//    public List<ReportDTO> selectInvoiceDetail() {
//        return reportDao.selectInvoiceDetail();
//    }
//
//    @Override
//    public List<ReportDTO> selectInvoiceAdjustment() {
//        return reportDao.selectInvoiceAdjustment();
//    }

    @Override
    public List<HistoryDTO> selectItemPriceHistory() {
        return reportDao.selectItemPriceHistory();
    }



//    @Override
//    public List<ReportDTO> selectSummaryReport() {
//        return reportDao.selectSummaryReport();
//    }


}