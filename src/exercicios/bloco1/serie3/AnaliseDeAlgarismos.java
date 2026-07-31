package exercicios.bloco1.serie3;

import java.util.Scanner;

public class AnaliseDeAlgarismos {
    public static void main(String[] args) {
        // Receba um número inteiro positivo e determine quantidade de algarismos, soma dos algarismos e número invertido.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo: ");
        int num = sc.nextInt();
        // resto da divisao por 10 encontra o ultimo algarismo
        // divisao inteira por 10 remove o ultimo algarismo
        int resto = 0;
        int ultimo= 0;
        while(resto != 0 ) {
            ultimo = num % 10;
            int ultimoNumero = resto % 10; // pegar o ultimo numero
        }
    }
}
