package mountblueJobChallenge;

import java.util.Arrays;
import java.util.List;

// https://www.hackerrank.com/challenges/misere-nim-1/problem
public class MisèreNim {
    public static void main(String[] args) {
        System.out.println(misereNim(Arrays.asList(2, 3, 3)));
    }

    public static String misereNim(List<Integer> s) {

        int xorSum = 0;
        int countOnes = 0;

        // Calculate the XOR sum of all pile sizes and count the number of piles with only one stone
        for (int stones : s) {
            xorSum ^= stones;  // XOR operation to calculate the total XOR sum of all pile sizes
            if (stones == 1) {
                countOnes++;   // Increment count if the current pile has only one stone
            }
        }

        // Determine the winning condition based on the calculated XOR sum and count of piles with one stone
        if ((xorSum == 0 && countOnes == s.size()) || (xorSum != 0 && countOnes != s.size())) {
            // If the XOR sum is zero and all piles have only one stone OR
            // If the XOR sum is non-zero and not all piles have only one stone, the first player wins
            return "First";
        } else {
            // Otherwise, the second player wins
            return "Second";
        }
    }
}