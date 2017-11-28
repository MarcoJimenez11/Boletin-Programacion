/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6_4y5;

/**
 *
 * @author Usuario DAM
 */
public class Ejercicio6_4y5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        Cadena cadena = new Cadena("¡Texto de prueba! @#€|¬");
        
        //COMPROBACIONES
        cadena.visualizaCadena();
        
        cadena.invierteCadena();
        cadena.visualizaCadena();
        
        cadena.invierteCadena();
        cadena.visualizaCadena();
        
        cadena.encriptaCadena();
        cadena.visualizaCadena();
        
        cadena.desencriptaCadena();
        cadena.visualizaCadena();
    }
    
}
