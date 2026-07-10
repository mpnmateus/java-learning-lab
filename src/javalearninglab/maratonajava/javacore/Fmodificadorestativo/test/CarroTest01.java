package javalearninglab.maratonajava.javacore.Fmodificadorestativo.test;

import javalearninglab.maratonajava.javacore.Fmodificadorestativo.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
//        Carro c1 = new Carro("BMW", 290);
//        Carro c2 = new Carro("Ferrari", 310);
//        //c1.setVelocidadeLimite(200);

        // como tem modificador static, não acesso mais o atributo através de uma variável de referência, mas através da classe
        // Na verdade, com isso, não existe mais a necessidade de eu ter objetos (comentei tudo)
        System.out.println(Carro.velocidadeLimite); // 250
        Carro.velocidadeLimite = 180;
        System.out.println(Carro.velocidadeLimite); // 180

//        c1.imprime();
//        c2.imprime();

    }
}
