package co.cstad.dao;

import co.cstad.model.ItemDTO;
import co.cstad.model.StockInDTO;

import java.util.List;
import java.util.Optional;

public interface ItemDao {
    ItemDTO insert(ItemDTO item);
    StockInDTO stockIn(StockInDTO stockInDTO);
    List<ItemDTO> select();
    Optional<ItemDTO> selectById(Long id);
    ItemDTO updateById(ItemDTO product);
    ItemDTO deleteById(Long id);
    List<ItemDTO> selectByName(String name);
}
