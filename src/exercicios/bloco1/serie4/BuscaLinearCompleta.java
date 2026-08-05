package exercicios.bloco1.serie4;

import java.util.Random;
import java.util.Scanner;

public class BuscaLinearCompleta {
    public static void main(String[] args) {
        // Receba um valor de pesquisa e informe todas as posições em que ele ocorre. Caso não exista, apresente uma mensagem adequada.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um tamanho para o array: ");
        int tamanhoArray = sc.nextInt();
        int[] array = new int[tamanhoArray];
        Random random = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10);
        }

        int contador = 0;
        for(int j: array){
            System.out.println("Posição " + contador + ": "+ j);
            contador++;
        }
        System.out.println("--------------------------------");
        System.out.println("\nDigite um valor a ser pesquisado.");
        int valorPesquisa = sc.nextInt();

        String listaPosicoes = "";
        boolean existeAlgum = false;
        for(int i = 0; i < array.length; i++){
            if(valorPesquisa == array[i]){
                listaPosicoes += i + " ";
                existeAlgum = true;
            }
        }

        if (existeAlgum){
            System.out.println("As posições em que o nº " + valorPesquisa + " aparece na lista são: " +
                    "\n " + listaPosicoes);
        } else {
            System.out.println("O número " + valorPesquisa + " não aparece na lista nenhuma vez. ");
        }
    }
}
