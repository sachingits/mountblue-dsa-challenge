package mountblueJobChallenge;

// https://www.hackerrank.com/challenges/day-of-the-programmer/problem
public class DayOfTheProgrammer {
    public static void main(String[] args) {

        System.out.println(dayOfProgrammer(1800));
    }

    public static String dayOfProgrammer(int year) {
        if (year == 1918) {
            // Special case: Transition year in 1918
            return "26.09.1918";
        } else if ((year < 1918 && year % 4 == 0) || (year > 1918 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)))) {
            // Leap year in both Julian and Gregorian calendars
            return "12.09." + year;
        } else {
            return "13.09." + year;
        }
    }
}