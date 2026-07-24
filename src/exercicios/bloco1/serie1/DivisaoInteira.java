package exercicios.bloco1.serie1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DivisaoInteira {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro o qual será o dividendo: ");
        int dividendo = sc.nextInt();
        System.out.println("Digite outro número inteiro o qual será o divisor: ");
        int divisor = sc.nextInt();

        int quociente = (int) dividendo / divisor;
        int resto = dividendo % divisor;

        System.out.println(" --- RELATÓRIO DA DIVISÃO INTEIRA --- ");
        System.out.println("|  O quociente inteiro da divisao - quantas vezes o " + divisor + " cabe dentro de " + dividendo +
                " sem contemplar a parte decimal, é: " + quociente + ".");
        System.out.println("|  O resto - o que sobra - da divisao de " + dividendo + " por " + divisor +
                " é: " + resto + ".");
        System.out.println("--------------------------------------");
    }
}
