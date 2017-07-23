package Conexion;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author mastermoy
 */
public class Conexion {
        protected static Connection Conexion(){
        Connection conexion = null;
        try{
             Class.forName("com.mysql.jdbc.Driver");   
            String user="root";
            String password="M1n0str4ta";
            String server="jdbc:mysql://localhost/practica11";                
            conexion = (Connection) DriverManager.getConnection(server,user,password);
            //JOptionPane.showMessageDialog(null, "Conexion Exitosa");
        }catch (Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return conexion;
    }
   
    
}
