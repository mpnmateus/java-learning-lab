package javalearninglab.maratonajava.javacore.Npolimorfismo.service;

import javalearninglab.maratonajava.javacore.Npolimorfismo.repository.Repository;

public class DataBaseRepository implements Repository {
    @Override
    public void salvar(){
        System.out.println("Salvando em um banco de dados.");
    }
}
