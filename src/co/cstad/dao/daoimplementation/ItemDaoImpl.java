package co.cstad.dao.daoimplementation;

import co.cstad.dao.ItemDao;
import co.cstad.model.ItemDTO;
import co.cstad.model.StockInDTO;
import co.cstad.model.StockOutDTO;
import co.cstad.util.DbSingleton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ItemDaoImpl implements ItemDao {

    private final Connection connection;
    public ItemDaoImpl() {
        connection = DbSingleton.instance();
    }

    @Override
    public ItemDTO insert(ItemDTO itemDTO) {
        String sql = "INSERT INTO item (item_code, description, unit, qty, price_a, price_b, price_c, status) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, itemDTO.getItemCode());
            preparedStatement.setString(2, itemDTO.getItemDescription());
            preparedStatement.setString(3, itemDTO.getItemUnit());
            preparedStatement.setInt(4, itemDTO.getQty());
            preparedStatement.setBigDecimal(5, itemDTO.getItemPrice());
            preparedStatement.setBigDecimal(6, itemDTO.getItemPrice_out_a());
            preparedStatement.setBigDecimal(7, itemDTO.getItemPrice_out_b());
            preparedStatement.setBigDecimal(8, itemDTO.getItemPrice_out_c());
            preparedStatement.setBoolean(9, itemDTO.isStatus());

            // Execute the query
            int affectedRows = preparedStatement.executeUpdate();

            if (affectedRows > 0) {
                // Retrieve the generated keys (if any)
                ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    // Set the generated ID to the itemDTO
                    itemDTO.setItemId(generatedKeys.getLong(1));
                    return itemDTO;
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }
    @Override
    public StockInDTO stockIn(StockInDTO stockInDTO) {
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

    @Override
    public StockOutDTO stockout(StockOutDTO stockOutDTO)  {
        String insertStockInSql = "INSERT INTO stock_out (item_id, qty, price_out, stock_out_date) " +
                "VALUES (?, ?, ?, CURRENT_DATE)";
        String updateItemQtySql = "UPDATE item SET qty = qty - ? WHERE item_id = ?";

        try {
            // Insert into stock_in table
            try (PreparedStatement insertStockInStatement = connection.prepareStatement(insertStockInSql, PreparedStatement.RETURN_GENERATED_KEYS)) {
                insertStockInStatement.setLong(1, stockOutDTO.getItemId());
                insertStockInStatement.setInt(2, stockOutDTO.getQtyOut());
                insertStockInStatement.setBigDecimal(3, stockOutDTO.getPriceOut());

                // Execute the query
                int affectedRows = insertStockInStatement.executeUpdate();

                if (affectedRows > 0) {
                    // Retrieve the generated keys (if any)
                    ResultSet generatedKeys = insertStockInStatement.getGeneratedKeys();
                    if (generatedKeys.next()) {
                        // Set the generated ID to the stockInDTO
                        stockOutDTO.setStockOutID(generatedKeys.getLong(1));

                        // Update item quantity in the item table
                        try (PreparedStatement updateItemQtyStatement = connection.prepareStatement(updateItemQtySql)) {
                            updateItemQtyStatement.setInt(1, stockOutDTO.getQtyOut());
                            updateItemQtyStatement.setLong(2, stockOutDTO.getItemId());
                            updateItemQtyStatement.executeUpdate();
                        }

                        return stockOutDTO;
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }



    @Override
    public List<ItemDTO> select() {
        String sql = "SELECT * FROM item";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<ItemDTO> itemDTOS = new ArrayList<>();
            while (resultSet.next()) {
                ItemDTO itemDTO = new ItemDTO();
                itemDTO.setItemId(resultSet.getLong("item_id"));
                itemDTO.setItemCode(resultSet.getString("item_code"));
                itemDTO.setItemDescription(resultSet.getString("description"));
                itemDTO.setItemUnit(resultSet.getString("unit"));
                itemDTO.setQty(resultSet.getInt("qty"));
                itemDTO.setItemPrice(resultSet.getBigDecimal("price"));
                itemDTO.setItemPrice_out_a(resultSet.getBigDecimal("price_a"));
                itemDTO.setItemPrice_out_b(resultSet.getBigDecimal("price_b"));
                itemDTO.setItemPrice_out_c(resultSet.getBigDecimal("price_c"));
                itemDTO.setStatus(resultSet.getBoolean("status"));
                itemDTOS.add(itemDTO);
            }
            return itemDTOS;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Optional<ItemDTO> selectById(Long id) {
        String sql = "SELECT * FROM item WHERE item_id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                ItemDTO itemDTO = new ItemDTO();
                // Populate itemDTO fields from resultSet
                itemDTO.setItemId(resultSet.getLong("item_id"));
                itemDTO.setItemCode(resultSet.getString("item_code"));
                itemDTO.setItemDescription(resultSet.getString("description"));
                itemDTO.setItemUnit(resultSet.getString("unit"));
                itemDTO.setQty(resultSet.getInt("qty"));
                itemDTO.setItemPrice(resultSet.getBigDecimal("price"));
                itemDTO.setItemPrice_out_a(resultSet.getBigDecimal("price_a"));
                itemDTO.setItemPrice_out_b(resultSet.getBigDecimal("price_b"));
                itemDTO.setItemPrice_out_c(resultSet.getBigDecimal("price_c"));
                itemDTO.setStatus(resultSet.getBoolean("status"));

                return Optional.of(itemDTO);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return Optional.empty();
    }

    @Override
    public ItemDTO updateById(ItemDTO itemDTO) {
        String sql = "UPDATE item SET item_code = ?, description = ?, unit = ?, qty = ?, price_a = ?, price_b = ?, price_c = ?, status = ? WHERE item_id = ?";

        try {
            connection.setAutoCommit(false);  // Disable auto-commit

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, itemDTO.getItemCode());
            preparedStatement.setString(2, itemDTO.getItemDescription());
            preparedStatement.setString(3, itemDTO.getItemUnit());
            preparedStatement.setInt(4, itemDTO.getQty());
            preparedStatement.setBigDecimal(5, itemDTO.getItemPrice());
            preparedStatement.setBigDecimal(6, itemDTO.getItemPrice_out_a());
            preparedStatement.setBigDecimal(7, itemDTO.getItemPrice_out_b());
            preparedStatement.setBigDecimal(8, itemDTO.getItemPrice_out_c());
            preparedStatement.setBoolean(9, itemDTO.isStatus());
            preparedStatement.setLong(10, itemDTO.getItemId());

            int affectedRows = preparedStatement.executeUpdate();

            if (affectedRows > 0) {
                connection.commit();  // Commit the transaction
                return itemDTO;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            try {
                connection.rollback();  // Rollback in case of an exception
            } catch (SQLException rollbackException) {
                System.out.println(rollbackException.getMessage());
            }
        } finally {
            try {
                connection.setAutoCommit(true);  // Restore auto-commit mode
            } catch (SQLException setAutoCommitException) {
                System.out.println(setAutoCommitException.getMessage());
            }
        }

        return null;
    }




    @Override
    public ItemDTO deleteById(Long id) {
        String sql = "DELETE FROM item WHERE item_id = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, id);

            int affectedRows = preparedStatement.executeUpdate();

            if (affectedRows > 0) {
                // Successfully deleted, return the deleted item (optional)
                ItemDTO deletedItem = new ItemDTO();
                deletedItem.setItemId(id);
                return deletedItem;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    @Override
    public List<ItemDTO> selectByName(String name) {
        return null;
    }
}
