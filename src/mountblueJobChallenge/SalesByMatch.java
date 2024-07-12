package mountblueJobChallenge;

import java.util.Arrays;
import java.util.List;

// https://www.hackerrank.com/challenges/sock-merchant/problem
// https://hackerrank.com/contests/mountblue-technologies/challenges/sock-merchant

public class SalesByMatch {
    public static void main(String[] args) {
        List<Integer> sockList = Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20, 10);
        System.out.println(sockMerchant(sockList));
    }

    public static int sockMerchant(List<Integer> ar) {
        int[] colorCounts = new int[101];
        int totalPairs = 0;

        for (int color : ar) {
            colorCounts[color]++;
            if (colorCounts[color] % 2 == 0) {
                totalPairs++;
                colorCounts[color] = 0;
            }
        }

        return totalPairs;
    }
}