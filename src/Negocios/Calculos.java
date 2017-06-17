/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;

/**
 *
 * @author mastermoy
 */
public class Calculos {
        static int result =0;
           
        public static int suma(int n1,int n2){
        result = n1 + n2;
        return result; 
        
    }
    
    public static int resta(int n1, int n2){
        result= n1 - n2;
        return result;
    
    }
    
    public static int multi(int n1, int n2){
        result = n1 * n2;
        return result;   
        
    }
    
    public static int div(int n1, int n2){
        result = n1 / n2;
        return result;
    
    }   
}
