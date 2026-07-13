package javalearninglab.maratonajava.javacore.Gassociacao.domain;

public class Professor {
    private String nome;

    // Uma escola pode ter vários professores
    // O professor só pode ter (trabalhar) em uma escola


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
