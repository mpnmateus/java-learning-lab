package javalearninglab.maratonajava.javacore.Npolimorfismo.test;

import javalearninglab.maratonajava.javacore.Npolimorfismo.repository.Repository;
import javalearninglab.maratonajava.javacore.Npolimorfismo.service.DataBaseRepository;
import javalearninglab.maratonajava.javacore.Npolimorfismo.service.FileRepository;
import javalearninglab.maratonajava.javacore.Npolimorfismo.service.MemoryRepository;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositoryTest {

    public static void main(String[] args) {
        Repository repository = new DataBaseRepository();
//        Repository repository = new FileRepository();
//        Repository repository = new MemoryRepository();
        repository.salvar();

        List<String> list= new LinkedList<>();
//        List<String> list= new ArrayList<>();
        list.add("Mateus");
        list.add("Janana");
        System.out.println(list);
    }
}
