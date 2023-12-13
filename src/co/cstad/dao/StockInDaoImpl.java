package co.cstad.dao;

import co.cstad.model.StockInDTO;
import co.cstad.util.DbSingleton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class StockInDaoImpl implements StockInDao{
    private static Connection connection;
    public StockInDaoImpl(){
        connection = DbSingleton.instance();
    }
    @Override
    public StockInDTO insert(StockInDTO stockInDTO) {
        String insertStockInSql = "INSERT INTO stock_in (item_id, qty, price_in, stock_in_date) " +
                "VALUES (?, ?, ?, CURRENT_DATE)";
        String updateItemQtySql = "UPDATE item SET qty = qty + ? WHERE item_id = ?";

        try {
            // Insert into stock_in table
            try (PreparedStatement insertStockInStatement = connection.prepareStatement(insertStockInSql, PreparedStatement.RETURN_GENERATED_KEYS)) {
                insertStockInStatement.setLong(1, stockInDTO.getItemId());
                insertStockInStatement.setInt(2, stockInDTO.getQtyIn());
                insertStockInStatement.setBigDecimal(3, stockInDTO.getPriceIn());

                // Execute the query
                int affectedRows = insertStockInStatement.executeUpdate();

                if (affectedRows > 0) {
                    // Retrieve the generated keys (if any)
                    ResultSet generatedKeys = insertStockInStatement.getGeneratedKeys();
                    if (generatedKeys.next()) {
                        // Set the generated ID to the stockInDTO
                        stockInDTO.setStockInID(generatedKeys.getLong(1));

                        // Update item quantity in the item table
                        try (PreparedStatement updateItemQtyStatement = connection.prepareStatement(updateItemQtySql)) {
                            updateItemQtyStatement.setInt(1, stockInDTO.getQtyIn());
                            updateItemQtyStatement.setLong(2, stockInDTO.getItemId());
                            updateItemQtyStatement.executeUpdate();
                        }

                        return stockInDTO;
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }




}
