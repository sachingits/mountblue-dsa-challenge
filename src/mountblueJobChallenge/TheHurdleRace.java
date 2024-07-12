package mountblueJobChallenge;

import java.util.Arrays;
import java.util.List;

// https://www.hackerrank.com/challenges/the-hurdle-race/problem

public class TheHurdleRace {
    public static void main(String[] args) {
        System.out.println(hurdleRace(4, Arrays.asList(1, 6, 3, 5, 2)));
    }

    public static int hurdleRace(int k, List<Integer> height) {

        int max = Integer.MIN_VALUE;

        for(int element : height){

            if(element > max){
                max = element;
            }
        }

        return k > max ? 0 : max - k;
    }
}
