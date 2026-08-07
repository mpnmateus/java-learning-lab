package exercicios.bloco1.serie4;

import java.util.Random;
import java.util.Scanner;

public class Rotacao {
    public static void main(String[] args) {
        // Desloque todos os elementos uma posição para a direita, fazendo o último elemento ocupar a primeira posição.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do número: ");
        int tamanhoNum = sc.nextInt();
        int[] numeroArray = new int[tamanhoNum];

        // POPULAR ARRAY
        Random random = new Random();
        for(int i = 0; i < numeroArray.length; i++){
            numeroArray[i] = random.nextInt(10);
        }
        // IMPRIMIR NÚMERO
        System.out.print("Número: ");
        for(int j: numeroArray){
            System.out.print(j);
        }
        // INVERTENDO ARRAY
        int[] arrayInvertido = new int[tamanhoNum];
        int iterador = 0;
        for(int i = numeroArray.length-1; i >= 0; i--){
            arrayInvertido[iterador] = numeroArray[i];
            iterador++;
        }
        // IMPRIMINDO ARRAY INVERTIDO
        System.out.print("\nNúmero invertido: ");
        for(int k: arrayInvertido){
            System.out.print(k);
        }

    }
}
