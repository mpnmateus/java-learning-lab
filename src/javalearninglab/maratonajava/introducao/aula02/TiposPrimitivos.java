package javalearninglab.maratonajava.introducao.aula02;

public class TiposPrimitivos {
    public static void main(String[] args){
        // int, double, float, char, byte, short, long, boolean
        int idade = (int) 10000000000L; // Vai forçar para caber, mas vai cortar os bits para caber (não sabemos o que esperar)
        long numeroGrande = (long) 155.23;
        double salarioDouble = 2000.0D;
        float salarioFloat = 2500.0F;
        byte idadeByte = 127; //Vai até 127
        short idadeShort = 32767; // Vai até 32767
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere= 'M';

        System.out.println("A idade é: " + idade);
        System.out.println(verdadeiro);
        System.out.println(idade);
        System.out.println(numeroGrande);
    }
}
