package mountblueJobChallenge;

// https://www.hackerrank.com/challenges/find-digits/problem
public class FindDigits {
    public static void main(String[] args) {
        System.out.println(findDigits(124));
    }

    public static int findDigits(int n) {
        int count = 0;
        int originalN = n;

        while (n > 0) {
            int digit = n % 10;

            // Check if the extracted digit is not zero and if it divides the original number 'n' evenly
            if (digit != 0 && originalN % digit == 0) {
                // If the conditions are met, increment the count of digits that are divisors
                count++;
            }

            n /= 10;
        }

        return count;
    }
}