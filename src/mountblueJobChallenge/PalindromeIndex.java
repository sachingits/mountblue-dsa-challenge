package mountblueJobChallenge;

// https://www.hackerrank.com/challenges/palindrome-index/problem
public class PalindromeIndex {
    public static void main(String[] args) {
        System.out.println("bcbc");
    }

    public static int palindromeIndex(String s) {

        int length = s.length();
        for (int i = 0; i < length / 2; i++) {
            if (s.charAt(i) != s.charAt(length - 1 - i)) {
                if (isPalindrome(s.substring(i, length - i - 1))) {
                    return length - i - 1;
                } else if (isPalindrome(s.substring(i + 1, length - i))) {
                    return i;
                } else {
                    return -1;
                }
            }
        }

        return -1;
    }

    public static boolean isPalindrome(String s) {
        int length = s.length();
        for (int i = 0; i < length / 2; i++) {
            if (s.charAt(i) != s.charAt(length - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
