package exercicios.bloco1.serie4;

import java.util.Random;
import java.util.Scanner;

/**
 * Busca linear: quando N dobra, o número de comparações dobra aproximadamente (2×).
 * Ordenação manual implementada: quando N dobra, o número de comparações se aproxima de quadruplicar (4×) - N(N-1)/2
 * Remoção duplicados: quando N dobra, o número de comparações se aproxima de quadruplicar (4×) - N(N-1)/2
 * - Pra testar esse caso e imprimir corretamente em relatório, usar um array sem repetições
 */
public class AnaliseComplexidadeIntuitiva {
    /* Para busca linear, remoção de duplicados e ordenação, determine quantas comparações
     * aproximadamente crescem quando o tamanho do array dobra.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do array: ");
        int tamanhoArray = sc.nextInt();

        // INSTANCIANDO O ARRAY COM O TAMANHO INFORMADO
        int[] array = new int[tamanhoArray];

        // INSTANCIANDO O OBJETO DO TIPO RANDOM
        Random random = new Random();

        // PREENCHENDO O ARRAY
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(15);
        }

        /* Para estudar o pior caso */
        /*
        for(int i = 0; i < array.length; i++){
            array[i] = i;
        }
        */


        // IMPRIMINDO O ARRAY
        System.out.println("Array: ");
        for(int k: array){
            System.out.print(k + " ");
        }

        // Em busca linear, buscaremos por um número que excede o bounding em 1, já que o random vai até 14.
        int numeroProcurado = 15; // Assim faz o algoritmo testar todas as possibilidades possíveis

        /* ---- BUSCA LINEAR ---- */
        // CONTANDO QUANTAS COMPARAÇÕES NA BUSCA LINEAR
        int comparacoesBusca = 0;
        for(int i = 0; i < array.length; i++){
            comparacoesBusca++;
            if(numeroProcurado == array[i]){
                break;
            }
        }

        /* ---- REMOÇÃO DE DUPLICADOS ---- */
        int[] arrayAux = new int[tamanhoArray];
        int indiceArraySing = 0;
        int comparacoesRemoDupli = 0;
        for(int i = 0; i < array.length; i++){
            boolean ehRepetido = false;
            for(int j = i - 1; j >= 0; j--){
                comparacoesRemoDupli++;
                if(array[i] == array[j]){
                    ehRepetido = true;
                    break;
                }
            }
            if(!ehRepetido){
                arrayAux[indiceArraySing] = array[i];
                indiceArraySing++;
            }
        }
        int[] arrayUnicos = new int[indiceArraySing];
        for(int i = 0; i < arrayUnicos.length; i++){
            arrayUnicos[i] = arrayAux[i];
        }
        System.out.println("\nArray sem duplicados");
        for(int p: arrayUnicos){
            System.out.print(p + " ");
        }


        /* ---- ORDENAÇÃO ---- */
        int aux = 0;
        int comparacoesOrdenacao = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                comparacoesOrdenacao++;
                if(array[i] > array[j]){
                    aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;

                }
            }
        }

        // RELATÓRIOS
        System.out.println("\n\n[BUSCA LINEAR] No pior caso, são feitas são feitas " + comparacoesBusca +  " comparações no array.");
        System.out.println("[REMOCAO DUPLICADOS] São feitas " + comparacoesRemoDupli + " comparações no array.");
        System.out.println("[ORDENAÇÃO] Foram feitas " + comparacoesOrdenacao +  " comparações no array.");

        /* ----------------------------------------- */
        /* ----------------------------------------- */
        /* ----------------------------------------- */

        // DUPLICANDO O ARRAY PARA BUSCA LINEAR
        // INSTANCIANDO O ARRAY COM O TAMANHO INFORMADO X 2
        int[] array2 = new int[tamanhoArray*2];

        // PREENCHENDO O ARRAY DE TAMANHO DUPLICADO
        for(int i = 0; i < array2.length; i++){
            array2[i] = random.nextInt(15);
        }
        /* Para estudar o pior caso */
        /*
        for(int i = 0; i < array2.length; i++){
            array2[i] = i;
        }
        */

        // IMPRIMINDO O ARRAY DE TAMANHO DUPLICADO
        System.out.println("\nArray duplicado: ");
        for(int k: array2){
            System.out.print(k + " ");
        }

        /* ---- BUSCA LINEAR ---- */
        comparacoesBusca = 0;
        for(int i = 0; i < array2.length; i++){
            comparacoesBusca++;
            if(numeroProcurado == array2[i]){
                break;
            }
        }

        /* ---- REMOÇÃO DE DUPLICADOS ---- */
        int[] arrayAuxDup = new int[tamanhoArray*2];
        indiceArraySing = 0;
        comparacoesRemoDupli = 0;
        for(int i = 0; i < array2.length; i++){
            boolean ehRepetido = false;
            for(int j = i - 1; j >= 0; j--){
                comparacoesRemoDupli++;
                if(array2[i] == array2[j]){
                    ehRepetido = true;
                    break;
                }
            }
            if(!ehRepetido){
                arrayAuxDup[indiceArraySing] = array2[i];
                indiceArraySing++;
            }
        }
        int[] arrayUnicosDup = new int[indiceArraySing];
        for(int i = 0; i < arrayUnicosDup.length; i++){
            arrayUnicosDup[i] = arrayAuxDup[i];
        }
        System.out.println("\nArray de tamanho duplicado sem valores duplicados");
        for(int p: arrayUnicosDup){
            System.out.print(p + " ");
        }


        /* ---- ORDENAÇÃO ---- */
        comparacoesOrdenacao = 0;
        for(int i = 0; i < array2.length; i++){
            for(int j = i + 1; j < array2.length; j++){
                comparacoesOrdenacao++;
                if(array2[i] > array2[j]){
                    aux = array2[i];
                    array2[i] = array2[j];
                    array2[j] = aux;

                }
            }
        }

        // RELATÓRIO
        System.out.println("\n\n[BUSCA LINEAR] No pior caso, são feitas " + comparacoesBusca +  " comparações no array duplicado.");
        System.out.println("[REMOCAO DUPLICADOS] São feitas " + comparacoesRemoDupli + " comparações no array.");
        System.out.println("[ORDENAÇÃO] Foram feitas " + comparacoesOrdenacao +  " comparações no array duplicado.");

    }
}
