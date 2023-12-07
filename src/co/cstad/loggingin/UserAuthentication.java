package co.cstad.loggingin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserAuthentication {
    private static final Logger logger = Logger.getLogger(UserAuthentication.class.getName());

    private static final String URL = "jdbc:postgresql://localhost:5432/dbinventorymanagement";
    private static final String USER = "postgres";
    private static final String PASSWORD = "kheang";

    static {
        // Configure the logger
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL); // Set the logging level
        logger.addHandler(consoleHandler);
    }

    public static boolean authenticateUser(String username, String password) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String query = "SELECT * FROM users WHERE username = ? AND password = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, hashPassword(password));
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    return resultSet.next();
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    private static String hashPassword(String password) {
        // Implement password hashing logic (e.g., using bcrypt)
        return password;
    }
}