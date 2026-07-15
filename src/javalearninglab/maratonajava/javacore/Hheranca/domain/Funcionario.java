package javalearninglab.maratonajava.javacore.Hheranca.domain;

public class Funcionario extends Pessoa{
    private double salario;

    static{
        System.out.println("Dentro do bloco de incialização estático de Funcionário.");
    }
    {
        System.out.println("Dentro do bloco de inicialização de Funcionário 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização de Funcionário 2");
    }
    public Funcionario(String nome){
        super(nome); // Para atender aos requisitos de criação de objeto da superclasse, pq Funcionario é uma Pessoa
        System.out.println("Dentro do construtor de Funcionário");
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }
    public void relatorioPagamento(){
        // this.nome está disponível apenas em tempo de execução e this.getNome() é má prática
        // Por isso usaremos o modificador protected na sua super classe (possibilita acesso às sub classes e também dentro do pct, como se fossem publicos)
        //System.out.println("Eu " + this.getNome() + " recebi o salário de R$ " + this.salario);
        System.out.println("Eu " + this.nome + " recebi o salário de R$ " + this.salario);

    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
