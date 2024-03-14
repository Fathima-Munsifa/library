/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagement;

/**
 *
 * @author asmah
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBConnection {
    
    Connection con=null;
   
        public static Connection ConnectDB(){
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection
        ("jdbc:mysql://localhost:3306/librarymgmnt","root","");
           return con;
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }      
    }
    
}
