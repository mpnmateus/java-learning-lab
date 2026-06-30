package javalearninglab.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        //Exercício: imprimir todos os números pares de 0 até 1k
        for(int i = 0; i < 1000; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
