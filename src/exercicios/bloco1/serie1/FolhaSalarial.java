package exercicios.bloco1.serie1;

import java.util.Scanner;

public class FolhaSalarial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o salário base: ");
        double salarioBase = sc.nextDouble();
        System.out.println("Digite o percentual de gratificação: ");
        double percentualGratificacao = sc.nextDouble();
        System.out.println("Digite o percentual de desconto");
        double percentualDesconto = sc.nextDouble();

        double gratificacao = salarioBase * (percentualGratificacao/100);
        double salarioMaisGratificacao = salarioBase + gratificacao;

        double desconto = salarioBase * (percentualDesconto/100);
        double salarioLiquidoMensal = salarioMaisGratificacao - desconto;

        double projecaoLiquidaAnual = salarioLiquidoMensal * 12;

        String relatorio = "| \n" +
                "*  O salário base é: R$" + String.format("%.2f",salarioBase) + ". \n" +
                "|  A gratificacao é: R$ " + String.format("%.2f",gratificacao) + ". \n" +
                "*  O desconto é: R$ " + String.format("%.2f",desconto) + ". \n" +
                "|  O salário líquido mensal é R$ " + String.format("%.2f",salarioLiquidoMensal) + ". \n" +
                "*  A projecao líquida anual é: R$ " + String.format("%.2f", projecaoLiquidaAnual) +". \n" +
                "| \n" +
                " -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-";

        System.out.println(" -*-*-*-*-*-*-*-*- RELATÓRIO -*-*-*-*-*-*-*-*- ");
        System.out.println(relatorio);

    }
}
