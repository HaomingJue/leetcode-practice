class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length - 1;
        int column = 0;
        while(column < matrix[0].length && row >= 0) {
            if (target == matrix[row][column]) return true;
            if (target > matrix[row][column]) 
            {
                column++;
                continue;
            }
            if (target < matrix[row][column]) {
                row--;
                continue;
            }
        }
        return false;
    }
}