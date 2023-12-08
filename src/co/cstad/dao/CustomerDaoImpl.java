package co.cstad.dao;

import co.cstad.model.CustomerDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class CustomerDaoImpl implements CustomerDao{
    private Connection connection;
    @Override
    public CustomerDTO insert(CustomerDTO customerDTO) {
        String sql = """
                INSERT INTO customer(name,address,phone_one,phone_two,status,type)
                VALUES (?,?,?,?,?,?)
                """;
        try{
            PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public List<CustomerDTO> select() {
        return null;
    }

    @Override
    public Optional<CustomerDTO> selectById(Long id) {
        return Optional.empty();
    }

    @Override
    public CustomerDTO updateById(CustomerDTO product) {
        return null;
    }

    @Override
    public CustomerDTO deleteById(Long id) {
        return null;
    }

    @Override
    public List<CustomerDTO> selectByName(String name) {
        return null;
    }
}
