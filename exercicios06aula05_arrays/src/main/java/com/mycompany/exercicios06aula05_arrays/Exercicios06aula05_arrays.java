/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicios06aula05_arrays;
import java.util.Scanner;
/**
 *
 * @author fic
 */
public class Exercicios06aula05_arrays {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        
        // Definindo o array para armazenar 5 números inteiros
        int[] numeros = new int[5];
        
        // Solicitando ao usuário para digitar os 5 números inteiros
        System.out.println("Digite 5 números inteiros:");
        
        // Laço para receber os 5 números e armazená-los no array
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }
        
        // Exibindo os números na ordem inversa
        System.out.println("\nNúmeros na ordem inversa:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
        
        // Fechando o scanner após o uso
        scanner.close();
    }
}
