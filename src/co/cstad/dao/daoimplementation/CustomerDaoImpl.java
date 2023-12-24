package co.cstad.dao.daoimplementation;

import co.cstad.dao.CustomerDao;
import co.cstad.model.CustomerDTO;
import co.cstad.util.DbSingleton;
import co.cstad.view.BoxBorder;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class CustomerDaoImpl implements CustomerDao {
    private final Connection connection;

    public CustomerDaoImpl() {
        connection = DbSingleton.instance();
    }

    @Override
    public CustomerDTO insert(CustomerDTO customerDTO) {
        String sql = """
                INSERT INTO customer(name,address,phone_one,phone_two,status,type)
                VALUES (?,?,?,?,?,?)
                """;
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1,customerDTO.getCustomerName());
            preparedStatement.setString(2,customerDTO.getAddress());
            preparedStatement.setString(3,customerDTO.getContact1());
            preparedStatement.setString(4,customerDTO.getContact2());
            preparedStatement.setBoolean(5,customerDTO.getStatus());
            preparedStatement.setString(6,customerDTO.getCustomerType());
            int affectRow = preparedStatement.executeUpdate();
            System.out.println(" ==> Effected Row : " + affectRow);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return customerDTO;
    }




    @Override
    public List<CustomerDTO> select() {
        String sql = "SELECT * FROM customer";
        try {


            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<CustomerDTO> customerDTOS = new ArrayList<>();


            while (resultSet.next()) {
                CustomerDTO customerDTO = new CustomerDTO();
                customerDTO.setCustomersId(resultSet.getLong("customer_id"));
                customerDTO.setCustomerName(resultSet.getString("name"));
                customerDTO.setAddress(resultSet.getString("address"));
                customerDTO.setContact1(resultSet.getString("phone_one"));
                customerDTO.setContact2(resultSet.getString("phone_two"));
                customerDTO.setStatus(resultSet.getBoolean("status"));
                customerDTO.setCustomerType(resultSet.getString("type"));
                customerDTOS.add(customerDTO);
            }
            return customerDTOS;


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    @Override
    public Optional<CustomerDTO> selectById(Long id) {
        String sql = """
                SELECT * FROM customer WHERE customer_id = ?
                """;
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                CustomerDTO customerDTO = new CustomerDTO();
                customerDTO.setCustomersId(resultSet.getLong("customer_id"));
                customerDTO.setCustomerName(resultSet.getString("name"));
                customerDTO.setAddress(resultSet.getString("address"));
                customerDTO.setContact1(resultSet.getString("phone_one"));
                customerDTO.setContact2(resultSet.getString("phone_two"));
                customerDTO.setStatus(resultSet.getBoolean("status"));
                customerDTO.setCustomerType(resultSet.getString("type"));
                return Optional.of(customerDTO);
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return Optional.empty();
    }

    @Override
    public CustomerDTO updateById(CustomerDTO customerDTO) {
        String sql = """
                UPDATE customer SET name = ? , address = ? , phone_one = ? , phone_two = ? , status = ? , type = ? WHERE customer_id = ?
                """;
        try{
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement = connection.prepareStatement(sql);


            preparedStatement.setString(1,customerDTO.getCustomerName());
            preparedStatement.setString(2,customerDTO.getAddress());
            preparedStatement.setString(3,customerDTO.getContact1());
            preparedStatement.setString(4,customerDTO.getContact2());
            preparedStatement.setBoolean(5,customerDTO.getStatus());
            preparedStatement.setString(6,customerDTO.getCustomerType());
            preparedStatement.setLong(7, customerDTO.getCustomersId());



            int affectedRows = preparedStatement.executeUpdate();

            if (affectedRows > 0) {
                connection.commit();  // Commit the transaction
                return customerDTO;
            }
        } catch (SQLException e) {

            System.out.println(e.getMessage());
        }

        return null;
    }

    @Override
    public CustomerDTO deleteById(Long id) {
        String sql = "DELETE FROM customer WHERE customer_id = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, id);

            int affectedRows = preparedStatement.executeUpdate();

            if (affectedRows > 0) {
                // Successfully deleted, return the deleted item (optional)
                CustomerDTO deletedItem = new CustomerDTO();
                deletedItem.setCustomersId(id);
                return deletedItem;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return null;    }

    @Override
    public List<CustomerDTO> selectByName(String name) {
        return null;
    }
}