package mountblueJobChallenge;

// https://www.hackerrank.com/challenges/counting-valleys/problem

public class CountingValleys {
    public static void main(String[] args) {
        System.out.println(countingValleys(2, "UUDUDD"));
    }

    public static int countingValleys(int steps, String path) {

        int altitude = 0;
        int count = 0;

        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'U') {
                altitude++;
            } else if (path.charAt(i) == 'D') {
                altitude--;
                if (altitude == -1) {
                    count++;
                }
            }
        }

        return count;
    }
}