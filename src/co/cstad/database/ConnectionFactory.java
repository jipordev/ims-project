package co.cstad.database;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;

public class ConnectionFactory {
    static final String driverClassName = "org.postgresql.Driver";
    static final String connectionUrl = "jdbc:postgresql://localhost:5432/postgres";
    static final String username = "postgres";
    static final String password = "24sep2002";
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
