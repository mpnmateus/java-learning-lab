package exercicios.bloco1.serie1;

public class LaboratorioDeCasting {
    public static void main(String[] args) {
        int numeroInt = 150;
        long numeroLong = 2_147_483_648L;
        double numeroDouble = 19.99;
        float numeroFloat = 7.75F;
        short numeroShort = 32_000;
        byte numeroByte = 100;

        System.out.println("Conversões\n");

        short numeroByteToShort = 100;
        System.out.println(numeroByte);
        System.out.println(numeroByteToShort);

        int numeroShortToInt = 32_000;
        System.out.println(numeroShort);
        System.out.println(numeroShortToInt);

        long numeroIntToLong = 150;
        System.out.println(numeroInt);
        System.out.println(numeroIntToLong);

        double numeroIntToDouble = 150;
        System.out.println(numeroInt);
        System.out.println(numeroIntToDouble);

        int numeroLongToInt = (int) 2_147_483_648L;
        System.out.println(numeroLong);
        System.out.println(numeroLongToInt);

        int numeroDoubleToInt = (int) 19.99;
        System.out.println(numeroDouble);
        System.out.println(numeroDoubleToInt);

        int numeroFloatToInt = (int) 7.75F;
        System.out.println(numeroFloat);
        System.out.println(numeroFloatToInt);

        byte numeroIntToByte = (byte) 150;
        System.out.println(numeroInt);
        System.out.println(numeroIntToByte);

    }
}
