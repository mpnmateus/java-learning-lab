package javalearninglab.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        while(count < 10){
            System.out.println(count++);
        }
        System.out.println("-------\n");

        // Do-While => Executa pelo menos uma vez
        count = 9;
        int laço = 1;
        do {
            System.out.println("Dentro do do-while, laço nº " + laço);
            laço++;
            count++;
        } while (count < 10);
        System.out.println("-------\n");

        for(int i =0; i < 10; i++){
            System.out.println("Laço for nº: " + i);
        }
    }
}
