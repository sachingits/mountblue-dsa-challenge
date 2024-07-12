package mountblueJobChallenge;

// https://www.hackerrank.com/challenges/the-love-letter-mystery/problem
public class TheLoveLetterMystery {
    public static void main(String[] args) {

        System.out.println(theLoveLetterMystery("abcd"));
    }

    public static int theLoveLetterMystery(String s) {

        int count = 0;
        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            if(leftChar != rightChar){
                int diff = Math.abs(leftChar - rightChar);
                count += diff;
            }
            left++;
            right--;
        }

        return count;
    }
}