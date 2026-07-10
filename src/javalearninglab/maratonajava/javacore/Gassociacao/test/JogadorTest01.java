package javalearninglab.maratonajava.javacore.Gassociacao.test;

import javalearninglab.maratonajava.javacore.Gassociacao.domain.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        // Importante entendimento para associação
        // Importante entendimento para coleções (Listas, maps, sets, etc) - mesmo princípio
        Jogador jogador1 = new Jogador("Messi");
        Jogador jogador2 = new Jogador("Haaland");
        Jogador jogador3 = new Jogador("Vini Jr.");
        Jogador jogador4 = new Jogador("Maradona");

//        Jogador[] jogadores = new Jogador[4];
//        Jogador[] jogadores = new Jogador[]{jogador1, jogador2, jogador3, jogador4};
        Jogador[] jogadores = {jogador1, jogador2, jogador3, jogador4};
        // jogadores[0] == jogador1 // Agora, Messi tem duas variáveis de refrência apontando para ele

        for(Jogador j: jogadores){
            j.imprime();
        }

    }
}
