package mountblueJobChallenge;

import java.util.Arrays;
import java.util.List;

// https://www.hackerrank.com/challenges/lisa-workbook/problem
public class LisasWorkbook {
    public static void main(String[] args) {
        System.out.println(workbook(5, 3, Arrays.asList(4, 2, 6, 1, 10)));
    }

    public static int workbook(int n, int k, List<Integer> arr) {

        int specialProblems = 0;
        int pageNumber = 1;

        for (int chapter = 0; chapter < n; chapter++) {
            int problemsInChapter = arr.get(chapter);
            int currentPage = 1;

            for (int problem = 1; problem <= problemsInChapter; problem++) {
                if (problem == pageNumber) {
                    specialProblems++;
                }

                if (currentPage == k || problem == problemsInChapter) {
                    pageNumber++;
                    currentPage = 1;
                } else {
                    currentPage++;
                }
            }
        }

        return specialProblems;
    }
}
