package co.cstad.dao;

import co.cstad.database.ConnectionFactory;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserDao {
    Connection con = null;
    PreparedStatement ps = null;
    Statement stmt = null;
    ResultSet rs = null;

    public UserDao() {
        try {
            con = new ConnectionFactory().getConnection();
            stmt = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//    public void addUserDAO(UserDTO userdto, String user) {
//        try{
//            String query = "SELECT * FROM users WHERE fullname='"+userdto.getFullName()+"' AND location='"+userdto.getLocation()+"' AND phone='"+userdto.getPhone()+"' AND category='"+userdto.getCategory()+"'";
//            rs=stmt.executeQuery(query);
//            if(rs.next()){
//                JOptionPane.showMessageDialog(null,"Same User has already been added!");
//            }else{
//                addFunction(userdto, user);
//            }
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//    }//end of method addUserDTO
//    public void addFunction(UserDTO userdto, String user){
//        try{
//            String username = null;
//            String password = null;
//            String oldUsername = null;
//            String encPass=null;
//            String query1="SELECT * FROM users";
//            rs=stmt.executeQuery(query1);
//            if(!rs.next()){
//                username="user"+"1";
//                password="user"+"1";
//            }
//            else{
//                String query2="SELECT * FROM users ORDER by id DESC";
//                rs=stmt.executeQuery(query2);
//                if(rs.next()){
//                    oldUsername=rs.getString("username");
//                    Integer ucode=Integer.parseInt(oldUsername.substring(4));
//                    ucode++;
//                    username="user"+ucode;
//                    password="user"+ucode;
//                }
//                encPass=new Users().encryptPassword(password);
//            }
//
//            String query = "INSERT INTO users (fullname,location, phone, username, password, category) VALUES(?,?,?,?,?,?)";
//            ps = (PreparedStatement) con.prepareStatement(query);
//            ps.setString(1, userdto.getFullName());
//            ps.setString(2, userdto.getLocation());
//            ps.setString(3, userdto.getPhone());
//            ps.setString(4, username);
//            ps.setString(5, encPass);
//            ps.setString(6, userdto.getCategory());
//            ps.executeUpdate();
//            if("ADMINISTRATOR".equals(user))
//                JOptionPane.showMessageDialog(null, "NEW ADMINISTRATOR ADDED");
//            else
//                JOptionPane.showMessageDialog(null, "NEW NORMAL USER ADDED");
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//    }
}
