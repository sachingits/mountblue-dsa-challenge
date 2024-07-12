package mountblueJobChallenge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://www.hackerrank.com/challenges/minimum-distances/problem

public class MinimumDistances {
    public static void main(String[] args) {

        System.out.println(minimumDistances(Arrays.asList(7, 1, 3, 4, 1, 7)));
    }

    public static int minimumDistances(List<Integer> a) {

        Map<Integer, Integer> map = new HashMap<>();
        int minDiff = Integer.MAX_VALUE;

        for(int i=0; i<a.size(); i++){
            int value = a.get(i);

            if(map.containsKey(value)){
                int index = map.get(value);
                int diff = i - index;

                minDiff = Math.min(diff, minDiff);
            }

            map.put(value, i);
        }

        if(minDiff == Integer.MAX_VALUE){
            return -1;
        }

        return minDiff;
    }
}