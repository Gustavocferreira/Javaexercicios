/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade05_escopodevariaveis;

/**
 * Programa que utiliza uma variável global para contar incrementos
 */
public class Atividade05_EscopodeVariaveis {

     //Variável global contador 
    static int contador = 0;

    // Método para incrementar o contador
    public static void incrementarContador() {
        contador++;  // Aumenta o valor de contador em 1
    }

    public static void main(String[] args) {
        // Chamando o método algumas vezes
        incrementarContador();
        incrementarContador();
        incrementarContador();

        // Exibindo o valor final do contador
        System.out.println("Valor final do contador: " + contador);
    }
}
