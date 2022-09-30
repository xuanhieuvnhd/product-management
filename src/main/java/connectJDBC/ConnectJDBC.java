package connectJDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectJDBC {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/quanlysanpham";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "761321";
//Test ket noi database
//    public static void main(String[] args) {
//        Connection con = connect();
//        if(con == null){
//            System.out.println("false");
//        }else {
//            System.out.println("true");
//        }
//    }
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