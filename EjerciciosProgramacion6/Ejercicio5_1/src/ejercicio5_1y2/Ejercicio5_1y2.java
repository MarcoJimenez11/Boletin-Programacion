/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_1y2;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM
 */
public class Ejercicio5_1y2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables
        int bolasN = 0, bolasB = 0;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Introduce bolas blancas en la urna: ");
        bolasB =leer.nextInt();
        
        System.out.println("Introduce bolas negras en la urna: ");
        bolasN =leer.nextInt();
        
        //Creamos la urna con las bolas dadas
        Urna urna = new Urna(bolasN, bolasB);
        
        //Extrae bolas hasta que esté vacía
        while(urna.estaVacio() == false){
            System.out.println(urna.extraerBolas());
            System.out.println("Bolas negras: " + urna.getBolasNegras() + " Bolas blancas: " + urna.getBolasBlancas());
        }
        
        System.out.println("Introduce bolas blancas en la urna trampa: ");
        bolasB = leer.nextInt();
        
        System.out.println("Introduce bolas negras en la urna trampa: ");
        bolasN = leer.nextInt();
        
        //Creamos la urna trampa
        Urna urnaTrampa = new UrnaTrampa(bolasN, bolasB);
        
        //Sacamos de ella hasta que esté vacía
        while(urnaTrampa.estaVacio() == false){
            System.out.println(urnaTrampa.extraerBolas());
            System.out.println("Bolas negras: " + urnaTrampa.getBolasNegras() + " Bolas blancas: " + urnaTrampa.getBolasBlancas());
        }
    }
    
}
