package mountblueJobChallenge;

public class SherlockAndSquares {
    public static void main(String[] args) {

        System.out.println(squares(24, 49));
    }

    public static int squares(int a, int b) {

        int countB = (int) Math.floor(Math.sqrt(b));
        int countA = (int) Math.floor(Math.sqrt(a));

        return countB - countA;
    }
}