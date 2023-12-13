package co.cstad.service;

import co.cstad.dao.StockInDao;
import co.cstad.dao.StockInDaoImpl;
import co.cstad.model.StockInDTO;

public class StockInServiceImpl implements StockInService{
    private final StockInDao stockInDao;
    public StockInServiceImpl(){
        stockInDao = new StockInDaoImpl();
    }
    @Override
    public StockInDTO insert(StockInDTO item) {
        return stockInDao.insert(item);
    }
}
