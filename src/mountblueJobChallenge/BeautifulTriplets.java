package mountblueJobChallenge;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// https://www.hackerrank.com/challenges/beautiful-triplets/problem
// and what if there was array instead of list? check below method.

public class BeautifulTriplets {
    public static void main(String[] args) {
        System.out.println(beautifulTriplets(3, Arrays.asList(1, 2, 4, 5, 7, 8, 10)));
//        System.out.println(beautifulTriplets(3, new int[]{1, 2, 4, 5, 7, 8, 10}));
    }

    public static int beautifulTriplets(int d, List<Integer> arr) {
        int count = 0;
        int n = arr.size();

        for (int i=0; i<n-2; i++) {
            int first = arr.get(i);
            int second = first + d;
            int third = second + d;

            if (arr.contains(second) && arr.contains(third)) {
                count++;
            }
        }

        return count;
    }

    // for array as an input.
    public static int beautifulTriplets(int d, int[] arr) {
        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            int first = arr[i];
            int second = first + d;
            int third = second + d;

            int secondIndex = indexOf(arr, second, i + 1);
            int thirdIndex = indexOf(arr, third, secondIndex + 1);

            if (secondIndex != -1 && thirdIndex != -1) {
                count++;
            }
        }

        return count;
    }

    public static int indexOf(int[] arr, int target, int startIndex) {
        for (int i = startIndex; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}