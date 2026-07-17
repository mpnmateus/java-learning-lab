package javalearninglab.maratonajava.javacore.Minterfaces.domain;

// É um carregador de dados
// cria métodos públicos e abstratos por padrão
// não faz sentido ser concreto, porque se eu quero carregar dados, temos opções de onde carregar: banco de dados; arquivo.
public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10; // tds atributos em uma interface são constantes

    public abstract void load(); // = void load();

    // A partir do java8+, é possível que uma interface tenha métodos com implementação
    // Evita a obrigatoriedade dos métodos que implementam a interface fazerem a implementação do metodo (ia quebrar muito código)
    // Para isso, criaram uma forma de possibilitar métodos concretos (que não obrigam a sua implementação)
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões.");
    }

    // métodos estáticos nunca serão sobrescritos, pois pertencem à classe (nesse caso, interface)
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveDataSize na interface.");
    }

}
