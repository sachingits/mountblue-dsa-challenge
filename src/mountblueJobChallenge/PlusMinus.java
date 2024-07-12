package mountblueJobChallenge;

import java.util.Arrays;
import java.util.List;

public class PlusMinus {
    public static void main(String[] args) {

        plusMinus(Arrays.asList(-4, 3, -9, 0, 4, 1));
    }

    public static void plusMinus(List<Integer> arr) {

        int positiveCount = 0;
        int zeroCount = 0;
        int negativeCount = 0;

        for (int element : arr) {
            if (element > 0) {
                positiveCount++;
            } else if (element < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        double total = arr.size();

        double positiveRatio = (double) positiveCount / total;
        double negativeRatio = (double) negativeCount / total;
        double zeroRatio = (double) zeroCount / total;

        System.out.printf("%.6f%n", positiveRatio);
        System.out.printf("%.6f%n", negativeRatio);
        System.out.printf("%.6f%n", zeroRatio);
    }
}
