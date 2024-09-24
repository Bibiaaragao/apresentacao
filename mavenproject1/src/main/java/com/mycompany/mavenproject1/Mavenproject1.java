/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Mavenproject1 {

    public static void main(String[] args) {
      List<String> pessoas = Arrays.asList("Carla", "Bruna", "Marcos", "Livia");
    
    //Filtrar nomes que começam com M
    List<String> filtroPessoas = pessoas.stream()
            .filter(pessoa -> pessoa.startsWith("M"))
            .collect(Collectors.toList());
    System.out.println("Pessoas que o nome começa com a letra M: " + filtroPessoas);
    
    //Ordenar
    List<String> ordemPessoas = pessoas.stream()
            .sorted()
            .collect(Collectors.toList());
    System.out.println("Lista por ordem: " + ordemPessoas);
    
    List<Integer> numeros = Arrays.asList(3, 6, 9, 12, 15);
    
    //Dividir por 3
    List<Integer> divisao3 = numeros.stream()
            .map(num -> num / 3)
            .collect(Collectors.toList());
    System.out.println("Números divididos por 3: " + divisao3);
    
    //Soma todos os números
    int somaTodos = numeros.stream()
            .reduce(0, Integer::sum);
    System.out.println("Números divididos por 3: " + somaTodos);
        
    }
}
