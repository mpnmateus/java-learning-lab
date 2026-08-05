package exercicios.bloco1.serie4;

import java.util.Random;
import java.util.Scanner;

public class EstatisticasDoArray {
    public static void main(String[] args) {
        // Determine menor valor, maior valor, posições em que aparecem, soma, média e quantidade de elementos acima da média.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número limite para preencher um array e para que possamos trazer estatísticas sobre: ");
        int limite = sc.nextInt();
        if (limite > 0) {
            Random random = new Random();

            int[] arrayDeInteiros = new int[limite];

            // POPULANDO O ARRAY DE FORMA RANDOMICA COM INTEIROS ATÉ 15
            for (int i = 0; i < arrayDeInteiros.length; i++) {
                arrayDeInteiros[i] = random.nextInt(15);
                //            arrayDeInteiros[i] = i;
            }
            // IMPRESSÃO DO ARRAY
            System.out.println("O array gerado aleatoriamente é: ");
            for (int i = 0; i < arrayDeInteiros.length; i++) {
                System.out.println("Posição " + i + ": " + arrayDeInteiros[i]);
            }

            // MAIOR E MENOR VALORES
            int maiorValor = 0;
            int menorValor = 0;
            for (int j = 0; j < arrayDeInteiros.length; j++) {
                if (j == 0) {
                    maiorValor = arrayDeInteiros[j];
                    menorValor = arrayDeInteiros[j];
                }
                if (arrayDeInteiros[j] > maiorValor) {
                    maiorValor = arrayDeInteiros[j];
                }
                if (arrayDeInteiros[j] < menorValor) {
                    menorValor = arrayDeInteiros[j];
                }
            }

            // POSICAO DO MAIOR E MENOR VALOR
            String posicaoMaiorValor = "";
            String posicaoMenorValor = "";
            for (int i = 0; i < arrayDeInteiros.length; i++) {
                if (arrayDeInteiros[i] == maiorValor) {
                    posicaoMaiorValor += i + " ";
                }
                if (arrayDeInteiros[i] == menorValor) {
                    posicaoMenorValor += i + " ";
                }
            }

            // SOMA
            int soma = 0;
            for (int num : arrayDeInteiros) {
                soma += num;
            }

            // MÉDIA
            double media = (double) soma / arrayDeInteiros.length;
            int qtdAcimaMedia = 0;
            for (int i = 0; i < arrayDeInteiros.length; i++) {
                if (arrayDeInteiros[i] > media) {
                    qtdAcimaMedia++;
                }
            }

            // RELATÓRIO
            System.out.println("\n --- RELATORIO --- ");
            System.out.println("Maior valor: " + maiorValor);
            System.out.println("Posições do maior valor: " + posicaoMaiorValor);
            System.out.println("Menor valor: " + menorValor);
            System.out.println("Posições do menor valor: " + posicaoMenorValor);
            System.out.println("\nA soma é: " + soma);
            System.out.println("A média é: " + media);
            System.out.println("A quantidade de elementos acima da média é: " + qtdAcimaMedia);

        } else {
            System.out.println("O limite precisa ser maior que 0.");
        }
    }
}
