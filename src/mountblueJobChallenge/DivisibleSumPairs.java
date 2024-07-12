package mountblueJobChallenge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DivisibleSumPairs {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(two(new int[]{2, 7, 6, 5, 1, 25}, 12)));
    }

    public static int[] two(int[] arr, int k){

        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<arr.length; i++){

            int value = k - arr[i];

            if (map.containsKey(value)){
                return new int[]{map.get(value), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }
}