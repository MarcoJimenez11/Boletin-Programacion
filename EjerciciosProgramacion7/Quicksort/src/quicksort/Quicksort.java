/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

/**
 *
 * @author Usuario DAM
 */
public class Quicksort {

    public static void quicksort(int vector[], int izquierda, int derecha) {

    int pivote = vector[izquierda]; // tomamos primer elemento como pivote
    int i = izquierda; // i realiza la búsqueda de izquierda a derecha
    int j = derecha; // j realiza la búsqueda de derecha a izquierda
    int aux;

    while(i < j){            // mientras no se crucen las búsquedas
       while(vector[i] <= pivote && i < j){
           i++; // busca elemento mayor que pivote
       }
       while(vector[j] > pivote) {
           j--;         // busca elemento menor que pivote
       }
       if (i < j) {                      // si no se han cruzado                      
           aux = vector[i];                  // los intercambia
           vector[i] = vector[j];
           vector[j] = aux;
       }
     }
    
     vector[izquierda] = vector[j]; // se coloca el pivote en su lugar de forma que tendremos
     vector[j] = pivote; // los menores a su izquierda y los mayores a su derecha
     
     if(izquierda < j-1)
        quicksort(vector,izquierda,j-1); // ordenamos subarray izquierdo
     if(derecha > j+1)
        quicksort(vector,j+1,derecha); // ordenamos subarray derecho
    }

    public static void main(String[] args) {
        
        int [] array;
        int tamanio = 10;
        array = new int[tamanio];
        
        for(int i = 0; i < tamanio; i++){
            array[i] = (int) (Math.random() * 10);
        }
        for(int i = 0; i < tamanio; i++){
            System.out.print(array[i] + " ");
        }
        
        quicksort(array,0,tamanio-1);
        
        System.out.print("\n Ordenado \n ");
        
        for(int i = 0; i < tamanio; i++){
            System.out.print(array[i] + " ");
        }
        
    }
    
}
