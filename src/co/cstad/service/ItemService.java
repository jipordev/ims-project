package co.cstad.service;

import co.cstad.model.ItemDTO;

import java.util.List;

public interface ItemService {
    ItemDTO insert(ItemDTO itemDTO);
    List<ItemDTO> select();
    ItemDTO selectById(Long id);
    ItemDTO updateById(ItemDTO item);
    ItemDTO deleteById(Long id);
    List<ItemDTO> selectByName(String name);
}
