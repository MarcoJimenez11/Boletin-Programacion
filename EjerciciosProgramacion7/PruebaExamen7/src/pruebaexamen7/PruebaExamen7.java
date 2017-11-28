/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaexamen7;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM
 */
public class PruebaExamen7 {

    public static TipoBool compruebaAnd(TipoBool caso1, TipoBool caso2){
        TipoBool resultado = TipoBool.FALSO;
         if(caso1 == TipoBool.FALSO){
             resultado = TipoBool.FALSO;
         }
         else if(caso1 == TipoBool.TALVEZ){
             if(caso2 == TipoBool.FALSO)
                 resultado = TipoBool.FALSO;
             else
                 resultado = TipoBool.TALVEZ;
         }
         else if(caso1 == TipoBool.CIERTO){
             if(caso2 == TipoBool.FALSO)
                 resultado = TipoBool.FALSO;
             else if (caso2 == TipoBool.TALVEZ)
                 resultado = TipoBool.TALVEZ;
             else
                 resultado = TipoBool.CIERTO;
         }
         
         return resultado;
    }
    
    public static TipoBool compruebaOr(TipoBool caso1, TipoBool caso2){
        TipoBool resultado = TipoBool.FALSO;
         if(caso1 == TipoBool.FALSO){
             if(caso2 == TipoBool.FALSO)
                 resultado = TipoBool.FALSO;
             else if (caso2 == TipoBool.TALVEZ)
                 resultado = TipoBool.TALVEZ;
             else
                 resultado = TipoBool.CIERTO;
         }
         else if(caso1 == TipoBool.TALVEZ){
             if(caso2 == TipoBool.FALSO || caso2 == TipoBool.TALVEZ)
                 resultado = TipoBool.TALVEZ;
             else
                 resultado = TipoBool.CIERTO;
         }
         else if(caso1 == TipoBool.CIERTO){
             resultado = TipoBool.CIERTO;
         }
         
         return resultado;
    }
    
    public static TipoBool negacion(TipoBool caso){
        TipoBool resultado = TipoBool.FALSO;
        
        if(caso == TipoBool.FALSO)
            resultado = TipoBool.CIERTO;
        else if(caso == TipoBool.TALVEZ)
            resultado = TipoBool.TALVEZ;
        else
            resultado = TipoBool.FALSO;
        
        return resultado;                  
    }
            
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        TipoBool prueba1 = TipoBool.CIERTO;      
        TipoBool prueba2 = TipoBool.FALSO;
        int boton = 1;
        
        do{
            System.out.println("1 cierto 2 tal vez 3 falso");
            boton = leer.nextInt();
            if(boton == 1)
                prueba1 = TipoBool.CIERTO;
            if(boton == 2)
                prueba1 = TipoBool.TALVEZ;
            if(boton == 3)
                prueba1 = TipoBool.FALSO;
            
            System.out.println("1 cierto 2 tal vez 3 falso");
            boton = leer.nextInt();
            if(boton == 1)
                prueba2 = TipoBool.CIERTO;
            if(boton == 2)
                prueba2 = TipoBool.TALVEZ;
            if(boton == 3)
                prueba2 = TipoBool.FALSO;
            
            System.out.println("1 and 2 or 3 negación 0 salir");
            boton = leer.nextInt();
            
            if(boton == 1)
                System.out.println(compruebaAnd(prueba1, prueba2));
            if(boton == 2)
                System.out.println(compruebaOr(prueba1, prueba2));
            if(boton == 3)
                System.out.println(negacion(prueba1));
            
        }while(boton != 0);
    }
    
}
