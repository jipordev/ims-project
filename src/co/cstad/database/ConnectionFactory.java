package co.cstad.database;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public class ConnectionFactory {
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    public ConnectionFactory() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/ims?user=root&password=root");
            stmt=con.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public Connection getConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost/dbinventorymanagement?user=postgres&password=kheang");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    public boolean checkLogin(String username, String password, String user) {
        String query="SELECT * FROM users WHERE username='"+username+"' AND password='"+password+"' AND category='ADMINISTRATOR' LIMIT 1";
        try {
            rs=stmt.executeQuery(query);
            if(rs.next()){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
