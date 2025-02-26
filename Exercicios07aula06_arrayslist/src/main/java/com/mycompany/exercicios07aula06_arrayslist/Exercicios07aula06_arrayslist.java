/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicios07aula06_arrayslist;
import java.util.ArrayList; 
import java.util.Scanner;
/**
 *
 * @author fic
 */
public class Exercicios07aula06_arrayslist {

    public static void main(String[] args) {
       // Criando o Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Criando a lista de nomes
        ArrayList<String> nomes = new ArrayList<>();
        String nome; // Variável para armazenar o nome digitado


//        nomes.add("Ana");
//        nomes.add("Carlos");
//        nomes.add("Bruna");
//        nomes.add("Eduardo");
        
// Usando forEach para imprimir cada nome na lista}
        
        
        // Loop para capturar nomes até o usuário digitar "parar"
        do {
            System.out.print("Digite o nome (digite 'parar' para encerrar): ");
            nome = scanner.nextLine(); // Lê a linha digitada pelo usuário
            if (!nome.equals("parar")) { // Adiciona à lista se não for 'parar'
                nomes.add(nome);
            }
        } while (!nome.equals("parar")); // Encerra quando o usuário digitar 'parar'

        // Exibindo os nomes na lista
        nomes.forEach(nomeX -> System.out.println(nomeX));

        // Fechando o scanner após o uso
        scanner.close();
    }
}

