/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_1y2;

/**
 *
 * @author Usuario DAM
 */
public class Urna {
    //Declaración de atributos de clase, número de bolas negras y blancas en la urna
    protected int bolasNegras = 0;
    protected int bolasBlancas = 0;
    
    /**Constructor
     * Damos un número de bolas negras y blancas a la urna
     * @param bolasNeg
     * @param bolasBlan 
     */
    public Urna(int bolasNeg, int bolasBlan){
        bolasNegras = bolasNeg;
        bolasBlancas = bolasBlan;
    }
    
    /**método para saber si la urna esta vacía o no
     * 
     * @return 
     */
    public boolean estaVacio(){
        if(bolasNegras == 0 && bolasBlancas == 0)
            return true;
        else
            return false;
    }
    
    /**método para saber cuántas bolas negras hay en la urna
     * 
     * @return 
     */
    public int getBolasNegras(){
        return bolasNegras;
    }
    
    /**método para saber cuántas bolas blancas hay en la urna
     * 
     * @return 
     */
    public int getBolasBlancas(){
        return bolasBlancas;
    }
    
    /**Método que simula la extracción de dos bolas aleatorias
       a su vez mete una bola negra si ambas son del mismo color
       si por el contrario son de distinto color, mete una bola blanca
     * 
     * @return 
     */
    public String extraerBolas(){
        String texto = "";
        //aleatorio de 1 a 4 para los 4 casos posibles(N N, N B, B N, B B)
        int aleatorio = (int) (Math.random()*4)+1;
        
        //Comprobamos si hay dos o más bolas para sacar
        if(bolasNegras + bolasBlancas >= 2){
            //Comprobamos si a su vez hay dos o más bolas de cada color
            if(bolasNegras >= 2 && bolasBlancas >= 2){
               switch(aleatorio){
                   case 1:
                       bolasNegras--;
                       texto = "Se sacan dos bolas negras y se mete una negra";
                       break;
                   case 2:
                       bolasBlancas -= 2;
                       bolasNegras++;
                       texto = "Se sacan dos bolas blancas y se mete una negra";
                       break;
                   case 3:
                       bolasNegras--;
                       texto = "Se sacan dos bolas de distinto color y se mete una blanca";
                       break;
                   case 4:
                       bolasNegras--;
                       texto = "Se sacan dos bolas de distinto color y se mete una blanca";
                       break;
               }
           }
            //Si no hay dos o más de cada, entonces si hay dos o más negras las saca y mete una
           else if(bolasNegras >= 2){
               bolasNegras--;
               texto = "Se sacan dos bolas negras y se mete una negra";
           }//Si no y son las blancas las que hay dos o más las saca y mete una negra
           else if(bolasBlancas >= 2){
               bolasBlancas -= 2;
               bolasNegras++;
               texto = "Se sacan dos bolas blancas y se mete una negra";
           }//y si no entonces es que hay una de cada, las saca y mete una blanca
           else{
               bolasNegras--;
               texto = "Se sacan dos bolas de distinto color y se mete una blanca";
           }
       }//Si no hay 2 o más en total entonces solo queda una, comprueba su color y la saca
       else if(bolasNegras == 1){
           bolasNegras--;
           texto = "Se saca la última bola que es negra";
       }
       else if(bolasBlancas == 1){
           bolasBlancas--;
           texto = "Se saca la última bola que es blanca";
       }
       else{
           texto = "No quedan bolas";
       }
       return texto;
    }
}