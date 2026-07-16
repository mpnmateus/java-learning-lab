package javalearninglab.maratonajava.javacore.Minterfaces.domain;

public interface DataLoader {
    // É um carregador de dados
    // cria métodos públicos e abstratos por padrão
    // não faz sentido ser concreto, porque se eu quero carregar dados, temos opções de onde carregar: banco de dados; arquivo.

    public abstract void load(); // = void load();

    // A partir do java8+, é possível que uma interface tenha métodos com implementação
    // Evita a obrigatoriedade dos métodos que implementam a interface fazerem a implementação do metodo (ia quebrar muito código)
    // Para isso, criaram uma forma de possibilitar métodos concretos (que não obrigam a sua implementação)
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões.");
    }

}
