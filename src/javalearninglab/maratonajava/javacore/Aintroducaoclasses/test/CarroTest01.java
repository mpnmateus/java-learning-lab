package javalearninglab.maratonajava.javacore.Aintroducaoclasses.test;

import javalearninglab.maratonajava.javacore.Aintroducaoclasses.model.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Carro c2 = new Carro();

        c1.nome = "Corsa";
        c1.modelo = "hatch";
        c1.ano = 1997;
        c2.nome = "Palio";
        c2.modelo = "weekend";
        c2.ano = 1998;

        System.out.println(c1.nome);
        System.out.println(c1.modelo);
        System.out.println(c1.ano);
        System.out.println(c2.nome);
        System.out.println(c2.modelo);
        System.out.println(c2.ano);
    }
}
