package mountblueJobChallenge;

// https://www.hackerrank.com/challenges/utopian-tree/problem
public class UtopianTree {
    public static void main(String[] args) {
        System.out.println(utopianTree(4));
    }

    public static int utopianTree(int n) {
        int result = 1;

        for(int i=1; i<=n; i++){
            if(i % 2 == 0){
                result += 1;
            } else {
                result = result * 2;
            }
        }
        return result;
    }
}