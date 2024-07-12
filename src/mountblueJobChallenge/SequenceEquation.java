package mountblueJobChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://www.hackerrank.com/challenges/permutation-equation/problem
// I did it using both as a list and as an array (parameter)

public class SequenceEquation {
    public static void main(String[] args) {

        System.out.println(permutationEquation(Arrays.asList(5, 2, 1, 3, 4)));
        System.out.println(Arrays.toString(permutationEquation(new int[]{5, 2, 1, 3, 4})));
    }

    public static List<Integer> permutationEquation(List<Integer> p) {
        int n = p.size();
        List<Integer> result = new ArrayList<>();

        for(int i=1; i<=n; i++){
            int index = p.indexOf((p.indexOf(i) + 1)) + 1;
            result.add(index);
        }
        return result;
    }

    public static int[] permutationEquation(int[] p) {

        int n = p.length;
        int[] result = new int[n];

        for (int i=1; i<=n; i++){

            int x = indexOf(p, i) + 1;
            int y = indexOf(p, x) + 1;

            result[i - 1] = y;
        }

        return result;
    }

    public static int indexOf(int[] p, int x) {
        for (int i=0; i<p.length; i++){
            if (p[i] == x){
                return i;
            }
        }
        return -1;
    }
}
