package javalearninglab.maratonajava.javacore.Npolimorfismo.test;

import javalearninglab.maratonajava.javacore.Npolimorfismo.domain.Computador;
import javalearninglab.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import javalearninglab.maratonajava.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("MacbookAir", 12000);
        Tomate tomate = new Tomate("Gaúcho", 10);

        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println();
        CalculadoraImposto.calcularImpostoTomate(tomate);
    }
}
