/*Q-01: Print prime numbers between given input value.*/

public class PrimeNumber {

    //main method
    public static void main(String[] args) {

        int n = 100;        //given input value
        boolean isPrime;

        for(int i = 1; i <= n; i++) {
            isPrime = true;
            for(int j = 2; j <= i / 2; j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
