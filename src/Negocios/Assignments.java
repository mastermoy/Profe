/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;
import Conexion.Conexion;
import Encapsulamiento.eAssignmentUsers;
import Datos.AssigmentData;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author mastermoy
 */
public class Assignments extends Conexion{
    
    public static String ingresarDatos(eAssignmentUsers assignment) throws SQLException, Exception{
        String resultado = null;
        Connection conexion;
        conexion = Conexion();
        try {
            conexion.setAutoCommit(false);
            resultado = AssigmentData.insertAssignment(conexion, assignment);
            conexion.commit();
        } catch (SQLException e) {
            conexion.rollback();
            throw new Exception("Error en la capa de negocios"+e.getMessage());
        }         
    
    return resultado;    
    }
    
    public static List<eAssignmentUsers> getAssignment() throws Exception{
       List<eAssignmentUsers> lAssignments = new ArrayList<>();
       Connection conexion = Conexion();
               try {
            conexion.setAutoCommit(false);
            //resultado = UserData.ingresarDatos(conexion, user);
            lAssignments = AssigmentData.getAssignment(conexion);
            conexion.commit();
        } catch (SQLException e) {
            conexion.rollback();
            throw new Exception("Error en la capa de negocios"+e.getMessage());
        }  
    return lAssignments;
    }
    
   public static boolean deleteAssignments(int id) throws Exception {
       boolean resultado = false;       
       Connection conexion = Conexion();
       try {
           conexion.setAutoCommit(false);           
           resultado = AssigmentData.deleteAssignment(id, conexion);
           conexion.commit();
       } catch (Exception e) {
          conexion.rollback();
          throw new Exception("Error en la capa de negocios"+e.getMessage()); 
         
       }       
       return resultado;
   }
   
   public static String editAssignments(eAssignmentUsers assignment) throws SQLException, Exception{
        String resultado = null;
        Connection conexion = Conexion();
        try {
            conexion.setAutoCommit(false);
            resultado = AssigmentData.editAssignment(conexion, assignment);
            conexion.commit();
        } catch (SQLException e) {
            conexion.rollback();
            throw new Exception("Error en la capa de negocios"+e.getMessage());
        }         
    
    return resultado;    
    }
    
}
