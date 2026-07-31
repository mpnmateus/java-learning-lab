package exercicios.bloco1.serie3;

import java.util.Scanner;

public class TabuadaParametrizada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número para expor a tabuada: ");
        int num = sc.nextInt();
        System.out.println("Informe o limite inicial: ");
        int limiteInicial = sc.nextInt();
        System.out.println("Informe o limite final: ");
        int limiteFinal = sc.nextInt();

        boolean ehCrescente = limiteInicial < limiteFinal;

        if (ehCrescente) {
            System.out.println("\n --- Tabuada de " + num + " --- ");
            while(limiteInicial <= limiteFinal){
                int resultado = num * limiteInicial;
                System.out.println(num + " * " + limiteInicial + " = " + resultado);
                limiteInicial++;
            }
        } else {
            System.out.println("\n --- Tabuada de " + num + " --- ");
            while(limiteInicial >= limiteFinal){
                int resultado = num * limiteInicial;
                System.out.println(num + " * " + limiteInicial + " = " + resultado);
                limiteInicial--;
            }
        }

    }
}
