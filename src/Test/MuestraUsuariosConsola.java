/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;
import Negocios.User;
import Encapsulamiento.eUsers;
import java.util.List;


/**
 *
 * @author mastermoy
 */
public class MuestraUsuariosConsola {
    
    public static void main(String[] args) throws Exception{
        //elimina("mastermoy2");
        muestra();
    }
    
    public static void muestra(){
    List<eUsers> miLista = null;
        try {
            miLista = User.getUsers();
           
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        for(eUsers user:miLista){
          System.out.print(user.getId()+", ");
          System.out.print(user.getName());
          System.out.println();
        }
    }
    
    public static void elimina(String userName) throws Exception{
    if(User.deleteUser(userName))
    {
    System.out.println("Usuario eliminado correctamente");
    
    }
    else{
    System.out.println("no se pudo eliminar el usuario");
    }
        
    }
    
}
