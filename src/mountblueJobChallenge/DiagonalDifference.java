package mountblueJobChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://www.hackerrank.com/challenges/diagonal-difference/problem

public class DiagonalDifference {
    public static void main(String[] args) {

        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(Arrays.asList(11, 2, 4));
        matrix.add(Arrays.asList(4, 5, 6));
        matrix.add(Arrays.asList(10, 8, -12));

        System.out.println(matrix);
        System.out.println(diagonalDifference(matrix));
    }

    public static int diagonalDifference(List<List<Integer>> arr) {

        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 0; i < arr.size(); i++) {
            primaryDiagonalSum += arr.get(i).get(i);
            secondaryDiagonalSum += arr.get(i).get(arr.size() - 1 - i);
        }

        return Math.abs(primaryDiagonalSum - secondaryDiagonalSum);
    }
}