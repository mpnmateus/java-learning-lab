package javalearninglab.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {

        // Árray de arrays
        // Cada posição do array base, tem um array de 3 posições
        int[][] dias = new int[3][3];
        System.out.println(dias);

        dias[0][0] = 40;
        dias[0][1] = 23;
        dias[0][2] = 32;

        dias[1][0] = 45;
        dias[1][1] = 50;
        dias[1][2] = 24;

        for(int i = 0; i < dias.length; i++){
            for (int j = 0; j < dias[i].length; j++){
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("----------\n");

        for(int[] arrBase : dias){
            for (int num : arrBase)
                System.out.println(num);
        }
    }
}
