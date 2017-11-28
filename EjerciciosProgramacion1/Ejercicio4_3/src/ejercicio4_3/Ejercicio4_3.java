/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_3;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM
 */
public class Ejercicio4_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables
        double lado1, lado2, lado3;
        double perimetro;
        double area;
        Scanner leer = new Scanner(System.in);
        
        //Lectura de los lados de un triángulo
        System.out.println("Para saber el área de un triángulo introduce sus lados");
        System.out.println("Lado 1: ");
        lado1 = leer.nextDouble();
        System.out.println("Lado 2: ");
        lado2 = leer.nextDouble();
        System.out.println("Lado 3: ");
        lado3 = leer.nextDouble();
        
        //Cálculo del perímetro del triángulo, que es la suma de los lados dividido entre 2
        perimetro = (lado1 + lado2 + lado3) / 2;
        
        //Cálculo del área del triángulo
        area = Math.sqrt(perimetro * (perimetro - lado1) * (perimetro - lado2) * (perimetro - lado3));
        
        //Salida por pantalla del resultado del área del triángulo
        System.out.println("El área del triángulo dado es de " + area);
        
    }
    
}
