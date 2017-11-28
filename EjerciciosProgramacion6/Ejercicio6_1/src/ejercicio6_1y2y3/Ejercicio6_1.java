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
public class Ejercicio6_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista lista  = new Lista();
        
        //COMPROBACIONES DE LAS CLASES
        if(lista.estaVacia())
            System.out.println("Esta vacía");
        else
            System.out.println("No esta vacía");
        
        lista.visualizaElementos();
        
        lista.ponPrimero("1.- hola");
        lista.ponUltimo("2.- adios");
        lista.ponUltimo("3.- el delfín");
        lista.visualizaElementos();
        
        if(lista.estaVacia())
            System.out.println("Esta vacía");
        else
            System.out.println("No esta vacía");
        
        lista.extraeUltimo();
        lista.visualizaElementos(); 
        
        lista.extraePrimero();
        lista.visualizaElementos();
        
        
        //PILA
        System.out.println("--------------------------PILA---------------------------");
        
        Pila pila = new Pila();
        
        for(int i = 0; i <= 100; i++){
            pila.push(i);
        }
        
        pila.cima();
        pila.pop();
        pila.pop();
        pila.cima();
        
        //COLA
        System.out.println("--------------------------COLA---------------------------");
        
        Cola cola = new Cola();
        
        for(int i = 1; i <= 100; i++){
            cola.ponEnCola(i);
        }
        
        cola.frente();
        cola.extraeDeCola();
        cola.frente();
    }
    
}
