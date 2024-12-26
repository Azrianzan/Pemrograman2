package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
	private static final String DB_URL = "jdbc:mysql://localhost:3306/praktikum7";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "toor";

	public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Gagal koneksi ke database!");
        }
        return connection;
    }
}
