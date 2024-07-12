package mountblueJobChallenge;

import java.util.Arrays;
import java.util.List;

// https://www.hackerrank.com/challenges/mini-max-sum/problem

public class MiniMaxSum {
    public static void main(String[] args) {

        miniMaxSum(Arrays.asList(3, 2, 6, 3, 8, 1));
    }

    public static void miniMaxSum(List<Integer> arr) {

        long min = Integer.MAX_VALUE;
        long max = Integer.MIN_VALUE;

        long minSum = 0;
        long maxSum = 0;

        for(int element : arr){

            min = Math.min(min, element);
            max = Math.max(max, element);

            minSum += element;
            maxSum += element;
        }

        minSum -= max;
        maxSum -= min;

        System.out.println(minSum + " " + maxSum);
    }
}