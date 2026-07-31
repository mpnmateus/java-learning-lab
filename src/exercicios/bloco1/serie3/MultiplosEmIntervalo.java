package exercicios.bloco1.serie3;

import java.util.Scanner;

public class MultiplosEmIntervalo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um nº para iniciar as divisões: ");
        int inicio = sc.nextInt();
        System.out.println("Digite um nº para iniciar as divisões: ");
        int fim = sc.nextInt();
        System.out.println("Digite o divisor: ");
        int divisor = sc.nextInt();
        boolean ehCrescente = inicio < fim;


        System.out.println(" --- Divisões exatas pelo divisor " + divisor + " --- ");
        if(ehCrescente) {
            for (int i = inicio; i <= fim; i++) {
                if (i % divisor == 0) {
                    int resultado = i / divisor;
                    System.out.println(i + " / " + divisor + " = " + resultado);
                }
            }
        } else {
            for (int i = inicio; i >= fim; i--) {
                if (i % divisor == 0) {
                    int resultado = i / divisor;
                    System.out.println(i + " / " + divisor + " = " + resultado);
                }
            }
        }
    }
}
