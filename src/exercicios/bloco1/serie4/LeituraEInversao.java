package exercicios.bloco1.serie4;

public class LeituraEInversao {
    public static void main(String[] args) {
        int limite = 10;
        int[]array = new int[limite];

        for(int i = 0; i < limite; i++){
            array[i] = i+1;
        }
        System.out.println("Apresentação dos elementos do array na ordem original: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("\nApresentação dos elementos do array na ordem invertida: ");
        for(int i = limite-1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }

    }
}
