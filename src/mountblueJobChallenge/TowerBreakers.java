package mountblueJobChallenge;

public class TowerBreakers {
    public static void main(String[] args) {

        // Case 1: Tower height is 1
        int case1Result = towerBreakers(5, 1);
        System.out.println("Case 1: " + case1Result);

        // Case 2: Only one tower
        int case2Result = towerBreakers(1, 4);
        System.out.println("Case 2: " + case2Result);

        // Case 3: Even number of towers
        int case3Result = towerBreakers(6, 3);
        System.out.println("Case 3: " + case3Result);

        // Case 4: Odd number of towers and odd tower height
        int case4Result = towerBreakers(5, 3);
        System.out.println("Case 4: " + case4Result);

        // Case 5: Odd number of towers and even tower height
        int case5Result = towerBreakers(7, 4);
        System.out.println("Case 5: " + case5Result);
    }

    public static int towerBreakers(int n, int m) {

        // If the tower height iss 1, Player 1 will always win, as Player 2 has no moves
        // If there is only one tower, Player 1 will always win by reducing it to 1
        // If the nunber of towers is even, Player 2 will always win
        // If the number of towers is odd, Player 1 will always win

        if(m == 1 || n % 2 == 0){
            return 2;
        } else {
            return 1;
        }
    }
}
