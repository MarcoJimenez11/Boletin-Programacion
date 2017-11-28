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
public class UrnaTrampa extends Urna{

    public UrnaTrampa(int bolasNeg, int bolasBlan) {
        super(bolasNeg, bolasBlan);
    }
    
    /**Sobreescritura del método de extraer bolas
     * donde hay un 0.2% de probabilidad cada vez
     * que se extraen bolas de que una de las que
     * queda dentro cambie de color
     * @return 
     */
    @Override
    public String extraerBolas(){
        String texto = "";
        int aleatorio = (int) (Math.random()*4)+1;
           if(bolasNegras +bolasBlancas >= 2){
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
               else if(bolasNegras >= 2){
                   bolasNegras--;
                   texto = "Se sacan dos bolas negras y se mete una negra";
               }
               else if(bolasBlancas >= 2){
                   bolasBlancas -= 2;
                   bolasNegras++;
                   texto = "Se sacan dos bolas blancas y se mete una negra";
               }
               else{
                   bolasNegras--;
                   texto = "Se sacan dos bolas de distinto color y se mete una blanca";
               }
           }
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
        
        //El aleatorio trampa simula el 0,2% de probabilidad que hay de que cambie
        //una bola de color, si trampa es 1 cambia, sino no
        int trampa = (int) (Math.random()*500)+1;
        //El aleatorio color sirve para elegir el tipo de bola que cambia de color
        int color = (int) (Math.random()*2)+1;
        //Si ocurre la trampa, y después si hay de ambos colores según el enunciado, se hace la trampa
        if(trampa == 1){
            if(bolasNegras > 0 && bolasBlancas > 0){
                if(color == 1){
                    bolasNegras++;
                    bolasBlancas--;
                    texto = texto + " ¡Ha sucedido una trampa! Una bola blanca se ha convertido en negra";
                }
                else{
                    bolasNegras--;
                    bolasBlancas++;
                    texto = texto + " ¡Ha sucedido una trampa! Una bola negra se ha convertido en blanca";
                }
            }
        }
        return texto;
    }
}
