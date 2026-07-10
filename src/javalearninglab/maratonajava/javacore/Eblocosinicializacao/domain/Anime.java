package javalearninglab.maratonajava.javacore.Eblocosinicializacao.domain;

public class Anime {
    private String nome;
    private int[] episodios;
    // Ao criar um objeto:
    // 1. Alocado espaço em memória pro objeto
    // 2. cada atributo de classe é criado e inicializaco com valores default (ou o que for passado)
    // 3. Executa bloco de inciailização
    // 4. Executa construtor

    {
        // Executado antes do construtor
        System.out.println("Dentro do bloco de incialização de instância."); // bloco de incialização não estático
        episodios = new int[100];
        for(int i = 0; i < episodios.length; i++){
            episodios[i] = i+1;
        }

    }

    public Anime(String nome){
        this.nome = nome;
    }

    public Anime(){
        for(int num: this.episodios){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
