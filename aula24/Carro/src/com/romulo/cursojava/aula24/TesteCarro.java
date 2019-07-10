/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.romulo.cursojava.aula24;

/**
 *
 * @author Rômulo de Carvalho.
 */
public class TesteCarro {
    
    public static void main(String[] args) {
        
        Carro van = new Carro();
        van.marca = "FIAT";
        van.modelo = "Ducato";
        van.numPassageiro = 10;
        van.capCombustivel = 100;
        van.conscombustivel = 0.2;
        
        System.out.println(van.marca);
        System.out.println(van.modelo);
        
        Carro fusca = new Carro();
        fusca.marca = "Volkswagem";
        fusca.modelo = "Fusca";
        fusca.numPassageiro = 5;
        fusca.capCombustivel = 60;
        fusca.conscombustivel = 0.5;
        
        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);
    }
        
}
