package exercicios.bloco1.serie1;

public class ConcatenacaoEPrecedencia {
    public static void main(String[] args) {
        // Sem executar o programa inicialmente, escreva em comentário a saída esperada de cada linha:
        System.out.println(10 + 20 + " Java"); // 30 Java
        System.out.println("Java " + 10 + 20); // Java 1020
        System.out.println("Resultado: " + 10 * 2); // Resultado: 20
        System.out.println("Resultado: " + 10 + 2 * 3); // Resultado: 106
        System.out.println(10 + 2 * 3 + " Resultado"); // 106 Resultado
        System.out.println("Resultado: " + (10 + 2) * 3); // Resultado: 306
        System.out.println("A" + 1 + 2 + 3); // A123
        System.out.println(1 + 2 + 3 + "A"); // 6A
        System.out.println("Média: " + (7 + 8 + 9) / 3.0); // Média: 8

        System.out.println();
        // Escreva expressões que gerem exatamente estas saídas:
        System.out.println("Java " + 3 + 0);
//        Java 30
        System.out.println("Resultado: " + 3 + 6);
//        Resultado: 36
        System.out.println("Total: " + 6 + 0);
//        Total: 60
        System.out.println("A" + 6);
//        A6
        System.out.println(3 + 3 + "A");
//        6A
        System.out.println("10 + 20 = 30");
//        10 + 20 = 30
        System.out.println("Média: " + (4D + 4D));
//        Média: 8.0
    }
}
