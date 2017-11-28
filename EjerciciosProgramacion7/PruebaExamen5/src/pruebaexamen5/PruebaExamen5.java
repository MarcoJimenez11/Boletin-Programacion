/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaexamen5;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM
 */
public class PruebaExamen5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int saldo = 0;
        
        System.out.println("Introduce el saldo inicial: ");
        saldo = leer.nextInt();
        
        Casino casino = new Casino(saldo);
        
        for(int i=0; i < 100000; i++){
            casino.casiIguales();
        }
        
        System.out.println("Saldo tras 100.000 partidas al casi iguales: " + casino.getPuntos());
        
        for(int i=0; i < 100000; i++){
            casino.tresAlReves();
        }
        
        System.out.println("Saldo tras 100.000 partidas al por tres al revés: " + casino.getPuntos());
        
        for(int i=0; i < 400000; i++){
            casino.mezclandoJuegos();
        }
        
        System.out.println("Saldo tras 400.000 partidas al mezclando juegos: " + casino.getPuntos());
    }
    
}
