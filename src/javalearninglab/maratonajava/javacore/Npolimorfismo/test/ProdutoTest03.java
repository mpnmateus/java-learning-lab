package javalearninglab.maratonajava.javacore.Npolimorfismo.test;

import javalearninglab.maratonajava.javacore.Npolimorfismo.domain.Computador;
import javalearninglab.maratonajava.javacore.Npolimorfismo.domain.Produto;
import javalearninglab.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import javalearninglab.maratonajava.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("MacbookAir", 12000);

        Tomate tomate = new Tomate("Tomate Gaúcho", 10);
        tomate.setDataValidade("11/12/2026");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println();
        CalculadoraImposto.calcularImposto(produto);

    }
}
