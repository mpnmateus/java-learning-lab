package javalearninglab.maratonajava.javacore.Bintroducaometodos.test;

import javalearninglab.maratonajava.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        double result = calc.divideDoisNumeros(3, 4);
        System.out.println(result);
        System.out.println(calc.divideDoisNumeros02(20,2));

        System.out.println("\n----------");
        calc.imprimeDivisaoDeDoisNumeros(50, 0);
    }
}
