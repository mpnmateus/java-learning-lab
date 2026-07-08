package javalearninglab.maratonajava.javacore.Bintroducaometodos.domain;

public class Pessoa {
    private String nome;
    private   int idade;

    // acoplamento é quanto uma classe conhece da outra
    // aqui estamos diminuindo o acoplamento por termos uma camada entre o acesso aos atributos
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }
    public void setName(String name){
        this.nome = name;
    }
    public void setIdade(int idade){
        if(idade < 0) {
            System.out.println("Idade inválida.");
            return;
        }
        this.idade = idade;
    }
    public String getNome(){ return this.nome; }
    public int getIdade(){ return this.idade; }
}
