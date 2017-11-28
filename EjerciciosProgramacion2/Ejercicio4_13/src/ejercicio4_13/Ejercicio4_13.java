/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_13;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM
 */
public class Ejercicio4_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables
        int num1, num2;
        int menor, mayor;
        int sumaTotal = 0, contador = 0;
        Scanner leer = new Scanner(System.in);
        
        //Lectura de teclado de dos números
        System.out.println("Introduce dos números: ");
        num1 = leer.nextInt();
        num2 = leer.nextInt();

        //Determinar el mayor y el menor para trabajar con el bucle siguiente
        if(num1 > num2){
            menor = num2;
            mayor = num1;
        }
        else{
            mayor = num2;
            menor = num1;
        }
        
        //Con este bucle contamos cuántos números pares hay entre ambos números y la suma total de ellos
        for(int i = menor; i <= mayor; i++){
            if(i % 2 == 0){
                contador++;
                System.out.print(i + " ");
                sumaTotal += i;
            }
        }
        
        //Salida de los números pares que hay entre ambos números y la suma total de ellos
        System.out.println("Son en total " + contador + " números pares, y su suma es " + sumaTotal);
    }
    
}
