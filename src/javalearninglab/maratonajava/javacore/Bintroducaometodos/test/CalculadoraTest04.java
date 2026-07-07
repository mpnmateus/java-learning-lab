package javalearninglab.maratonajava.javacore.Bintroducaometodos.test;

import com.sun.security.jgss.GSSUtil;
import javalearninglab.maratonajava.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int num1 = 2;
        int num2 = 5;
        calc.alteraDoisNumeros(num1, num2);
        System.out.println("\n---------");
        System.out.println("Dentro da classe de teste: ");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }
}
