package javalearninglab.maratonajava.javacore.Minterfaces.domain;

public interface DataLoader {
    // É um carregador de dados
    // cria métodos públicos e abstratos por padrão
    // não faz sentido ser concreto, porque se eu quero carregar dados, temos opções de onde carregar: banco de dados; arquivo.

    public abstract void load(); // = void load();

}
