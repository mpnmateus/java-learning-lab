package exercicios.bloco1.serie4;

import java.util.Random;
import java.util.Scanner;

public class SeparacaoParesImpares {
    public static void main(String[] args) {
        // A partir de um array original, crie um array contendo apenas os pares e outro contendo apenas os ímpares, sem deixar espaços indevidos.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do array: ");
        int tamanhoArray = sc.nextInt();
        int[] array = new int[tamanhoArray];

        // POPULANDO O ARRAY
        Random random = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(16);
        }
        // IMPRIMINDO O ARRAY
        int iteradorImpressao = 0;
        for(int k: array){
            System.out.println("Posição " + iteradorImpressao + ": " + k);
            iteradorImpressao++;
        }
        // QUANTIDADE PARA INSTANCIAR ARRAY PARA PARES E PARA ÍMPARES
        int qntPares = 0;
        int qntImpares = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                qntPares++;
            } else {
                qntImpares++;
            }
        }
        /*
        qntImpares = array.length - qntPares;
        **/


        // QUANTIDADE PARA INSTANCIAR ARRAY PARA PARES E PARA ÍMPARES
        int[] arrayPares = new int[qntPares];
        int[] arrayImpares = new int[qntImpares];
        int j = 0;
        int l = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                arrayPares[j] = array[i];
                j++;
            } else {
                arrayImpares[l] = array[i];
                l++;
            }
        }

        // IMPRIMINDO ARRAY PARES
        System.out.println("Array de pares: ");
        for(int i = 0; i < arrayPares.length; i++){
            System.out.println("Posição " + i  + ": " + arrayPares[i]);
        }

        // IMPRIMINDO ARRAY DE ÍMPARES
        System.out.println("Array de ímpares: ");
        for(int i = 0; i < arrayImpares.length; i++){
            System.out.println("Posição " + i  + ": " + arrayImpares[i]);
        }
    }
}
