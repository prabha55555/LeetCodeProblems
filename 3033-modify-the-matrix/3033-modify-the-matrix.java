class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[] max = new int[n];
        for (int j = 0; j < n; j++) {
            max[j] = Integer.MIN_VALUE;
        }

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                max[j] = Math.max(max[j], matrix[i][j]);
            }
        }

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = max[j];
                }
            }
        }

        return matrix;
    }
}
