/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_14;

/**
 *
 * @author Usuario DAM
 */
public class Ejercicio4_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables
        int aux;
        
        //Bucle de 100 iteraciones para mostrar Hola y Adiós
        for(int i = 0; i < 100; i++){
            //Cambiamos la variable auxiliar en cada iteración para mostrar alternativamente Hola y Adiós
            if(i % 2 == 0)
                aux = 0;
            else
                aux = 1;
            
            //Mostramos el número de mensajes para mayor comodidad al comprobar el resultado
            System.out.print(i+1);
            
            //Con el switch que pide el ejercicio comprobamos la variable auxiliar para mostrar el mensaje alternativamente
            switch(aux){
                case 0:
                    System.out.println(".Hola");
                    break;
                
                case 1:
                    System.out.println(".Adiós");
                    break;
            }
        }
    }   
}
