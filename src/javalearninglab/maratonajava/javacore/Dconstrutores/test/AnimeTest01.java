package javalearninglab.maratonajava.javacore.Dconstrutores.test;


import javalearninglab.maratonajava.javacore.Dconstrutores.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Dragon Ball Z", "Streaming", 24, "Ação", "Estudio ghibli");
        Anime anime2 = new Anime(); // Para demonstrar construtor sem argumentos (mas com incialização padrão para cada tipo)
        anime.imprime();
        System.out.println("-----");
        anime2.imprime();
    }
}
