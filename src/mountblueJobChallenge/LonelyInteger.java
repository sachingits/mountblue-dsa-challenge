package mountblueJobChallenge;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// https://www.hackerrank.com/challenges/lonely-integer/problem
public class LonelyInteger {
    public static void main(String[] args) {
        System.out.println(lonelyInteger(Arrays.asList(0, 0, 1, 2, 1)));
    }

    public static int lonelyInteger(List<Integer> a) {
        Collections.sort(a);

        for(int i=0; i<a.size()-1; i+=2){
            if(!a.get(i).equals(a.get(i + 1))){
                return a.get(i);
            }
        }

        return a.get(a.size()-1);
    }
}