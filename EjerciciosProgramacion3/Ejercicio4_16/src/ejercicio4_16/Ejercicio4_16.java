/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_16;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM
 */
public class Ejercicio4_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables
        int tamanio;
        int mayor, menor;
        Scanner leer = new Scanner(System.in);
        
        //Lectura de la cantidad de números que vamos a introducir
        System.out.println("¿Cuántos números vas a introducir para calcular el menor y el mayor de ellos?");     
        tamanio = leer.nextInt();
        //Creamos un array para almacenarlos (innecesario pero bueno)
        int [] lista = new int[tamanio];
        
        //Lectura de cada número y lo almacenamos en el array
        System.out.println("Introduce uno a uno todos los números");
        for(int i = 0; i < tamanio; i++){
            lista[i] = leer.nextInt();
        }
        
        //Ponemos por defecto el menor y mayor el primer número
        menor = lista[0];
        mayor = lista[0];
        
        //Y recorremos el resto buscando un número mayor que el mayor y uno menor que el menor
        for(int i = 1; i < tamanio; i++){
            if(lista[i] > mayor)
                mayor = lista[i];
            if(lista[i] < menor)
                menor = lista[i];
        }
        
        //Salida del menor y el mayor de todos los números dados
        System.out.println("El menor de la lista es el " + menor + " y el mayor es el " + mayor);
    }
    
}
