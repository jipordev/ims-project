package co.cstad.dao;

import co.cstad.model.Item;
import co.cstad.util.DbSingleton;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;

public class ItemDaoImpl implements ItemDao{

    private final Connection connection;
    public ItemDaoImpl() {
        connection = DbSingleton.instance();
    }

    @Override
    public Item insert(Item item) {
        return null;
    }

    @Override
    public List<Item> select() {
        return null;
    }

    @Override
    public Optional<Item> selectById(Long id) {
        return Optional.empty();
    }

    @Override
    public Item updateById(Item product) {
        return null;
    }

    @Override
    public Item deleteById(Long id) {
        return null;
    }

    @Override
    public List<Item> selectByName(String name) {
        return null;
    }
}
