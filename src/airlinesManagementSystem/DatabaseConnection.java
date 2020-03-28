package airlinesManagementSystem;

/**
 *
 * @author MD Rakibur Khan
 */

import java.sql.*;
import javax.swing.JOptionPane;

public class DatabaseConnection {
    
    public static Connection Connect(){
        try {
            //Checking JDBC drivar availibility
            Class.forName("org.sqlite.JDBC");
            
        } catch (ClassNotFoundException classNotFoundException) {
            
            JOptionPane.showMessageDialog(null, classNotFoundException, "Database Driver Error!!!", JOptionPane.ERROR_MESSAGE);
        
        }
        
        try {
            // database parameters
            String url = "jdbc:sqlite:src/assets/database/Airlines Management System.sqlite3";
            // create a connection to the database
           Connection connection = DriverManager.getConnection(url);
  
            return connection;
            
        } catch (SQLException sQLException) {
            
            JOptionPane.showMessageDialog(null, sQLException, "SQL Error!!!", JOptionPane.ERROR_MESSAGE);
            
            return null;
        }
    }
}
 