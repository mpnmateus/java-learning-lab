package javalearninglab.maratonajava.javacore.Aintroducaoclasses.test;

import javalearninglab.maratonajava.javacore.Aintroducaoclasses.model.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mestre";
        professor.idade = 60;
        professor.sexo = 'M';
        System.out.println(professor.nome);
        System.out.println(professor.idade);
        System.out.println(professor.sexo);
    }
}
