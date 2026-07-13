package javalearninglab.maratonajava.javacore.Gassociacao.test;

import javalearninglab.maratonajava.javacore.Gassociacao.domain.Jogador;
import javalearninglab.maratonajava.javacore.Gassociacao.domain.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        // Para trabalhar relacionamento muitos para muitos (n-n)
        // Não vamos garantir regras de integridade que um BD costuma fazer (um jogador pode estar em dois times)
        // Agora, não importa por onde vamos começar a instanciar, já que ambos tem composição de objetos

        Jogador jogador = new Jogador("Mateus");
        Jogador jogador2 = new Jogador("Pelé");
        Time time = new Time("Seleção brasileira");
        Jogador[] jogadores = {jogador, jogador2};

        // Como é um relacionamento bidirecional, preciso setar corretamente os objetos
        jogador.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        jogador.imprime();
        jogador2.imprime();
        System.out.println("--- Time ---");
        time.Imprime();

    }
}
