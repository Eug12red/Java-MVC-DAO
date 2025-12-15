package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 Gère la connexion SQLite.
 */
public class DatabaseConnection {

    private static final String URL = "jdbc:sqlite:hospital.db";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL);
    }
}
