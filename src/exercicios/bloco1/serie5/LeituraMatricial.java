package exercicios.bloco1.serie5;

import java.util.Random;
import java.util.Scanner;

public class LeituraMatricial {

    /*
     * Preencha uma matriz e apresente seus valores
     * por linhas e, depois, por colunas.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println(" -- MATRIZ (m) x (n) -- ");

        System.out.print("Digite a quantidade de linhas (m): ");
        int linhas = sc.nextInt();

        System.out.print("Digite a quantidade de colunas (n): ");
        int colunas = sc.nextInt();

        // Evita matriz sem linhas/colunas e permite usar matriz[0] com segurança.
        if (linhas <= 0 || colunas <= 0) {
            System.out.println("Linhas e colunas devem ser maiores que zero.");
            sc.close();
            return;
        }


        /* =========================================================
         * CRIAÇÃO DA MATRIZ
         * =========================================================
         *
         * int[linhas][colunas]
         *
         * matriz é um array de arrays:
         *
         * matriz
         *   |
         *   +-- matriz[0] --> [ ][ ][ ][ ]
         *   +-- matriz[1] --> [ ][ ][ ][ ]
         *   +-- matriz[2] --> [ ][ ][ ][ ]
         *
         * Cada array interno representa UMA LINHA.
         */
        int[][] matriz = new int[linhas][colunas];


        /* =========================================================
         * PREENCHIMENTO
         * =========================================================
         *
         * matriz[linha][coluna]
         *
         * O for externo escolhe uma linha.
         * O for interno percorre todas as colunas daquela linha.
         */
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                matriz[linha][coluna] = random.nextInt(10);
            }
        }


        /* =========================================================
         * LEITURA POR LINHAS
         * =========================================================
         *
         * Primeiro fixamos uma LINHA.
         * Depois percorremos suas COLUNAS.
         *
         * Exemplo:
         *
         * → → →
         * → → →
         * → → →
         */
        System.out.println("\n--- MATRIZ POR LINHAS ---");

        for (int linha = 0; linha < matriz.length; linha++) {
            System.out.print("Linha " + linha + ": ");
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                // O acesso continua sendo [linha][coluna].
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }


        /* =========================================================
         * LEITURA POR COLUNAS
         * =========================================================
         *
         * Agora fixamos uma COLUNA.
         * Depois percorremos todas as LINHAS dela.
         *
         * Exemplo:
         *
         * ↓ ↓ ↓
         * ↓ ↓ ↓
         * ↓ ↓ ↓
         *
         * O acesso NÃO muda:
         *
         * matriz[linha][coluna]
         */
        System.out.println("\n--- MATRIZ POR COLUNAS ---");

        /*
         * matriz[0] = primeira linha inteira.
         *
         * matriz[0].length = quantidade de elementos dessa linha
         *                  = quantidade de colunas da matriz.
         */
        for (int coluna = 0; coluna < matriz[0].length; coluna++) {
            System.out.print("Coluna " + coluna + ": ");
            /*
             * matriz.length = quantidade de arrays internos
             *               = quantidade de linhas.
             *
             * Enquanto este for percorre as linhas,
             * "coluna" continua com o mesmo valor.
             */
            for (int linha = 0; linha < matriz.length; linha++) {
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }

        sc.close();
        /*
        * Memorizar conceitualmente estas quatro relações:
            - matriz[linha][coluna]
            é o acesso a um elemento.

            - matriz.length
            é a quantidade de linhas, porque matriz é o array principal e cada elemento dele é uma linha.

            - matriz[linha].length
            é a quantidade de elementos existentes em determinada linha — numa matriz retangular, corresponde à quantidade de colunas.
        * */
    }
}