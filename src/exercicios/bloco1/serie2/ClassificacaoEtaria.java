package exercicios.bloco1.serie2;

import java.util.Scanner;

public class ClassificacaoEtaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma idade.");
        int idade = sc.nextInt();
        if(idade < 0 || idade > 110){
            System.out.println("Idade inválida.");
        } else if (idade > 18){
            System.out.println("Maior idade.");
        } else{
            System.out.println("Menor idade.");
        }
    }
}
