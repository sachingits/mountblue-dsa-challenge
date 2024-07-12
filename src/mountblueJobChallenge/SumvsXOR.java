package mountblueJobChallenge;

// https://www.hackerrank.com/challenges/one-month-preparation-kit-sum-vs-xor/problem
public class SumvsXOR {
    public static void main(String[] args) {
        System.out.println(sumXor(5));
    }

    public static long sumXor(long n) {
        long count = 0;

        while (n > 0) {
            // Check if the least significant bit of 'n' is 0 (an unset bit)
            if ((n & 1) == 0) {
                count++;
            }

            n >>= 1; // Right shift 'n' to move to the next bit position
        }

        // Calculate the number of values satisfying the criteria
        // by left shifting 1 by the count of unset bits (2^count)
        return 1L << count;
    }
}