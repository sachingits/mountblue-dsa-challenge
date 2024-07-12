package mountblueJobChallenge;

import java.util.Stack;

public class SuperReducedString {
    public static void main(String[] args) {

        System.out.println(superReducedString("aabccbrrvb"));
    }

    public static String superReducedString(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i=0; i<s.length(); i++){
            if (!stack.isEmpty() && stack.peek() == s.charAt(i)){
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            // by using insert method (instead of append) we're ensuring that the characters are added to the beginning of the result string,
            // preserving their original order
            result.insert(0, stack.pop());
        }

        if (result.length() == 0) {
            return "Empty String";
        }

        return result.toString();
    }
}
