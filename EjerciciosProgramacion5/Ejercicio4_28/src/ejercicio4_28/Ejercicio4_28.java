/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_28;

/**
 *
 * @author Usuario DAM
 */
public class Ejercicio4_28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables
        int dado1 = 0, dado2 = 0;
        int contador = 0;
        
        //Bucle de 100 iteraciones que crea dos aleatorios del 1 al 6 simulando dados
        //para aumentar un contador cada vez que al tirarlos ambos la suma de lo que
        //salen es igual a 10
        for(int i = 0; i < 100; i++){
            dado1 =(int) (Math.random()*6)+1;
            dado2 =(int) (Math.random()*6)+1;
            if(dado1+dado2 == 10)
                contador++;
        }
        
        //Salida de las veces que sale 10 en total al tirar dos dados
        System.out.println("Al tirar dos dados han salido entre los dos 10 un total de " + contador + " veces ");
    }
    
}
