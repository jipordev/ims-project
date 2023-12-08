package co.cstad.database;

import co.cstad.dao.CustomerDao;
import co.cstad.model.CustomerDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDatabase {
    private Connection connection;

    private final List<CustomerDTO> customerDTOList;
//    public CustomerDTO Insert(CustomerDao customerDao){
//        String sql = """
//                INSERT INTO customer(name,address,phone_one,phone_two,status,type)
//                VALUES (?,?,?,?,?,?)
//                """;
//        try{
//            PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        return
//    }
    public CustomerDatabase() {
        customerDTOList = new ArrayList<>();
    }

    public List<CustomerDTO> getCustomerDTOList() {
        return customerDTOList;
    }
}
