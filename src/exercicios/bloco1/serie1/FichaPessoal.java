package exercicios.bloco1.serie1;

public class FichaPessoal {
    public static void main(String[] args) {
        String nome = "Mateus";
        int idade = 35;
        double altura = 1.73;
        double peso = 71;
        char sexo = 'M';
        String situacaoMatricula = "matriculado";
        double rendaMensal = 6000;

        String relatorio = "Nome: " + nome + "\n" +
                "Idade: " + idade + "\n" +
                "Altura: " + altura + "\n" +
                "Peso: " + peso + "\n" +
                "Sexo: " + sexo + "\n" +
                "Situação de matrícula " + situacaoMatricula + "\n" +
                "Renda mensal: R$ " + rendaMensal;
        System.out.println(" ---- RELATÓRIO ---- ");
        System.out.println(relatorio);
    }
}
