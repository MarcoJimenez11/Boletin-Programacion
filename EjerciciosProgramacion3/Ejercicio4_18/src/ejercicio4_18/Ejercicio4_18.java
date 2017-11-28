/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_18;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM
 */
public class Ejercicio4_18 {
    
    //Método estático para calcular el factorial
    public static int Factorial(int numero){
        int factorial = 1;
        
        for(int i = numero; i > 0; i--){
                factorial = factorial * i;
        }
        
        return factorial;
    }
    
    
    public static void main(String[] args) {
        //Declaración de variables
        int numA, numB;
        int resultado;
        Scanner leer = new Scanner(System.in);
        
        //Lectura de dos números
        System.out.println("Introduce dos números para calcular su combinatorio");       
        numA = leer.nextInt();
        numB = leer.nextInt();
        
        //Cálculo del combinatorio de ambos números usando la función factorial creada anteriormente
        resultado = Factorial(numA) / (Factorial(numB) * Factorial(numA-numB));
        
        //Salida del resultado
        System.out.println("Número combinatorio desde " + numA + " hasta " + numB + " es de " + resultado);
    }
    
}
