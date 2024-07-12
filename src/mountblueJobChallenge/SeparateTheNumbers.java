package mountblueJobChallenge;

// https://www.hackerrank.com/challenges/separate-the-numbers/problem

public class SeparateTheNumbers {
    public static void main(String[] args) {
        separateNumbers("99910001001");
    }

    public static void separateNumbers(String s) {
        String subString = "";

        for(int i=1; i<=s.length()/2; i++){

            subString = s.substring(0, i);
            long num = Long.parseLong(subString);
            StringBuilder validString = new StringBuilder(subString);

            while (validString.length() < s.length()){
                validString.append(++num);
            }

            if (s.equals(validString.toString())){
                System.out.println("YES " + subString);
                return;
            }
        }
        System.out.println("NO");
    }
}