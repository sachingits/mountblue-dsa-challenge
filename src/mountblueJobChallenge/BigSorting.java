package mountblueJobChallenge;

import java.util.*;

// https://www.hackerrank.com/challenges/big-sorting/problem
public class BigSorting {
    public static void main(String[] args) {

        System.out.println(bigSorting(Arrays.asList("4", "14", "24", "12", "123", "1233576435545674535766455435764355456745357664554357643554567453576645543576435545674535766455435764355456745357664554",
                "9")));
    }

    public static List<String> bigSorting(List<String> unsorted) {

        Collections.sort(unsorted, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {

                if (a.length() != b.length()){
                    return a.length() - b.length();
                }
                return a.compareTo(b);
            }
        });
        return unsorted;
    }
}