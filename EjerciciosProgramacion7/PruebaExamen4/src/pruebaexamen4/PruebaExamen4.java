/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaexamen4;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM
 */
public class PruebaExamen4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 0;
        int sumaTotal = 0, sumaAux = 0;
        int contador = 0;
        boolean esMagico = true;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Introduce el valor n: ");
        
        n = leer.nextInt();
        
        
        int [][]matriz = new int[n][n];
        
        System.out.println("Introduce los valores de la matriz: ");
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++)
                matriz[i][j] = leer.nextInt();
        }
        
        for(int j = 0; j < n; j++){
            sumaTotal += matriz[0][j];
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                sumaAux += matriz[i][j];
            }
            if(sumaTotal != sumaAux)
                esMagico = false;

            sumaAux = 0;
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                sumaAux += matriz[j][i];
            }
            if(sumaTotal != sumaAux)
                esMagico = false; 

            sumaAux = 0;
        }
        for(int i = 0; i < n; i++){
            sumaAux += matriz[i][i];
        }
            if(sumaTotal != sumaAux)
                esMagico = false;

            sumaAux = 0;


        for(int i = 0; i < n; i++){
            sumaAux += matriz[n-i-1][i];
        }
            if(sumaTotal != sumaAux)
                esMagico = false;

            sumaAux = 0;


        if(esMagico)
            System.out.println("Es mágico, y la constante mágica es " + sumaTotal);
        else
            System.out.println("No es mágico");
    }
    
}
