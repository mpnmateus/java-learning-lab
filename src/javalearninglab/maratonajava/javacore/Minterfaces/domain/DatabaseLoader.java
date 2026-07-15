package javalearninglab.maratonajava.javacore.Minterfaces.domain;

public class DatabaseLoader implements DataLoader {
    // Uma classe que carrega dados do banco de dados
    @Override
    public void load(){
        System.out.println("Carregando dados do banco de dados.");
    }
}
