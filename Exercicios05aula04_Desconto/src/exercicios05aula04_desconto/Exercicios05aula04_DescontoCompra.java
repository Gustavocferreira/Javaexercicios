/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios05aula04_desconto;
import java.util.Scanner;


/**
 *
 * @author FIC
 */

public class Exercicios05aula04_Desconto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new scanner (System.in);
        System.out.print("digite o valor da sua compra: ");
        double Valorcompra = scanner.nextDouble();
        
        double desconto = 0;      
        
        //Aplicar as condi;óes para que aconteça o desconto
        if (Valorcompra > 500){
            desconto = 0.10; //10% de desocnto para compras acima de R$500
        }else if (Valorcompra >= 200){
            desconto = 0.05;
            
        }else {System.out.print("Sua compra náo tem desconto =/");
            }    
       
     double ValorFinal= Valorcompra - (Valorcompra + desconto);
     
     System.out.printf("Valor final da compra após o desconto é de: ", ValorFinal);
     
     scanner.close();
     
     
}
    
    