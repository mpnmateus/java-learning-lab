package javalearninglab.maratonajava.javacore.Fmodificadorestativo.domain;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    // Com mod de acesso static, essa variavel nao pertence ao objeto, mas à classe
    // Todos os objetos advindos dessa classe, compartilharão o valor alterado já que essa é uma variável de classe
    public static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima){
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println("--------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Máxima: " + this.velocidadeMaxima);
        // como a variavel tem o modificador static, preciso acessá-la através da classe e não do atributo de um objeto
        System.out.println("Velocidade Limite: " + Carro.velocidadeLimite);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public void setVelocidadeLimite(double velocidadeLimite) {
        this.velocidadeLimite = velocidadeLimite;
    }
}
