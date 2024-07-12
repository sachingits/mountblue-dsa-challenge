package mountblueJobChallenge;

import java.util.Arrays;
import java.util.List;

// https://www.hackerrank.com/challenges/the-birthday-bar/problem

public class SubArrayDivision {
    public static void main(String[] args) {
        System.out.println(birthday(Arrays.asList(1, 2, 1, 3, 2), 3, 2));
    }

    public static int birthday(List<Integer> s, int d, int m) {
        if(s.size() < m){
            return 0;
        }

        int count = 0;

        for(int i=0; i<=s.size()-m; i++){
            int sum = 0;
            for(int j=i; j<i+m; j++){
                sum += s.get(j);
            }
            if(sum == d){
                count++;
            }
        }

        return count;
    }
}
