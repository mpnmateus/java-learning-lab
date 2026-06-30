package javalearninglab.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Condição: valorParcela >= 1000
        double valorCarro = 30000;
        int quantidadeParcelas = 0;
        double valorParcelaImpressao = 0;

        for(int parcela = 1; parcela <= valorCarro; parcela++){
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000)
                break;
            if (valorParcela >= 1000)
                quantidadeParcelas++;
                valorParcelaImpressao = valorParcela;
            System.out.println("Valor em " + parcela + " parcelas de R$ " + valorParcela);
        }
        System.out.println("Um carro de R$ " + valorCarro + " pode ser parcelado em até " + quantidadeParcelas + " vezes de " + valorParcelaImpressao);

    }
}
