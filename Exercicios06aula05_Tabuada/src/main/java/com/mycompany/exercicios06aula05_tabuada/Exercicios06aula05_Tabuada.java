/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicios06aula05_tabuada;

import java.util.Scanner;


/**
 *
 * @author fic
 */
public class Exercicios06aula05_Tabuada {

    public static void main(String[] args) {
        Scanner scanner = new scanner (System.in);
        System.out.print("Digite um número para ver sua tabuada");
        int numero = scanner.nextInt();
        
        int i = 1;
        while(i<=10) {
            System.out.println(numero+ "x" = + i + " = " );
        }
    }
}
