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
public class Cola {
    private Lista cola = new Lista();
    
    /**Constructor
     * 
     */
    public Cola(){
        cola = new Lista();
    }
    
    /**método para extraer el primer elemento de la cola
     * 
     */
    public void extraeDeCola(){
        cola.extraePrimero();
    }
    
    /**método para poner en la cola un elemento, que se pone al final
     * 
     * @param ob 
     */
    public void ponEnCola(Object ob){
        cola.ponUltimo(ob);
    }
    
    /**método que devuelve si la cola esta vacía o no
     * 
     * @return 
     */
    public boolean vacia(){
        return cola.estaVacia();
    }
    
    /**método que devuelve el primer elemento de la cola, sin extraerlo
     * 
     */
    public void frente(){
        Object ob = cola.extraePrimero();
        System.out.println(ob);
        cola.ponPrimero(ob);
    }
}
