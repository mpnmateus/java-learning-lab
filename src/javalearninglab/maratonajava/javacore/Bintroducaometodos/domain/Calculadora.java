package javalearninglab.maratonajava.javacore.Bintroducaometodos.domain;

public class Calculadora {

    public void somarDoisNumeros(){
        System.out.println(10+10);
        //obs.: saida é diferente de retorno
    }

    public void subtraiDoisNumeros(){
        System.out.println(20-10);
    }

    // No contrato, indicamos oa parametros que ele deve receber ao ser invocado
    // Se um metodo exige mais de dois parametros, é bom pensar em dividir em metodos menores
    public void multiplicaDoisNumeros(int num1, float num2){
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2){
        if (num2 == 0){
            return 0;
        }
        return num1 / num2;
    }

    public double divideDoisNumeros02(double num1, double num2){
        if(num2 != 0 ){
            return num1 / num2;
        }
        return 0;
    }

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2){
        if(num2 == 0){
            System.out.println("Não existe divisão por zero.");
            return;
        }
        System.out.println(num1 / num2);
    }

    public void alteraDoisNumeros(int num1, int num2){
        // as variaveis de referencia sao criadas dentro do metodo e tem escopo local
        // se sao do tipo primitivo, recebem apenas copias, nao referencias, entao a variavel original nunca tera seu valor alterado
        num1 = 99;
        num2 = 67;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for(int num: numeros){
            soma += num;
        }
        System.out.println("O resultado da soma é: " + soma);

    }
    //Varargs (transforma os argumentos enviados em um array quando os recebe por parametro
    public void somaVarArgs(int... numeros){
        int soma = 0;
        for(int num: numeros){
            soma += num;
        }
        System.out.println("O resultado da soma é: " + soma);
    }
}
