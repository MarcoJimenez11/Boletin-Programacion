/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_23;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM
 */
public class Ejercicio4_23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables
        int mes = 1;
        Scanner leer = new Scanner(System.in);
        
        //Bucle que termina cuando le demos un 0 para usar el programa varias veces
        while(mes != 0){
            
            //Lectura del mes que queremos saber su nombre dado el número
            System.out.print("Introduce el número de mes (el 0 termina el programa): ");
            mes = leer.nextInt();

            //Switch que dado el mes según cada caso muestra en letra el nombre
            switch(mes){
                case 1:
                    System.out.println("Enero");
                    break;
                case 2:
                    System.out.println("Febrero");
                    break;
                case 3:
                    System.out.println("Marzo");
                    break;
                case 4:
                    System.out.println("Abril");
                    break;
                case 5:
                    System.out.println("Mayo");
                    break;
                case 6:
                    System.out.println("Junio");
                    break;
                case 7:
                    System.out.println("Julio");
                    break;
                case 8:
                    System.out.println("Agosto");
                    break;
                case 9:
                    System.out.println("Septiembre");
                    break;
                case 10:
                    System.out.println("Octubre");
                    break;
                case 11:
                    System.out.println("Noviembre");
                    break;
                case 12:
                    System.out.println("Diciembre");
                    break;
                case 0:
                    System.out.println("Saliste del programa");
                    break;
                
                default:
                    System.out.println("El número introducido no está entre 1 y 12");
                    break;
            }
        }
    }
    
}
