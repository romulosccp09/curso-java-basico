/*
 * Exercício 01 VetoreCurso Básico Java.
 * Criar um Vetor A com 5 elementos inteiros. Construir um Vetor B de mesmo tipo
 *  e tamanho e com os mesmos elementos do vetor A, ou seja, B[i] = A[i].
 */
package exevet01;

import java.util.Scanner;

/**
 *
 * @author Rômulo de Carvalho.
 */
public class ExeVet01 {

    
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        
        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];
        
        for(int i=0; i<vetorA.length; i++){
            System.out.println("Entre com um valor na posição: " + i);
            vetorA[i] = tecla.nextInt();
            vetorB[i] = vetorA[i];
        }
        
        /*for(i=0; i<vetorA.length; i++){
            vetorB = vetorA; 
            
        } */
        System.out.print("Valores do vetor A = ");
        for(int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
            
        }
       
        System.out.println("");
        System.out.print("Valores do vetor B = ");
        for (int i=0; i<vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }
    }
    
}
