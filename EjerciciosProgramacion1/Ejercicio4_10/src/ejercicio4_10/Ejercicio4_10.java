/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_10;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM
 */
public class Ejercicio4_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables
        int numero = 0;
        int sumaTotal = 0;
        boolean noNatural = true;
        Scanner leer = new Scanner(System.in);
        
        //Bucle para pedir un número natural desde teclado para evitar números negativos
        while(noNatural){
            System.out.println("Introduce un número natural: ");
            numero = leer.nextInt();
            if(numero >= 0){
                noNatural = false;
            }       
        }
        
        //Bucle que comienza en el número dado y hasta cero suma todos los números pares que hay
        for(int i = numero; i > 0; i--){
            if(i % 2 == 0)
                sumaTotal += i;
        }
        
        //Salida de la suma de los números pares comprendidos entre 0 y el número dado
        System.out.println("La suma de los números naturales pares inferiores total es de " + sumaTotal);
    }
    
}
