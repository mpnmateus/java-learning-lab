package javalearninglab.maratonajava.javacore.Gassociacao.associationExercicies.domain;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        if(seminario != null
            && this.seminario != null
                && this.seminario != seminario) {
            System.out.println("O aluno " + this.nome + " já está cadastrado em outro seminário ("
                    + this.seminario.getTitulo() + ").");
        }
        this.seminario = seminario;
    }
}
