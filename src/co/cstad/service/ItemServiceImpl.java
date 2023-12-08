package co.cstad.service;

import co.cstad.dao.ItemDaoImpl;
import co.cstad.model.ItemDTO;

import java.util.List;

public class ItemServiceImpl implements ItemService{
    private static ItemDaoImpl itemDao;
    public ItemServiceImpl() {
        itemDao = new ItemDaoImpl();
    }

    @Override
    public ItemDTO insert(ItemDTO item) {
        return null;
    }

    @Override
    public List<ItemDTO> select() {
        return itemDao.select();
    }

    @Override
    public ItemDTO selectById(Long id) {
        return null;
    }

    @Override
    public ItemDTO updateById(ItemDTO item) {
        return null;
    }

    @Override
    public ItemDTO deleteById(Long id) {
        return null;
    }

    @Override
    public List<ItemDTO> selectByName(String name) {
        return null;
    }
}
