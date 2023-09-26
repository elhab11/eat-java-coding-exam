package problems.math;

public class PrimeNumber {

    /*
     *
     * find collections of Prime numbers from number 2 to 1 million.
     * output number of Prime numbers on the given range.
     *
     */

    public static void main(String[] args) {
       int n;
       int j = 0;

         n= 1000000000;
                      // Check from 2 to n-1
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    System.out.println(i);
                    j++;
                }


            }
            System.out.println("the are "+j+" prime numbers");

    }
}
