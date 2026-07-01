package javalearninglab.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // Valores de inicialização padrão (para variáveis de classe (fora do metodo) ou arrays):
        // byte, short, int, long, float e double == 0
        // char '\u0000' == ' ' (espaço em branco)
        // boolean == false
        // String null
        String [] nomes = new String[3];
        System.out.println(nomes[0]);
        System.out.println(nomes[1]);
        System.out.println(nomes[2]);
    }
}
