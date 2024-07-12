package mountblueJobChallenge;

// https://www.hackerrank.com/challenges/append-and-delete/problem
public class AppendAndDelete {
    public static void main(String[] args) {
        System.out.println(appendAndDelete("hackerhappy", "hackerrank", 9));
    }

    public static String appendAndDelete(String s, String t, int k) {

        int commonLength = 0;

        // Find the common length of characters at the beginning of both strings
        for (int i = 0; i < Math.min(s.length(), t.length()); i++) {
            if (s.charAt(i) == t.charAt(i)) {
                commonLength++;
            } else {
                break;
            }
        }

        // Calculate the number of operations needed to perform to transform s to t
        int requiredOperations = s.length() + t.length() - 2 * commonLength;

        // If the required number of operations is greater than the given k, it's not possible
        if (requiredOperations > k) {
            return "No";
        }
        // If the difference in operations is even and matches with available k operations, it's possible
        else if (requiredOperations % 2 == k % 2) {
            return "Yes";
        }
        // If the total length of s and t minus k is negative, it's possible
        else if ((s.length() + t.length() - k) < 0) {
            return "Yes";
        } else {
            // Otherwise, it's not possible
            return "No";
        }
    }
}