/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_9;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM
 */
public class Ejercicio4_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables
        int num1, num2;
        int menor, mayor;
        int suma = 0;
        Scanner leer = new Scanner(System.in);
        
        //Lectura de dos números para saber los comprendidos entre ellos
        System.out.println("Introduce dos números ");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        //Determinamos el mayor y el menor para trabajar con el bucle
        if(num1 > num2){
            menor = num2;
            mayor = num1;
        }
        else{
            mayor = num2;
            menor = num1;
        }
        
        //Una vez tenemos el mayor y el menor podemos crear un bucle para ir sumando los números comprendidos entre ambos
        for(int i = menor; i <= mayor; i++){
            suma = suma + i;
        }
        
        //Salida de la suma de los números entre ambos dados
        System.out.println("La suma de los números comprendidos entre " + menor + " y " + mayor + " es de " + suma);
    }
    
}
