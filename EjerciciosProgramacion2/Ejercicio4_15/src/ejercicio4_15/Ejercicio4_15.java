/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_15;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM
 */
public class Ejercicio4_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables
        int num1, num2;
        int menor, mayor;
        boolean ahoraSi = true;
        Scanner leer = new Scanner(System.in);
        
        //Lectura de dos números
        System.out.println("Introduce dos números: ");
        num1 = leer.nextInt();
        num2 = leer.nextInt();

        //Determinamos el mayor y menor para el bucle siguiente
        if(num1 > num2){
            menor = num2;
            mayor = num1;
        }
        else{
            mayor = num2;
            menor = num1;
        }
        
        System.out.println("Los números impares mostrados alternativamente entre " + menor + " y " + mayor + " son: ");
        
        //Bucle que va del menor al mayor mostrando alternativamente los números impares
        for(int i = menor; i <= mayor; i++){
            if(i % 3 == 0){                
                if(ahoraSi){
                    System.out.print(i + " ");
                    ahoraSi = false;
                }
                else
                    ahoraSi = true;
            }
        }
        
        
    }
    
}
