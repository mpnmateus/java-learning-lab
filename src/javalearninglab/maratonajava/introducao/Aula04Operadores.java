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
        System.out.println("---------------"+"\n");

        // && (and) || (or) ! (not)

        // &&
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = (idade > 30) && (salario >= 4612);
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta: " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta: " + isDentroDaLeiMenorQueTrinta);
        System.out.println("---------------"+"\n");

        // ||
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystationCinco = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente >= valorPlaystationCinco || valorTotalContaPoupanca >= valorPlaystationCinco;

        System.out.println("O playstation é comprável: " + isPlaystationCincoCompravel);
        System.out.println("---------------"+"\n");

    }
}
