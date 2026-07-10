package javalearninglab.maratonajava.javacore.Fmodificadorestativo.domain;

public class Carro {

    private String nome;
    private double velocidadeMaxima;
    // Com mod de acesso static, essa variavel nao pertence ao objeto, mas à classe
    // Todos os objetos derivados dessa classe (todas as instancias), compartilharão o valor alterado já que essa é uma variável de classe
    private static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima){
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println("--------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Máxima: " + this.velocidadeMaxima);
        // como a variavel tem o modificador static, é melhor acessá-la através da classe (Carro) e não do atributo de um objeto
        System.out.println("Velocidade Limite: " + this.velocidadeLimite); // Mas como temos certeza que o métod é chamado por uma instância, vou manter o this
    }
    // o this. não funciona porque existe a possibilidade da instancia não existir (já que o atributo é static)
    // funciona com imprime pois ele não é estático e será chamado por uma instancia
    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite; // Importante acessar via Carro., pois o java prioriza sempre o escopo mais próximo (o local) ;
        // e, assim, teríamos uma atribuição da variável local (recebida por parametro) nela mesma (não na de classe)
        // Obs.: nao posso acessar nenhuma variável não estática dentro de métodos estáticos
    }
    /* Criação de métodos estáticos
     * Quando os métodos não acessam uma variável (um atributo) da instância
     * */

    public static double getVelocidadeLimite(){ return velocidadeLimite; } // aqui funciona pois nao temos variavel recebida por parametro

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public double getVelocidadeMaxima() { return velocidadeMaxima; }
    public void setVelocidadeMaxima(double velocidadeMaxima) { this.velocidadeMaxima = velocidadeMaxima; }

}
