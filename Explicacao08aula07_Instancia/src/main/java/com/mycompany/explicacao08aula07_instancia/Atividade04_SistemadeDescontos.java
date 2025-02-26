package com.mycompany.explicacao08aula07_instancia; // Certifique-se de que este é o caminho correto

import java.util.Scanner;

public class Atividade04_SistemadeDescontos {
    static double taxaDesconto = 0.1; // Define a taxa de desconto de 10%

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.print("Digite o nome do produto: ");
        produto.nome = scanner.nextLine();

        System.out.print("Digite o preço do produto: ");
        produto.preco = Double.parseDouble(scanner.nextLine());

        aplicarDesconto(produto);

        System.out.println("Produto: " + produto.nome);
        System.out.println("Preço com desconto: " + produto.preco);

        scanner.close();
    }

    public static void aplicarDesconto(Produto p) {
        p.preco -= p.preco * taxaDesconto;
    }
}

class Produto {
    String nome;
    double preco;
}

