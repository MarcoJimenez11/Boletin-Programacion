/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_27;

/**
 *
 * @author Usuario DAM
 */
public class Ejercicio4_27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables
        int aleatorio = 0;
        int contador = 0;
        
        //Bucle de 100 iteraciones que crea un aleatorio del 1 al 6 
        // y aumenta un contador cada vez que sale seis para saber cuántas veces ha salido
        for(int i = 0; i < 100; i++){
            aleatorio =(int) (Math.random()*6)+1;
            if(aleatorio == 6)
                contador++;
        }
        
        //Salida de la cantidad de veces que ha salido 6
        System.out.println("El número 6 ha salido " + contador + " veces en 100 tiradas del dado");
    }
    
}
