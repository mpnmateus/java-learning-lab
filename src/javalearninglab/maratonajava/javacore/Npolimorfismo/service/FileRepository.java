package javalearninglab.maratonajava.javacore.Npolimorfismo.service;

import javalearninglab.maratonajava.javacore.Npolimorfismo.repository.Repository;

public class FileRepository implements Repository {
    @Override
    public void salvar(){
        System.out.println("Salvando em um arquivo.");
    }
}
