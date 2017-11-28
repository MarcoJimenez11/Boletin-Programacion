/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6_1y2y3;

import java.util.Vector;

/**
 *
 * @author Usuario DAM
 */
public class Lista {
    private Vector lista = new Vector();
    
    /**Constructor
     * 
     */
    public Lista(){
        lista = new Vector();
    }
    
    /**pone el elemento dado en el primer lugar de la lista
     * 
     * @param ob 
     */
    public void ponPrimero(Object ob){
        //movemos desde el final de la lista cada elemento a la derecha
        //para hacer hueco al nuevo elemento que irá el primero
        for(int i = lista.size()-1; i >= 0; i--){
            lista.insertElementAt(lista.get(i), i+1);           
        }
        lista.insertElementAt(ob, 0);
    }
    
    /**pone el elemento dado al final de la lista
     * 
     * @param ob 
     */
    public void ponUltimo(Object ob){
        lista.add(ob);
    }
    
    /**devuelve si esta vacía la lista o no
     * 
     * @return 
     */
    public boolean estaVacia(){
        return lista.isEmpty();
    }
    
    /**extrae el primer elemento de la lista
     * 
     * @return 
     */
    public Object extraePrimero(){
        Object ob = lista.get(0);
        lista.remove(0);
        return ob;
    }
    
    /**extrae el último elemento de la lista
     * 
     * @return 
     */
    public Object extraeUltimo(){
        Object ob = lista.get(lista.size()-1);
        lista.remove(lista.size()-1);
        return ob;
    }
    
    /**muestra todos los elementos de la lista
     * 
     */
    public void visualizaElementos(){
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i) + " ");
        }
    }
}
