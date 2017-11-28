/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_1;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Usuario DAM
 */
public class Ejercicio41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables
        Scanner leer = new Scanner(System.in);
        double cateto1;
        double cateto2;
        double hipotenusa;
        
        //Lectura de teclado de los catetos del triángulo
        System.out.println("Introduce el valor de los catetos de un triángulo rectángulo");
        System.out.print("Cateto 1: ");
        cateto1 = leer.nextDouble();
        System.out.print("Cateto 2: ");
        cateto2 = leer.nextDouble();
        
        //Operación matemática que calcula la hipotenusa (raíz cuadrada de los catetos al cuadrado)
        hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        
        //Salida por pantalla de la hipotenusa
        System.out.println("La hipotenusa vale " + hipotenusa);
    }
    
}
