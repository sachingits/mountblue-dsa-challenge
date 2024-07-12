package mountblueJobChallenge;

import java.util.Arrays;
import java.util.List;

// https://www.hackerrank.com/challenges/gem-stones/problem
public class Gemstones {
    public static void main(String[] args) {
        System.out.println(gemstones(Arrays.asList("abc", "abc", "ab")));
    }

    public static int gemstones(List<String> arr) {
        int[] mineralCount = new int[26];
        int numOfRocks = arr.size();

        for (String rock : arr) {
            // Array to track if a mineral is present in the current rock
            boolean[] foundMineral = new boolean[26];

            for (char mineral : rock.toCharArray()) {
                // Set the corresponding index in the foundMineral array to true
                foundMineral[mineral - 'a'] = true;
            }

            // Increment the count of minerals found in the current rock
            for (int i = 0; i < 26; i++) {
                if (foundMineral[i]) {
                    mineralCount[i]++;
                }
            }
        }

        // Count the number of minerals that appeared in every rock
        int gemstoneCount = 0;

        for (int count : mineralCount) {
            // If a mineral occurs in all rocks, increment gemstoneCount
            if (count == numOfRocks) {
                gemstoneCount++;
            }
        }

        return gemstoneCount;
    }
}