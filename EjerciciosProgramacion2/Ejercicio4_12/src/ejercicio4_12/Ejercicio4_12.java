/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_12;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM
 */
public class Ejercicio4_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        
        ESTE EJERCICIO PIDE ALGO YA HECHO EN EL ANTERIOR ASÍ QUE MANTUVE EL MISMO CÓDIGO      
        
        */
        int numero = 0;
        int factorial = 1;
        boolean noNatural = true;
        Scanner leer = new Scanner(System.in);
        
        while(noNatural){
            System.out.println("Introduce un número natural: ");

            numero = leer.nextInt();
            if(numero >= 0){
                noNatural = false;
            }
        
        }
        
        for(int i = numero; i > 0; i--){
                factorial = factorial * i;
        }
        
        System.out.println("El factorial de " + numero + " es " + factorial);
    }
    
}
