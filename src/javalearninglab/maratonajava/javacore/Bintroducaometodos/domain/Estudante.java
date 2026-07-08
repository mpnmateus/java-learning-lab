package javalearninglab.maratonajava.javacore.Bintroducaometodos.domain;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    public void imprime(){
        // a variável de referencia manda um sinal para dentro do objeto e o objeto é o responsável por executar a ação
        System.out.println("-----------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
        /* Mas aqui já estamos baixando um pouco a coesão, pq além de ser responsável mapear algo do mundo real pro mundo computacional
        também estou imprimindo os dados desse objeto. No entanto, é padrão querermos saber informações do nosso objeto e, portanto,
        é comum haver um metodo de impressao pro objeto.
         */
    }
}
