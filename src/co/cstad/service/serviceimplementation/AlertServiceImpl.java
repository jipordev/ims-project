package co.cstad.service.serviceimplementation;

import co.cstad.dao.AlertDao;
import co.cstad.dao.daoimplementation.AlertDaoImpl;
import co.cstad.model.AlertDTO;
import co.cstad.service.AlertService;
import co.cstad.util.Singleton;

import java.util.List;

public class AlertServiceImpl implements AlertService {
    private static AlertDaoImpl alertDaoImpl;

    public  AlertServiceImpl(){
        alertDaoImpl=Singleton.alertDao();
    private final AlertDao alertDao;

    public  AlertServiceImpl(){
        alertDao = Singleton.alertDao();
    }


    @Override
    public List<AlertDTO> selectStockAlertReport() {
        return alertDaoImpl.selectStockAlertReport();
    }
}

        return alertDao.selectStockAlertReport();
    }
}