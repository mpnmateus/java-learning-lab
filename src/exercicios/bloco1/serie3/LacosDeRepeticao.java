package exercicios.bloco1.serie3;

import java.util.Scanner;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        // Receba dois números e imprima todos os valores entre eles em ordem crescente ou decrescente, conforme a entrada.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois números: ");
        System.out.println("Número 1: ");
        int num1 = sc.nextInt();
        System.out.println("Número 2: ");
        int num2 = sc.nextInt();

        boolean ehOrdemCrescente = num1 < num2;

        if(ehOrdemCrescente){
            for(int i = num1+1; i < num2; i++){
                System.out.print(i + " ");
            }
        } else {
            for(int i = num1-1; i > num2; i--){
                System.out.print(i + " ");
            }
        }
    }
}
