package mountblueJobChallenge;

// https://www.hackerrank.com/challenges/alternating-characters/problem

public class AlternatingCharacters {
    public static void main(String[] args) {
        System.out.println(alternatingCharacters("sachin"));
    }

    public static int alternatingCharacters(String s) {
        int count = 0;
        int i = 0;

        while(i < s.length() - 1){
            if(s.charAt(i) == s.charAt(i+1)){
                count++;
            }
            i++;
        }
        return count;
    }
}