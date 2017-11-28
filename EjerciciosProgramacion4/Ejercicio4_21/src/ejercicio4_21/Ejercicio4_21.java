/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_21;

/**
 *
 * @author Usuario DAM
 */
public class Ejercicio4_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("--------- LAS TABLAS DE MULTIPLICAR ----------");
        
        //Dos bucles anidados donde el para cada caso del primero se muestra el
        //resultado de multiplicarlo con los números del 1 al 10
        for(int i = 1; i <= 10; i++){
            System.out.println("TABLA DEL " + i);
            for(int j = 1; j <= 10; j++){
                System.out.println(i + " x " + j + " = " + i*j);
            }
        }
    }
    
}
