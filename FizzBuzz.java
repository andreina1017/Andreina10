public class FizzBuzz {
    public static void main(String args[]){
        final int NUMERO_MAXIMO = 100;

        for(int i = 1; i<=NUMERO_MAXIMO; i++){
            if((i%3 == 0) && (i%5 == 0)){
                System.out.println("fizzbuzz");
            }
            else if(i%3 == 0){
                System.out.println("fizz");
            }
            else if(i%5 == 0){
                System.out.println("buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
