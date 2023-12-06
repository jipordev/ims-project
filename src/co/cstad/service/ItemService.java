package co.cstad.service;

import co.cstad.model.Item;

import java.util.List;

public interface ItemService {
    Item insert(Item item);
    List<Item> select();
    Item selectById(Long id);
    Item updateById(Item item);
    Item deleteById(Long id);
    List<Item> selectByName(String name);
}
