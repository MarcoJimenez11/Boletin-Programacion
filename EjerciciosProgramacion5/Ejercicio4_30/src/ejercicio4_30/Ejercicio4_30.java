/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_30;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM
 */
public class Ejercicio4_30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables
        //Creamos un aleatorio del 1 al 100 para que el usuario intente adivinarlo
        int aleatorio = (int) (Math.random()*100)+1;
        int numero = 0;
        //Establecemos el número de intentos a 5
        int intentos = 5;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Adivina el número que estoy pensando entre 1 y 100 ");
        
        //Comienza el bucle que terminará cuando se acaben los intentos, establecidos en 5 en la declaración de variables
        do{
            //Lectura del número para intentar adivinar el pensado por la máquina
            numero = leer.nextInt();

            //Si acertamos mostramos que hemos ganado y salimos del bucle al poner los intentos a -1
            //Si no acertamos decrece el número de intentos 
            //y mostramos si el número a adivinar es mayor o menor que el dado por teclado
            if(numero == aleatorio){
                System.out.println("Si, acertaste! Era el " + aleatorio + " !!!");
                intentos = -1;
            }
            else{
                intentos--;
                if(numero < aleatorio)
                    System.out.println("El número que estoy pensando es mayor que el que has dicho. Te quedan " + intentos + " intentos");
                else
                    System.out.println("El número que estoy pensando es menor que el que has dicho. Te quedan " + intentos + " intentos");
            }
        
        }while(intentos > 0);
        
        //Si se sale del bucle siendo intentos 0 se acabaron los intentos
        //Y el usuario no ha acertado así que mostramos el fallo
        //(Si hubieramos acertado intentos sería -1)
        if(intentos == 0)
            System.out.println("Fallaste! El número era " + aleatorio);
    }
    
}
