/*
 * Projeto do Cusrso Java Básico Loiane Groner.
 * Como ler dados do teclado.
 *
 */
package com.romulo.cursojava.aula12;

import java.util.Scanner;

/**
 *
 * @author Rômulo de Carvalho
 */
public class LeituraDadosTeclado {

    
    public static void main(String[] args) {
    
        Scanner teclado = new Scanner(System.in);
        
        /*System.out.println("Digite seu Nome Completo: ");
        String nomeCompleto = teclado.nextLine();
        System.out.println("Seu nome Completo é " + nomeCompleto + "!");
        
        System.out.println("Digite seu primeiro nome: ");
        String primeiroNome = teclado.next();
        System.out.println("seu primeiro nome é " + primeiroNome);
        
        System.out.println("Digite sua idade: ");
        int idade = teclado.nextInt();
        System.out.println("Sua idade é: " + idade + "!");
        
        System.out.println("Digite sua altura: ");
        double altura = teclado.nextDouble();
        System.out.println("Sua altura é: " + altura + "!"); */
        
        System.out.println(" Digite o seu primeiro nome, idade, quantidade de"
                + " filhos, altura e se tiver pet. ");
        String primeiroNome = teclado.next();
        int idade = teclado.nextInt();
        byte qtdFilhos = teclado.nextByte();
        float altura = teclado.nextFloat();
        boolean temPet = teclado.nextBoolean();
        
        System.out.println(primeiroNome + " sua idade é, " + idade + ", "
                + "você tem " + qtdFilhos + " sua altura é, " + altura);
        System.out.println(" tem bichinho de estimação? " + temPet);
        
    }
    
}
