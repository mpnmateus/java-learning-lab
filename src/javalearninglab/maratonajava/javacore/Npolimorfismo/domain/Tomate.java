package javalearninglab.maratonajava.javacore.Npolimorfismo.domain;

public class Tomate extends Produto {
    public static final double IMP_POR_CENTO = 0.06;
    public Tomate(String nome, double valor){
        super(nome, valor);
    }

    @Override
    public double calcularImposto(){
        return this.valor * IMP_POR_CENTO;
    }
}
