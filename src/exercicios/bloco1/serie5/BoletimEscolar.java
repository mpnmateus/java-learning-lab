package exercicios.bloco1.serie5;

import java.util.Scanner;

public class BoletimEscolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // SERÃO 5 ALUNOS, COM 4 NOTAS CADA
        double[][] boletim = new double[5][4];

        // SOLICITANDO E ATRIBUINDO 4 NOTAS PARA CADA UM DOS 5 ALUNOS
        double nota = 0;
        int quantidadeNotas = 0;
        double somaNotas = 0;
        for(int linha = 0; linha < boletim.length; linha++){
            System.out.println(" -- Aluno " + (int)(linha + 1) + " -- ");
            System.out.println("Digite a nota de cada uma das 4 avaliações: ");
            for(int coluna = 0; coluna < boletim[linha].length; coluna++){
                do {
                    System.out.println("Avaliação " + (int) (coluna + 1) + ": ");
                    nota = sc.nextDouble();
                    boletim[linha][coluna] = nota;
                    quantidadeNotas++;
                    somaNotas += nota;
                } while(nota < 0 || nota > 10);
            }
        }
        System.out.println("\n ---- MATRIZ ALUNOS X NOTAS ---- ");
        System.out.println();
        for(int linha = 0; linha < boletim.length; linha++){
            String aluno = "Aluno " + (int)(linha + 1) + " | ";
            System.out.print("        ");
            if(linha == 0){
                for(int coluna = 0; coluna < boletim[linha].length; coluna++){
                    System.out.print(" Nota" + (int)(coluna + 1) + "  ");
                }
                System.out.println("\n         -------------------------------");
            }
            System.out.print("\n" + aluno);
            for(int coluna = 0; coluna < boletim[linha].length; coluna++){
                if(boletim[linha][coluna] == 10){
                    System.out.print(String.format("%.0f",boletim[linha][coluna]) + "   |  ");
                }else {
                    System.out.print(String.format("%.1f",boletim[linha][coluna]) + "  |  ");
                }
            }

            System.out.println("\n----------------------------------------");
        }

        // PARA CALCULAR MÉDIA PARA CADA ESTUDANTE E COLOCAR NUM ARRAY
        double[] arrMediaPorEstudante = new double[5];
        int indiceEstudante = 0;
        for(int linha = 0; linha < boletim.length; linha++){
            double somaPorEstudante = 0;
            int quantidadeNotasPorEstudante = 0;
            for(int coluna = 0; coluna < boletim[linha].length; coluna++){
                somaPorEstudante += boletim[linha][coluna];
                quantidadeNotasPorEstudante++;
            }
            arrMediaPorEstudante[indiceEstudante] = somaPorEstudante / quantidadeNotasPorEstudante;
            indiceEstudante++;
        }

        // CALCULAR MÉDIA POR AVALIAÇÃO
        double[] arrMediaPorAvaliacao = new double[4];
        int indiceAvaliacao = 0;
        for(int coluna = 0; coluna < boletim[0].length; coluna++){
            double somaNotasAvaliacao = 0;
            int quantidadeNotasPorAvaliacao = 0;
            for(int linha = 0; linha < boletim.length; linha++){
                somaNotasAvaliacao += boletim[linha][coluna];
                quantidadeNotasPorAvaliacao++;
            }
            arrMediaPorAvaliacao[indiceAvaliacao] = somaNotasAvaliacao / quantidadeNotasPorAvaliacao;
            indiceAvaliacao++;
        }

        // MAIOR NOTA DA MATRIZ E SUA POSICAO
        double maiorNota = boletim[0][0];
        int indiceLinhaMaiorNota = 0;
        int indiceColunaMaiorNota = 0;
        for(int linha = 0; linha < boletim.length; linha++){
            for(int coluna = 0; coluna < boletim[0].length; coluna++){
                if(boletim[linha][coluna] > maiorNota){
                    maiorNota = boletim[linha][coluna];
                    indiceLinhaMaiorNota = linha;
                    indiceColunaMaiorNota = coluna;
                }
            }
        }

        // RELATÓRIOS
        System.out.println("\n\n ------ RELATÓRIOS ------ ");

        System.out.println("A maior nota do boletim é: " + maiorNota + ". Sua posição é (linha)(coluna) [" + indiceLinhaMaiorNota + "][" + indiceColunaMaiorNota + "].");

        double mediaGeral = somaNotas / quantidadeNotas;
        System.out.println("Média geral da turma: " + String.format("%.2f", mediaGeral));


        int quantidadeMediaSuperiorSete = 0;
        for(int i = 0; i < arrMediaPorEstudante.length; i++){
            if(arrMediaPorEstudante[i] >= 7){
                quantidadeMediaSuperiorSete++;
            }
        }
        System.out.println("Quantidade de estudantes com média igual ou superior a 7: " + quantidadeMediaSuperiorSete);


        double EstudanteMaiorMedia = 0;
        int indiceMaiorMediaEstudante = 0;
        for(int i = 0; i < arrMediaPorEstudante.length; i++){
            if(arrMediaPorEstudante[i] > EstudanteMaiorMedia){
                EstudanteMaiorMedia = arrMediaPorEstudante[i];
                indiceMaiorMediaEstudante = i;
            }
        }
        System.out.println("O estudante com a maior média (" + EstudanteMaiorMedia + ") é: " + arrMediaPorEstudante[indiceMaiorMediaEstudante]);


        System.out.println("\n -- Média por aluno -- ");
        for(int i = 0; i < arrMediaPorEstudante.length; i++){
            System.out.println("Aluno " + (int)(i+1) + ": " + arrMediaPorEstudante[i]);
        }


        System.out.println("\n -- Média por avaliação -- ");
        for(int i = 0; i < arrMediaPorAvaliacao.length; i++){
            System.out.println("Avaliação " + (int)(i+1) + ": " + arrMediaPorAvaliacao[i]);
        }
    }
}
