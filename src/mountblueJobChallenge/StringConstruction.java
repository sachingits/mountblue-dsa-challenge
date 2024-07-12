package mountblueJobChallenge;

import java.util.HashSet;
import java.util.Set;

// https://www.hackerrank.com/challenges/string-construction/problem
public class StringConstruction {
    public static void main(String[] args) {
        System.out.println(stringConstruction("abcd"));
    }

    public static int stringConstruction(String s) {
        Set<Character> charSet = new HashSet<>();

        for (char c : s.toCharArray()) {
            // Add each character to the set
            charSet.add(c);
        }

        // The size of the set represents the number of unique characters
        // which is the minimum cost required to construct the string
        return charSet.size();
    }
}