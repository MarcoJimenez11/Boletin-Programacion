/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaexamen6;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM
 */
public class PruebaExamen6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int pruebas = 0;
        int muros = 0;
        int anteriorAltura = 0, altura = 0;
        int subidas = 0, bajadas = 0;
        
        do{ 
        pruebas = leer.nextInt();
        }while(pruebas > 30 || pruebas < 0);
        for(int i = 0; i < pruebas; i++){
            do{
            muros = leer.nextInt();
            }while(muros < 0 || pruebas > 50);
            for(int j = 0; j < muros; j++){
                if(j == 0)
                    anteriorAltura = leer.nextInt();
                else{
                    altura = leer.nextInt();
                    if(altura > anteriorAltura){
                        subidas++;
                        anteriorAltura = altura;
                    }
                    else if(altura < anteriorAltura){
                        bajadas++;
                        anteriorAltura = altura;
                    }
                }  
            }
            System.out.println("Case " + i + ": " + subidas + " " + bajadas);
            subidas = 0;
            bajadas = 0;
        }
    }
    
}
