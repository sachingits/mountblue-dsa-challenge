package mountblueJobChallenge;

import java.util.Arrays;
import java.util.List;

// https://www.hackerrank.com/challenges/designer-pdf-viewer/problem

public class DesignerPDFViewer {
    public static void main(String[] args) {
        System.out.println(designerPdfViewer(Arrays.asList(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5), "abc"));
    }

    public static int designerPdfViewer(List<Integer> h, String word) {
        char[] arr = word.toCharArray();
        int maxHeight = 0;

        for(char c : arr){
            int index = c - 'a';
            int height = h.get(index);

            maxHeight = Math.max(height, maxHeight);
        }

        return maxHeight * word.length();
    }
}