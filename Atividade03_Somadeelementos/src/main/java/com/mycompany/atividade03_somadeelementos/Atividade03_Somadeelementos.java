/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade03_somadeelementos;

import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class Atividade03_SomadeElementos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
// Criando o objeto Scanner para entrada do usuário
        
        int[] numeros = new int[5]; // Criando um array para armazenar 5 números inteiros
        int soma = 0; // Inicializando a variável soma com 0
        
        System.out.println("Digite 5 números inteiros:");

        // Loop para capturar os 5 números inteiros do usuário
        for (int i = 0; i < numeros.length; i++) {
            System.out.print((i + 1) + "º número: ");
            numeros[i] = scanner.nextInt(); // Lendo um número inteiro digitado pelo usuário
            soma += numeros[i]; // Somando o valor ao total
        }

        // Exibindo a soma dos números digitados
        System.out.println("\nA soma dos números digitados é: " + soma);

        scanner.close(); // Fechando o Scanner para evitar vazamento de recursos
    }
}
       