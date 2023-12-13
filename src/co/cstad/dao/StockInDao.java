package co.cstad.dao;

import co.cstad.model.ItemDTO;
import co.cstad.model.StockInDTO;

import java.util.List;
import java.util.Optional;

public interface StockInDao {
    StockInDTO insert(StockInDTO item);
}
