package co.cstad.dao;

import co.cstad.model.Item;

import java.util.List;
import java.util.Optional;

public interface ItemDao {
    Item insert(Item item);
    List<Item> select();
    Optional<Item> selectById(Long id);
    Item updateById(Item product);
    Item deleteById(Long id);
    List<Item> selectByName(String name);
}
