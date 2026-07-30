package exercicios.bloco1.serie2;

import java.util.Scanner;

public class EscolhaTernarioEIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* USANDO IF TERNÁRIO */
        System.out.println("Digite um número inteiro para que seja definido se é par ou ímpar: ");
        int num = sc.nextInt();
        String resultado = num % 2 == 0 ? "PAR" : "ÍMPAR";
        System.out.println("O número " + num + " é " + resultado + ".");

        System.out.println("\nDigite uma idade para definirmos se a pessoa tem maioridade ou não.");
        int idade = sc.nextInt();
        String maioridade = idade >= 18 ? "MAIOR DE IDADE" : "MENOR DE IDADE";
        System.out.println("A pessoa é " + maioridade);

        System.out.println("\nDigite dois números inteiros para que seja apresentado o maior: ");
        System.out.println("Número 1: ");
        int num1 = sc.nextInt();
        System.out.println("Número 2: ");
        int num2 = sc.nextInt();
        int maior = num1 > num2 ? num1 : num2;
        System.out.println("O maior número é: " + maior);

        /* USANDO ESTRUTURAS CONDICIONAIS TRADICIONAIS */

        /* NOTAS */
        System.out.println("----------------------------------");
        System.out.println("Digite uma nota para que seja classificada: ");
        double nota = sc.nextDouble();
        String classificacao = "";
        if(nota >= 9 && nota <= 10){
            classificacao = "Excelente";
        } else if (nota >= 7 && nota < 9){
            classificacao = "Bom";
        } else if (nota >= 5 && nota < 7){
            classificacao = "Regular";
        } else if (nota < 5){
            classificacao = "Insuficiente";
        } else {
            System.out.println("Nota inválida.");
            return;
        }
        System.out.println("A classificação da nota é: " + classificacao + ".");

        /* SALÁRIO */
        System.out.println("----------------------------------");
        System.out.println("Digite o salário do trabalhador: ");
        double salario = sc.nextDouble();
        System.out.println("Digite o tempo de empresa do trabalhador (em anos): ");
        int tempoEmpresa = sc.nextInt();
        System.out.println("Digite a quantidade de faltas do trabalhador (em dias): ");
        double faltas = sc.nextInt();

        double bonus = 0;
        if(tempoEmpresa >= 5 && faltas <= 3){
            bonus = salario * 0.1;
        } else if(tempoEmpresa >= 3 && faltas <= 5){
            bonus = salario * 0.05;
        }
        double salarioComBonus = salario + bonus;
        System.out.println("O salário do trabalhador é: R$ " + salario + ".\n"
                + "O Bônus é : R$ " + bonus + ".\n"
                + "O salário final é: R$ " + salarioComBonus + ".");
    }
}
