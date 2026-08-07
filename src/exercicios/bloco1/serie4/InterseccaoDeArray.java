package exercicios.bloco1.serie4;

import java.util.Random;
import java.util.Scanner;

public class InterseccaoDeArray {
    public static void main(String[] args) {
        // Receba dois arrays e produza um terceiro contendo os valores presentes em ambos, sem repetições.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho de ambos os arrays: ");
        int tamanhoArray = sc.nextInt();

        // INSTANCIANDO OS DOIS ARRAYS
        int[] array1 = new int[tamanhoArray];
        int[] array2 = new int[tamanhoArray];

        Random random = new Random();

        // PREENCHENDO O PRIMEIRO ARRAY
        for(int i = 0; i < array1.length; i++){
            array1[i] = random.nextInt(8);
        }
        // PREENCHENDO O SEGUNDO ARRAY
        for(int i = 0; i < array2.length; i++){
            array2[i] = random.nextInt(8);
        }

        //IPRIMINDO O PRIMEIRO ARRAY
        System.out.println("Array 1: ");
        for(int i = 0; i < array1.length; i++){
            System.out.print(array1[i] + " ");
//            System.out.println("Posicao " + i + ": " + array1[i]);
        }
        //IPRIMINDO O SEGUNDO ARRAY
        System.out.println("\nArray 2: ");
        for(int i = 0; i < array2.length; i++){
            System.out.print(array2[i] + " ");
//            System.out.println("Posicao " + i + ": " + array2[i]);
        }

        // ARRAY AUXILIAR PARA INDICAR AQUELES QUE ESTÃO SENDO REPETIDOS
        int[] arrayAuxRepetido = new int[tamanhoArray];
        for(int i = 0; i < arrayAuxRepetido.length; i++){
            arrayAuxRepetido[i] = 0;
        }

        // PERCORRENDO O ARRAY 2 COM CADA ELEMENTO DO ARRAY 1
        int tamanhoArraySingulares = 0;
        for(int i = 0; i < array1.length; i++){
            boolean existeNoOutroArray = false;
            for(int j = 0; j < array2.length; j++){
                if(array1[i] == array2[j] && arrayAuxRepetido[j] == 0){
                    existeNoOutroArray = true;
                    arrayAuxRepetido[j] = 1;
                }
            }
            if(existeNoOutroArray){
                tamanhoArraySingulares++;
            }
        }
        // INSTANCIANDO ARRAY DE SINGULARES
        int[] arraySingulares = new int[tamanhoArraySingulares];
        System.out.println("\nTamanho do novo array de singulares: " + arraySingulares.length);


        // ARRAY AUXILIAR PARA INDICAR AQUELES QUE ESTÃO SENDO REPETIDOS
        for(int i = 0; i < arrayAuxRepetido.length; i++){
            arrayAuxRepetido[i] = 0;
        }

        // PREENCHENDO ARRAY DE SINGULARES
        int indiceSingulares = 0;
        for(int i = 0; i < array1.length; i++){
            boolean existeNoOutroArray = false;
            for(int j = 0; j < array2.length; j++){
                if(array1[i] == array2[j] && arrayAuxRepetido[j] == 0){
                    existeNoOutroArray = true;
                    arrayAuxRepetido[j] = 1;
                }
            }
            if(existeNoOutroArray){
                arraySingulares[indiceSingulares] = array1[i];
                indiceSingulares++;
            }
        }

        // IMPRIMINDO ARRAY DE SINGULARES
        System.out.println("Array de singulares: ");
        for(int k: arraySingulares){
            System.out.println(k);
        }

    }
}
