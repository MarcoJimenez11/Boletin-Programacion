/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_4;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM
 */
public class Ejercicio4_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaración de variables
        int numero;
        Scanner leer = new Scanner(System.in);
        
        //Lectura del número que queremos saber si es negativo o positivo
        System.out.println("Introduce un número: ");
        numero = leer.nextInt();
        
        //Condicional que determmina si el numero es mayor o igual que 0 para decir que es positivo o sino es negativo
        if(numero >= 0)
            System.out.println("El número es positivo");
        else
            System.out.println("El número es negativo");
    }
    
}
