package javalearninglab.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Condição: valorParcela >= 1000
        // Usando o break
        double valorCarro = 50000;
        int quantidadeParcelas = 0;
        double valorMinimoParcela = 1000;
        for(int parcela = 1; parcela < valorCarro; parcela++){
            double valorParcela = valorCarro / parcela;
            if(valorParcela < valorMinimoParcela){
                break;
            }
            System.out.println("O valor da parcela em " + parcela + " vezes é : R$ " + valorParcela);
            quantidadeParcelas++;
        }
        String relatorio = "Um carro no valor de R$ " + valorCarro + " que deve ter parcelas maiores ou iguais a R$ " + valorMinimoParcela +
                ", pode ser parcelado em de até " + quantidadeParcelas +
                " vezes.";
        System.out.println(relatorio);

    }
}
