package exercicios.bloco1.serie4;

import java.util.Random;
import java.util.Scanner;

public class SegundoMaiorValorDistinto {
    public static void main(String[] args) {
        // Determine o segundo maior valor do array, desconsiderando repetições.
        // Caso o array possua menos de dois valores distintos, imprima: "Não existe segundo maior valor distinto"
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do array: ");
        int tamanhoArray = sc.nextInt();

        // POPULANDO O ARRAY COM NÚMEROS RANDOMICOS ATÉ 14
        Random random = new Random();
        int[] array = new int[tamanhoArray];
        for(int i = 0; i < array.length; i++){
//            array[i] = random.nextInt(1); // Para testar menos de dois valores distintos
            array[i] = random.nextInt(10);
        }

        // IMPRIMINDO O ARRAY
        int contadorImpressao = 0;
        for(int j: array){
            System.out.println("Posição " + contadorImpressao + ": " + j);
            contadorImpressao++;
        }

        // MAIOR VALOR
        int maiorValor = 0;
        for(int i = 0; i < array.length; i++){
            if(i == 0){
                maiorValor = array[i];
            }
            if(array[i] > maiorValor){
                maiorValor = array[i];
            }
        }

        // SEGUNDO MAIOR VALOR
        int segundoMaior = 0;
        for(int i = 0; i < array.length; i++){
            if(i == 0 && array[i] < maiorValor){ // Se o primeiro é o maior valor, não atribui para não invalidar maiorValor como tal
                segundoMaior = array[i];
            }
            if(array[i] > segundoMaior && array[i] < maiorValor){
                segundoMaior = array[i];
            }
        }

        System.out.println("Maior valor: " + maiorValor);
        if(maiorValor == segundoMaior){
            System.out.println("Não existe segundo maior valor distinto");
            return;
        }
        System.out.println("Segundo maior valor: " + segundoMaior);

    }
}
