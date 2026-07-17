package javalearninglab.maratonajava.javacore.Npolimorfismo.domain;

public class Computador extends Produto {
    public static final double IMP_POR_CENTO = 0.21;
    public Computador (String nome, double valor){
        super(nome, valor);
    }
    @Override
    public double calcularImposto(){
        return this.valor * IMP_POR_CENTO;
    }

}
