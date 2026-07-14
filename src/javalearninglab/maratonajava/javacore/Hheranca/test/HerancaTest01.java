package javalearninglab.maratonajava.javacore.Hheranca.test;

import javalearninglab.maratonajava.javacore.Hheranca.domain.Endereco;
import javalearninglab.maratonajava.javacore.Hheranca.domain.Funcionario;
import javalearninglab.maratonajava.javacore.Hheranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco(); // comecar criando os objetos pela classe que tem menos relacionamentos (menos dependencias)
        endereco.setRua("Avenida dos anjos");
        endereco.setCep("900200-852");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Cacau");
        pessoa.setCpf("2020235236");
        pessoa.setEndereco(endereco);

        System.out.println(" --- Pessoa --- " );
        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Kate");
        funcionario.setCpf("11100011198");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(50000);

        System.out.println("\n --- Funcionário --- ");
        funcionario.imprime();
    }
}
