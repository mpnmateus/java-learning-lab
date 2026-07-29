package exercicios.bloco1.serie2;

import java.util.Scanner;

public class PlanoDeDescontos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a categoria do cliente (COMUM, PRATA OU OURO): ");
        String categoria = sc.next();

        double valorCompra = 0;
        boolean valorAceito = false;
        while(!valorAceito) {
            System.out.println("Digite o valor da compra: ");
            valorCompra = sc.nextDouble();
            if(valorCompra > 0){
                valorAceito = true;
            } else {
                System.out.println("O valor da compra tem que ser maior que R$ 0,00.");
            }
        }
        System.out.println("Digite a forma de pagamento (PIX, DEBITO, CREDITO): ");
        String formaPagamento = sc.next();

        double valorDescontoCategoria = 0;
        switch(categoria){
            case "COMUM":
                valorDescontoCategoria = 0;
                break;
            case "PRATA":
                valorDescontoCategoria = (valorCompra * 0.05);
                break;
            case "OURO":
                valorDescontoCategoria = (valorCompra * 0.10);
                break;
            default:
                System.out.println("Categoria inexistente.");
                break;
        }

        double valorDescontoFormaPagamento = 0;
        switch(formaPagamento){
            case "PIX":
                valorDescontoFormaPagamento = (valorCompra - valorDescontoCategoria) * 0.05;
                break;
            case "DEBITO":
                valorDescontoFormaPagamento = (valorCompra - valorDescontoCategoria) * 0.02;;
                break;
            case "CREDITO":
                break;
            default:
                System.out.println("Forma de pagamento inexistente.");
                break;
        }
        double descontoAddValorCompra = 0;
        if(valorCompra >= 1000){
            descontoAddValorCompra = (valorCompra - valorDescontoCategoria - valorDescontoFormaPagamento) * 0.03;
        }

        double total = (valorCompra - valorDescontoCategoria - valorDescontoFormaPagamento) - descontoAddValorCompra;

        String relatorio = "Valor original: " + valorCompra + ". \n" +
                "Desconto da categoria : R$ " + String.format("%.2f", valorDescontoCategoria) + ". \n" +
                "Desconto da forma de pagamento: R$ " + String.format("%.2f", valorDescontoFormaPagamento) + ". \n" +
                "Desconto da add por valor da compra: R$ " + String.format("%.2f", descontoAddValorCompra) + ". \n" +
                "Valor final: R$ " + String.format("%.2f", total) + ". \n";
        System.out.println("\n ---- RELATORIO ---- ");
        System.out.println(relatorio);
    }
}
