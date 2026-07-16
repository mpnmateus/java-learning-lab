package javalearninglab.maratonajava.javacore.Minterfaces.domain;

public interface DataRemover {
    // Mas não quero ter que criar uma classe só para prover a implementação desse metodo
    // Por isso uma das grades vantagens da interface é implementar multiplas interfaces em uma mesma classe
    public abstract void remove();
}
