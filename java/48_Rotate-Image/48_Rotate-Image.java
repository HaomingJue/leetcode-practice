class Solution {
    public void rotate(int[][] matrix) {
        rotate(matrix, 0);
    }
    
    
    private void rotate(int[][] matrix, int level) {
        if ((matrix.length % 2 == 0 && level >= matrix.length / 2) ||
            (matrix.length % 2 == 1 && level > matrix.length / 2)) {
            return;
        }
        int[] record = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
                record[i] = matrix[level][i];
        }
        for (int i = level; i < matrix.length - level; i++) {
            matrix[level][i] = matrix[matrix.length - 1 - i][level];
            
        }
        for (int i = level; i < matrix.length - level; i++) {
            matrix[i][level] = matrix[matrix.length - level - 1][i];
        }
        for (int i = level; i < matrix.length - level; i++) {
            matrix[matrix.length - level - 1][i] = matrix[matrix.length - i - 1][matrix.length - level - 1];
        }
        for (int i = level; i < matrix.length - level; i++) {
            matrix[i][matrix.length - level - 1] = record[i];
        }
        level++;
        rotate(matrix, level);
    }
}