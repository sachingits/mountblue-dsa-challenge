package mountblueJobChallenge;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// https://www.hackerrank.com/challenges/marcs-cakewalk/problem

public class MarksCakewalk {
    public static void main(String[] args) {

        System.out.println(marcusCakewalk(Arrays.asList(6, 2, 8, 4, 1, 9)));
    }

    public static long marcusCakewalk(List<Integer> calorie) {


        calorie.sort(Collections.reverseOrder());
        // Collections.sort(calorie, Collections.reverseOrder());

        long result = 0;

        for (int i=0; i<calorie.size(); i++){
            result += (long) (Math.pow(2, i) * calorie.get(i));
        }

        return result;
    }
}
