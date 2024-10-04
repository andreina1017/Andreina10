public class NumerosPrimos {
    public static void main(String[] args) {
        final int NUMERO_MAXIMO = 100;
        System.err.println("los numeros primos entre 1 y 100");

        for(int i = 2; i<= NUMERO_MAXIMO; i++){
            int contadorDivisores = 0;

            for (int j =2; j< i; j++){
                if (i % j ==0){
                    contadorDivisores++;
                    break;
                }
            }
        
        if (contadorDivisores == 0)  {
            System.out.println(i + "");
        }  

        }
    }
}
