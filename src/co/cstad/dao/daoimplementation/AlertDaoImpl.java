package co.cstad.dao.daoimplementation;

import co.cstad.dao.AlertDao;
import co.cstad.model.AlertDTO;
import co.cstad.model.ItemDTO;
import co.cstad.util.DbSingleton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class AlertDaoImpl implements AlertDao {
    private Connection connection;
    public AlertDaoImpl() {
        connection = DbSingleton.instance();
    }
    @Override
    public List<AlertDTO> selectStockAlertReport() {
        String sql = """
                SELECT ga.alert_id , ga.qty_alert , i.qty , i.item_code , i.description ,i.unit,CAST( i.price as numeric ) as "pr",i.status
                FROM group_alert ga
                INNER JOIN item i ON ga.alert_id = i.alert_id
                WHERE i.qty IS NOT NULL AND i.qty <= 60
            """;

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            List<AlertDTO> reportDTOS = new ArrayList<>();


            while (resultSet.next()) {
                AlertDTO reportDTO = new AlertDTO();
                ItemDTO item = new ItemDTO();


                reportDTO.setAlertId(resultSet.getLong("alert_id"));
                item.setQty(resultSet.getInt("qty"));
                reportDTO.setQytAlert(item.getQty());
                item.setItemCode(resultSet.getString("item_code"));
                item.setItemDescription(resultSet.getString("description"));
                item.setItemUnit(resultSet.getString("unit"));
                item.setItemPrice(resultSet.getBigDecimal("pr"));
                item.setStatus(resultSet.getBoolean("status"));
                reportDTO.setItem(item);

                reportDTOS.add(reportDTO);

            }

            return reportDTOS;
        } catch (SQLException e) {
            System.out.println("Error executing query: " + e.getMessage());
            e.printStackTrace(); // Print the stack trace for debugging
        }

        return null;
    }
}