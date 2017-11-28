/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6_1y2y3;

/**
 *
 * @author Usuario DAM
 */
public class Pila {
    private Lista pila = new Lista();
    
    /**Constructor
     * 
     */
    public Pila(){
        pila = new Lista();
    }
    
    /**extrae el último elemento de la pila
     * 
     * @return 
     */
    public Object pop(){
        return pila.extraeUltimo();
    }
    
    /**pone el objeto dado al final de la pila
     * 
     * @param ob 
     */
    public void push(Object ob){
        pila.ponUltimo(ob);
    }
    
    /**devuelve si está vacía la pila o no
     * 
     * @return 
     */
    public boolean vacia(){
        return pila.estaVacia();
    }
    
    /**muestra el último elemento de la pila sin extraerlo
     * 
     */
    public void cima(){
        Object objeto = pila.extraeUltimo();
        System.out.println(objeto);
        pila.ponUltimo(objeto);
    }
}
