/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;
import Conexion.Conexion;
import Encapsulamiento.eAccesories;
import Datos.AccesoriesData;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author mastermoy
 */
public class Accesories extends Conexion{
    
     public static String insertAccesories(eAccesories accesories) throws SQLException, Exception{
        String resultado = null;
       Connection conexion = Conexion();
        try {
            conexion.setAutoCommit(false);
            resultado = AccesoriesData.insertAccesories(conexion, accesories);
            conexion.commit();
        } catch (SQLException e) {
            conexion.rollback();
            throw new Exception("Error en la capa de negocios"+e.getMessage());
        }         
    
    return resultado;    
    }
    
    public static List<eAccesories> getAccesories() throws Exception{
       List<eAccesories> lAccesories = new ArrayList<>();
       Connection conexion = Conexion();
               try {
            conexion.setAutoCommit(false);
            lAccesories = AccesoriesData.getAccesories(conexion);
            conexion.commit();
        } catch (SQLException e) {
            conexion.rollback();
            throw new Exception("Error en la capa de negocios"+e.getMessage());
        }  
    return lAccesories;
    }
    
   public static boolean deleteAccesories(String serie) throws Exception {
       boolean resultado = false;       
       Connection conexion = Conexion();
       try {
           conexion.setAutoCommit(false);           
           resultado = AccesoriesData.deleteAccesories(serie, conexion);
           conexion.commit();
       } catch (Exception e) {
          conexion.rollback();
          throw new Exception("Error en la capa de negocios"+e.getMessage()); 
         
       }       
       return resultado;
   }
   
   public static String edithAccesories(eAccesories accesories) throws SQLException, Exception{
        String resultado = null;
        Connection conexion = Conexion();
        try {
            conexion.setAutoCommit(false);
            resultado = AccesoriesData.editAccesories(conexion, accesories);
            conexion.commit();
        } catch (SQLException e) {
            conexion.rollback();
            throw new Exception("Error en la capa de negocios"+e.getMessage());
        }         
    
    return resultado;    
    }
    
}
