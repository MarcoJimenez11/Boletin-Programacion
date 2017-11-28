/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_22;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM
 */
public class Ejercicio4_22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables
        int numero;
        boolean esPrimo = true;
        Scanner leer = new Scanner(System.in);
        
        //Lectura de un número
        System.out.println("Introduce un número: ");       
        numero = leer.nextInt();
        
        //Bucle desde 2 hasta el número para calcular si alguno de estos 
        //divide de forma entera al número y por lo tanto el número no es primo
        for(int i = 2; i < numero; i++){
            if(numero % i == 0){
                i=numero;
                esPrimo = false;
            }               
        }
        
        //Mostramos si el número dado es primo o no
        if(esPrimo)
            System.out.println("El número introducido es primo");
        else
            System.out.println("El número introducido no es primo");
        
    }
    
}
