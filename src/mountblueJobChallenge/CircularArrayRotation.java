package mountblueJobChallenge;

import java.util.Arrays;
import java.util.List;

// https://www.hackerrank.com/challenges/circular-array-rotation/problem

public class CircularArrayRotation {
    public static void main(String[] args) {
        System.out.println(circularArrayRotation(Arrays.asList(3, 4, 5), 2, Arrays.asList(1, 2)));
    }

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {

        k = k % a.size();
        int l = a.size();

        for(int i=0; i<queries.size(); i++){
            int position = (queries.get(i) - k + l) % l;
            queries.set(i, a.get(position));
        }

        return queries;
    }
}