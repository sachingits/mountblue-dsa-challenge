package mountblueJobChallenge;

import java.util.HashSet;

// https://www.hackerrank.com/challenges/two-strings/problem
public class TwoStrings {
    public static void main(String[] args) {
        System.out.println(twoStrings("and", "art"));
    }

    public static String twoStrings(String s1, String s2) {
        HashSet<Character> set = new HashSet<>();

        for (char c : s1.toCharArray()) {
            set.add(c);
        }

        for (char c : s2.toCharArray()) {
            if (set.contains(c)) {
                return "YES";
            }
        }

        return "NO";
    }
}