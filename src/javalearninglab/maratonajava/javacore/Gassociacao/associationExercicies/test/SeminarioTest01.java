package javalearninglab.maratonajava.javacore.Gassociacao.associationExercicies.test;

import javalearninglab.maratonajava.javacore.Gassociacao.associationExercicies.domain.Aluno;
import javalearninglab.maratonajava.javacore.Gassociacao.associationExercicies.domain.Local;
import javalearninglab.maratonajava.javacore.Gassociacao.associationExercicies.domain.Professor;
import javalearninglab.maratonajava.javacore.Gassociacao.associationExercicies.domain.Seminario;

public class SeminarioTest01 {
    public static void main(String[] args) {
        Local local1 = new Local("Casa do norte");
        Local local2 = new Local("Muralha");

        Aluno aluno1 = new Aluno("Mateus", 34);
        Aluno aluno2 = new Aluno("Jon Snow", 24);

        Seminario seminario1 = new Seminario("Lidando com espadas",
                local1,
                new Aluno[]{aluno1, aluno2});
        Seminario seminario2 = new Seminario("Sobrevivencia no inverno", local2);

        Seminario[] seminariosDisponiveis = {seminario1, seminario2};

        Professor professor1 = new Professor("Ned Stark", "Artes marciais", seminariosDisponiveis);
        professor1.imprime();


//        seminario2.setAlunos(new Aluno[]{aluno1});
//
//        aluno1.setSeminario(seminario1);
//        aluno1.setSeminario(seminario2);
//        aluno2.setSeminario(seminario1);
//
//        professor1.setSeminarios(seminariosDisponiveis);



        System.out.println("\n\n --- INSCRIÇÕES --- ");
        for(int i = 0; i < seminariosDisponiveis.length; i++){
            System.out.println("\nSeminário " + (i+1));
            seminariosDisponiveis[i].imprime();
            System.out.println();
        }

        System.out.println("\n" + aluno1.getNome() + " está inscrito em: " +
                 aluno1.getSeminario().getTitulo());
    }
}
