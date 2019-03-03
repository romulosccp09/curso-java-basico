/*
 *Exercicío 02 Vetores: Criar um vetor A com 8 posiçoes, e um vetor B   do mesmo
 *tipo e tamanho e com elementos do vetor A multiplicados por, ou seja, 
 * B[i] = 2*A[i]
 */
package exe02;

import java.util.Scanner;

/**
 *
 * @author Rômulo de Carvalho
 */
public class Exe02 {

    
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        
        int[] vetorA = new int[8];
        int[] vetorB = new int[vetorA.length];
        
        for(int i =0; i<vetorA.length; i++){
            System.out.print("Entre com um com o " + (i+1) + "° valor: ");
            
           vetorA[i] = tecla.nextInt();
           vetorB[i] = 2 * vetorA[i];
        }
        
        System.out.print("Os valores do vetor A = ");
        for(int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
            
        }
        
        System.out.println(" ");
        
        System.out.print("Os valores do vetor B = ");
        for(int i=0; i<vetorB.length; i++){
            System.out.print(vetorB[i] +" ");
        }
        System.out.println(" ");
    }
    
}
