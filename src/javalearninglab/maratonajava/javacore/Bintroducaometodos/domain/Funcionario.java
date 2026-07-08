package javalearninglab.maratonajava.javacore.Bintroducaometodos.domain;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

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

        for(double num: this.salarios) {
            media += num;
        }
        media /= this.salarios.length;
        return media;
    }
    public double[] getSalarios(){ return salarios; }
    public void setSalarios(double[] salarios){ this.salarios = salarios; }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getMedia() {
        return media;
    }
}
