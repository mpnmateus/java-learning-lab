package javalearninglab.maratonajava.javacore.Minterfaces.domain;

public class FileLoader implements DataLoader, DataRemover {
    // É também um DataLoader, só que traz dados de um arquivo

    // Hierarquia dos modificadores de acesso, do menos para o mais liberal:
    // private -> default -> protected -> public
    @Override
    public void load(){
        System.out.println("Carregando dados de um arquivo.");
    }
    @Override
    public void remove() {
        System.out.println("Deletando dados de um arquivo.");
    }
}
