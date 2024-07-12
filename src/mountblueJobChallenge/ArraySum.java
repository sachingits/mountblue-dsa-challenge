package mountblueJobChallenge;

import java.util.*;

public class ArraySum {
    public static void main(String[] args) {
        System.out.println(simpleArraySum(Arrays.asList(3, 5, 7, 8)));
    }

    public static int simpleArraySum(List<Integer> ar) {
        int sum = 0;

        for (int n : ar) {
            sum += n;
        }

        return sum;
    }
}