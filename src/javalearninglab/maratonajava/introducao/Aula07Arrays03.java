package javalearninglab.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = {1,2,3};
        int[] numeros3 = new int[]{4,3,2,1};

        // for indexado
        for(int i = 0; i < numeros2.length; i++){
            System.out.println(numeros2[i]);
        }
        System.out.println("----------\n");

        // for each: tem uma variável de referência e a cada iteração, vai fazer referencia a cada uma das posições do array
        for(int j : numeros3)
            System.out.println(j);
    }
}
