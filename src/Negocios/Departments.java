/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;
import Conexion.Conexion;
import Encapsulamiento.eDepartments;
import Datos.DepartmentData;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author mastermoy
 */
public class Departments extends Conexion{
    
     public static String insertDepartment(eDepartments department) throws SQLException, Exception{
        String resultado = null;
       Connection conexion = Conexion();
        try {
            conexion.setAutoCommit(false);
            resultado = DepartmentData.insertDepartment(conexion, department);
            conexion.commit();
        } catch (SQLException e) {
            conexion.rollback();
            throw new Exception("Error en la capa de negocios"+e.getMessage());
        }         
    
    return resultado;    
    }
    
    public static List<eDepartments> getDepartment() throws Exception{
       List<eDepartments> lDepartment = new ArrayList<>();
       Connection conexion = Conexion();
               try {
            conexion.setAutoCommit(false);
            //resultado = DepartmentData.ingresarDatos(conexion, equipment);
            lDepartment = DepartmentData.getDepartments(conexion);
            conexion.commit();
        } catch (SQLException e) {
            conexion.rollback();
            throw new Exception("Error en la capa de negocios"+e.getMessage());
        }  
    return lDepartment;
    }
    
   public static boolean deleteDepartment(String name) throws Exception {
       boolean resultado = false;       
       Connection conexion = Conexion();
       try {
           conexion.setAutoCommit(false);           
           resultado = DepartmentData.deleteDepartment(name, conexion);
           conexion.commit();
       } catch (Exception e) {
          conexion.rollback();
          throw new Exception("Error en la capa de negocios"+e.getMessage());         
       }       
       return resultado;
   }
   
   public static boolean edithDepartment(eDepartments department) throws SQLException, Exception{
       boolean resultado = false;  
        Connection conexion = Conexion();
        try {
            conexion.setAutoCommit(false);
            resultado = DepartmentData.editDepartment(conexion, department);
            conexion.commit();
        } catch (SQLException e) {
            conexion.rollback();
            throw new Exception("Error en la capa de negocios"+e.getMessage());
        }         
    
    return resultado;    
    }
    
    
    
}
