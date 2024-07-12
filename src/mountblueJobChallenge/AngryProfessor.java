package mountblueJobChallenge;

import java.util.Arrays;
import java.util.List;

// https://www.hackerrank.com/challenges/angry-professor/problem

public class AngryProfessor {
    public static void main(String[] args) {

        System.out.println(angryProfessor(Arrays.asList(-1, -3, 4, 2), 3));
    }

    public static String angryProfessor(List<Integer> a, int k) {
        int attendees = 0;

        for(int student : a){
            if(student <= 0){
                attendees++;
            }
        }
        return attendees >= k ? "NO" : "YES";
    }
}
