package co.cstad.dao;

import co.cstad.model.ItemDTO;
import co.cstad.model.UserDTO;

import java.util.List;
import java.util.Optional;
import javax.swing.*;
import java.awt.color.ICC_ColorSpace;
import java.sql.*;
import java.util.logging.Level;

public interface UserDao {
    UserDTO insert(UserDTO userDTO);
    List<UserDTO> select();
    Optional<UserDTO> selectById(Long id);
    UserDTO updateById(UserDTO userDTO);
    UserDTO deleteById(Long id);
    List<UserDTO> selectByName(String name);
public class UserDao {
    PreparedStatement ps = null;
    Statement stmt = null;
    ResultSet rs = null;
    public void addUserDAO(UserDTO userdto, String user) {
        try (Connection con = ConnectionFactory.getConnection()) {
            String query = "SELECT * FROM users WHERE username=? AND password=?";
            ps = con.prepareStatement(query);
            ps.setString(1, userdto.getUserName());
            ps.setString(2, userdto.getPassword());
            ResultSet resultSet = ps.executeQuery();

            rs=stmt.executeQuery(query);
            if(rs.next()){
                System.out.println("Same User has already been added!");
            }else{
                String insertQuery = "INSERT INTO users (role_id, username, password, address, address, email, phone) VALUES(?,?,?,?,?,?,?)";
                ps = con.prepareStatement(insertQuery);
                ps.setString(1, userdto.getRoleId());
                ps.setString(2, userdto.getUserName());
                ps.setString(3, userdto.getPassword());
                ps.setString(4, userdto.getAddress());
                ps.setString(5, userdto.getEmail());
                ps.setString(6, userdto.getContact());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
//        try{
//            String query = "SELECT * FROM users WHERE username=? AND password=?";
//            ps = con.prepareStatement(query);
//            ps.setString(1, userdto.getUserName());
//            ps.setString(2, userdto.getPassword());
//            ResultSet resultSet = ps.executeQuery();
//
//            rs=stmt.executeQuery(query);
//            if(rs.next()){
//                System.out.println("Same User has already been added!");
//            }else{
//                String insertQuery = "INSERT INTO users (role_id, username, password, address, address, email, phone) VALUES(?,?,?,?,?,?,?)";
//                ps = con.prepareStatement(insertQuery);
//                ps.setString(1, userdto.getRoleId());
//                ps.setString(2, userdto.getUserName());
//                ps.setString(3, userdto.getPassword());
//                ps.setString(4, userdto.getAddress());
//                ps.setString(5, userdto.getEmail());
//                ps.setString(6, userdto.getContact());
//            }
//        }catch(Exception e){
//            e.printStackTrace();
//        }
    }
}
