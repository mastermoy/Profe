/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;
import java.sql.*;
import Encapsulamiento.eAccesories;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author mastermoy
 */
public class AccesoriesData {
    
     public static String insertAccesories(Connection Conectar, eAccesories Accesories) throws SQLException
    {        
       CallableStatement query = Conectar.prepareCall("{call sp_accesorios_insert(?,?,?,?,?)}");
       query.setString(1, Accesories.getMarca());
       query.setString(2, Accesories.getModelo());
       query.setString(3, Accesories.getSerie());
       query.setInt(4, Accesories.getDepartment_Id());
       query.setInt(5, Accesories.getAssignment_user_Id());
       
       ResultSet resultset = query.executeQuery();
       resultset.next();
       String resultado = resultset.getString("ERROR");
       return resultado;       
    }
    
     public static List<eAccesories> getAccesories(Connection conectar) throws Exception{
       List<eAccesories> lAccesories = new ArrayList<>();
        try {
            CallableStatement query = conectar.prepareCall("{call sp_accesorios_getall()}");
            ResultSet resultset = query.executeQuery();
            while(resultset.next()){
                eAccesories AccesoriesList = new eAccesories( 
                        resultset.getInt(1),
                        resultset.getString(2),
                        resultset.getString(3),
                        resultset.getString(4),
                        resultset.getInt(5),
                        resultset.getInt(6) 
                );
                lAccesories.add(AccesoriesList);
            }            
        } catch (SQLException e) {
            throw new Exception("Error al mostrar lista"+e.getMessage());
        }        
       return lAccesories ; 
    }
    
    
    public static boolean deleteAccesories(String Serie, Connection conectar) throws Exception{
        boolean resultado = false;
        try {
            CallableStatement query = conectar.prepareCall("{call sp_accesorios_delete(?)}");
            query.setString(1, Serie);
            query.executeQuery();
            resultado = true;
            
        } catch (SQLException e) {
            throw new Exception("Error al mostrar lista"+e.getMessage()); 
        }        
        return resultado;
    }
    
    
    public static String editAccesories(Connection Conectar, eAccesories Accesories) throws SQLException
    {        
       CallableStatement query = Conectar.prepareCall("{call sp_accesorios_update(?,?,?,?,?,?)}");
       query.setInt(1, Accesories.getId());
       query.setString(2, Accesories.getMarca());
       query.setString(3, Accesories.getModelo());
       query.setString(4, Accesories.getSerie());
       query.setInt(5, Accesories.getDepartment_Id());
       query.setInt(6, Accesories.getAssignment_user_Id());
       
       ResultSet resultset = query.executeQuery();
       resultset.next();
       String resultado = resultset.getString("ERROR");
       return resultado;       
    }  
    
    
}
