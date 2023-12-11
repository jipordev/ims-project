// DbSingleton.java
package co.cstad.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingleton {
    static final String driverClassName = "org.postgresql.Driver";
    static final String connectionUrl = "jdbc:postgresql://localhost/dbinventorymanagement";
    static final String username = "postgres";
    static final String password = "kheang";
    static Connection connection = null;

    private DbSingleton() {
    }

    public static Connection instance() {
        if (connection == null) {
            try {
                Class.forName("org.postgresql.Driver");
                connection = DriverManager.getConnection(connectionUrl, username, password);
            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException("Error initializing database connection", e);
            }
        }
        return connection;
    }
}
