
package config;

import java.sql.*;
import javax.swing.JOptionPane;

public class KoneksiDB {
   static Connection con;
    public static int executeUpdate;
   public static Connection getConnection() {
       
     try {
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pembayaranspp","root","");         
     }catch (Exception e) {
         JOptionPane.showMessageDialog(null, "ERROR : Koneksi Gagal!");
         System.exit(0);
     }
       return con;
   }
    
    
    
}

