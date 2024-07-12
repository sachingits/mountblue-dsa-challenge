package mountblueJobChallenge;

// https://www.hackerrank.com/challenges/halloween-sale/problem
public class HalloweenSale {
    public static void main(String[] args) {
        System.out.println(howManyGames(20, 3, 6, 80));
    }

    public static int howManyGames(int p, int d, int m, int s) {

        int gameBuy = 0;
        int remainingBudget = s;
        int currentPrice = p;

        // we will continue buying games while the currentPrice is >= to the minimum price (m)
        // + there's enough budget left to purchase the game.
        while(currentPrice >= m && remainingBudget >= currentPrice){
            remainingBudget -= currentPrice;
            gameBuy++;

            // here we are reducing the price by the discount (d) until reaches the minimum price (m).
            currentPrice = Math.max(currentPrice - d, m);
        }

        return gameBuy;
    }
}
