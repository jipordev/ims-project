package co.cstad.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingleton {
    private static final String DRIVER_CLASS_NAME = "org.postgresql.Driver";
    private static final String CONNECTION_URL = "jdbc:postgresql://localhost/dbinventorymanagement";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "kheang";

    private static volatile Connection connection;

    private DbSingleton() {
        // Prevent instantiation
    }

    public static Connection instance() {
        if (connection == null) {
            try {
                Class.forName(DRIVER_CLASS_NAME);
                connection = DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        return connection;
    }
}
