package javalearninglab.maratonajava.javacore.Bintroducaometodos.test;

import javalearninglab.maratonajava.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest05 {
    public static void main(String... args) {
        Calculadora calc = new Calculadora();
        int[] numeros = {1,2,3,4,5,6};
        calc.somaArray(numeros);
        calc.somaVarArgs(1,2,3,4,5,6,7,8); // Posso passar inumeros argumentos que a JVM vai transformar isso em um array
    }
}
