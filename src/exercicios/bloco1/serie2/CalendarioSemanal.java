package exercicios.bloco1.serie2;

import java.util.Scanner;

public class CalendarioSemanal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 7 para saber a correspondência em dia da semana: ");
        int dia = sc.nextInt();

        switch (dia){
            case 7:
                System.out.println("Fim de semana");
                System.out.println("Sábado");
                break;
            case 1:
                System.out.println("Fim de semana");
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Dia de semana");
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Dia de semana");
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Dia de semana");
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Dia de semana");
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Dia de semana");
                System.out.println("Sexta-feira");
                break;
            default:
                System.out.println("Valor inválido.");
                break;
        }
    }
}
