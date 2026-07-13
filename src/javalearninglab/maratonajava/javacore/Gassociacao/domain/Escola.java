package javalearninglab.maratonajava.javacore.Gassociacao.domain;

public class Escola {
    private String nome;
    private Professor[] professores;
    // Uma escola pode ter vários professores
    // O professor só pode ter (trabalhar) em uma escola

    public Escola(String nome){
        // Posso criar uma escola sem ter professores (dps associa-se)
        this.nome = nome;
    }
    public Escola(String nome, Professor[] professores){
        // Posso criar uma escola sem ter professores (dps associa-se)
        this(nome);
        this.professores = professores;
    }

    public void Imprime(){
        System.out.println(this.nome);
        if(professores == null) return; // Porque professores não é obrigatório
        for(Professor p: professores){
            System.out.println(p.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setProfessores(Professor[] professores){ this.professores = professores; }
    public Professor[] getProfessores(){ return professores; }
}
