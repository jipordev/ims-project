package co.cstad.database;

import java.sql.DriverManager;
import java.sql.Connection;

public class ConnectionFactory {
    static final String driverClassName = "com.mysql.cj.jdbc.Driver";
    static final String connectionUrl = "jdbc:postgresql://localhost/dbinventorymanagement?user=postgres&password=kheang";
    static final String username = "postgres";
    static final String password = "123";
    static Connection con = null;
    public static Connection getConnection() {
        try {
            Class.forName(driverClassName);
            con = DriverManager.getConnection(connectionUrl, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
