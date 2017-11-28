/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaexamen8;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM
 */
public class PruebaExamen8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pieza tablero[][] = new Pieza[8][8];
        Scanner leer = new Scanner(System.in);
        int color = -1;
        int tipo = 0;
        int piezasNegras[] = new int[6];
        int totalNegras = 0;
        int piezasBlancas[] = new int[6];
        int totalBlancas = 0;
        int x,y;
        
        while(color != 0){
            System.out.println("Elige coordenadas: ");
            x = leer.nextInt();
            y = leer.nextInt();

            System.out.println("Qué ficha quieres poner en la casilla " + x + " " + y);
            System.out.println("1 negra 2 blanca 0 salir bucle");
            color = leer.nextInt();
            System.out.println("1 rey 2 reina 3 torre 4 caballo 5 alfil 6 peón");
            tipo = leer.nextInt();

            if(color == 1){
                switch (tipo){
                    case 1:
                        tablero[x][y] = new Pieza(TipoPieza.REY, true);
                        break;
                    case 2:
                        tablero[x][y] = new Pieza(TipoPieza.REINA, true);
                        break;
                    case 3:
                        tablero[x][y] = new Pieza(TipoPieza.TORRE, true);
                        break;   
                    case 4:
                        tablero[x][y] = new Pieza(TipoPieza.CABALLO, true);
                        break;
                    case 5:
                        tablero[x][y] = new Pieza(TipoPieza.ALFIL, true);
                        break;
                    case 6:
                        tablero[x][y] = new Pieza(TipoPieza.PEON, true);
                        break;
                }
            }
            if(color == 2){
                switch (tipo){
                    case 1:
                        tablero[x][y] = new Pieza(TipoPieza.REY, false);
                        break;
                    case 2:
                        tablero[x][y] = new Pieza(TipoPieza.REINA, false);
                        break;
                    case 3:
                        tablero[x][y] = new Pieza(TipoPieza.TORRE, false);
                        break;   
                    case 4:
                        tablero[x][y] = new Pieza(TipoPieza.CABALLO, false);
                        break;
                    case 5:
                        tablero[x][y] = new Pieza(TipoPieza.ALFIL, false);
                        break;
                    case 6:
                        tablero[x][y] = new Pieza(TipoPieza.PEON, false);
                        break;
                }

            }
        }
        
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){   
                if(tablero[i][j] == null){
                    
                }
                else if(tablero[i][j].esNegra()){
                    totalNegras++;
                    if(null != tablero[i][j].getTipo())
                        switch (tablero[i][j].getTipo()) {
                        case REY:
                            piezasNegras[0]++;
                            break;
                        case REINA:
                            piezasNegras[1]++;
                            break;
                        case TORRE:
                            piezasNegras[2]++;
                            break;
                        case CABALLO:
                            piezasNegras[3]++;
                            break;
                        case ALFIL:
                            piezasNegras[4]++;
                            break;
                        case PEON:
                            piezasNegras[5]++;
                            break;
                        default:
                            break;
                    }
                }
                else if(tablero[i][j].esNegra() == false){
                    totalBlancas++;
                    if(null != tablero[i][j].getTipo())
                        switch (tablero[i][j].getTipo()) {
                        case REY:
                            piezasBlancas[0]++;
                            break;
                        case REINA:
                            piezasBlancas[1]++;
                            break;
                        case TORRE:
                            piezasBlancas[2]++;
                            break;
                        case CABALLO:
                            piezasBlancas[3]++;
                            break;
                        case ALFIL:
                            piezasBlancas[4]++;
                            break;
                        case PEON:
                            piezasBlancas[5]++;
                            break;
                        default:
                            break;
                    }
                }                
            }
                
        }
        
        System.out.println("Piezas negras: ");
        System.out.println("Rey: " + piezasNegras[0]);
        System.out.println("Reina: " + piezasNegras[1]);
        System.out.println("Torre: " + piezasNegras[2]);
        System.out.println("Caballo: " + piezasNegras[3]);
        System.out.println("Alfil: " + piezasNegras[4]);
        System.out.println("Peón: " + piezasNegras[5]);
        System.out.println("Total: " + totalNegras);
        
        System.out.println("Piezas blancas: ");
        System.out.println("Rey: " + piezasBlancas[0]);
        System.out.println("Reina: " + piezasBlancas[1]);
        System.out.println("Torre: " + piezasBlancas[2]);
        System.out.println("Caballo: " + piezasBlancas[3]);
        System.out.println("Alfil: " + piezasBlancas[4]);
        System.out.println("Peón: " + piezasBlancas[5]);
        System.out.println("Total: " + totalBlancas);
    }
    
}
