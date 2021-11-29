class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int count = 1;
        for (int level = 0; level <= (n%2==0 ? n/2-1 : n/2); level++) {
            for (int i = level; i < n - level; i++) {
                ans[level][i] = count++;
            }
            for (int i = level + 1; i < n - level; i++) {
                ans[i][n - level - 1] = count++;
            }
            for (int i = n - level - 2; i >= level; i--) {
                ans[n - level - 1][i] = count++;
            }
            for (int i = n - level - 2; i > level; i--) {
                ans[i][level] = count++;
            }
        }
        return ans;
    }
}