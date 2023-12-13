package co.cstad.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbSingleton {
    private static final Logger logger = Logger.getLogger(DbSingleton.class.getName());
    private static final String driverClassName = "org.postgresql.Driver";
    private static final String url = "jdbc:postgresql://localhost/dbinventorymanagement";
    private static final String username = "postgres";
    private static final String password = "kheang";
    private static Connection connection = null;

    private DbSingleton() {}

    public static Connection instance() {
        if (connection == null) {
            try {
                Class.forName(driverClassName);
                connection = DriverManager.getConnection(url, username, password);
            } catch (ClassNotFoundException | SQLException e) {
                logger.log(Level.SEVERE, "Error creating database connection", e);
            }
        }
        return connection;
    }
}
