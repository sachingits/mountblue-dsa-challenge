package mountblueJobChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// https://www.hackerrank.com/challenges/maximum-perimeter-triangle/problem

public class MaximumPerimeterTriangle {
    public static void main(String[] args) {

        System.out.println(maximumPerimeterTriangle(Arrays.asList(4, 3, 10, 5, 2, 1)));
    }

    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {

        List<Integer> list = new ArrayList<>();
        Collections.sort(sticks);

        int j = sticks.size() - 1;
        int i = j - 2;

        while(i >= 0){

            if((sticks.get(i) + sticks.get(i+1) > sticks.get(j))){
                list.add(sticks.get(i));
                list.add(sticks.get(i+1));
                list.add(sticks.get(j));
                return list;
            }
            i--;
            j--;
        }

        list.add(-1);
        return list;
    }
}