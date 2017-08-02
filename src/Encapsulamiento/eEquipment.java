/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulamiento;

import java.sql.Date;

/**
 *
 * @author mastermoy
 */
public class eEquipment {
    int id;
    String model;
    String serialnum;
    String type;
    String dateofpurchace;
    String endofguaranty;
    int department_Id;
    int assignment_Id;
    
    public eEquipment(){}
    
    public eEquipment(int id, String model, String serialnum, String type, String dateofpurchace, String endofguaranty, int department_Id, int assignment_Id)
    {
        this.id = id;
        this.model = model;
        this.serialnum = serialnum;
        this.type = type;
        this.dateofpurchace = dateofpurchace;
        this.endofguaranty = endofguaranty;
        this.department_Id = department_Id;
        this.assignment_Id = assignment_Id;    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialnum() {
        return serialnum;
    }

    public void setSerialnum(String serialnum) {
        this.serialnum = serialnum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDateofpurchace() {
        return dateofpurchace;
    }

    public void setDateofpurchace(String dateofpurchace) {
        this.dateofpurchace = dateofpurchace;
    }

    public String getEndofguaranty() {
        return endofguaranty;
    }

    public void setEndofguaranty(String endofguaranty) {
        this.endofguaranty = endofguaranty;
    }

    public int getDepartment_Id() {
        return department_Id;
    }

    public void setDepartment_Id(int department_Id) {
        this.department_Id = department_Id;
    }

    public int getAssignment_Id(){
        return assignment_Id;
    }

    public void setAssignment_Id(int assignment_Id) {
        this.assignment_Id = assignment_Id;
    }
    
    
    
}
