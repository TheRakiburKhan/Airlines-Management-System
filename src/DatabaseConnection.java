/*
 * The MIT License
 *
 * Copyright 2020 MD Rakibur Khan.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

/**
 *
 * @author MD Rakibur Rahman Khan
 */

import java.sql.*;
import javax.swing.JOptionPane;

public class DatabaseConnection {
    
    Connection connection = null;
    
    public Connection Connect(){
        try {
            
            Class.forName("org.sqlite.JDBC");
            
        } catch (ClassNotFoundException classNotFoundException) {
            
            JOptionPane.showMessageDialog(null, classNotFoundException, "Database Driver Error!!!", JOptionPane.ERROR_MESSAGE);
        
        }
        
        try {
            // database parameters
            String url = "jdbc:sqlite:src/assets/database/Airlines Management System.sqlite3";
            // create a connection to the database
            connection = DriverManager.getConnection(url);
  
            return connection;
            
        } catch (SQLException sQLException) {
            
            JOptionPane.showMessageDialog(null, sQLException, "SQL Error!!!", JOptionPane.ERROR_MESSAGE);
            
            return null;
        }
    }
}
