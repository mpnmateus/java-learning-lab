package javalearninglab.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        int [] idades = new int[3];
        idades[0] = 4;
        idades[1] = 15;
        idades[2] = 25;
        //idades[3] = 11; //ArrayOutOfBounds
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);
    }
}
