package mountblueJobChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// https://www.hackerrank.com/challenges/luck-balance/problem
public class LuckBalance {
    public static void main(String[] args) {
        List<List<Integer>> contests = new ArrayList<>();

        contests.add(Arrays.asList(5, 1));
        contests.add(Arrays.asList(2, 1));
        contests.add(Arrays.asList(1, 1));
        contests.add(Arrays.asList(8, 1));
        contests.add(Arrays.asList(10, 0));
        contests.add(Arrays.asList(5, 0));

        System.out.println(luckBalance(3, contests));
    }

    public static int luckBalance(int k, List<List<Integer>> contests) {
        int maxLuck = 0;
        int impContextCount = 0;
        List<Integer> impContextLuck = new ArrayList<>();

        for(List<Integer> contest : contests){
            int luck = contest.get(0);
            int imp = contest.get(1);

            if(imp == 0){
                maxLuck += luck;
            } else {
                impContextLuck.add(luck);
                impContextCount++;
            }
        }

        impContextLuck.sort(Collections.reverseOrder());
        // Collections.sort(impContextLuck, Collections.reverseOrder());

        for(int i=0; i<impContextCount; i++){
            if(i < k){
                maxLuck += impContextLuck.get(i);
            } else {
                maxLuck -= impContextLuck.get(i);
            }
        }

        return maxLuck;
    }
}