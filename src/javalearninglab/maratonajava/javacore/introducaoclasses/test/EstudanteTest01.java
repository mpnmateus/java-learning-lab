package javalearninglab.maratonajava.javacore.introducaoclasses.test;

import javalearninglab.maratonajava.javacore.introducaoclasses.model.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Mateus";
        estudante.idade = 34;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println("Endereço do objeto: " + estudante);
    }
}
