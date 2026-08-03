package exercicios.bloco1.serie3;

import java.util.Scanner;

public class SequenciaFibonacci {
    public static void main(String[] args) {
        // Receba a quantidade de termos e apresente a sequência correspondente. Trate quantidades inválidas.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de termos: ");
        int termos = sc.nextInt();
        int num1 = 0; // n-2
        int num2 = 1; // n-1

        // f(n) = f(n-1) + f(n-2)
        String sequenciaFibonacci = "" + num1 + " " + num2;
        int termoN = 0;
        for(int i = 3; i <= termos; i++){
            termoN = num2 + num1;
            num1 = num2;
            num2 = termoN;
            sequenciaFibonacci += " " + termoN;
        }
        System.out.println("\nA sequência Fibonacci para " + termos + " termos é: ");
        System.out.println(sequenciaFibonacci);
    }
}
