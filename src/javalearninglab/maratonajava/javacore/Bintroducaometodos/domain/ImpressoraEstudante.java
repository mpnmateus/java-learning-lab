package javalearninglab.maratonajava.javacore.Bintroducaometodos.domain;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante){
        System.out.println("-----------");
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        // Usado didaticamente para demonstrar que antes de acabar com a referencia dentro desse escopo, ele altera o estado do objeto
        // Num proximo acesso ao objeto atraves da referencia, teremos o estado ja mudado (anteriormente)
        estudante.nome = "ExemploDoRiscoDePassarReferenciaDeObjetos";

        // Faria mais sentido se fosse uma classe de impressão de relatório genérica
    }
}
