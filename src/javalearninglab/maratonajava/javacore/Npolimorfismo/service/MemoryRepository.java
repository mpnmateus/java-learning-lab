package javalearninglab.maratonajava.javacore.Npolimorfismo.service;

import javalearninglab.maratonajava.javacore.Npolimorfismo.repository.Repository;

public class MemoryRepository implements Repository {
    @Override
    public void salvar(){
        System.out.println("Salvando na memória.");
    }
}
