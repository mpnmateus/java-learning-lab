package exercicios.bloco1.serie2;

import java.util.Scanner;

public class CLassificacaoTriangulos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a medida de três lados de um triângulo");
        System.out.println("Medida 1:");
        int lado1 = sc.nextInt();
        System.out.println("Medida 2:");
        int lado2 = sc.nextInt();
        System.out.println("Medida 3:");
        int lado3 = sc.nextInt();

        boolean ehTriangulo = false;

        if(lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2)){
            ehTriangulo = true;
        }

        if(!ehTriangulo){
            System.out.println("Não é um triângulo.");
            return;
        }

        if((lado1 == lado2) && (lado1 ==lado3)){
            System.out.println("Esse é um triângulo equilátero");
        } else if((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3)){
            System.out.println("Esse triângulo é isósceles.");
        } else {
            System.out.println("Esse triângulo é escaleno.");
        }

    }
}
