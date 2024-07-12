package mountblueJobChallenge;

// https://www.hackerrank.com/challenges/mars-exploration/problem
// two ways to do it.
public class MarsExploration {
    public static void main(String[] args) {

        System.out.println(marsExploration("SOSSOSSOS"));
    }

    public static int marsExploration(String s) {

        int count = 0;
        int firstS = 0;
        int o = 1;
        int secondS = 2;

        for(int i=0; i<s.length(); i++){

            if (firstS == i){
                if (s.charAt(i) != 'S'){
                    count++;
                }
                firstS = firstS + 3;
            } else if (o == i) {
                if (s.charAt(i) != 'O'){
                    count++;
                }
                o = o + 3;
            } else if (secondS == i) {

                if (s.charAt(i) != 'S'){
                    count++;
                }
                secondS = secondS + 3;
            }
        }
        return count;
    }

    public static int AnotherMarsExploration(String s) {
        int count = 0;

        String pattern = "SOS";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != pattern.charAt(i % 3)) {
                count++;
            }
        }

        return count;
    }
}
