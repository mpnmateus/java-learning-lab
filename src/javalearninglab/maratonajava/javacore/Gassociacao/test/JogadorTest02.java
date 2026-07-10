package javalearninglab.maratonajava.javacore.Gassociacao.test;

import javalearninglab.maratonajava.javacore.Gassociacao.domain.Jogador;
import javalearninglab.maratonajava.javacore.Gassociacao.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Mateus");
        Time time = new Time("Brasil");

        //Vou cadastrar o jogador em um time (criando a relação entre os objetos) - associação unidirecional
        jogador.setTime(time);
        jogador.imprime();
    }
}
