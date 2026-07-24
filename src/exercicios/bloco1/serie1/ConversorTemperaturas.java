package exercicios.bloco1.serie1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConversorTemperaturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura, em Celsius, para a conversão: ");
        double temperatura = sc.nextDouble();

        double fahrenheit = (temperatura * 1.8) + 32;
        double kelvin = temperatura + 273.15;

        // Esconde zeros decimais
        DecimalFormat df = new DecimalFormat("0.##");

        System.out.println("\n ----- CONVERSÃO TEMPERATURA ------ ");
        System.out.println("A conversão de " + df.format(temperatura) + "º" + " para fahrenheit e kelvin, respectivamente, é: " +
                fahrenheit + ", " + kelvin + ".");
    }
}
