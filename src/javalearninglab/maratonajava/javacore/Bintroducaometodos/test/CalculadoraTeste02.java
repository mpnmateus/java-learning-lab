package javalearninglab.maratonajava.javacore.Bintroducaometodos.test;

import javalearninglab.maratonajava.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTeste02 {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();

        // Passamos os argumentos conforme os parametros contidos no contrato do metodo
        c.multiplicaDoisNumeros(10, 20);
    }
}
