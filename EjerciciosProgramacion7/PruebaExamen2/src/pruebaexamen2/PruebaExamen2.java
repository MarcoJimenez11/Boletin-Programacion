/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaexamen2;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM
 */
public class PruebaExamen2 {

    
    public static void main(String[] args) {
        int ciclo = 1, cicloMayor = 0;
        int numero1[] = new int[100], numero2[] = new int[100];
        int mayor[] = new int[100], menor[] = new int[100];
        int aux = 0;
        int n = 0;
        int a = -1;
        int tamanio = 0;
        
        Scanner leer = new Scanner(System.in);
        
        
        do{
            a++;
            do{
                System.out.println("Introduce dos números entre 0 y 10.000: ");
                numero1[a] = leer.nextInt();
                numero2[a] = leer.nextInt();
            }while(numero1[a] < -1 || numero1[a] > 10000 || numero2[a] < -1 || numero2[a] > 10000);
            if(numero1[a] > numero2[a]){
                mayor[a] = numero1[a];
                menor[a]= numero2[a];
            }else{
                mayor[a] = numero2[a];
                menor[a] = numero1[a];
            }
        }while(numero1[a] != -1 || numero2[a] != -1);
        
        
        
        for(int j = 0; j < numero1.length; j++){
            if(numero1[j] == -1)
                tamanio = j;
        }
        
        for(int x = 0; x < tamanio; x++){
            for(int i = menor[x]; i <= mayor[x]; i++){
            n = i;
            while(n != 1){
            ciclo++;
            
            if(n % 2 == 0)
                n = n/2;
            else
                n = (n*3)+1;
            }
            
            if(ciclo > cicloMayor)
                cicloMayor = ciclo;
            ciclo = 1;
            }
        
        System.out.println(menor[x] + " " + mayor[x] + " " + cicloMayor);
        cicloMayor = 0;
        }
        
        
        
        
        
    }
    
}
