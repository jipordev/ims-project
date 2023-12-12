// UserAuthentication.java
package co.cstad.loggingin;
import co.cstad.util.DbSingleton;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;



public class UserAuthentication {
    private static Connection connection;
    private static final Logger logger = Logger.getLogger(UserAuthentication.class.getName());

    public UserAuthentication() {
        connection = DbSingleton.instance();
    }

    static {
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL); // Set the logging level
        logger.addHandler(consoleHandler);
    }

    public static boolean authenticateUser(String username, String password) {
        try {
            connection = DbSingleton.instance();
            String query = "SELECT * FROM users WHERE username = ? AND password = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, hashPassword(password));
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    return resultSet.next();
                }
            }
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Error during user authentication", e);
        }
        return false;
    }

    public static String getUserRole(String username) {
        try {
            connection = DbSingleton.instance();
            String query = "SELECT r.name FROM roles r JOIN users u ON r.id = u.id WHERE u.username = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, username);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        return resultSet.getString("name");
                    }
                }
            }
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Error getting user role", e);
        }
        return null;
    }

    private static String hashPassword(String password) {
        // Implement password hashing logic (e.g., using bcrypt)
        return password;
    }
}

