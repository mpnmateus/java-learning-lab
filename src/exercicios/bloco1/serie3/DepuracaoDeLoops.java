package exercicios.bloco1.serie3;

public class DepuracaoDeLoops {
    public static void main(String[] args) {
        //o erro;
        //a alteração realizada;
        //por que o código corrigido termina corretamente.

        // Trecho A: Deve imprimir de 1 a 10 e terminar.
        int contador = 1;
        while (contador <= 10) {
            System.out.println(contador);
            contador++; // Adicionei um iterador para não ficar em looping
        }

        // Trecho B: Deve imprimir exatamente os números de 0 a 9.
        for (int i = 0; i < 10; i++) { // O bounding (delimitação) estava em 10 (incluso). Diminui retirando o sinal de =
            System.out.println(i);
        }

        // Trecho C: Deve imprimir de 10 a 1 e terminar.
        for (int i = 10; i >= 1; i--) { // Mudei o iterador com um sinal de decremento, já que começa do 10 e vai até 1
            System.out.println(i);
        }

        // Trecho D: Deve somar os números de 1 a 5 e imprimir 15.
        int soma = 0;
        for (int i = 1; i <= 5; i++) { // O bounding (delimitação) estava em 4 pela falta do sinal de =, excluindo o 5
            soma += i; // Faltava o +, para transformar em operador de atribuição composta aritmético (pelo tipo da varíável)
        }
        System.out.println(soma);

    }
}
