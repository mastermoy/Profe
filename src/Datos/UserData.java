/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;
import java.sql.*;
import Encapsulamiento.eUsers;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author mastermoy
 */
public class UserData {
    
    public static String ingresarDatos(Connection Conectar, eUsers User) throws SQLException
    {        
       CallableStatement query = Conectar.prepareCall("{call sp_Users_insert(?,?,?,?,?,?)}");
       query.setString(1, User.getName());
       query.setString(2, User.getLastName());
       query.setString(3, User.getUserName());
       query.setString(4, User.geteMail());
       query.setString(5, User.getPassword());
       query.setInt(6, User.getProfiles_Id());
       
       ResultSet resultset = query.executeQuery();
       resultset.next();
       String resultado = resultset.getString("ERROR");
       return resultado;
       
    }
    
    public static List<eUsers> getUsers(Connection conectar) throws Exception{
       List<eUsers> lUsuarios = new ArrayList<>();
        try {
            CallableStatement query = conectar.prepareCall("{call sp_Users_getall()}");
            ResultSet resultset = query.executeQuery();
            while(resultset.next()){
                eUsers UserList = new eUsers( 
                        resultset.getInt("id"),
                        resultset.getString("name"),
                        resultset.getString("lastname"),
                        resultset.getString(4),
                        resultset.getString(5),
                        resultset.getString(6),
                        resultset.getInt(7)               
                );
                lUsuarios.add(UserList);
            }
            
        } catch (Exception e) {
            throw new Exception("Error al mostrar lista"+e.getMessage());
        }        
       return lUsuarios ; 
    }
    
    
    public static boolean deleteUser(String userName, Connection conectar) throws Exception{
        boolean resultado = false;
        try {
            CallableStatement query = conectar.prepareCall("{call sp_Users_delete(?)}");
            query.setString(1, userName);
            query.executeQuery();
            resultado = true;
            
        } catch (Exception e) {
            throw new Exception("Error al mostrar lista"+e.getMessage()); 
        }        
        return resultado;
    }
    
    public static String editarDatos(Connection Conectar, eUsers User) throws SQLException
    {        
       CallableStatement query = Conectar.prepareCall("{call sp_User_update(?,?,?,?,?,?,?)}");
       query.setInt(1, User.getId());
       query.setString(2, User.getName());
       query.setString(3, User.getLastName());
       query.setString(4, User.getUserName());
       query.setString(5, User.geteMail());
       query.setString(6, User.getPassword());
       query.setInt(7, User.getProfiles_Id());
       
       ResultSet resultset = query.executeQuery();
       resultset.next();
       String resultado = resultset.getString("ERROR");
       return resultado;       
    }  
    
        public static String findLogin(Connection Conectar, eUsers User) throws SQLException
    {        
       CallableStatement query = Conectar.prepareCall("{call sp_Userslogin_find(?,?)}");
       query.setString(1, User.getUserName());
       query.setString(2, User.getPassword());
              
       ResultSet resultset = query.executeQuery();
       resultset.next();
       String resultado = resultset.getString("ERROR");
       return resultado;       
    } 
    
    
}
