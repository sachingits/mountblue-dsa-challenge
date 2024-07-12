package mountblueJobChallenge;

// https://www.hackerrank.com/challenges/caesar-cipher-1/problem

public class CaesarCipher {
    public static void main(String[] args) {

        System.out.println(caesarCipher("middle-Outz", 2));
    }

    public static String caesarCipher(String s, int k) {

        StringBuilder result = new StringBuilder();

        int n = s.length();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (Character.isLowerCase(c)) {
                c = (char) (((c - 'a' + k) % 26) + 'a');
            } else if (Character.isUpperCase(c)) {
                c = (char) (((c - 'A' + k) % 26) + 'A');
            }

            result.append(c);
        }
        return result.toString();
    }
}
