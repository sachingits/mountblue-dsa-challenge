package mountblueJobChallenge;

import java.util.Arrays;
import java.util.List;

// https://www.hackerrank.com/challenges/grid-challenge/problem

public class GridChallenge {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("ebacd", "fghij", "olmkn", "trpqs", "xywuv");
        System.out.println(gridChallenge(stringList));
    }

    public static String gridChallenge(List<String> grid) {

        int numRows = grid.size();
        int numCols = grid.get(0).length();

        for(int row=0; row<numRows; row++){
            char[] sortedRow = grid.get(row).toCharArray();
            Arrays.sort(sortedRow);
            grid.set(row, new String(sortedRow));
        }

        for(int col=0; col<numCols; col++){
            for(int row=1; row<numRows; row++){

                if(grid.get(row).charAt(col) < grid.get(row - 1).charAt(col)){
                    return "NO";
                }
            }
        }
        return "YES";
    }
}