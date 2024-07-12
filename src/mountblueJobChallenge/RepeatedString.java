package mountblueJobChallenge;

// https://www.hackerrank.com/challenges/repeated-string/problem

public class RepeatedString {
    public static void main(String[] args) {
        System.out.println(repeatedString("sader", 1000000000000L));
    }

    public static long repeatedString(String s, long n) {
        long countOfAInSubstring = 0;
        long substringLength = s.length();

        for (int i = 0; i < substringLength; i++) {
            if (s.charAt(i) == 'a') {
                countOfAInSubstring++;
            }
        }

        // Calculate how many times the entire substring s repeats in the first n characters
        long fullRepeatsCount = n / substringLength;

        // Calculate the number of 'a' in the repeated part
        long totalAInFullRepeats = fullRepeatsCount * countOfAInSubstring;

        // Calculate the number of remaining characters
        long remainingChars = n % substringLength;

        // Calculate the number of 'a' in the remaining characters
        long countOfAInRemaining = 0;
        for (int i = 0; i < remainingChars; i++) {
            if (s.charAt(i) == 'a') {
                countOfAInRemaining++;
            }
        }

        return totalAInFullRepeats + countOfAInRemaining;
    }
}