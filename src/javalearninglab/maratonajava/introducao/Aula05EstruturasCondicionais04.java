package javalearninglab.maratonajava.introducao;

/*
I want do know how much I have to pay in the Netherlands 2020 based on my annual salary
* */
public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args){
        double salarioAnual = 60000;
        double primeiraFaixa = 9.7/100;
        double segundaFaixa = 37.35/100;
        double terceiraFaixa = 49.50/100;
        double valorImposto = 0;
        if(salarioAnual < 34.712){
            valorImposto = salarioAnual * primeiraFaixa;
        } else if(salarioAnual >= 34.713 && salarioAnual <= 68.507){
            valorImposto = salarioAnual * segundaFaixa;
        } else{
            valorImposto = salarioAnual * terceiraFaixa;
        }
        System.out.println("A taxa a ser paga é: R$ " + valorImposto);
    }
}
