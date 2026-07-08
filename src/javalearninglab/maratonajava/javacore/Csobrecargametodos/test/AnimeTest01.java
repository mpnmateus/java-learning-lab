package javalearninglab.maratonajava.javacore.Csobrecargametodos.test;

import javalearninglab.maratonajava.javacore.Csobrecargametodos.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
//        anime.setTipo("Streaming");
//        anime.setEpisodios(24);
//        anime.setNome("Dragon Ball Z");
        //anime.init("Dragon Ball Z", "Streaming", 24);
        anime.init("Dragon Ball Z", "Streaming", 24, "Ação");
        anime.imprime();
    }
}
