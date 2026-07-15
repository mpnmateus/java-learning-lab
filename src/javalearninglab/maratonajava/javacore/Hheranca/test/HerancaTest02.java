package javalearninglab.maratonajava.javacore.Hheranca.test;

import javalearninglab.maratonajava.javacore.Hheranca.domain.Funcionario;

public class HerancaTest02 {
    public static void main(String[] args) {
        // 0. Bloco de inicialização estático da super classe é executado quando a JVM carregar a superclasse
        // 1. Bloco de inicialização estático da subclasse é executado quando a JVM carregar a subclasse
        // 2. Alocado espaço em memória pro objeto da superclasse
        // 3. cada atributo da superclasse é criado e inicializado com valores default (ou o que for passado da superclasse)
        // 4. Executa bloco de inicialização da superclasse - na ordem em que aparece
        // 5. Executa construtor da superclasse
        // 6. Alocado espaço em memória pro objeto da subclasse
        // 7. cada atributo da subclasse é criado e inicializado com valores default (ou o que for passado)
        // 8. Executa bloco de inicialização da subclasse - na ordem em que aparece
        // 9. Executa construtor da subclasse

        // Toda vez que um objeto é criado, ele executa esse bloco de inicialização abaixo
        // Isso gera custo de processamento
        // Precisamos que o bloco de inicialização seja executado uma única vez (bloc de ini estático)
        Funcionario funcionario = new Funcionario("Mateus");
    }
}
