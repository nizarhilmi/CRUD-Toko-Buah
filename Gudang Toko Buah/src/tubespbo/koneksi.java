package tubespbo;
import java.sql.*;
import javax.swing.JOptionPane;

public class koneksi {
    private static Connection KoneksiDatabase;
    public static Connection getKoneksi() throws SQLException {
        try {
            String DB ="jdbc:mysql://localhost/gudang";
            String user="root";
            String pass="";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            KoneksiDatabase = (Connection) DriverManager.getConnection(DB,user,pass);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Tidak ada koneksi","Error",
            JOptionPane.INFORMATION_MESSAGE);
            System.err.println(e.getMessage());
            System.exit(0);
        }
         return KoneksiDatabase;
    }     
}
