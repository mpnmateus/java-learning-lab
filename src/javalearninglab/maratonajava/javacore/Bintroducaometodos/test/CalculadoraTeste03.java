package javalearninglab.maratonajava.javacore.Bintroducaometodos.test;

import javalearninglab.maratonajava.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        double result = calc.divideDoisNumeros(3, 4);
        System.out.println(result);
    }
}
