package javalearninglab.maratonajava.javacore.Bintroducaometodos.test;

import javalearninglab.maratonajava.javacore.Bintroducaometodos.domain.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Mateus";
        funcionario.idade = 32;
        funcionario.salarios[0] = 2500;
        funcionario.salarios[1] = 3250.65;
        funcionario.salarios[2] = 4200.52;

        System.out.printf("----- RELATÓRIO ----\n");
        funcionario.imprimeDados();
        funcionario.imprimirMediaSalarial();
    }
}
