package javalearninglab.maratonajava.javacore.Npolimorfismo.service;

import javalearninglab.maratonajava.javacore.Npolimorfismo.domain.Computador;
import javalearninglab.maratonajava.javacore.Npolimorfismo.domain.Produto;
import javalearninglab.maratonajava.javacore.Npolimorfismo.domain.Tomate;

// Essa é nossa camada de regra de negócios
public class CalculadoraImposto {

    public static void calcularImposto(Produto produto){
        double imposto = produto.calcularImposto();
        System.out.println("Relatório de imposto do produto");
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto: " + imposto);
    }

   // Esses dois métodos abaixo nem precisam existir, pois trazem acoplamento, tornam a classe pouco extensível
    public static void calcularImpostoComputador(Computador computador){
        double imposto = computador.calcularImposto();
        System.out.println("Relatório de imposto do computador");
        System.out.println("Computador: " + computador.getNome());
        System.out.println("Valor: " + computador.getValor());
        System.out.println("Imposto: " + imposto);
    }

    public static void calcularImpostoTomate(Tomate tomate){
        double imposto = tomate.calcularImposto();
        System.out.println("Relatório de imposto do tomate");
        System.out.println("Tomate: " + tomate.getNome());
        System.out.println("Valor: " + tomate.getValor());
        System.out.println("Imposto: " + imposto);
    }

}
