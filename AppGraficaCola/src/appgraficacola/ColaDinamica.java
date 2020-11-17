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
public class ColaDinamica {
    NodoCola cima,fin;
    int tamanio;
    
    public boolean EstaVacia()
    {
        return cima==null;
    }
    
    public void Empujar(String elemento){
        NodoCola nodo = new NodoCola(elemento);
        if(EstaVacia()){
            cima = nodo;
            
        }
        else{
            fin.siguiente = nodo;
        }
        fin = nodo;
        tamanio++;
    }
    public String SacarCola(){
        if(!EstaVacia()){
            cima = cima.siguiente;
            tamanio--;
        }else{
            System.out.println("No hay elementos que eliminar :(");
            
        }
        return null;
    }
    public void mostrarCola(){
        NodoCola recorre = cima;
        if(!EstaVacia()){
            while(recorre!= null){
                System.out.println(recorre.elemento);
                recorre = recorre.siguiente;
            }
            
        }
        else{
           System.out.println("La cola ésta vacía");
        }
    }
    
    
    
    
    
    
    
    
}
