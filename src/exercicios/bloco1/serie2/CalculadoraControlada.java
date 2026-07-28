package exercicios.bloco1.serie2;

import java.util.Scanner;

public class CalculadoraControlada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double num1 = sc.nextDouble();
        System.out.println("Digite outro número: ");
        double num2 = sc.nextDouble();
        System.out.println("Digite a operação aritmética: ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        int operacao = sc.nextInt();
        double result = 0;
        String operacaoDescri = "";

        switch(operacao){
            case 1:
                result = num1 + num2;
                operacaoDescri = "soma";
                break;
            case 2:
                result = num1 - num2;
                operacaoDescri = "subtração";
                break;
            case 3:
                result = num1 * num2;
                operacaoDescri = "multiplicação";
                break;
            case 4:
                if(num2 == 0){
                    System.out.println("Não existe divisão por 0.");
                    break;
                }
                result = num1 / num2;
                operacaoDescri = "divisão";
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }
        if(result != 0){
            System.out.println("O resultado da " + operacaoDescri + " de " +
                    num1 + " por " + num2 + " é: " + String.format("%.2f",result));
        }
    }
}
