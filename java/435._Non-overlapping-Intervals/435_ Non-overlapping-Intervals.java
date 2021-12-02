class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count = 0;
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int prevStart = intervals[0][0];
        int prevEnd = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            int currStart = intervals[i][0];
            int currEnd = intervals[i][1];
            if (currStart <= prevStart || currStart < prevEnd) count++;
            else {
                prevStart = currStart;
                prevEnd = currEnd;
            }
        }
        return count;
    }
}