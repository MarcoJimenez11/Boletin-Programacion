/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_7;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM
 */
public class Ejercicio4_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables
        int numero1, numero2, numero3;
        int mayor;
        Scanner leer = new Scanner(System.in);
        
        //Lectura de tres números para saber cual es el mayor
        System.out.println("Introduce tres números: ");
        numero1 = leer.nextInt();
        numero2 = leer.nextInt();
        numero3 = leer.nextInt();
        
        //Comprobamos paso a paso cual es el mayor de los 3
        if(numero1 > numero2){
            if(numero1 > numero3)
                mayor = numero1;
            else
                mayor = numero3;
        }
        else{
            if(numero2 > numero3)
                mayor = numero2;
            else
                mayor = numero3;
        }
        
        //Salida del número mayor
        System.out.println("El mayor de esos números es el " + mayor);
    }
    
}
