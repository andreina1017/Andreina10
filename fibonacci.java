public class fibonacci {
    public static void main(String[] args) {
        final int NUMERO_MAXIMO = 50;
        long NumeroInicial = 0;
        long NumeroSiguiente = 1;
        long NumeroResultado;

        System.out.print(NumeroInicial + "," + NumeroSiguiente);
        for(int i =2; i < NUMERO_MAXIMO; i++){

            NumeroResultado = NumeroInicial + NumeroSiguiente;
            System.out.print("," + NumeroResultado);
            NumeroInicial = NumeroSiguiente;
            NumeroSiguiente = NumeroResultado;
        }

    }
}
