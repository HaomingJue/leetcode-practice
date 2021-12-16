class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (target < matrix[0][0]) return false;
        int r = searchRow(matrix, target);
        return searchColumn(matrix, target, r);
    }
    
    private int searchRow(int[][] matrix, int target) {
        if (matrix.length == 1) return 0;
        if (matrix[matrix.length - 1][0] <= target) return matrix.length-1;
        int low = 0, high = matrix.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (matrix[mid][0] <= target && matrix[mid+1][0] > target) return mid;
            if (matrix[mid][0] > target) high = mid;
            if (matrix[mid][matrix[0].length-1] < target) low = mid + 1;
        }
        return -1;
    }
    
    private boolean searchColumn(int[][] matrix, int target, int r) {
        int low = 0, high = matrix[0].length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (matrix[r][mid] == target) return true;
            if (matrix[r][mid] < target) low = mid + 1;
            if (matrix[r][mid] > target) high = mid - 1;
        }
        return false;
    }
}