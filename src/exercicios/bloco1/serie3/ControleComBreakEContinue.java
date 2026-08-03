package exercicios.bloco1.serie3;

import java.util.Scanner;

public class ControleComBreakEContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número que servirá de limite para o laço for: ");
        int limite = sc.nextInt();

        String listaImpressao = "";
        boolean flagCondicao = false;
        for(int i = 1; i < limite; i++){
            if(i % 4 == 0){
                continue;
            }
            listaImpressao += i + " ";
            if((i > 50) && ((i % 7 == 0) &&(i % 9 == 0))){ //Só satisfará essa condição quando chegar no 63
                System.out.println("interrupção em: " + i);
                flagCondicao = true;
                break;
            }
        }
        System.out.println("----------------------");
        if(!flagCondicao){
            System.out.println("\nNenhum valor de interrupção encontrado.");
        }
        System.out.println("\nA lista que respeita as condições é: ");
        System.out.println(listaImpressao);
    }
}
