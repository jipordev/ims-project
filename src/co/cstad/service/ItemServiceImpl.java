package co.cstad.service;

import co.cstad.dao.ItemDaoImpl;
import co.cstad.model.ItemDTO;

import java.util.List;

public class ItemServiceImpl implements ItemService {
    private static ItemDaoImpl itemDao;

    public ItemServiceImpl() {
        itemDao = new ItemDaoImpl();
    }

    @Override
    public ItemDTO insert(ItemDTO item) {
        return itemDao.insert(item);
    }

    @Override
    public List<ItemDTO> select() {
        return itemDao.select();
    }

    @Override
    public ItemDTO selectById(Long id) {
        // Implement this method to retrieve an item by ID from the DAO
        return itemDao.selectById(id).orElse(null);
    }

    @Override
    public ItemDTO updateById(ItemDTO item) {
        // Implement this method to update an item by ID in the DAO
        return itemDao.updateById(item);
    }

    @Override
    public ItemDTO deleteById(Long id) {
        // Implement this method to delete an item by ID in the DAO
        return itemDao.deleteById(id);
    }

    @Override
    public List<ItemDTO> selectByName(String name) {
        // Implement this method to retrieve items by name from the DAO
        return itemDao.selectByName(name);
    }
}
