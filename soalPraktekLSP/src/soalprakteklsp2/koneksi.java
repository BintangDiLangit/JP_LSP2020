/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soalprakteklsp2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author BintangDiLangit
 */
public class koneksi {
    private static com.mysql.jdbc.Connection mysqlkonek;
//    public static void main(String[] args) throws SQLException{
//        koneksiDB();
//    }
    
    public static com.mysql.jdbc.Connection koneksiDB() throws SQLException {
        if(mysqlkonek==null){
            try {
                String DB="jdbc:mysql://localhost:3306/lsp2bintang"; // tokobuku database
                String user="root"; // user database
                String pass=""; // password database
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                mysqlkonek = (com.mysql.jdbc.Connection) DriverManager.getConnection(DB,user,pass);
          
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Koneksi Gagal");
            }
        }
        return mysqlkonek;
    }
    
    public static void main(String[] args) throws SQLException {
        koneksi.koneksiDB();
    }
}
