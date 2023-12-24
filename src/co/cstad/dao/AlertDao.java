package co.cstad.dao;

import co.cstad.model.AlertDTO;

import java.util.List;

public interface AlertDao {
    List<AlertDTO> selectStockAlertReport();
}