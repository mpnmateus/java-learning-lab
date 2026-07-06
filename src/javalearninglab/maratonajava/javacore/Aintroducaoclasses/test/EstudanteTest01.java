package javalearninglab.maratonajava.javacore.Aintroducaoclasses.test;

import javalearninglab.maratonajava.javacore.Aintroducaoclasses.model.Estudante;

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


        Estudante estudante2 = new Estudante();
        //Para ver a inicializacao padrao de cada atributo do objeto:
        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
    }
}
