package co.cstad.service;

import co.cstad.dao.ItemDaoImpl;
import co.cstad.dao.ReportDaoImpl;
import co.cstad.model.ItemDTO;
import co.cstad.model.ReportDTO;
import co.cstad.util.Singleton;

import java.util.List;

public class ReportServiceImpl implements ReportService {

    private static ReportDaoImpl reportDao;
    public ReportServiceImpl(){
        reportDao = Singleton.getReportDao();
    }

    /*@Override
    public List<ReportDTO> selectStockCount() {
        return reportDao.selectStockCount();
    }

    @Override
    public List<ReportDTO> selectStockIn() {
        return reportDao.selectStockIn();
    }

    @Override
    public List<ReportDTO> selectStockOut() {
        return reportDao.selectStockOut();
    }*/

    @Override
    public List<ReportDTO> selectInvoiceDetail() {
        return reportDao.selectInvoiceDetail();
    }

    @Override
    public List<ReportDTO> selectInvoiceAdjustment() {
        return reportDao.selectInvoiceAdjustment();
    }

    @Override
    public List<ReportDTO> selectItemPriceHistory() {
        return reportDao.selectItemPriceHistory();
    }

    @Override
    public List<ReportDTO> selectStockAlertReport() {
        return reportDao.selectStockAlertReport();
    }

    @Override
    public List<ReportDTO> selectSummaryReport() {
        return reportDao.selectSummaryReport();
    }


}
