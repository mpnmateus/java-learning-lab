package javalearninglab.maratonajava.javacore.Gassociacao.domain;

public class Jogador {
    private String nome;
    private Time time;

    public void imprime(){
        System.out.println(this.nome);
        if (this.time != null) System.out.println(this.time.getNome());
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }
    // Vai poder se vincular a um time depois
    public void setTime(Time time) {
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
