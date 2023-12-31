// DbSingleton.java
package co.cstad.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingleton {
    private static String url = "jdbc:postgresql://localhost:5432/dbims";
    private static String username = "postgres";
    private static String password = "78910";
    private static Connection connection;

    private DbSingleton() {
    }

    public static Connection instance() {
        if (connection == null) {
            try {
                Class.forName("org.postgresql.Driver");
                connection = DriverManager.getConnection(url, username, password);
            } catch (ClassNotFoundException | SQLException e) {
                // Log or rethrow the exception for better handling
                throw new RuntimeException("Error initializing database connection", e);
            }
        }
        return connection;
    }
}