/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_5;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM
 */
public class Ejercicio4_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables
        int numero;
        Scanner leer = new Scanner(System.in);
        
        //Lectura del número que queremos saber si es par o impar
        System.out.println("Introduce un número: ");
        numero = leer.nextInt();
        
        //Condicional que determina si el número al dividirlo por 2 el resto es 0 es par, o sino es impar
        if(numero % 2 == 0)
            System.out.println("El número es par");
        else
            System.out.println("El número es impar");
    }
    
}
