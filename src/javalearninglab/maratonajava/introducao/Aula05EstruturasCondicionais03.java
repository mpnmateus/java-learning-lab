package javalearninglab.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main (String[] args){
        //Doar se salario > 5000
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 para o Mateus";
        String mensagemNaoDoar = "Ainda não tenho condições de doar";
        // (condicao) ? verdadeiro : falso
        String resultado = (salario > 5000) ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
}
