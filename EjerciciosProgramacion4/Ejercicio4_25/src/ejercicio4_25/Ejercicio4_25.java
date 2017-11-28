/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_25;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM
 */
public class Ejercicio4_25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables
        int nota;
        double deficiente=0, suficiente=0, bien=0, notable=0, sobresaliente=0;
        double total;       
        Scanner leer = new Scanner(System.in);
        
        //Bucle para pedir varias notas de alumnos, el 0 lo termina
        //Dentro calculamos su calificación y aumentamos un contador correspondiente
        do{
            System.out.print("Introduce la nota del alumno (el 0 termina el bucle): ");

            nota = leer.nextInt();
            if(nota > 0){
                if(nota < 5)
                    deficiente++;
                else if(nota < 6)
                    suficiente++;
                else if(nota < 7)
                    bien++;
                else if(nota < 9)
                    notable++;
                else if(nota <= 10)
                    sobresaliente++;
                else
                    System.out.println("La nota introducida no está entre 0 y 10");
            }
        }
        while(nota != 0);
        
        //Calculamos el total de notas con la suma de todos los contadores
        total = deficiente + suficiente + bien + notable + sobresaliente;
        
        //Mostramos el porcentaje de alumnos con cada calificación
        System.out.println("Deficientes: " + deficiente + " (" + deficiente/total*100 + "%)");
        System.out.println("Suficientes: " + suficiente + " (" + suficiente/total*100 + "%)");
        System.out.println("Bienes: " + bien + " (" + bien/total*100 + "%)");
        System.out.println("Notables: " + notable + " (" + notable/total*100 + "%)");
        System.out.println("Sobresalientes: " + sobresaliente + " (" + sobresaliente/total*100 + "%)");
        
    }
    
}
