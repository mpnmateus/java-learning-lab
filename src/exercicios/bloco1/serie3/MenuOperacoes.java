package exercicios.bloco1.serie3;

import java.util.Scanner;

public class MenuOperacoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        double resultado = 0;
        do {
            System.out.println("Menu para cálculos:");
            System.out.println("1 - Somar \n" +
                    "2 - Subtrair \n" +
                    "3 - Multiplicar \n" +
                    "4 - Dividir \n" +
                    "5 - Calcular resto da divisão \n" +
                    "0 - Encerrar \n");
            System.out.println("Escolha uma opção: ");
            opcao = sc.nextInt();
            if (opcao != 0) {
                if (opcao >= 1 && opcao <= 5) {
                    System.out.println("Digite o primeiro número inteiro: ");
                    int num1 = sc.nextInt();
                    System.out.println("Digite o segundo número inteiro: ");
                    int num2 = sc.nextInt();
                    switch (opcao) {
                        case 1:
                            resultado = num1 + num2;
                            System.out.println(resultado);
                            break;
                        case 2:
                            resultado = num1 - num2;
                            System.out.println(resultado);
                            break;
                        case 3:
                            resultado = num1 * num2;
                            System.out.println(resultado);
                            break;
                        case 4:
                            if (num2 == 0) {
                                System.out.println("Não existe divisão por zero.");

                            } else {
                                resultado = num1 / num2;
                                System.out.println(resultado);
                            }
                            break;
                        case 5:
                            if (num2 == 0) {
                                System.out.println("Não existe divisão por zero.");

                            } else {
                                resultado = num1 % num2;
                                System.out.println(resultado);
                            }
                            break;
                    }
                } else {
                    System.out.println("Opção inválida.");
                }
            }
        } while (opcao != 0);
        System.out.println("Programa finalizado.");
        sc.close();
    }
}
