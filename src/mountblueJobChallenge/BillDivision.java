package mountblueJobChallenge;

import java.util.Arrays;
import java.util.List;

// https://www.hackerrank.com/challenges/bon-appetit/problem

public class BillDivision {
    public static void main(String[] args) {
        bonAppetit(Arrays.asList(3, 10, 2, 9), 1, 12);
    }

    public static void bonAppetit(List<Integer> bill, int k, int b) {

        // k = excludedItemIndex
        // b = anna paid

        int sharedCost = 0;

        for (int i = 0; i < bill.size(); i++) {
            if (i != k) {
                sharedCost += bill.get(i);
            }
        }

        int annaShare = sharedCost / 2;

        if (b - annaShare != 0) {
            System.out.println(b - annaShare);
        } else {
            System.out.println("Bon Appetit");
        }
    }
}
