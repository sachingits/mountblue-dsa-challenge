package mountblueJobChallenge;

// https://www.hackerrank.com/challenges/strange-advertising/problem

public class ViralAdvertising {
    public static void main(String[] args) {

        System.out.println(viralAdvertising(5));
    }

    public static int viralAdvertising(int n) {

        int shared = 5;
        int liked = 0;
        int cumulativeLiked = 0;

        for(int i=1; i<=n; i++){

            liked = shared / 2;
            cumulativeLiked += liked;
            shared = liked * 3;
        }

        return cumulativeLiked;
    }
}
