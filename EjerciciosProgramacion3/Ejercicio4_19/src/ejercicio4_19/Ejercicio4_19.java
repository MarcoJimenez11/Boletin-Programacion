/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_19;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM
 */
public class Ejercicio4_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables
        int numero = 0;
        int positivos = 0, negativos = 0;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Introduce números para contar cuántos positivos y negativos hay, el '0' termina el bucle ");
        
        //Bucle para pedir números hasta poner un 0
        do{
            //Lectura del número
            numero = leer.nextInt();
            
            //Si el número es mayor que cero la cantidad de positivos aumenta y sino la de negativos aumenta
            //El 0 no cuenta porque es el que termina el bucle
            if(numero != 0){
                if(numero > 0)
                    positivos++;
                else
                    negativos++;
            }
        
        }while(numero != 0);
        
        //Salida de la cantidad de positivos y negativos de todos los números dados
        System.out.println("Hay un total de " + positivos + " números positivos y " + negativos + " números negativos");
    }
    
}
