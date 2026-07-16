package javalearninglab.maratonajava.javacore.Minterfaces.domain;

public class DatabaseLoader implements DataLoader, DataRemover {
    // Uma classe que carrega dados do banco de dados
    // Não existe limite para a quantidade de interfaces que posso implementar em uma classe
    @Override
    public void load(){
        System.out.println("Carregando dados do banco de dados.");
    }

    @Override
    public void remove(){
        System.out.println("Removendo dados do banco de dados.");
    }
}
