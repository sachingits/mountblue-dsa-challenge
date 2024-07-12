package mountblueJobChallenge;

// https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited/problem

public class JumpingCloudsRevisited {
    public static void main(String[] args){

        System.out.println(jumpingOnClouds(new int[]{0, 0, 1, 0, 0, 1, 1, 0}, 2));
    }

    public static int jumpingOnClouds(int[] c, int k) {

        int currentPosition = 0;
        int energy = 100;
        int n = c.length;

        do {
            currentPosition = (currentPosition + k) % n;

            if (c[currentPosition] == 1){
                energy -= 3;
            } else {
                energy -= 1;
            }
        } while (currentPosition != 0);

        return energy;
    }
}
