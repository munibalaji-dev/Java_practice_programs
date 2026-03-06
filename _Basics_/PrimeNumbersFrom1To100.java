package _ControlFlow_;

public class PrimeNumbersFrom1To100 {

    public static void main(String[] args) {

        // Loop through numbers from 2 to 100
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;

            // Check for any divisors from 2 to i/2
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false; // Not prime if divisible
                    break;
                }
            }

            if (isPrime) {
                System.out.println("Prime Number : " + i);
            }
        }
    }
}
