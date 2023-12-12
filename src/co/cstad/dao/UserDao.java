package co.cstad.dao;

import co.cstad.model.UserDTO;
import co.cstad.util.DbSingleton;

import java.sql.*;

public class UserDao {
    PreparedStatement ps = null;
    Statement stmt = null;
    ResultSet rs = null;
    public void addUserDAO(UserDTO userdto, String user) {
        try (Connection con = DbSingleton.instance()) {
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
