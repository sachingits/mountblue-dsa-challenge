package mountblueJobChallenge;

// https://www.hackerrank.com/challenges/kangaroo/problem
// https://www.hackerrank.com/contests/mountblue-technologies/challenges/kangaroo

public class NumberLineJumps {
    public static void main(String[] args) {

        System.out.println(kangaroo(0,2,5,3));
    }

    public static String kangaroo(int x1, int v1, int x2, int v2) {

        // first we check (initially) whether kangaroo 1 is behind to kangaroo 2 or not
        // then we check the speed of both kangaroos; if the speed of kangaroo 1 slower or equal to kangaroo 2
        // then 1st one can never reach to 2nd one; so we return "NO"
        if (x1 < x2 && v1 <= v2){
            return "NO";
        }

        // here we check whether the speed of both is different or not
        if (v1 != v2){

            int distanceDiff = x2 - x1;
            int speedDiff = v1 - v2;

            // if the initial divisible of distance and speed is 0 it means they will meet at some point
            // but if it's != 0 means they will never meet; so we return "NO".
            if (distanceDiff % speedDiff != 0){
                return "NO";
            }
        }

        return "YES";
    }
}