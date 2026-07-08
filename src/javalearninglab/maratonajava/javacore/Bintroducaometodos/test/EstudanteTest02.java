package javalearninglab.maratonajava.javacore.Bintroducaometodos.test;

import javalearninglab.maratonajava.javacore.Bintroducaometodos.domain.Estudante;

public class EstudanteTest02 {

    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        estudante01.nome = "Mateus";
        estudante01.idade = 34;
        estudante01.sexo = 'M';

        estudante02.nome = "Juliana";
        estudante02.idade = 37;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
    }

}
