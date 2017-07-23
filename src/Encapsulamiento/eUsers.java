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
public class eUsers {
    int id;
    String name;
    String lastName;
    String userName;
    String eMail;
    String password;
    int profiles_Id;
    
    public eUsers(){}

    public eUsers(int id, String name, String lastName, String userName, String eMail, String password, int profiles_Id) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.userName = userName;
        this.eMail = eMail;
        this.password = password;
        this.profiles_Id = profiles_Id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getProfiles_Id() {
        return profiles_Id;
    }

    public void setProfiles_Id(int profiles_Id) {
        this.profiles_Id = profiles_Id;
    }
    
    
    
    
    
    
    }

