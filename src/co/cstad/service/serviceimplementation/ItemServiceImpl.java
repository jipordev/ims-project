package co.cstad.service.serviceimplementation;

import co.cstad.dao.daoimplementation.ItemDaoImpl;
import co.cstad.model.ItemDTO;
import co.cstad.model.StockInDTO;
import co.cstad.model.StockOutDTO;
import co.cstad.service.ItemService;
import co.cstad.util.Singleton;

import java.util.List;

public class ItemServiceImpl implements ItemService {
    private static ItemDaoImpl itemDao;

    public ItemServiceImpl() {
        itemDao = Singleton.getItemDao();
    }

    @Override
    public ItemDTO insert(ItemDTO item) {
        return itemDao.insert(item);
    }


    @Override
    public StockInDTO stockIn(StockInDTO stockInDTO) {
        return itemDao.stockIn(stockInDTO);
    }

    @Override
    public StockOutDTO stockOut(StockOutDTO stockOutDTO) {
        return itemDao.stockOut(stockOutDTO);
    }

    @Override
    public List<ItemDTO> select() {
        return itemDao.select();
    }

    @Override
    public ItemDTO selectById(Long id) {
        return itemDao.selectById(id).orElse(null);
    }

    @Override
    public ItemDTO updateById(ItemDTO item) {
        return itemDao.updateById(item);
    }

    @Override
    public ItemDTO deleteById(Long id) {
        return itemDao.deleteById(id);
    }

    @Override
    public List<ItemDTO> selectByName(String name) {
        return itemDao.selectByName(name);
    }

    /*public List<StockInDTO> selectStockIn() {
        return itemDao.selectStockIn();
    }

    @Override
    public List<StockOutDTO> selectStockOut() {
        return itemDao.selectStockOut();
    }*/

}