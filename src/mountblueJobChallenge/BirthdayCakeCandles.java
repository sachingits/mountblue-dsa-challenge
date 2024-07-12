package mountblueJobChallenge;

import com.sun.crypto.provider.HmacMD5KeyGenerator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://www.hackerrank.com/challenges/birthday-cake-candles/problem

public class BirthdayCakeCandles {
    public static void main(String[] args) {

        System.out.println(birthdayCakeCandles(Arrays.asList(3, 2, 3, 1, 2)));
    }

    public static int birthdayCakeCandles(List<Integer> candles) {

        int maxHeight = 0;
        int count = 0;

        for (int candle : candles) {

            if (candle > maxHeight) {
                maxHeight = candle;
                count = 1;
            } else if (candle == maxHeight) {
                count++;
            }
        }
        return count;
    }
}
