/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas;

/**
 *
 * @author mastermoy
 */
import java.util.Scanner;
import java.util.Random;

public class Practicas {
    public static Scanner read = new Scanner(System.in);  
    public static Random rn = new Random();


    public static void main(String[] args) {
       int opc;
       //Scanner read = new Scanner(System.in);  
       System.out.println("Elije una opcion entre 1 y 4 o preciona 5 para Salir");  
       opc =  read.nextInt();
       
       switch(opc){
                
            case 1:
                p1();
                break;
            case 2: 
                p2();
                break;
            case 3:
                p3();
                break;
            case 4:
                p4();
                break;
            case 5:
                System.exit(0);
            default:
                 System.out.println("Opcion incorrecta");  
                
             
        }          
    }
    
    public static void p1(){
        int d1, d2, d3;
        //Random rn = new Random();
        d1 = rn.nextInt(6) + 1;
        d2 = rn.nextInt(6) + 1;
        d3 = rn.nextInt(6) + 1;
        
        System.out.println("Dado 1: "+d1);
        System.out.println("Dado 2: "+d2);
        System.out.println("Dado 3: "+d3);
        System.out.println("Ejercicio 1: Tira de 3 dados");
        if(d1 == 6 && d2 == 6 && d3 == 6)
        {
          System.out.println("Resultado Excelente");  
        }
        
        if(d1 != 6 && d2 != 6 && d3 != 6)
        {
          System.out.println("Resultado Pesimo");  
        }
        
        
        if(d1==6 && d2 !=6 && d3 !=6 ){
            System.out.println("Resultado Regular");        
        }
        
         if(d1!=6 && d2 ==6 && d3 !=6 ){
            System.out.println("Resultado Regular");        
        }
         
        if(d1!=6 && d2 !=6 && d3 ==6 ){
            System.out.println("Resultado Regular");        
        }
        
        if (d1==6 && d2 ==6 && d3 !=6)
        {
            System.out.println("Resultado Muy Bueno");  
        }
        
        if (d1==6 && d2 !=6 && d3 ==6)
        {
            System.out.println("Resultado Muy Bueno");  
        }
        
        if (d1!=6 && d2 ==6 && d3 ==6)
        {
            System.out.println("Resultado Muy Bueno");  
        }
        
        
    }
        
    public static void p2(){
   // Scanner read = new Scanner(System.in);   
    int numero, pares, total;
    pares = 0;
    total = 0;
    System.out.println("Ingresa numeros mayores a 20, inserta 5 numeros pares para terminar");
    
    do{
       System.out.println("captura un numero: ");
       numero = read.nextInt();
       
       total = total + numero;
       if(numero % 2 ==0 ){
       pares++;       
       }        
    }while(pares<5);
         System.out.println("La suma total es: "+total);   
    }  
    
    public static void p3(){
        int n1, n2, contador;
        contador =0;
        int resp, respuesta;
        boolean bandera = true;
        //Scanner read = new Scanner(System.in);  
       // Random rn = new Random();
        
        n1 = rn.nextInt(10) + 1;
        n2 = rn.nextInt(10) + 1;
        resp = n1 * n2;
        
        while(bandera){
            System.out.println("Escribe el resultado de la siguente operacion: ");
            System.out.println(n1 + " x " + n2 + " = ");
            respuesta = read.nextInt();
        
            if (resp == respuesta){
                System.out.println("Felicidades, el resultado es correcto ");
                bandera=false;           
            }
            else{
                System.out.println("Resultado incorrecto, inenta de nuevo ");
                contador++;
            }
            if(contador >4){
                System.out.println("Lo siento, Perdiste ");
                bandera=false;                 
            }       
        
        }
        
    }
        public static void p4(){
       // Scanner read = new Scanner(System.in);  
       // Random rn = new Random(); 
        
        int numero, adivina;
        numero = rn.nextInt(100)+1;
        adivina = 0;
        boolean bandera = true;
        System.out.println("Adivina el numero entre 1 y 100");
        
       do{
         System.out.println("busca: "+numero); 
          adivina = read.nextInt();
          if(numero < adivina){
              System.out.println("El numero que buscas es menor"); 
              }
          else{
              System.out.println("El numero que buscas es mayor"); 
                }
        
          if (numero == adivina){
             System.out.println("Felicidades, el numero: "+adivina+" es correcto"); 
             bandera = false;
             }
        
       }while(bandera);
     }
      
        
    }
        

    

