package javalearninglab.maratonajava.introducao;

import java.util.Date;

/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a mensagem:
Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o <salario> na data <data>
* */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args){
        String nome = "Mateus";
        String endereco = "Avenida Mauá, 100";
        double salario = 3500.50;
        Date dataHoje = new Date();
        String relatorio = "Eu "+ nome + ", morando no endereço "+ endereco + ",\n" +
                "confirmo que recebi o salário de R$ "+ salario + " na data de hoje, " + dataHoje;

        System.out.println(relatorio);
    }

}
