/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_6;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM
 */
public class Ejercicio4_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables
        int numero1, numero2;
        Scanner leer = new Scanner(System.in);
        
        //Lectura de dos números para saber si alguno de ellos divide de manera entera al otro
        System.out.println("Introduce un número: ");
        numero1 = leer.nextInt();
        System.out.println("Introduce otro número: ");
        numero2 = leer.nextInt();
        
        //Condicional que determina si al dividir un número con el otro el resto da cero es que si se dividen de manera entera
        if(numero1 % numero2 == 0 || numero2 % numero1 == 0)
            System.out.println("Uno de esos números divide enteramente al otro");
        else
            System.out.println("Ninguno de esos números divide enteramente al otro");
    }
    
}
