package mountblueJobChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://www.hackerrank.com/challenges/compare-the-triplets/problem
// https://www.hackerrank.com/contests/mountblue-technologies/challenges/compare-the-triplets/submissions/code/1367900888

public class CompareTheTriplets {
    public static void main(String[] args) {

        System.out.println(compareTriplets(Arrays.asList(17, 18, 30), Arrays.asList(99, 16, 8)));
    }

    // a = alice and b = bob
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        List<Integer> rating = new ArrayList<>();

        int aliceCount = 0;
        int bobCount = 0;

        for (int i = 0; i < 3; i++) {
            if (a.get(i) > b.get(i)) {
                aliceCount++;
            } else if (a.get(i) < b.get(i)) {
                bobCount++;
            }
        }

        rating.add(0, aliceCount);
        rating.add(1, bobCount);

        return rating;
    }
}
