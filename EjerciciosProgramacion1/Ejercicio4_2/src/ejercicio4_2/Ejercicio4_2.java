/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_2;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM
 */
public class Ejercicio4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables
        int salarioFabricante;
        int unidadesVendidas;
        int precioUnidad;
        Scanner leer = new Scanner(System.in);
        
        //Introducir número de unidades vendidas
        System.out.println("Para saber el salario introduce el nº de unidades vendidas");
        unidadesVendidas = leer.nextInt();
        
        //Introducir el precio de cada unidad
        System.out.println("Ahora introduce el precio de cada unidad");
        precioUnidad = leer.nextInt();
        
        //Cálculo del salario de un fabricante, que es el precio de las unidades vendidas en total
        salarioFabricante = unidadesVendidas * precioUnidad;
        
        //Salida del salario de cada fabricante y del diseñador, que es el doble del de el fabricante
        System.out.println("El salario de cada fabricante es de " + salarioFabricante +
                "€ y el salario del diseñador es de " + salarioFabricante*2 + "€");
    }
    
}
