/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;
import java.sql.*;
import Encapsulamiento.eAssignmentUsers;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author mastermoy
 */
public class AssigmentData {
    public static String insertAssignment(Connection Conectar, eAssignmentUsers Assignment) throws SQLException
    {        
       CallableStatement query = Conectar.prepareCall("{call sp_AssignUsers_insert(?,?)}");
       query.setString(1, Assignment.getFirstName());
       query.setString(2, Assignment.getLastName());
       
       ResultSet resultset = query.executeQuery();
       resultset.next();
       String resultado = resultset.getString("ERROR");
       return resultado;
       
    }
    
    public static List<eAssignmentUsers> getAssignment(Connection conectar) throws Exception{
       List<eAssignmentUsers> lAssignments = new ArrayList<>();
        try {
            CallableStatement query = conectar.prepareCall("{call sp_AssignUserss_getall()}");
            ResultSet resultset = query.executeQuery();
            while(resultset.next()){
                eAssignmentUsers AssignmentList = new eAssignmentUsers( 
                        resultset.getInt("id"),
                        resultset.getString("firstname"),
                        resultset.getString("lastname"));
                lAssignments.add(AssignmentList);
            }            
        } catch (SQLException e) {
            throw new Exception("Error al mostrar lista"+e.getMessage());
        }        
       return lAssignments ; 
    }
    
    
    public static boolean deleteAssignment(int id, Connection conectar) throws Exception{
        boolean resultado = false;
        try {
            CallableStatement query = conectar.prepareCall("{call sp_AssignUsers_delete(?)}");
            query.setInt(1, id);
            query.executeQuery();
            resultado = true;
            
        } catch (SQLException e) {
            throw new Exception("Error al mostrar lista"+e.getMessage()); 
        }
        
        return resultado;
    }
    
    public static String editAssignment(Connection Conectar, eAssignmentUsers Assignment) throws SQLException
    {        
       CallableStatement query = Conectar.prepareCall("{call sp_updateAssignment(?,?,?)}");
       query.setInt(1, Assignment.getId());
       query.setString(2, Assignment.getFirstName());
       query.setString(3, Assignment.getLastName());
       
       ResultSet resultset = query.executeQuery();
       resultset.next();
       String resultado = resultset.getString("ERROR");
       return resultado;
       
    }  
}
