import java.util.*;

class Solution {
    // public List<List<Integer>> generate(int numRows) {
    //     List<List<Integer>> triangle = new ArrayList<>();

    //     for (int n = 0; n < numRows; n++) {
    //         List<Integer> row = new ArrayList<>();
    //         long value = 1;
    //         row.add((int)value); 

    //         for (int r = 1; r <= n; r++) {
    //             value = value * (n - r + 1) / r;  
    //             row.add((int)value);
    //         }

    //         triangle.add(row);
    //     }

    //     return triangle;
    // }

  
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int row = 0; row < numRows; row++) {
            List<Integer> currentRow = new ArrayList<>();

            for (int col = 0; col <= row; col++) {
                if (col == 0 || col == row) {
                    currentRow.add(1);  
                } else {
                    int sum = triangle.get(row - 1).get(col - 1) + triangle.get(row - 1).get(col);
                    currentRow.add(sum);
                }
            }

            triangle.add(currentRow);
        }

        return triangle;
    
}

}
