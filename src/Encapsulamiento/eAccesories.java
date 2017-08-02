/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulamiento;

/**
 *
 * @author mastermoy
 */
public class eAccesories {
    private int id;
    private String marca;
    private String modelo;
    private String serie;
    private int department_Id;
    private int assignment_user_Id;
    

    public eAccesories() { }
    
    public eAccesories(int id, String marca, String modelo, String serie, int department_Id, int assignment_user_Id)
    {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.serie = serie;
        this.department_Id = department_Id;
        this.assignment_user_Id = assignment_user_Id;    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getDepartment_Id() {
        return department_Id;
    }

    public void setDepartment_Id(int department_Id) {
        this.department_Id = department_Id;
    }

    public int getAssignment_user_Id() {
        return assignment_user_Id;
    }

    public void setAssignment_user_Id(int assignment_user_Id) {
        this.assignment_user_Id = assignment_user_Id;
    }
    
    
    
}
