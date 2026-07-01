package javalearninglab.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Condição valorParcela >= 1000
        // Usando o continue
        double valorTotal = 50000;
        double valorParcela = 0;
        double valorMinimoParcela = 1000;
        int quantidadeParcelas = 1;
        for(int parcela = (int) valorTotal; parcela >= 1; parcela--){
            valorParcela = valorTotal / parcela;
            if (valorParcela <= valorMinimoParcela){
                continue;
            }
            System.out.println("O valor da parcela em " + parcela + " vezes é : R$ " + valorParcela);
            quantidadeParcelas++;
        }
        String relatorio = "Um carro no valor de R$ " + valorTotal + " que deve ter parcelas maiores ou iguais a R$ " + valorMinimoParcela +
                ", pode ser parcelado em de até " + quantidadeParcelas +
                " vezes.";
        System.out.println(relatorio);

    }
}
