/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_11;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM
 */
public class Ejercicio4_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables
        int numero = 0;
        int factorial = 1;
        boolean noNatural = true;
        Scanner leer = new Scanner(System.in);
        
        //Bucle para pedir de teclado un número natural y evitar negativos
        while(noNatural){
            System.out.println("Introduce un número natural: ");
            numero = leer.nextInt();
            if(numero >= 0){
                noNatural = false;
            }    
        }
        
        //Bucle que va desde el número hasta cero sin incluirlo para multiplicar todos los números y obtener el factorial
        for(int i = numero; i > 0; i--){
                factorial = factorial * i;
        }
        
        //Salida del factorial del número dado
        System.out.println("El factorial de " + numero + " es " + factorial);
    }
    
}
