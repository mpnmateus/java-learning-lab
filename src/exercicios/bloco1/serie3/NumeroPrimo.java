package exercicios.bloco1.serie3;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        // Informe se um número é primo. Depois, exiba todos os primos dentro de um intervalo informado.
        Scanner sc = new Scanner(System.in);

        System.out.println(" --- Definição de número primo ---");
        System.out.println("Digite o número: ");
        int numero = sc.nextInt();

        int soma = 0;
        // Existe algum nº entre 2 e o nº anterior a ele que o divide sem deixar resto? Se houver ao menos um, ele não é primo.
        for(int i = 2; i < numero; i++){
            if(numero % i == 0){
                soma++;
            }
        }
        if(numero > 1 && soma < 1){
            System.out.println("O número " + numero + " é primo.");
        } else {
            System.out.println("O número " + numero + " não é primo.");
        }

        System.out.println("-------------------------------------");
        System.out.println("\n --- Exibição de números primos ---");
        System.out.println("Digite o primeiro número do intervalo: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o primeiro número do intervalo: ");
        int num2 = sc.nextInt();


        String listaNumerosPrimos = "";
        for(int i = num1; i <= num2; i++){
            int contador = 0;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    contador++;
                }
            }
            if(i > 1 && contador < 1){
                listaNumerosPrimos += i + " ";
            }
        }
        System.out.println("Do intervalo de " + num1 + " e " + num2 + " a lista de números primos é: " + "\n" + listaNumerosPrimos);

    }
}
