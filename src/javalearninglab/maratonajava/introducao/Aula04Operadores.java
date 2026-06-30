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

        // Atribuição = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000; //bonus = bonus + 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        System.out.println(bonus);
        System.out.println("---------------"+"\n");

        // Atribuições unárias: incremento (++) ou decremento (--)
        int contador = 0;
        contador += 1; //contador = contador + 1;
        contador++;
        contador--;
        System.out.println("O contador está em: " + contador+"\n");

        int contador2 = 0;
        //System.out.println(++contador2);
        System.out.println(contador2++); //primeiro executa a impressão, depois soma.
        System.out.println(contador2);
    }
}
