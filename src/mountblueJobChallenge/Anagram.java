package mountblueJobChallenge;

// https://www.hackerrank.com/challenges/anagram/problem
public class Anagram {
    public static void main(String[] args) {
        System.out.println(anagram("aaabbb"));
    }

    public static int anagram(String s) {
        // Check if the length of the string is odd, as it's not possible to split into two equal-length substrings
        if (s.length() % 2 != 0) {
            return -1;
        }

        // Split the string into two substrings of equal length
        int length = s.length();
        String s1 = s.substring(0, length / 2);
        String s2 = s.substring(length / 2);

        // Create arrays to count the occurrences of characters in both substrings
        int[] countS1 = new int[26];
        int[] countS2 = new int[26];

        // Count occurrences of characters in the first substring
        for (char c : s1.toCharArray()) {
            countS1[c - 'a']++;
        }

        // Count occurrences of characters in the second substring
        for (char c : s2.toCharArray()) {
            countS2[c - 'a']++;
        }

        // Calculate the number of characters needed to change to make the substrings anagrams
        int changes = 0;
        for (int i = 0; i < 26; i++) {
            changes += Math.abs(countS1[i] - countS2[i]); // Calculate the absolute difference in character counts
        }

        // As we're counting changes for both substrings, divide by 2 to get the total changes needed
        return changes / 2;
    }
}