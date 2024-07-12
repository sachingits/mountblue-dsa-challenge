package mountblueJobChallenge;

// https://www.hackerrank.com/challenges/taum-and-bday/problem
public class TaumAndBday {
    public static void main(String[] args) {
        System.out.println(taumBday(3, 5, 3, 4, 1));
    }

    public static long taumBday(int b, int w, int bc, int wc, int z) {
        // Calculate the minimum cost considering different scenarios

        // If the cost of converting one color gift to the other is greater than the individual costs
        if (Math.abs(bc - wc) > z) {
            // If black gifts are more expensive than white gifts + conversion cost, convert black to white
            if (bc > wc + z) {
                return (long)b * (wc + z) + (long)w * wc;
            }
            // If white gifts are more expensive than black gifts + conversion cost, convert white to black
            else if (wc > bc + z) {
                return (long)b * bc + (long)w * (bc + z);
            }
        }

        // Otherwise, purchase the gifts without conversion
        return (long)b * bc + (long)w * wc;
    }
}