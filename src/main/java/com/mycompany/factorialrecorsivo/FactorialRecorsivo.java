/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factorialrecorsivo;

/**
 *
 * @author DAW
 */
/* F7 ejecutamos paso a paso, F8 ejecutamos la función de golpe */
public class FactorialRecorsivo {

    public static void main(String[] args) {
        int valor=5;
        System.out.println("Versión iterativa del facorial.");
        int resultado=factorialIterativo(valor);/* Si ejecutamos aquí F7 nos vamos a nuestra función*/
        System.out.println(resultado); /*Si ejecuto aquí F7 nos metemos en la función println del sistema*/
        
        int resultadoDos=factorialRecursivo(valor);
        System.out.println(resultadoDos);
    }
    //MODIFICACIÓN PARA EL EXAMEN DE GIT
    public static int factorialIterativo(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
            
        }
        return fact;
        
    }
    
    public static int factorialRecursivo(int n){

       if(n==0){    
            return 1;
        }else{
            return factorialRecursivo(n-1)*n;
        }
    }

}