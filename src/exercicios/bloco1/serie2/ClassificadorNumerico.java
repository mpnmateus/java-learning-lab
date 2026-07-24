package exercicios.bloco1.serie2;

import java.util.Scanner;

public class ClassificadorNumerico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num = sc.nextInt();

        System.out.println();
        if (num > 0){
            System.out.println("O número é positivo.");
        } else if (num < 0){
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é 0.");
        }

        if(num % 2 == 0){
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
    }
}
