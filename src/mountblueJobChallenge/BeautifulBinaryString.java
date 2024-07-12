package mountblueJobChallenge;

// https://www.hackerrank.com/challenges/beautiful-binary-string/problem

public class BeautifulBinaryString {
    public static void main(String[] args) {
        System.out.println(beautifulBinaryString("0100101010"));
    }

    public static int beautifulBinaryString(String b) {
        int count = 0;
        int index = 0;

        while (index < b.length()) {
            index = b.indexOf("010", index);
            if (index != -1) {
                count++;
                index += 3;
            } else {
                break;
            }
        }
        return count;
    }
}