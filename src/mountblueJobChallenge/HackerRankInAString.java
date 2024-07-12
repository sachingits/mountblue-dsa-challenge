package mountblueJobChallenge;

// https://www.hackerrank.com/challenges/hackerrank-in-a-string/problem

public class HackerRankInAString {
    public static void main(String[] args) {
        System.out.println(hackerrankInString("hereiamstackerrank"));
    }

    public static String hackerrankInString(String s) {
        String target = "hackerrank";
        int targetIndex = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == target.charAt(targetIndex)) {
                targetIndex++;
            }

            if (targetIndex == target.length()) {
                return "YES";
            }
        }
        return "NO";
    }
}
