package co.cstad.dao;

import co.cstad.model.ItemDTO;

import java.util.List;
import java.util.Optional;

public interface ItemDao {
    ItemDTO insert(ItemDTO item);
    List<ItemDTO> select();
    Optional<ItemDTO> selectById(Long id);
    ItemDTO updateById(ItemDTO product);
    ItemDTO deleteById(Long id);
    List<ItemDTO> selectByName(String name);
}
