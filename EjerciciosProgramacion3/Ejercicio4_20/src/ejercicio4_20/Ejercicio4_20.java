/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_20;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM
 */
public class Ejercicio4_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables
        double numero = 0;
        int contador = 0;
        double sumaTotal = 0;
        double media;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Introduce números para hacer su media aritmética, el '0' termina el bucle ");
        
        //Bucle para pedir números y mientras no sean 0, sumarlos a un total y a la vez contar cuántos números hay
        do{         
            numero = leer.nextInt();          
            if(numero != 0){
                sumaTotal += numero;
                contador++;
            }     
        }while(numero != 0);
        
        //Calculamos la media con la suma total y la cantidad de números calculados anteriormente en el bucle
        media = sumaTotal/contador;
        
        //Salida de la media
        System.out.println("La media aritmética es de " + media);
    }
    
}
