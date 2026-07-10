package javalearninglab.maratonajava.javacore.Fmodificadorestativo.test;

import javalearninglab.maratonajava.javacore.Fmodificadorestativo.domain.Carro;

public class CarroTest01 {
    static String test;
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 290);
        Carro c2 = new Carro("Ferrari", 310);
        c1.imprime();
        c2.imprime();

        test = "TestandoOAcessoDeUmaVariavelEstaticaDentroDeUmMetodoEstatico";

        Carro.setVelocidadeLimite(150);
        c1.imprime();
        c2.imprime();



    }
}
