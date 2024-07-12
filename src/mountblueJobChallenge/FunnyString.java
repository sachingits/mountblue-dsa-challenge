package mountblueJobChallenge;

// https://www.hackerrank.com/challenges/funny-string/problem
public class FunnyString {
    public static void main(String[] args) {
        System.out.println(funnyString("acxz"));
    }

    public static String funnyString(String s) {

        // Reverse the input string and store it in the 'reverse' variable
        String reverse = new StringBuilder(s).reverse().toString();

        // Iterate through the characters of the string starting from the second character
        for (int i = 1; i < s.length(); i++) {

            // Calculate the absolute difference in ASCII values between adjacent characters
            // in the original string and its reversed counterpart
            int diff1 = Math.abs((int) s.charAt(i) - (int) s.charAt(i - 1));
            int diff2 = Math.abs((int) reverse.charAt(i) - (int) reverse.charAt(i - 1));

            // Check if the absolute differences of adjacent characters are not equal
            // between the original string and its reversed version
            if (diff1 != diff2) {
                // If differences are not equal at any point, return "Not Funny"
                return "Not Funny";
            }
        }

        // If all the absolute differences are equal for both the original string and its reverse,
        // return "Funny" as the string satisfies the condition for being funny
        return "Funny";
    }
}