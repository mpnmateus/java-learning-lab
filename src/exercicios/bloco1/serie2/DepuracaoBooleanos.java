package exercicios.bloco1.serie2;

public class DepuracaoBooleanos {
    public static void main(String[] args) {
        int idade = 20;
        boolean possuiCarteira = false;
        double saldo = 500;
        double preco = 500;

        // A primeira mensagem aparece somente quando a idade for exatamente 18.
        if (idade == 18) { // Antes estava "=", que é um sinal de atribuição
            System.out.println("Tem exatamente 18 anos");
        }

        // A segunda aparece somente quando possuiCarteira for true.
        if (possuiCarteira == true) { // Antes estava "=", que é um sinal de atribuição
            System.out.println("Possui carteira");
        }

        // A pessoa pode dirigir apenas quando for maior de idade e possuir carteira.
        if (idade >= 18 && possuiCarteira) { // Antes estava com o operador lógico ||, indicando uma coisa OU outra
            System.out.println("Pode dirigir");
        }

        // A compra é autorizada quando o saldo for maior ou igual ao preço.
        if (saldo >= preco) { // Antes estava com o operador relacional ">", indicando apenas que o saldo deveria ser maior que o preço
            System.out.println("Compra autorizada");
        } else if (saldo == preco) { // Antes estava "=", que é um sinal de atribuição
            System.out.println("Compra autorizada usando todo o saldo");
        }

        // Antes estava "=", que é um sinal de atribuição
        if (!(idade >= 18)) { // Antes o a expressao estava sem parêntesis, fazendo com que a negação incindisse apenas na variável idade e não na expressão completa
            System.out.println("Menor de idade");
        }
    }
}
