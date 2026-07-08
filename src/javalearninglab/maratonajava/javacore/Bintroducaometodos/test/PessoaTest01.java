package javalearninglab.maratonajava.javacore.Bintroducaometodos.test;

import javalearninglab.maratonajava.javacore.Bintroducaometodos.domain.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setName("Mateus");
        p.setIdade(-4);
        p.imprime();
        System.out.println("-----");

        System.out.println(p.getNome());
        System.out.println(p.getIdade());
    }
}
