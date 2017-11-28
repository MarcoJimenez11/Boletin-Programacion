/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_26;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM
 */
public class Ejercicio4_26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables
        int numero = 0;
        int moneda = 0;
        Scanner leer = new Scanner(System.in);
        
        //Bucle para tirar una moneda varias veces
        do{
            System.out.println("Introduce un número distinto a 0 para tirar una moneda o 0 para salir: ");
            numero = leer.nextInt();
            
            if(numero != 0){
                //Creamos un aleatorio entre 1 y 2
                moneda = (int) (Math.random()*2)+1;
                //Si el aleatorio es uno muestra cara, sino muestra cruz
                if(moneda == 1)
                    System.out.println("Ha salido cara");
                else
                    System.out.println("ha salido cruz");
            }
        }while(numero != 0);
    }
    
}
