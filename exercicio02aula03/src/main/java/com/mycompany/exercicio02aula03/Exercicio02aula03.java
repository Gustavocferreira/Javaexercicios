/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio02aula03;

/**
 *
 * @author FIC
 */
public class Exercicio02aula03 {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner (System.in);
        System.out.print("digite um número: ");
        int numero = scanner.nextInt();
         
        int metade = numero/ 2;
        
        if(numero == metade * 2) {
            System.out.println("O numero:" + numero + "é Par.");
        } else {
            System.out.println("O numero:" + numero + "é impar.");
        }
        scanner.close();
    }
}