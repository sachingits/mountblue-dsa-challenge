package mountblueJobChallenge;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// https://www.hackerrank.com/challenges/minimum-absolute-difference-in-an-array/problem

public class MinimumAbsoluteDifference {
    public static void main(String[] args) {

        System.out.println(minimumAbsoluteDifference(Arrays.asList(-59, -36, -13, 1, -53, -92, -2, -96, -54, 75)));
    }

    public static int minimumAbsoluteDifference(List<Integer> arr) {
        int minAbsoluteDiff = Integer.MAX_VALUE;
        Set<Integer> seen = new HashSet<>();

        for (int num : arr) {
            // Calculate absolute difference with previous elements in 'seen' set
            for (int prev : seen) {
                int absoluteDiff = Math.abs(num - prev);
                minAbsoluteDiff = Math.min(minAbsoluteDiff, absoluteDiff);
            }

            seen.add(num);
        }

        return minAbsoluteDiff;
    }
}
