package mountblueJobChallenge;

// https://www.hackerrank.com/challenges/pangrams/problem

public class Pangrams {
    public static void main(String[] args) {
        System.out.println(pangrams("The quick brown fox jumps over the lazy dog"));
    }

    public static String pangrams(String s) {
        s = s.toLowerCase();
        boolean[] present = new boolean[26];

        for(char c : s.toCharArray()){
            if(c >= 'a' && c <= 'z'){
                present[c - 'a'] = true;
            }
        }

        for(boolean isPresent : present){
            if(!isPresent){
                return "not pangram";
            }
        }
        return "pangram";
    }
}