package exercicios.bloco1.serie4;

import java.util.Random;
import java.util.Scanner;

public class RemocaoDuplicados {
    public static void main(String[] args) {
        //Crie um novo array contendo somente a primeira ocorrência de cada valor do array original. Não use Collections.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do array: ");
        int tamanho = sc.nextInt();
        int[] array = new int[tamanho];

        // PREENCHENDO O ARRAY
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(5);
        }

        // IMPRIMINDO O ARRAY
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posicao " + i + ": " + array[i]);
        }
        // INVESTIGAR QUANTIDADE DE REPETIDOS
        int repetidos = 0;
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                boolean jaApareceu = false;
                for (int j = i - 1; j >= 0; j--) {
                    if (array[i] == array[j]) {
                        jaApareceu = true;
                        break;
                    }
                }
                if(jaApareceu){
                    repetidos++;
                }
            }
        }

        // INSTANCIAR NOVO ARRAY COM TAMANHO DA QUANTIDADE DOS SINGULARES
        int tamanhoArraySingulares = (array.length - repetidos);
        int[] arraySingulares = new int[tamanhoArraySingulares];
        System.out.println("Tamanho do array de singulares: " + arraySingulares.length);

        // PREENCHER O NOVO ARRAY DE SINGULARES APENAS COM OS NAO REPETIDOS
        int indiceArraySing = 0;
        for(int i = 0; i < array.length; i++){
                boolean ehRepetido = false;
                for (int j = i - 1; j >= 0; j--){
                    if(array[i] == array[j]){
                        ehRepetido = true;
                        break;
                    }
                }
                if(!ehRepetido){
                    arraySingulares[indiceArraySing] = array[i];
                    indiceArraySing++;
                }
        }

        // IMPRIMINDO O ARRAY DE SINGULARES
        for (int i = 0; i < arraySingulares.length; i++) {
            System.out.println("Posicao " + i + ": " + arraySingulares[i]);
        }
    }
}
