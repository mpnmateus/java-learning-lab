package javalearninglab.maratonajava.javacore.Lclassesabstratas.test;

import javalearninglab.maratonajava.javacore.Lclassesabstratas.domain.Desenvolvedor;
import javalearninglab.maratonajava.javacore.Lclassesabstratas.domain.Funcionario;
import javalearninglab.maratonajava.javacore.Lclassesabstratas.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Janine", 8500);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Mateus", 10000);
        System.out.println(desenvolvedor);
        System.out.println(gerente);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
