package mountblueJobChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudents {
    public static void main(String[] args) {

        System.out.println(gradingStudents(Arrays.asList(4, 38, 41, 45, 89, 91, 94, 95)));
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {

        List<Integer> gradeList = new ArrayList<>();

        for (int grade : grades){

            if (grade < 38){
                gradeList.add(grade);
            } else if (grade % 5 == 0) {
                gradeList.add(grade);
            } else if ((grade + 1) % 5 == 0) {
                gradeList.add(grade + 1);
            } else if ((grade + 2) % 5 == 0){
                gradeList.add(grade + 2);
            } else {
                gradeList.add(grade);
            }
        }
        return gradeList;
    }
}