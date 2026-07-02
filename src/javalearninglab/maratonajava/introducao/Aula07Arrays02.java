package javalearninglab.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // Valores de inicialização padrão (para variáveis de classe (fora do metodo) ou arrays):
        // byte, short, int, long, float e double == 0
        // char '\u0000' == ' ' (espaço em branco)
        // boolean == false
        // String null
        String [] nomes01 = new String[3];
        /*
        System.out.println(nomes01[0]);
        System.out.println(nomes01[1]);
        System.out.println(nomes01[2]);
        */

        // ITERANDO NO ARRAY
        // variaveis do tipo reference tem, entre outras coisas, "fields" (campo especial) - length
        String [] nomes = new String[5];
        nomes[0] = "Mateus";
        nomes[1] = "João";
        nomes[2] = "Maria";

        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }

        // Se eu instanciar novamente, eu perco a referência anterior (garbage collector apaga o objeto anterior pois está sem referencia)
        nomes = new String[6];
        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]); // null
        }
    }
}
