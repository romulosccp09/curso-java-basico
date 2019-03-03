/*
 * Exercicío 3 da aula de array, criar um vetor A com 15 elementos inteiros.
 * Cosntruir um vetor B com o mesmo tipo e tamanho, sendo que cada elemento do 
 * vetor B, seja o quadrado do respectivo de A, ou seja B[i] = A[i] * A[1]
 */
package exe03;

import java.util.Scanner;

/**
 *
 * @author Rômulo de Carvalho
 */
public class Exe03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        
        int[] vetorA = new int[15];
        int[] vetorB = new int[vetorA.length];
        
        for(int i = 0, j = 0; i < vetorA.length; i++, j++){
            System.out.println("Digite o " + (i+1) +"º valor: ");
            vetorA[i] = tecla.nextInt();
            vetorB[j] = vetorA[i] * vetorA[i];
        }
        
        for(int i = 0, j =0 ; i < vetorA.length; i++, j++){
            System.out.println("O quadrado do número " + vetorA[i] + ", vale1"
                    + ": "
            + vetorB[j] + "!");
            
        }
        
        
        
    }
    
}
