package javalearninglab.maratonajava.javacore.Lclassesabstratas.domain;

public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }
    public abstract void calculaBonus(); // Obriga a implementação para as suas classes concretas

    // Em uma classe abstrata posso ter métodos abstratos e métodos não abstratos
    // Porém, nunca poderei ter métodos abstratos em uma classe concreta
    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
