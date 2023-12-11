// ItemDatabase.java
package co.cstad.database;

import co.cstad.model.ItemDTO;
import co.cstad.util.DbSingleton;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ItemDatabase {
    private final Connection connection;

    public ItemDatabase() {
        this.connection = DbSingleton.instance();
        createTableIfNotExists();
    }

    private void createTableIfNotExists() {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS products (" +
                // ... (your existing table creation code)
                ")";

        try (Statement statement = connection.createStatement()) {
            statement.execute(createTableSQL);
        } catch (SQLException e) {
            // Log or rethrow the exception for better handling
            throw new RuntimeException("Error creating database table", e);
        }
    }

    public List<ItemDTO> getItems() {
        List<ItemDTO> items = new ArrayList<>();
        String selectSQL = "SELECT * FROM item";

        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(selectSQL)) {

            while (resultSet.next()) {
                ItemDTO itemDTO = new ItemDTO();
                // ... (your existing result set processing code)
                items.add(itemDTO);
            }
        } catch (SQLException e) {
            // Log or rethrow the exception for better handling
            throw new RuntimeException("Error retrieving items from the database", e);
        }

        return items;
    }
}
