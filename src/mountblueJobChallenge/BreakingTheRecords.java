package mountblueJobChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
// mountBlue : https://www.hackerrank.com/contests/mountblue-technologies/challenges/breaking-best-and-worst-records

public class BreakingTheRecords {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 21, 36, 10, 28, 35, 5, 24, 42);

        System.out.println(breakingRecords(list));
    }

    public static List<Integer> breakingRecords(List<Integer> scores) {

        List<Integer> recordCounts = new ArrayList<>();

        int minRecordCount = 0;
        int maxRecordCount = 0;
        Integer currMin = scores.get(0);
        Integer currMax = scores.get(0);

        for (Integer score : scores) {

            if (score < currMin){
                currMin = score;
                minRecordCount++;
            } else if (score > currMax) {
                currMax = score;
                maxRecordCount++;
            }
        }
        recordCounts.add(0, maxRecordCount);
        recordCounts.add(1, minRecordCount);

        return recordCounts;
    }
}