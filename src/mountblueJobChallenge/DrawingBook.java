package mountblueJobChallenge;

public class DrawingBook {
    public static void main(String[] args) {

        System.out.println(pageCount(6, 2));
    }

    // int n: the number of pages in the book
    // int p: the page number to turn to
    public static int pageCount(int n, int p) {

        int fromStart = p / 2;
        int fromEnd = (n / 2) - (p / 2);

        return Math.min(fromStart, fromEnd);
    }
}