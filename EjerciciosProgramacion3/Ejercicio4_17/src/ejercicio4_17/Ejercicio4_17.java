/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_17;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM
 */
public class Ejercicio4_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables
        int numero = 0, numeroAnterior = 0;
        int mayor, menor;
        Scanner leer = new Scanner(System.in);
        
        //Lectura del primer número para ponerlo como el mayor y menor
        System.out.println("Introduce números para calcular el mayor y el menor, el '0' termina el bucle ");       
        numeroAnterior = leer.nextInt();
        mayor = numeroAnterior;
        menor = numeroAnterior;
        
        //Comenzamos el bucle para seguir pidiendo números
        do{         
            numero = leer.nextInt();
            
            //Determinamos si el siguiente número es mayor que el mayor hasta el momento y menor que el menor
            //mientras no sea cero ya que es el número que determina el fin del bucle
            if(numero != 0){
                if(numero > mayor)
                    mayor = numero;
                if(numero < menor)
                    menor = numero;
            }
        
        }while(numero != 0);
        
        //Salida del menor y el mayor de los números dados
        System.out.println("El menor de la lista es el " + menor + " y el mayor es el " + mayor);
    }
    
}
