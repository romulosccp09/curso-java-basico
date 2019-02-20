/*
 * Curso java Básico.
 * Utilizando IF ELSE.
 */
package com.romulo.cursojava.aula14;
       
import java.util.Scanner;


/**
 *
 * @author Rômulo de Carvalho
 */
public class IfElse {

   
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int valor = teclado.nextInt();
        
        if(valor >= 18) {
            
            System.out.println("Maior de idade!");
            
        }
        
        else {
            
            System.out.println("Menor de idade!");
        }
        
        
        System.out.println("Entre com um valor:");
        double valor2 = teclado.nextDouble();
        
        if(valor2 <= 10) {
            
            System.out.println("Está barato, pode comprar!");
        } else if (valor2 > 10 && valor2 <= 15) {
            
            System.out.println("Você pode pedir um desconto!");
        } else if (valor2 >= 15 && valor2 <=17) {
            
            System.out.println("Pode pesquisar mais!");
        } else {
            
            System.out.println("está muito caro!");
            
        }
        
    }
    
}
