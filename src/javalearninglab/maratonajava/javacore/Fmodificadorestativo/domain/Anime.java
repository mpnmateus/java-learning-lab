package javalearninglab.maratonajava.javacore.Fmodificadorestativo.domain;

public class Anime {
    private String nome;
    private static int[] episodios;
    // Ao criar um objeto:
    // 0. Bloco de inicialização é executado quando a JVM carregar a classe
    // 1. Alocado espaço em memória pro objeto
    // 2. cada atributo de classe é criado e inicializado com valores default (ou o que for passado)
    // 3. Executa bloco de inicialização
    // 4. Executa construtor

    // Toda vez que um objeto é criado, ele executa esse bloco de inicialização abaixo
    // Isso gera custo de processamento
    // Precisamos que o bloco de inicialização seja executado uma única vez (bloc de ini estático)
    static {
        // Executado antes do construtor
        System.out.println("Dentro do bloco de incialização estático 1."); // bloco de incialização não estático
        episodios = new int[100];
        for(int i = 0; i < episodios.length; i++){
            episodios[i] = i+1;
        }

    }
    static{
        System.out.println("Dentro do bloco de inicialização estático 2.");
    }
    static{
        System.out.println("Dentro do bloco de inicialização estático 3.");
    }
    {
        System.out.println("Dentro do bloco de inicializção não estático (de instância).");
    }

    public Anime(String nome){
        this.nome = nome;
    }

    public Anime(){
        for(int num: Anime.episodios){
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
