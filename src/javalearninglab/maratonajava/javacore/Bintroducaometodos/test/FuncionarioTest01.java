package javalearninglab.maratonajava.javacore.Bintroducaometodos.test;

import javalearninglab.maratonajava.javacore.Bintroducaometodos.domain.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        /*
        funcionario.nome = "Mateus";
        funcionario.idade = 32;
        // comentado para verificar as medidas de segurança no programa
        //double[] salarios = new double[]{2500, 3250.65, 4200.52};

        System.out.println("----- RELATÓRIO ----\n");
        funcionario.imprimeDados();
        funcionario.imprimirMediaSalarial();

         */
        funcionario.setNome("Mateus");
        funcionario.setIdade(34);
        funcionario.setSalarios(new double[]{2000.5,2800.62,3000});
        funcionario.imprimeDados();
        funcionario.imprimirMediaSalarial();
        System.out.println(funcionario.getMedia());
    }
}
