package net.teraiya;

/**
 * Created by jteraiya on 11/30/14.
 */
public class PrimeNumbers {

    public boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        } else {
            /**
             * Q: Why are we checking only till  Math.sqrt(num)?
             * Ans: if a factor is greater than the square root of n,
             * the other factor that would multiply with it to equal n is necessarily less than the square root of n.
             */
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
