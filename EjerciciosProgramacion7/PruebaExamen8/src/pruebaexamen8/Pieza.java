/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaexamen8;

/**
 *
 * @author Usuario DAM
 */
public class Pieza {
    private TipoPieza tipo = TipoPieza.PEON;
    private boolean esNegra = false;
    
    public Pieza(TipoPieza tipo, boolean esNegra){
        this.tipo = tipo;
        this.esNegra = esNegra;
    }
    
    public TipoPieza getTipo(){
        return tipo;
    }
    
    public boolean esNegra(){
        return esNegra;
    }
}
