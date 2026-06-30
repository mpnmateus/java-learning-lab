package javalearninglab.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args){
        // idade < 15 caregoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto
        int idade = 21;
        String categoria; // variaveis de escopo local devem ser inicializadas antes de executá-las

        if(idade < 15){
            categoria = "Categoria infantil";
        } else if (idade >= 15 && idade < 18){
            categoria = "Categoria juvenil";
        } else {
            categoria = "Categoria adulto";
        }
        //categoria = idade < 15 ? "Categoria infantil" : idade >= 15 && idade < 18 ? "Categoria juvenil" : "Categoria adulto";

        System.out.println("A categoria é: " + categoria);
    }
}
