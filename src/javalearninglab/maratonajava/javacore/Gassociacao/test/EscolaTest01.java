package javalearninglab.maratonajava.javacore.Gassociacao.test;

import javalearninglab.maratonajava.javacore.Gassociacao.domain.Escola;
import javalearninglab.maratonajava.javacore.Gassociacao.domain.Professor;

public class EscolaTest01 {

    public static void main(String[] args) {
        Professor professor1 = new Professor();
        Professor professor2 = new Professor();
        Escola escola = new Escola("EPA");
        professor1.setNome("Mateus");
        professor2.setNome("Janaína");

        Professor[] professores = {professor1, professor2};
        Escola escola2 = new Escola("EJA", professores);

        escola.setProfessores(professores);
        escola.Imprime();

        escola2.Imprime();
    }

}
