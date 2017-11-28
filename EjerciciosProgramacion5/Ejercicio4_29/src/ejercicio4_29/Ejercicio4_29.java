/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_29;

/**
 *
 * @author Usuario DAM
 */
public class Ejercicio4_29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables
        int aleatorio = 0;
        
        //Bucle de 15 iteraciones para simular una quiniela
        for(int i = 0; i < 15; i++){
            //Creamos un aleatorio del 1 al 10 para simular los porcentajes del 50% 30% y 20% que tienen se salir 1, X o 2
            aleatorio =(int) (Math.random()*10)+1;
            
            //Comprobamos el aleatorio para mostrar la quiniela según los porcentajes dados
            //1 - 50%   X - 30%   2 - 20%
            if(aleatorio <= 5)
                System.out.println("#1 X 2");
            else if(aleatorio <= 8)
                System.out.println("1 #X 2");
            else
                System.out.println("1 X #2");
        }
        
        
    }
    
}
