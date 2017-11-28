/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaexamen;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM
 */
public class PruebaExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena1, cadena2;
        String mayor, menor;
        int coincide = 0;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Introduce dos cadenas de caracteres: ");
        
        cadena1 = leer.nextLine();
        cadena2 = leer.nextLine();
        
        if(cadena1.length() > cadena2.length()){
            mayor = cadena1;
            menor = cadena2;
        }
        else{
            mayor = cadena2;
            menor = cadena1;
        }
        
        for(int i = 0; i < mayor.length(); i++){
            if(menor.charAt(0) == mayor.charAt(i) && coincide != menor.length()){
                for(int j = 0; j < menor.length(); j++){
                    if((i+j)< mayor.length()  && menor.charAt(j) == mayor.charAt(i+j))
                        coincide++;
                }
            }
                
        }
        
        if(coincide == menor.length())
            System.out.println("Una de las cadenas dadas es subcadena de la otra");
        else
            System.out.println("Ninguna de las cadenas es subcadena de la otra");
                
        
        
    }
    
}
