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

    @Override
    public ItemDTO insert(ItemDTO itemDTO) {
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
                itemDTO.setItemPrice_out_a(resultSet.getDouble("price_a"));
                itemDTO.setItemPrice_out_b(resultSet.getDouble("price_b"));
                itemDTO.setItemPrice_out_c(resultSet.getDouble("price_c"));
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
        return Optional.empty();
    }

    @Override
    public ItemDTO updateById(ItemDTO itemDTO) {
        return null;
    }

    @Override
    public ItemDTO deleteById(Long id) {
        return null;
    }

    @Override
    public List<ItemDTO> selectByName(String name) {
        return null;
    }
}
