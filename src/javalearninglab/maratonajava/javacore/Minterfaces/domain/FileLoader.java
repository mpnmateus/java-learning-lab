package javalearninglab.maratonajava.javacore.Minterfaces.domain;

public class FileLoader implements DataLoader {
    // É também um DataLoader, só que traz dados de um arquivo

    @Override
    public void load(){
        System.out.println("Carregando dados de um arquivo.");
    }
}
