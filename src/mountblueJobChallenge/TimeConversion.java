package mountblueJobChallenge;

// https://www.hackerrank.com/challenges/time-conversion/problem

public class TimeConversion {
    public static void main(String[] args) {

        System.out.println(timeConversion("02:05:07AM"));
    }

    public static String timeConversion(String s) {

        String[] timeParts = s.split(":");

        int hours = Integer.parseInt(timeParts[0]);
        int minutes = Integer.parseInt(timeParts[1]);
        int seconds = Integer.parseInt(timeParts[2].substring(0, 2));
        String amPm = timeParts[2].substring(2);

        if(hours == 12 && amPm.equals("AM")){
            hours = 0;
        } else if(hours == 12 && amPm.equals("PM")){
            hours = 12;
        } else if(amPm.equals("PM")) {
            hours += 12;
        }

        // here we are using "%02d:%02d:%02d" to format hours, min, and sec.
        // %02d ensures that the values are displayed with leading zeros if needed.
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}