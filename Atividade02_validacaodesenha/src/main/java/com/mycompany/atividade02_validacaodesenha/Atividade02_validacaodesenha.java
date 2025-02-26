/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade02_validacaodesenha;
import java.util.Scanner;
/**
 *
 * @author fic
 */
public class Atividade02_validacaodesenha {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        // Solicita o nome do usuário
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine(); // Lê o nome digitado

        String senha; 
        
        // Laço do-while para garantir que a senha tenha exatamente 6 caracteres
        do {
            // Solicita a senha
            System.out.print("Digite a senha (deve ter exatamente 6 caracteres): ");
            senha = scanner.nextLine(); // Lê a senha digitada

        } while (senha.length() != 6); // Verifica se a senha tem exatamente 6 caracteres

        // Exibe a mensagem de sucesso quando a senha é válida
        System.out.println("Usuário e senha recebidos com sucesso!");

        // Fecha o scanner
        scanner.close();
    }
}