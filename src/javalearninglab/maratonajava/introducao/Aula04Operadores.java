package javalearninglab.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args){
        // Aritméticos: + - / *
        int numero01 = 10;
        int numero02 = 20;
        double resultadoDivisao = numero01 / (double) numero02;
        System.out.println(numero01+numero02+". A partir daqui concatena: "+numero01+numero02+"\n");
        System.out.println("Resultado da divisão: " + resultadoDivisao);
        System.out.println("---------------"+"\n");

        // Resto (%): se um numero dividido por 2 tem resto zero, ele é par
        int resto = 5 % 2;
        System.out.println("resto: "+ resto);
        System.out.println("---------------"+"\n");

        // Operadores lógicos: < > <= >= == != (sempre retornam valores booleanos)
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDiferenteDez " + isDezDiferenteDez);
    }
}
