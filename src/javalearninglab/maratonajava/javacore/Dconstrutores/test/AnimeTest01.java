package javalearninglab.maratonajava.javacore.Dconstrutores.test;


import javalearninglab.maratonajava.javacore.Dconstrutores.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Dragon Ball Z", "Streaming", 24, "Ação");
        Anime anime2 = new Anime();
        anime.imprime();
        System.out.println("-----");
        anime2.imprime();
    }
}
