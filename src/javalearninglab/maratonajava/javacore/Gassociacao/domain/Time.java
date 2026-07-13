package javalearninglab.maratonajava.javacore.Gassociacao.domain;

public class Time {
    // Nesse exemplo não trabalharemos com integridade dos dados (principio de BD)
    // Um Jogador pode estar em dois times ao mesmo tempo (problema de integridade)
    private String nome;
    private Jogador[] jogadores; // para conferir um relacionamento de muitos para muitos (N-N)

    public Time(String nome){
        this.nome = nome;
    }
    public Time(String nome, Jogador[] jogadores){
        this(nome);
        this.jogadores = jogadores;
    }
    public void Imprime(){
        System.out.println(this.nome);
        if(jogadores == null) return; // Porque jogadores não é obrigatório
        for(Jogador j: jogadores){
            System.out.println(j.getNome());
        }
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setJogadores(Jogador[] jogadores){ this.jogadores = jogadores; }
}
