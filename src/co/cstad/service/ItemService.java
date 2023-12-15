package co.cstad.service;

import co.cstad.model.ItemDTO;
import co.cstad.model.StockInDTO;
import co.cstad.model.StockOutDTO;
import co.cstad.model.UserDTO;

import java.util.List;

public interface ItemService {
    ItemDTO insert(ItemDTO item);
    StockInDTO stockIn(StockInDTO stockInDTO);
    StockOutDTO stockOut(StockOutDTO stockOutDTO);
    List<StockInDTO> selectStockIn();
    List<StockOutDTO> selectStockOut();
    List<ItemDTO> select();
    ItemDTO selectById(Long id);
    ItemDTO updateById(ItemDTO item);
    ItemDTO deleteById(Long id);
    List<ItemDTO> selectByName(String name);
}
