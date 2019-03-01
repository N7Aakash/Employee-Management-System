
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akash
 */

public class MySQLConnect {
    public static Connection connectDB(){
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb","n7aakash","1234@abcd");
            JOptionPane.showMessageDialog(null,"Connection Successful","Connection!",JOptionPane.INFORMATION_MESSAGE);
            return conn;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Connection unsuccessful" + e.getMessage(),"Connection!",JOptionPane.ERROR_MESSAGE);
            return null;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Connection unsuccessful" + e.getMessage(),"Connection!",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
        
}
