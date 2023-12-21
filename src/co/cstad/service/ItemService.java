package co.cstad.service;

import co.cstad.model.*;

import java.util.List;

public interface ItemService {
    ItemDTO insert(ItemDTO item);

    StockInDTO stockIn(StockInDTO stockInDTO);
    StockOutDTO stockOut(StockOutDTO stockOutDTO);
    List<ItemDTO> select();
    ItemDTO selectById(Long id);
    ItemDTO updateById(ItemDTO item);
    ItemDTO deleteById(Long id);
    List<ItemDTO> selectByName(String name);
}