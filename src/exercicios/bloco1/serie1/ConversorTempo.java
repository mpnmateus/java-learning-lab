package exercicios.bloco1.serie1;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class ConversorTempo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma quantidade de segundos para a conversão: ");
        int inputEmSegundos = sc.nextInt();
        int horaEmSegundos = 3600;
        int minutoEmSegundos = 60;

        // quantos segundos de hora cabem no input?
        int horas = (inputEmSegundos / horaEmSegundos);
        // Qual parte da hora em segundos não cabe no input?
        int saldo = inputEmSegundos % horaEmSegundos;
        // Quantos minutos cabem no saldo?
        int minutos = saldo / minutoEmSegundos;
        // Quanto sobra do saldo anterior dividido por 60segundos?
        int segundos = saldo % minutoEmSegundos;

        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);
        System.out.println("Tempo convertido (horas/minutos/segundos)) :" + horas + "h " + minutos + "m " + segundos + "s.");

    }
}
