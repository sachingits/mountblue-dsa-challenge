package mountblueJobChallenge;

// https://www.hackerrank.com/challenges/chocolate-feast/problem
public class ChocolateFeast {
    public static void main(String[] args) {

    }

    public static int chocolateFeast(int n, int c, int m) {

        // Calculate initial chocolates bought with the available money
        int chocolates = n / c;

        // Initialize the number of wrappers obtained from the bought chocolates
        int wrappers = chocolates;

        // While the number of wrappers is enough to exchange for more chocolates
        while (wrappers >= m) {
            // Calculate the number of chocolates obtained from exchanging wrappers
            int exchanged = wrappers / m;

            // Add the chocolates obtained from wrapper exchange to the total count
            chocolates += exchanged;

            // Calculate the remaining wrappers after exchanging for more chocolates
            int remainingWrappers = wrappers % m;

            // Calculate the total wrappers considering the exchanged ones and the remaining ones
            wrappers = exchanged + remainingWrappers;
        }

        // Return the total number of chocolates Bobby can eat after taking full advantage of the promotion
        return chocolates;
    }
}
