package javalearninglab.maratonajava.javacore.Npolimorfismo.test;

import javalearninglab.maratonajava.javacore.Npolimorfismo.domain.Computador;
import javalearninglab.maratonajava.javacore.Npolimorfismo.domain.Produto;
import javalearninglab.maratonajava.javacore.Npolimorfismo.domain.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Macbook", 12000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("-----------");

        Produto produto2 = new Tomate("Gaúcho", 10);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
    }
}
