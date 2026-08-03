package exercicios.bloco1.serie3;

import java.util.Scanner;

public class AnaliseDeAlgarismos {
    public static void main(String[] args) {
        // Receba um número inteiro positivo e determine quantidade de algarismos, soma dos algarismos e número invertido.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo: ");
        int num = sc.nextInt();
        // resto da divisao por 10 encontra o ultimo algarismo
        // divisao inteira por 10 remove o ultimo algarismo
        int resto = 0;
        int soma= 0;
        int quantidade = 0;
        String invertido = "";
        while((int)num / 10 != 0 ) {
            soma += num % 10; // encontra o último algarismo
            invertido += num % 10;
            num = num / 10; // remove o último algarismo
            quantidade++;
        }
        int quantidadeFinal = quantidade + 1;
        int somaFinal = num + soma;
        String invertidoFinal = invertido + num;
        System.out.println("Soma dos algarismos: " + somaFinal);
        System.out.println("Quantidade dos algarismos: " + quantidadeFinal);
        System.out.println("Algarismos invertidos: " + invertidoFinal);
    }
}
