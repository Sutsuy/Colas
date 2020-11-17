/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appgraficacola;
import java.util.*;
/**
 *
 * @author sause
 */
public class AppGraficaCola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here



   
        // TODO code application logic here
    
    Scanner leer=new Scanner (System.in);
        
        boolean continuar=true;
        
        int opc;
        String palabra;
        ColaDinamica cola=new ColaDinamica();
        
        while(continuar){
        System.out.println("MENU");
        System.out.println("1.- Insertar");
        System.out.println("2.- Eliminar ");
        System.out.println("3.- Mostrar ");
        System.out.println("4.- Salir ");
        System.out.println("Elige una opcion--> ");
        opc=leer.nextInt();
        
        
        
        switch (opc)
        {
            case 1:
                System.out.println("Ingresa la palabra "); 
                palabra=leer.next();
                cola.Empujar(palabra);
               
                break;
                
            case 2:
                
                cola.SacarCola();
               
             break;
             
            case 3:
                cola.mostrarCola();
                
            break;
                
            case 4:
               continuar= false;
              
               break;
                
            default:
                {
                    System.out.println("Opcio´n incorrecta.....Vuelve a intentarlo");                                                  
            
                }
                
                
            
            
            
        }
        
        
        
        
        
    }
    
    }
}
    
    
    
    

