package connectJDBC;

import java.sql.*;

public class ConnectJDBC {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/quanlysanpham";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "761321";

    public static Connection connect() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            System.out.println("Connect success!");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return conn;
    }
}