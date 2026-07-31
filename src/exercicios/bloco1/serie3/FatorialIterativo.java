package exercicios.bloco1.serie3;

import java.util.Scanner;

public class FatorialIterativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número para calcular seu fatorial.");
        int num = sc.nextInt();
        int fatorial = 0;
        if(num ==0){
            fatorial = 1;
        } else {
            fatorial = num;
        }
        for(int i = 1; i < num; i++) {
            fatorial = fatorial * (num - i);
        }
        System.out.println("O fatorial de " + num + " é: " + fatorial);
    }
}
