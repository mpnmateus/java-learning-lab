package exercicios.bloco1.serie6;

import java.util.Scanner;

public class BibliotecaProcedural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] codigos = new int[20];
        codigos[0] = 1;
        codigos[1] = 2;
        String[] titulos = new String[20];
        String[] autores = new String[20];
        boolean[] emprestados = new boolean[20];
        String[] usuarios = new String[20];

        int quantidadeLivrosCadastrados = 0; // Para informar quantos livros existem na biblioteca
        int opcao = 0;
        do {
            System.out.println(" --- MENU BIBLIOTECA --- ");
            System.out.println(" 1 - Cadastrar Livro" +
                    "\n 2 - Pesquisar livro por código" +
                    "\n 3 - Emprestar livro" +
                    "\n 4 - Devolver livro" +
                    "\n 5 - Listar todos os livros" +
                    "\n 6 - Listar livros disponíveis" +
                    "\n 7 - Listar livros emprestados" +
                    "\n 0 - Encerrar");
            System.out.println("-------------------------");
            System.out.println("Digite a opção desejada:");
            opcao = sc.nextInt();
            if(opcao != 0) {
                switch (opcao) {
                    case 1:
                        for (int i = 0; i < codigos.length; i++) {
                            if (codigos[i] == 0) {
                                System.out.println("Digite um código de cadastro para o livro: ");
                                int codigo = sc.nextInt();
                                if (codigo <= 0) {
                                    System.out.println("O código deve ser maior que zero.");
                                    break;
                                }
                                boolean ehRepetido = false;
                                do{
                                    ehRepetido = false;
                                    for (int j = 0; j < codigos.length; j++) {
                                        if (codigo == codigos[j]) {
                                            System.out.println("\nO código do livro já consta no cadastro.");
                                            ehRepetido = true;
                                            break;
                                        }
                                    }
                                    if(ehRepetido){
                                        System.out.println("Digite um código de cadastro para o livro: ");
                                        codigo = sc.nextInt();
                                    }
                                } while(ehRepetido);

                                sc.nextLine(); // para consumir o entre pendente de nextInt()
                                System.out.println("Digite o título do livro: ");
                                String titulo = sc.nextLine();
                                if (titulo.isBlank()) {
                                    System.out.println("Para efetivar o cadastro, é necessário informar um título.");
                                    break;
                                }
                                System.out.println("Digite o autor do livro: ");
                                String autor = sc.nextLine();
                                if (autor.isBlank()) {
                                    System.out.println("Para efetivar o cadastro, é necessário informar um autor.");
                                    break;
                                }
                                codigos[i] = codigo;
                                titulos[i] = titulo;
                                autores[i] = autor;
                                quantidadeLivrosCadastrados++;
                                System.out.println("Livro cadastrado!");
                                System.out.println();
                                break;

                            }
                            if (i == codigos.length-1) {
                                System.out.println("Não há mais espaço para cadastrar livros.");
                            }

                        }
                        break;
                    case 2:
                }
            }
        }while(opcao != 0);

    }
}
