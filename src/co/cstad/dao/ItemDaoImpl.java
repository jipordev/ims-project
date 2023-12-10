package co.cstad.dao;

import co.cstad.model.ItemDTO;
import co.cstad.util.DbSingleton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ItemDaoImpl implements ItemDao{

    private final Connection connection;
    public ItemDaoImpl() {
        connection = DbSingleton.instance();
    }

//    @Override
//    public ItemDTO insert(ItemDTO itemDTO) {
//        return null;
//    }
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
            preparedStatement.setBigDecimal(5, itemDTO.getItemPrice_out_a());
            preparedStatement.setBigDecimal(6, itemDTO.getItemPrice_out_b());
            preparedStatement.setBigDecimal(7, itemDTO.getItemPrice_out_c());
            preparedStatement.setBoolean(8, itemDTO.isStatus());

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
                return Optional.of(itemDTO);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return Optional.empty();
    }

    @Override
    public ItemDTO updateById(ItemDTO itemDTO) {
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
