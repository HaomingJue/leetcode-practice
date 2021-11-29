class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (target < matrix[0][0] || target > matrix[matrix.length-1][matrix[0].length-1]) return false;
        for (int i = 0; i < matrix.length; i++) {
            if (searchColumn(matrix, target, i)) return true;
        }
        return false;

    }
    
    private boolean searchColumn(int[][] matrix, int target, int row) {
        int low = 0;
        int high = matrix[0].length - 1;
        if (target < matrix[row][low] || target > matrix[row][high]) return false;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target == matrix[row][mid]) return true;
            if (target < matrix[row][mid]) high = mid - 1;
            if (target > matrix[row][mid]) low = mid + 1;
        }
        return false;
    }
}