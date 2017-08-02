/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;
import java.sql.*;
import Encapsulamiento.eDepartments;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author mastermoy
 */
public class DepartmentData {
    
    public static String insertDepartment(Connection Conectar, eDepartments Department) throws SQLException
    {        
       CallableStatement query = Conectar.prepareCall("{call sp_department_insert(?)}");
       query.setString(1, Department.getName());
       
       ResultSet resultset = query.executeQuery();
       resultset.next();
       String resultado = resultset.getString("ERROR");
       return resultado;
       
    }
    
    public static List<eDepartments> getDepartments(Connection conectar) throws Exception{
       List<eDepartments> lDepartments = new ArrayList<>();
        try {
            CallableStatement query = conectar.prepareCall("{call sp_departments_getall()}");
            ResultSet resultset = query.executeQuery();
            while(resultset.next()){
                eDepartments DepartmentList = new eDepartments( 
                        resultset.getInt("id"),
                        resultset.getString("name") );
                lDepartments.add(DepartmentList);
            }
            
        } catch (SQLException e) {
            throw new Exception("Error al mostrar lista"+e.getMessage());
        }        
       return lDepartments; 
    }
    
    
    public static boolean deleteDepartment(String DepartmentName, Connection conectar) throws Exception{
        boolean resultado = false;
        try {
            CallableStatement query = conectar.prepareCall("{call sp_department_delete(?)}");
            query.setString(1, DepartmentName);
            query.executeQuery();
            resultado = true;
            
        } catch (SQLException e) {
            throw new Exception("Error al mostrar lista"+e.getMessage()); 
        }        
        return resultado;
    }
    
    public static boolean editDepartment(Connection Conectar, eDepartments Department) throws Exception
    {     boolean resultado = false;
        try {     
       CallableStatement query = Conectar.prepareCall("{call sp_department_update(?,?)}");
       query.setInt(1, Department.getId());
       query.setString(2, Department.getName());query.executeQuery();
       resultado = true;
            
        } catch (SQLException e) {
            throw new Exception("Error al mostrar lista"+e.getMessage()); 
        }        
        return resultado;
       
    }  
    
    
    
    
}
