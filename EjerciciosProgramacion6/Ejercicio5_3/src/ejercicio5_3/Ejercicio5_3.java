/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_3;


import java.util.Scanner;

/**
 *
 * @author Usuario DAM
 */
public class Ejercicio5_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 0;
        int num2 = 0;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Factorial: ");
        numero = leer.nextInt();
        System.out.println("Factorial de " + numero + " = " + Mate.factorial(numero));
        
        System.out.println("Primo: ");
        numero = leer.nextInt();
        
        if(Mate.primo(numero))
            System.out.println("El número " + numero + " es primo");
        else
            System.out.println("El número " + numero + " no es primo");
        
        
        System.out.println("Perfecto: ");
        numero = leer.nextInt();
        
        if(Mate.perfecto(numero))
            System.out.println("El número " + numero + " es perfecto");
        else
            System.out.println("El número " + numero + " no es perfecto");
        
        System.out.println("Amigos: ");
        numero = leer.nextInt();
        num2 = leer.nextInt();
        
        if(Mate.amigos(numero, num2))
            System.out.println("Los números " + numero + " y " + num2 + " son amigos");
        else
            System.out.println("Los números " + numero + " y " + num2 + " no son amigos");
        
        System.out.println("Primos: ");
        numero = leer.nextInt();
        num2 = leer.nextInt();
        
        if(Mate.primos(numero, num2))
            System.out.println("Los números " + numero + " y " + num2 + " son primos entre ellos");
        else
            System.out.println("Los números " + numero + " y " + num2 + " no son primos entre ellos");
        
        System.out.println("Máximo común divisor: ");
        numero = leer.nextInt();
        num2 = leer.nextInt();
        System.out.println("El máximo común divisor de " + numero + " y " + num2 + " es " + Mate.maxComunDivisor(numero, num2));
        
        System.out.println("Potencia: ");
        numero = leer.nextInt();
        num2 = leer.nextInt();
        System.out.println("El número " + numero + " elevado a " + num2 + " es " + Mate.potencia(numero, num2));
        
    }
    
}
