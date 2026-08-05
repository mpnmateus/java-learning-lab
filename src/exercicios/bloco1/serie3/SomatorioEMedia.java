package exercicios.bloco1.serie3;

import java.util.Scanner;

public class SomatorioEMedia {
    public static void main(String[] args) {
        // Receba uma quantidade N de números e apresente soma, média, maior e menor valor. Não use arrays.
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números você quer informar: ");
        int quantidade = sc.nextInt();
        if(quantidade > 0) {
            int contador = 1;
            double somatorio = 0;
            double maior = 0;
            double menor = 0;
            while (contador <= quantidade) {
                System.out.println("Digite o " + contador + "º número: ");
                double num = sc.nextDouble();
                somatorio += num;

                if (contador == 1) {
                    maior = num;
                    menor = num;
                }
                if (num > maior) {
                    maior = num;
                }
                if (num < menor) {
                    menor = num;
                }


                contador++;
            }
            double media = somatorio / quantidade;

            System.out.println("\nSomatorio: " + somatorio);
            System.out.println("Maior nº: " + maior);
            System.out.println("Menor: " + menor);
            System.out.println("Média: " + media);
        }
    }
}
