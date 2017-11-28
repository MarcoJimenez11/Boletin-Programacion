/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_8;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM
 */
public class Ejercicio4_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables
        double lado1, lado2, lado3;
        double mayor, menor1, menor2;
        Scanner leer = new Scanner(System.in);
        
        //Lectura de 3 lados de un triángulo
        System.out.println("Introduce los 3 lados de un triángulo: ");
        lado1 = leer.nextDouble();
        lado2 = leer.nextDouble();
        lado3 = leer.nextDouble();
        
        //Comprobamos los lados obtenidos para saber cual es el mayor y cuales los menores para trabajar posteriormente
        if(lado1 > lado2){
            if(lado1 > lado3){
                mayor = lado1;
                menor1 = lado2;
                menor2 = lado3;
            }
            else{
                mayor = lado3;
                menor1 = lado1;
                menor2 = lado2;
            }
        }
        else{
            if(lado2 > lado3){
                mayor = lado2;
                menor1 = lado1;
                menor2 = lado3;
            }
            else{
                mayor = lado3;
                menor1 = lado1;
                menor2 = lado2;
            }
        }
        
        //Una vez tenemos al mayor y los menores, comprobamos si es un triángulo o no y si lo es, el tipo.
        if(mayor >= menor1 + menor2){
            System.out.println("No es un triángulo");
        }
        else if(Math.pow(mayor,2) == Math.pow(menor1,2) + Math.pow(menor2,2)){
            System.out.println("Es un triángulo rectángulo");
        }
        else if(Math.pow(mayor,2) > Math.pow(menor1,2) + Math.pow(menor2,2)){
            System.out.println("Es un triángulo obtusángulo");
        }
        else if(Math.pow(mayor,2) < Math.pow(menor1,2) + Math.pow(menor2,2)){
            System.out.println("Es un triángulo acutángulo");
        }
    }
    
}
