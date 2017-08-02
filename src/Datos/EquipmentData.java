/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;
import java.sql.*;
import Encapsulamiento.eEquipment;
import java.util.List;
import java.util.ArrayList;


/**
 *
 * @author mastermoy
 */
public class EquipmentData {
    
    public static String insertEquipment(Connection Conectar, eEquipment Equipment) throws SQLException
    {        
       CallableStatement query = Conectar.prepareCall("{call sp_equipo_insert(?,?,?,?,?,?,?)}");
       query.setString(1, Equipment.getModel());
       query.setString(2, Equipment.getSerialnum());
       query.setString(3, Equipment.getType());
       query.setString(4, Equipment.getDateofpurchace());
       query.setString(5, Equipment.getEndofguaranty());
       query.setInt(6, Equipment.getDepartment_Id());
       query.setInt(7, Equipment.getAssignment_Id());
       
       ResultSet resultset = query.executeQuery();
       resultset.next();
       String resultado = resultset.getString("ERROR");
       return resultado;       
    }
    
     public static List<eEquipment> getEquipment(Connection conectar) throws Exception{
       List<eEquipment> lEquipment = new ArrayList<>();
        try {
            CallableStatement query = conectar.prepareCall("{call sp_equipo_getall()}");
            ResultSet resultset = query.executeQuery();
            while(resultset.next()){
                eEquipment EquipmentList = new eEquipment( 
                        resultset.getInt(1),
                        resultset.getString(2),
                        resultset.getString(3),
                        resultset.getString(4),
                        resultset.getString(5),
                        resultset.getString(6),
                        resultset.getInt(7),
                        resultset.getInt(8) 
                );
                lEquipment.add(EquipmentList);
            }            
        } catch (SQLException e) {
            throw new Exception("Error al mostrar lista"+e.getMessage());
        }        
       return lEquipment ; 
    }
    
    
    public static boolean deleteEquipment(String Serie, Connection conectar) throws Exception{
        boolean resultado = false;
        try {
            CallableStatement query = conectar.prepareCall("{call sp_equipo_delete(?)}");
            query.setString(1, Serie);
            query.executeQuery();
            resultado = true;
            
        } catch (Exception e) {
            throw new Exception("Error al mostrar lista"+e.getMessage()); 
        }        
        return resultado;
    }
    
    
    public static String editEquipment(Connection Conectar, eEquipment Equipment) throws SQLException
    {        
       CallableStatement query = Conectar.prepareCall("{call sp_equipo_update(?,?,?,?,?,?,?,?)}");
       query.setInt(1, Equipment.getId());
       query.setString(2, Equipment.getModel());
       query.setString(3, Equipment.getSerialnum());
       query.setString(4, Equipment.getType());
       query.setString(5, Equipment.getDateofpurchace());
       query.setString(6, Equipment.getEndofguaranty());
       query.setInt(7, Equipment.getDepartment_Id());
       query.setInt(8, Equipment.getAssignment_Id());
       
       ResultSet resultset = query.executeQuery();
       resultset.next();
       String resultado = resultset.getString("ERROR");
       return resultado;       
    }  
    
    
    
}
