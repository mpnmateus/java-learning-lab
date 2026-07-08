package javalearninglab.maratonajava.javacore.Bintroducaometodos.domain;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimeDados(){
        if(this.nome == null || this.nome.isBlank() || this.idade < 0 || this.salarios == null) {
            System.out.println("Algum dos dados é inválido para a impressão");
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
        double media = calcularMediaSalarial();
        if (media ==0) {
            System.out.println("É preciso informar três salários para o cálculo da média.");
            return;
        }
        String mediaFinal = String.format("%.2f", media);
        System.out.println("A média dos salários do funcionário é: R$ " + mediaFinal);
    }

    public double calcularMediaSalarial(){
        if(this.salarios == null || this.salarios.length == 0) {
            return 0;
        }
        double soma = 0;
        for(double num: this.salarios) {
            soma += num;
        }

        return soma / this.salarios.length;
    }

}
