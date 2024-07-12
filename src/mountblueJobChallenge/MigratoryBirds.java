package mountblueJobChallenge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://www.hackerrank.com/challenges/migratory-birds/problem

public class MigratoryBirds {
    public static void main(String[] args) {

        System.out.println(migratoryBirds(Arrays.asList(1, 4, 4, 4, 5, 3)));
    }

    public static int migratoryBirds(List<Integer> arr) {

        Map<Integer, Integer> map = new HashMap<>();

        int mostFrequentBirdType = -1;
        int mostFrequency = 0;

        for (int birdType : arr){
            int currentFrequency = map.getOrDefault(birdType, 0) + 1;
            map.put(birdType, currentFrequency);

            if (currentFrequency > mostFrequency || (currentFrequency == mostFrequency && mostFrequentBirdType > birdType)){
                mostFrequentBirdType = birdType;
                mostFrequency = currentFrequency;
            }
        }

        return mostFrequentBirdType;
    }
}