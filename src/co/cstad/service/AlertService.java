package co.cstad.service;

import co.cstad.model.AlertDTO;

import java.util.List;

public interface AlertService {
    List<AlertDTO> selectStockAlertReport();
}
