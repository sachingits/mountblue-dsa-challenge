package mountblueJobChallenge;

// https://www.hackerrank.com/challenges/camelcase/problem

public class CamelCase {
    public static void main(String[] args) {

        System.out.println(camelcase("howAreYou"));
    }

    public static int camelcase(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        int count = 0;

        for(int i=0; i<s.length(); i++){

            char ch = s.charAt(i);

            if(Character.isUpperCase(ch)){
                count++;
            }
        }

        return ++count;
    }
}
