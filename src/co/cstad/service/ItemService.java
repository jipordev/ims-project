package co.cstad.service;

import co.cstad.model.ItemDTO;
import co.cstad.model.StockInDTO;
import co.cstad.model.StockOutDTO;

import java.util.List;

public interface ItemService {
    ItemDTO insert(ItemDTO item);
    StockInDTO stockIn(StockInDTO stockInDTO);
    StockOutDTO stockout(StockOutDTO stockOutDTO);
    List<ItemDTO> select();
    ItemDTO selectById(Long id);
    ItemDTO updateById(ItemDTO item);
    ItemDTO deleteById(Long id);
    List<ItemDTO> selectByName(String name);
    /*List<StockInDTO> selectStockIn();
    List<ItemDTO> selectStockOut();*/
}
