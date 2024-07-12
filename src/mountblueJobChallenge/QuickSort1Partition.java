package mountblueJobChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://www.hackerrank.com/challenges/quicksort1/problem
// https://www.hackerrank.com/contests/mountblue-technologies/challenges/quicksort1/problem

public class QuickSort1Partition {
    public static void main(String[] args) {

        System.out.println(quickSort(Arrays.asList(4, 5, 3, 7, 2)));
    }

    public static List<Integer> quickSort(List<Integer> arr) {

        int pivot = arr.get(0);

        List<Integer> left = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int element: arr) {

            if (element < pivot){
                left.add(element);
            } else if (element == pivot) {
                equal.add(pivot);
            } else {
                right.add(element);
            }
        }

        List<Integer> result = new ArrayList<>();

        result.addAll(left);
        result.addAll(equal);
        result.addAll(right);

        return result;
    }
}
