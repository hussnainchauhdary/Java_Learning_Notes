public class d_primeNumberChallenge {
    public static boolean isPrime(int number) {
        boolean prime = true ;
        if (number <= 1){
            prime = false;
        }
        for(int i = 2 ; i <= number/2 ; i ++){
            if (number % i == 0){
                prime = false;
                break;
            }
        }
        return prime ;

    }
    public static void main(String[] args) {
        int count = 0;
        for(int i = 2; i <= 100; i++) {

            if (isPrime(i)){
                System.out.println(i + " is a prime number ");
                count ++;
                if(count == 3){
                    System.out.println("Found 3-existing for loop");
                    break;
                }
            }

        }


    }
}
