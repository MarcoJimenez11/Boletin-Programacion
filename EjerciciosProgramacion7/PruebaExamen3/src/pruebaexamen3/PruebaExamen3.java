/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaexamen3;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM
 */
public class PruebaExamen3 {

    public static int procrear(int parejas){
        if(parejas > 1){
            return procrear(parejas-1) + procrear(parejas-2);
        }
        else if(parejas == 1){
            return 1;
        }
        else{
            return 0;
        }
    }
    
    public static void main(String[] args) {
        int meses = 0;
        int resultado = 0;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Introduce los meses transcurridos: ");
        
        meses = leer.nextInt();
        
        resultado = procrear(meses);
        System.out.println("Hay " + resultado + " parejas de conejos");
        
        
    }
    
}
