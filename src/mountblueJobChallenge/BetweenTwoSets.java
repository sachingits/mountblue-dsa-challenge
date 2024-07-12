package mountblueJobChallenge;

// https://www.hackerrank.com/challenges/between-two-sets/problem
// https://www.hackerrank.com/contests/mountblue-technologies/challenges/between-two-sets

import java.util.Arrays;
import java.util.List;

public class BetweenTwoSets {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(2, 4);
        List<Integer> list2 = Arrays.asList(16, 32, 96);

        System.out.println(getTotalX(list1, list2));
    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {

        int result = 0;
        int lcm = a.get(0);

        for (Integer integer : a) {
            lcm = getLCM(lcm, integer);
        }

        int gcd = b.get(0);

        for (Integer integer : b) {
            gcd = getGCD(gcd, integer);
        }

        // Count multiples of lcm that divide the gcd
        int multiple = 0;

        while (multiple <= gcd) {
            multiple += lcm;

            if (gcd % multiple == 0){
                result++;
            }
        }
        return result;
    }

    public static int getGCD(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return getGCD(n2, n1 % n2);
    }

    public static int getLCM(int n1, int n2) {

        if (n1 == 0 || n2 == 0){
            return 0;
        } else {
            int gcd = getGCD(n1, n2);

            return Math.abs(n1 * n2) / gcd;
        }
    }
}