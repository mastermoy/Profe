package Negocios;
import Conexion.Conexion;
import Encapsulamiento.eUsers;
import Datos.UserData;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author mastermoy
 */
public class User  extends Conexion{
    
    public static String ingresarDatos(eUsers user) throws SQLException, Exception{
        String resultado = null;
        Connection conexion = Conexion();
        try {
            conexion.setAutoCommit(false);
            resultado = UserData.ingresarDatos(conexion, user);
            conexion.commit();
        } catch (SQLException e) {
            conexion.rollback();
            throw new Exception("Error en la capa de negocios"+e.getMessage());
        }         
    
    return resultado;    
    }
    
    public static List<eUsers> getUsers() throws Exception{
       List<eUsers> lUsuarios = new ArrayList<>();
       Connection conexion = Conexion();
               try {
            conexion.setAutoCommit(false);
            //resultado = UserData.ingresarDatos(conexion, user);
            lUsuarios = UserData.getUsers(conexion);
            conexion.commit();
        } catch (SQLException e) {
            conexion.rollback();
            throw new Exception("Error en la capa de negocios"+e.getMessage());
        }  
    return lUsuarios;
    }
    
   public static boolean deleteUser(String userName) throws Exception {
       boolean resultado = false;       
       Connection conexion = Conexion();
       try {
           conexion.setAutoCommit(false);           
           resultado = UserData.deleteUser(userName, conexion);
           conexion.commit();
       } catch (Exception e) {
          conexion.rollback();
          throw new Exception("Error en la capa de negocios"+e.getMessage()); 
         
       }       
       return resultado;
   }
   
   public static String editarDatos(eUsers user) throws SQLException, Exception{
        String resultado = null;
        Connection conexion = Conexion();
        try {
            conexion.setAutoCommit(false);
            resultado = UserData.editarDatos(conexion, user);
            conexion.commit();
        } catch (SQLException e) {
            conexion.rollback();
            throw new Exception("Error en la capa de negocios"+e.getMessage());
        }         
    
    return resultado;    
    }
    
}
