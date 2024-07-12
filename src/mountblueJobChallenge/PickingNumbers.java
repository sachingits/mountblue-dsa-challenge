package mountblueJobChallenge;

import java.util.Arrays;
import java.util.List;

// https://www.hackerrank.com/challenges/picking-numbers/problem
public class PickingNumbers {
    public static void main(String[] args) {
        System.out.println(pickingNumbers(Arrays.asList(4, 6, 5, 3, 3, 1)));
    }

    public static int pickingNumbers(List<Integer> a) {
        int[] count = new int[101];

        for(int num : a){
            count[num]++;
        }

        int maximumLength = 0;

        for(int i=1; i<101; i++){
            maximumLength = Math.max(maximumLength, count[i] + count[i-1]);
        }

        return maximumLength;
    }
}