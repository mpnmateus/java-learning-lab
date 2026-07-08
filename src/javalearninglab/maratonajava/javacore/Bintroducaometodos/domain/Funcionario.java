package javalearninglab.maratonajava.javacore.Bintroducaometodos.domain;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios = new double[3];

    public void imprimeDados(){
        if(this.nome == null || this.idade <=1 || this.salarios == null) {
            return;
        }
        System.out.println("O nome do funcionário é: " + this.nome);
        System.out.println("A idade do funcionário é: " + this.idade);
        int i = 1;
        for (double num : this.salarios) {
            System.out.println("Seu " + i + "º salário: " + num);
            i++;
        }
    }

    public void imprimirMediaSalarial(){
        String media = String.format("%.2f", calcularMediaSalarial());
        System.out.println("A média dos salários do funcionário é: R$ " + media);
    }

    public double calcularMediaSalarial(){
        double soma = 0;
        for(double num: this.salarios){
            soma += num;
        }
        double media = soma / this.salarios.length;

        return media;
    }

}
