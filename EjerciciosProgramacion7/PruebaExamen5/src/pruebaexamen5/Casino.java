/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaexamen5;

/**
 *
 * @author Usuario DAM
 */
public class Casino {
    private int puntos = 0;
    
    public Casino(int dinero){
        puntos = dinero;
    }
    
    public int getPuntos(){
        return puntos;
    }
    
    public void casiIguales(){
        int aleatorio = (int) (Math.random()*1000)+1;
        
        if(aleatorio <= 495)
            puntos++;
        else
            puntos--;
    }
    
    public void tresAlReves(){
        if(puntos % 3 == 0){
            int aleatorio = (int) (Math.random()*1000)+1;
            if(aleatorio <= 95)
                puntos++;
            else
                puntos--;
        }
        else{
            int aleatorio = (int) (Math.random()*1000)+1;
            if(aleatorio <= 755)
                puntos++;
            else
                puntos--;
        }
    }
    
    public void mezclandoJuegos(){
        this.casiIguales();
        this.casiIguales();
        this.tresAlReves();
        this.tresAlReves();
    }
}
