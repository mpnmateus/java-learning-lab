package javalearninglab.maratonajava.javacore.Minterfaces.test;

import javalearninglab.maratonajava.javacore.Minterfaces.domain.DataLoader;
import javalearninglab.maratonajava.javacore.Minterfaces.domain.DatabaseLoader;
import javalearninglab.maratonajava.javacore.Minterfaces.domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
    }
}
