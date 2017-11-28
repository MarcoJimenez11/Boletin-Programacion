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
public class Caracter {
    
    /**convierte un carácter en su valor númerico
     * 
     * @param c
     * @return 
     */
    public static int ordinal(char c){
        return((int) c);
    }
    
    /**Convierte un número en el equivalente a carácter según la tabla ascii
     * 
     * @param i
     * @return 
     */
    public static char ascii(int i){
        return((char) i);
    }
}
