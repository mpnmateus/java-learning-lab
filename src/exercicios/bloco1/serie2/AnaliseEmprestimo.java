package exercicios.bloco1.serie2;

import java.util.Scanner;

public class AnaliseEmprestimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu salário mensal: ");
        double salario = sc.nextDouble();
        if(salario <= 0){
            System.out.println("Salário inválido.");
            return;
        }
        System.out.println("Digite o valor do empréstimo");
        double emprestimo = sc.nextDouble();
        if (emprestimo <= 0){
            System.out.println("Valor do empréstimo inválido.");
            return;
        }
        System.out.println("Digite a quantidade de parcelas para quitar o empréstimo");
        int quantidadeParcelas = sc.nextInt();
        if(quantidadeParcelas < 1 || quantidadeParcelas > 48){
            System.out.println("Quantidade de parcelas inválida.");
            return;
        }

        boolean estaAprovado = false;
        String limitesEmprestimo = "";
        String msgFinal = "";
        double parcela = emprestimo / quantidadeParcelas;

        if(parcela < (salario * 0.3) && emprestimo < (salario * 10) && quantidadeParcelas < 36){
            estaAprovado = true;
        } else if (parcela >= (salario * 0.3)){
            limitesEmprestimo += "Parcela superior a 30% do salário\n";
        } else if (emprestimo >= (salario * 10)){
            limitesEmprestimo += "Valor solicitado superior a 10 salários\n";
        } else if (quantidadeParcelas >= 36){
            limitesEmprestimo += "Quantidade de parcelas superior a 36\n";
        }


        double percentualRendaComprometido = (parcela * 100) / salario;
        msgFinal = "Valor da parcela: R$ " + String.format("%.2f", parcela) + ".\n";
        msgFinal += "Percentual da renda comprometido: " + String.format("%.2f", percentualRendaComprometido) + "%.\n";

        if (!estaAprovado){
            msgFinal += "Empréstimo reprovado. \nMotivos:\n" + limitesEmprestimo;

        } else {
            msgFinal += "Empréstimo aprovado.";
        }
        System.out.println(msgFinal);

    }
}
