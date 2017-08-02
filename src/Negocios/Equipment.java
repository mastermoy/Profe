/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;
import Conexion.Conexion;
import Encapsulamiento.eEquipment;
import Datos.EquipmentData;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author mastermoy
 */
public class Equipment extends Conexion{
    
     public static String insertEquipment(eEquipment equipment) throws SQLException, Exception{
        String resultado = null;
       Connection conexion = Conexion();
        try {
            conexion.setAutoCommit(false);
            resultado = EquipmentData.insertEquipment(conexion, equipment);
            conexion.commit();
        } catch (SQLException e) {
            conexion.rollback();
            throw new Exception("Error en la capa de negocios"+e.getMessage());
        }         
    
    return resultado;    
    }
    
    public static List<eEquipment> getEquipment() throws Exception{
       List<eEquipment> lEquipment = new ArrayList<>();
       Connection conexion = Conexion();
               try {
            conexion.setAutoCommit(false);
            //resultado = EquipmentData.ingresarDatos(conexion, equipment);
            lEquipment = EquipmentData.getEquipment(conexion);
            conexion.commit();
        } catch (SQLException e) {
            conexion.rollback();
            throw new Exception("Error en la capa de negocios"+e.getMessage());
        }  
    return lEquipment;
    }
    
   public static boolean deleteEquipment(String serialnum) throws Exception {
       boolean resultado = false;       
       Connection conexion = Conexion();
       try {
           conexion.setAutoCommit(false);           
           resultado = EquipmentData.deleteEquipment(serialnum, conexion);
           conexion.commit();
       } catch (Exception e) {
          conexion.rollback();
          throw new Exception("Error en la capa de negocios"+e.getMessage()); 
         
       }       
       return resultado;
   }
   
   public static String edithEquipment(eEquipment equipment) throws SQLException, Exception{
        String resultado = null;
        Connection conexion = Conexion();
        try {
            conexion.setAutoCommit(false);
            resultado = EquipmentData.editEquipment(conexion, equipment);
            conexion.commit();
        } catch (SQLException e) {
            conexion.rollback();
            throw new Exception("Error en la capa de negocios"+e.getMessage());
        }         
    
    return resultado;    
    }
    
}
