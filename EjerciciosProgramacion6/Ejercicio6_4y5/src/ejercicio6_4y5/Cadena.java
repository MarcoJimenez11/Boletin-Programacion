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
public class Cadena {
    private String cadena = "";
    
    /**Constructor
     * 
     * @param cadena 
     */
    public Cadena(String cadena){
        this.cadena = cadena;
    }
    
    /**invierte los elementos de la cadena
     * 
     */
    public void invierteCadena(){
        String invertida = "";
        for(int i = cadena.length()-1; i >= 0; i--){
            invertida += cadena.charAt(i);
        }
        cadena = invertida;
    }
    
    /**transforma la cadena en una nueva según un encriptado determinado
     * en este caso se le añade 11 al valor numérico de cada letra de la cadena
     * 
     */
    public void encriptaCadena(){
        String encriptada = "";
        char letra;
        for(int i = 0; i < cadena.length(); i++){    
            letra = cadena.charAt(i);
            encriptada += Caracter.ascii(Caracter.ordinal(letra)+11);
        }
        cadena = encriptada;
    }
    
    /**desencripta la cadena según el mismo procedimiento seguido para 
     * encriptarla, en este caso se le resta 11 para volver al valor original
     * 
     */
    public void desencriptaCadena(){
        String desencriptada = "";
        char letra;
        for(int i = 0; i < cadena.length(); i++){    
            letra = cadena.charAt(i);
            desencriptada += Caracter.ascii(Caracter.ordinal(letra)-11);
        }
        cadena = desencriptada;
    }
    
    /**Visualiza la cadena
     * 
     */
    public void visualizaCadena(){
        System.out.println(cadena);
    }
}
