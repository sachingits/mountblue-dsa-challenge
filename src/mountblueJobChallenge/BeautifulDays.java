package mountblueJobChallenge;

// https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem

public class BeautifulDays {
    public static void main(String[] args) {

        System.out.println(beautifulDays(20, 23, 6));
    }

    public static int beautifulDays(int i, int j, int k) {

        int count = 0;

        while (i <= j){
            long reverse = reverse(i);

            long diff = Math.abs(reverse - i);

            if (diff % k == 0){
                count++;
            }
            i++;
        }

        return count;

    }

    public static long reverse(int i){

        long reversed = 0;

        while (i != 0) {
            int digit = i % 10;
            reversed = reversed * 10 + digit;
            i /= 10;
        }

        return reversed;
    }
}
