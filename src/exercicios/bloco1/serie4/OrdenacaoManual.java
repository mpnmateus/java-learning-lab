package exercicios.bloco1.serie4;

import java.util.Random;
import java.util.Scanner;

public class OrdenacaoManual {
    // Ordene um array em ordem crescente sem utilizar Arrays.sort. Depois, adapte para ordem decrescente.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do array: ");
        int tamanhoArray = sc.nextInt();

        // INSTANCIANDO O ARRAY COM O TAMANHO INFORMADO
        int[] array = new int[tamanhoArray];

        // INTANCIANDO O OBJETO DO TIPO RANDOM
        Random random = new Random();

        // PREENCHENDO O ARRAY
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(15);
        }

        // IMPRIMINDO O ARRAY
        System.out.println("Array: ");
        for(int k: array){
            System.out.print(k + " ");
        }

        // ORDENANDO CRESCENTE
        int aux = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i] > array[j]){
                    aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }

        // IMPRIMINDO ARRAY CRESCENTE
        System.out.println("\nArray ordenado de forma crescente: ");
        for(int n: array){
            System.out.print(n + " ");
        }

        // INSTANCIANDO O ARRAY COM O TAMANHO INFORMADO
        int[] array2 = new int[tamanhoArray];

        // PREENCHENDO O ARRAY
        for(int i = 0; i < array2.length; i++){
            array2[i] = random.nextInt(15);
        }

        // IMPRIMINDO O ARRAY
        System.out.println("\n\n\nArray 2: ");
        for(int k: array2){
            System.out.print(k + " ");
        }

        // ORDENANDO DECRESCENTE
        aux = 0;
        for(int i = 0; i < array2.length; i++){
            for(int j = i + 1; j < array2.length; j++){
                if(array2[i] < array2[j]){
                    aux = array2[i];
                    array2[i] = array2[j];
                    array2[j] = aux;
                }
            }
        }

        // IMPRIMINDO ARRAY DECRESCENTE
        System.out.println("\nArray ordenado de forma decrescente: ");
        for(int n: array2){
            System.out.print(n + " ");
        }


    }
}
