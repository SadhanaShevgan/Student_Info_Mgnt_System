
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
//public class DatabaseConnection {
//    final static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
//    final static String DB_URL ="jdbc:mysql://loacalhost:3306/student";
//    
//    final static String USER ="root";
//    final static String PASS = " ";
//
//    public static Connection connection(){
//        try{
//            Class.forName(JDBC_DRIVER);
//            
//            Connection conn;
//            try {
//                conn = DriverManager.getConnection(DB_URL, USER, PASS);
//            } catch (SQLException ex) {
//                Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            
//        }catch(ClassNotFoundException e){
//            JOptionPane.showMessageDialog(null,e);
//            return null;
//        }
//        return null;
//    }
//}
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static Connection connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/student", "root", ""); // update DB name
        } catch (ClassNotFoundException | SQLException e) {
            return null;
        }
    }

    static Connection connection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
