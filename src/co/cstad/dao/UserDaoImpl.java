package co.cstad.dao;

import co.cstad.model.ItemDTO;
import co.cstad.model.UserDTO;
import co.cstad.util.DbSingleton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserDaoImpl implements UserDao{
    private final Connection connection;
    public UserDaoImpl(){
        connection = DbSingleton.instance();
    }
    public UserDTO insert(UserDTO userDTO) {
        String sql = " INSERT INTO users (username, password, email, contact, address, status, role_id)"+
            "VALUES (?, ?, ?, ?, ?, ?, ?) ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, userDTO.getUsername());
            preparedStatement.setString(2, userDTO.getPassword());
            preparedStatement.setString(3, userDTO.getEmail());
            preparedStatement.setString(4, userDTO.getUserContact());
            preparedStatement.setString(5, userDTO.getAddress());

            // Set boolean value for the "status" column
            preparedStatement.setBoolean(6, userDTO.getStatus());

            preparedStatement.setLong(7, userDTO.getRoleId());

            int affectedRows = preparedStatement.executeUpdate();

            if (affectedRows > 0) {
                // Retrieve the generated keys (if any)
                ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    // Set the generated ID to the userDTO
                    userDTO.setUserId(generatedKeys.getLong(8));
                    return userDTO;
                }
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public List<UserDTO> select() {
        String sql = "SELECT * FROM users";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<UserDTO> userDTOS = new ArrayList<>();
            while (resultSet.next()) {
                UserDTO userDTO = new UserDTO();
                userDTO.setUsername(resultSet.getString("username"));
                userDTO.setPassword(resultSet.getString("password"));
                userDTO.setEmail(resultSet.getString("email"));
                userDTO.setUserContact(resultSet.getString("contact"));
                userDTO.setAddress(resultSet.getString("address"));
                userDTO.setStatus(resultSet.getBoolean("status"));
                userDTO.setRoleId(resultSet.getLong("role_id"));
                userDTO.setUserId(resultSet.getLong("user_id"));
                userDTOS.add(userDTO);
            }
            return userDTOS;
        } catch (SQLException e) {
            // Log or throw an exception for better error handling
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Optional<UserDTO> selectById(Long id) {
        String sql = "SELECT * FROM users WHERE user_id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                UserDTO userDTO = new UserDTO();
                userDTO.setUsername(resultSet.getString("username"));
                userDTO.setPassword(resultSet.getString("password"));
                userDTO.setEmail(resultSet.getString("email"));
                userDTO.setUserContact(resultSet.getString("contact"));
                userDTO.setAddress(resultSet.getString("address"));
                userDTO.setStatus(resultSet.getBoolean("status"));
                userDTO.setRoleId(resultSet.getLong("role_id"));
                userDTO.setUserId(resultSet.getLong("user_id"));
                return Optional.of(userDTO);
            }
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return Optional.empty();
    }

    @Override
    public UserDTO updateById(UserDTO userDTO) {
        return null;
    }

    @Override
    public UserDTO deleteById(Long id) {
        String sql = "DELETE FROM users WHERE user_id = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, id);

            int affectedRows = preparedStatement.executeUpdate();

            if (affectedRows > 0) {
                // Successfully deleted, return the deleted item (optional)
                UserDTO deletedUser = new UserDTO();
                deletedUser.setUserId(id);
                return deletedUser;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    @Override
    public List<UserDTO> selectByName(String name) {
        return null;
    }
}
