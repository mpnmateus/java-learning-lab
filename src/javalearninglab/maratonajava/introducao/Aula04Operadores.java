package javalearninglab.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args){
        // Aritméticos: + - / *
        int numero01 = 10;
        int numero02 = 20;
        double resultadoDivisao = numero01 / (double) numero02;
        System.out.println(numero01+numero02+". A partir daqui concatena: "+numero01+numero02+"\n");
        System.out.println(resultadoDivisao);

        // Resto (%): se um numero dividido por 2 tem resto zero, ele é par
        int resto = 5 % 2;
        System.out.println(resto);

    }
}
