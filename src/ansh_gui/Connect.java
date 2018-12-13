package ansh_gui;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raj
 */
import java.sql.*;
import javax.swing.*;
public class Connect {
     Connection con=null;
   Connection con1=null;
        public static Connection ConnectDB(){
             try{
           
          Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://172.31.15.127:3306/ANSH","ansh","admin123");
        // Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ANSH","root","");
          return con;
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
    }      
}
         public static Connection Connect1DB(){
             try{
           
          Class.forName("com.mysql.jdbc.Driver");
         Connection con1 = DriverManager.getConnection("jdbc:mysql://172.31.15.127:3306/ANSH","ansh","admin123");
          return con1;
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
    }      
}
}
