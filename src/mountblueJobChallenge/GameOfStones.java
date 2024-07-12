package mountblueJobChallenge;

public class GameOfStones {
    public static void main(String[] args) {

        System.out.println(5 % 7);
        System.out.println(7 % 7);
        System.out.println(12 % 7);
        System.out.println(14 % 7);
        System.out.println(15 % 7);
    }

    public static String gameOfStones(int n) {
        if (n % 7 == 0 || n % 7 == 1) {
            return "Second"; // Second player wins
        } else {
            return "First"; // First player wins for all other cases
        }
    }
}
