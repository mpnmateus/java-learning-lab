package javalearninglab.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {

    public static void main(String[] args) {
        // Imprima os primeiros 25 numeros de um dado valor
        int numero = 50;
        int quantidadeRepeticoes = 25;
        for(int i = 0; i < quantidadeRepeticoes+1; i++){
            System.out.println(numero);
            numero++;
        }
        System.out.println("---------\n");
        // Imprima os primeiros 25 numeros de um dado valor - Usando o break
        for(int i = 0; i <= 50; i++){
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }

    }
}
