package co.cstad.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingleton {
    private static String url;
    private static String username;
    private static String password;
    private static Connection connection;
    public static Connection instance() {
        if (connection == null) {
            try {
                Class.forName("org.postgresql.Driver");
                connection = DriverManager.getConnection(
                        url,
                        username,
                        password
                );
            } catch (ClassNotFoundException e) {
                System.out.println(e.getMessage());
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return connection;
    }
}
