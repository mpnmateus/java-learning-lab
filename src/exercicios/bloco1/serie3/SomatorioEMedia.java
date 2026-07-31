package exercicios.bloco1.serie3;

import java.util.Scanner;

public class SomatorioEMedia {
    public static void main(String[] args) {
        // Receba uma quantidade N de números e apresente soma, média, maior e menor valor. Não use arrays.
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números você quer informar: ");
        int quantidade = sc.nextInt();

        int contador = 1;
        double somatorio = 0;
        double numAnterior = 0;
        double maior = 0;
        double menor = 0;
        while(contador <= quantidade){
            System.out.println("Digite o " + contador + "º número: ");
            double num = sc.nextDouble();
            somatorio += num;

            if((contador == 1) && (menor == 0)){
                menor = num;
            }
            if ((num < numAnterior) && (num < menor)){
                menor = num;
            }
            if((num > numAnterior) && (num > maior)){
                maior = num;
            }

            numAnterior = num;
            contador++;
        }
        double media = somatorio / quantidade;
        System.out.println("\nSomatorio: " + somatorio);
        System.out.println("Maior nº: " +maior);
        System.out.println("Menor: " + menor);
        System.out.println("Média: " + media);
    }
}
