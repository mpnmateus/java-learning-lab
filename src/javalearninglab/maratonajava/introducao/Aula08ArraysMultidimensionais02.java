package javalearninglab.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int [][] arrayInt = new int [3][]; //se não inicializarmos os arrays dentro do array base, teremos nullpointerexception

        //Diferentes formas de inicialização
        int[] array = {1,2,3,4,5,6};
        arrayInt[0] = new int[2];
        arrayInt[1] = new int[]{1,2,3};
        arrayInt[2] = array;

        for(int[] arraBase: arrayInt) {
            System.out.println("\n------");
            for (int num : arraBase) {
                System.out.print(num + " ");
            }
        }
        // outra forma de inicializar um array multidimensional
        int[][] arrayInt2 = {{0,0}, {1,2,3}, {1,2,3,4,5,6}};
        for(int[] arraBase: arrayInt2) {
            System.out.println("\n------");
            for (int num : arraBase) {
                System.out.print(num + " ");
            }
        }
        //Obs.: na vida real, usam-se coleções (collections), com o map
    }
}
