package javalearninglab.maratonajava.javacore.Gassociacao.associationExercicies.domain;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios = new Seminario[0];

    public Professor(String nome, String especialidade){
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this(nome, especialidade);
        setSeminarios(seminarios);
    }

    public void imprime(){
        System.out.println(" --- Professor ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);

        if(seminarios.length == 0){
            System.out.println("Seminários: nenhum seminário.");
            return;
        }

        System.out.print("Seminários: ");

        for(int i = 0; i < seminarios.length; i++){
            System.out.print(seminarios[i].getTitulo());
            if(i < seminarios.length - 1){
                System.out.print(", ");
            } else {
                System.out.print(".");
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        if (seminarios == null) {
            this.seminarios = new Seminario[0];
            return;
        }

        this.seminarios = seminarios;
    }
}
