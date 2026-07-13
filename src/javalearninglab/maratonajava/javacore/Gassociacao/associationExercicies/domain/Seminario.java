package javalearninglab.maratonajava.javacore.Gassociacao.associationExercicies.domain;

public class Seminario {
    private String titulo;
    private Aluno[] alunos = new Aluno[0];
    private Local local;

    public Seminario(String titulo, Local local){
        if(local == null) {
            System.out.println("O seminário deve possuir um local.");
        }
        this.titulo = titulo;
        this.local = local;
    }
    public Seminario(String titulo, Local local, Aluno[] alunos){
        this(titulo, local);
        setAlunos(alunos); // Para garantir integridade na associação bidirecional
   }
    public void imprime(){
        System.out.println("Título: " + this.titulo);
        System.out.println("Local: " + local.getEndereco());
        if(alunos.length == 0) {
            System.out.println("Alunos inscritos: nenhum aluno.");
            return;
        }
        System.out.print("Alunos inscritos: ");
        for(int i = 0; i < alunos.length; i++){
            System.out.print(alunos[i].getNome());
            if(i < alunos.length - 1){
                System.out.print(", ");
            } else {
                System.out.print(".");
            }
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        Aluno[] novosAlunos;
        if(alunos == null){
            novosAlunos = new Aluno[0];
        } else {
            novosAlunos = alunos;
        }
        for(Aluno aluno: novosAlunos){
            if(aluno == null){
                System.out.println("O array não pode conter um aluno nulol.");
            }
            Seminario seminarioAtual = aluno.getSeminario();
            if(seminarioAtual != null && seminarioAtual != this){
                System.out.println("O aluno " + aluno.getNome() + " já está inscrito em " +
                        "outo seminário.");
            }
        }
        this.alunos = novosAlunos;
        for(Aluno aluno: this.alunos){
            aluno.setSeminario(this);
        }
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        if(local == null) {
            System.out.println("Um seminário deve possuir um local.");
            return;
        }
        this.local = local;
    }
}
