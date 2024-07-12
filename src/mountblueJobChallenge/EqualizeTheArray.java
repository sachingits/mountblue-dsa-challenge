package mountblueJobChallenge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://www.hackerrank.com/challenges/equality-in-a-array/problem
public class EqualizeTheArray {
    public static void main(String[] args) {

        System.out.println(equalizeArray(Arrays.asList(3, 3, 2, 1, 3)));
    }

    public static int equalizeArray(List<Integer> arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int value : arr){
            map.put(value, map.getOrDefault(value, 0) + 1);
        }

        int maxFrequency = 0;

        for(int freq : map.values()){
            if(freq > maxFrequency){
                maxFrequency = freq;
            }
        }

        return arr.size() - maxFrequency;
    }
}