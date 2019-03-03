/*
 *Aula 19 Array Curso Básico de Java.
*/
package com.romulo.cursojava.aula19;

/**
 *
 * @author Rômulo de Carvalho.
 */
public class Array {

    
    public static void main(String[] args) {
        
        double[] temperaturas = new double[365];
        temperaturas[0] = 30.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 33.1;
        
        System.out.println("O valor da temperatura no primeiro dia é: " +
                temperaturas[0]);
        // tamanhho de espaços do Array.
        System.out.println("O tamanho do Array é: " + temperaturas.length);
        // Apontando o endereço de memória.
        System.out.println("Valores array: " + temperaturas);
        //mostrando os valores armazenados do array.
        for(int i = 0; i < temperaturas.length; i++){
            
            System.out.println("O valo da temperatura do dia " + (i+1) + " é " +
                    temperaturas[i]);
        }
        
    }
    
}
