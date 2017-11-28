/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_3;

/**
 *
 * @author Usuario DAM
 */
public class Mate {
    
    /**Método para calcular el factorial de un número dado
     * @param numero
     * @return 
     */
    public static int factorial(int numero){
        int factorial = 1;
        for(int i = numero; i > 0; i--){
                factorial = factorial * i;
        }
        
        return factorial;
    }
    
    /**Método para calcular si un número dado es primo o no
     * 
     * @param numero
     * @return 
     */
    public static boolean primo(int numero){
        boolean esPrimo = true;
        for(int i = 2; i < numero; i++){
            if(numero % i == 0){
                i=numero;
                esPrimo = false;
            }               
        }       
        return esPrimo;
    }
    
    /**Método para calcular si un número dado es perfecto o no
     * 
     * @param numero
     * @return 
     */
    public static boolean perfecto(int numero){
        boolean esPerfecto = false;
        int sumaDivisores = 0;
        for(int i = 1; i < numero; i++){
            if(numero % i == 0){
                sumaDivisores += i;
            }               
        }
        if(sumaDivisores == numero)
            esPerfecto = true;
        else
            esPerfecto = false;
        
        return esPerfecto;
    }
    
    /**Método para calcular el si dos números dados son amigos o no
     * 
     * @param num1
     * @param num2
     * @return 
     */
    public static boolean amigos(int num1, int num2){
        boolean sonAmigos = false;
        int sumaDivisores1 = 0, sumaDivisores2 = 0;
        
        for(int i = 1; i < num1; i++){
            if(num1 % i == 0){
                sumaDivisores1 += i;
            }               
        }
        if(sumaDivisores1 == num2){
            for(int j = 1; j < num2; j++){
                if(num2 % j == 0){
                    sumaDivisores2 += j;
                }         
            }
            if(sumaDivisores2 == num1)
                sonAmigos = true;
        }

        
        return sonAmigos;
    }
    
    /**Método para calcular si dos números dados son primos entre ellos o no
     * 
     * @param num1
     * @param num2
     * @return 
     */
    public static boolean primos(int num1, int num2){
        boolean sonPrimos = true;
        
        for(int i = 1; i < num1; i++){
            if(num1 % i == 0){
                if(num2 % i == 0){
                    sonPrimos = false;
                    i = num1;
                }
            }               
        }
        
        return sonPrimos;
    }
    
    /**Método para calcular el máximo común divisor de dos números dados
     * 
     * @param num1
     * @param num2
     * @return 
     */
    public static int maxComunDivisor(int num1, int num2){
        int mcd = 1;
        
        for(int i = 2; i <= num1; i++){
            if(num1 % i == 0){
                if(num2 % i == 0)
                    mcd = i;
            }               
        }
        
        return mcd;
    }
    
    /**Método para calcular la potencia de un número dado a un exponente dado
     * 
     * @param base
     * @param exponente
     * @return 
     */
    public static int potencia(int base, int exponente){
        int resultado = 1;
        
        for(int i = 0; i < exponente; i++){
            resultado *= base;
        }
        
        return resultado;
    }
}
