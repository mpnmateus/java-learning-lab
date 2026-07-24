package exercicios.bloco1.serie2;

import java.util.Scanner;

public class SituacaoAcademica {
    public static void main(String[] args) {
        // Nota mínima: 7,0
        // Frequência mínima: 70%
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota do estudante.");
        int n1 = sc.nextInt();
        System.out.println("Digite a segunda nota do estudante.");
        int n2 = sc.nextInt();
        System.out.println("Digite o percentual de frequência do estudante.");
        int frequencia = sc.nextInt();

        int media = (n1 + n2) / 2;

        if(media >= 70 && frequencia >= 70){
            System.out.println("Aprovado.");
        } else if ((media < 70) && (frequencia >= 70)) {
            System.out.println("Em recuperação.");
        } else {
            System.out.println("Reprovado por falta.");
        }
    }
}
