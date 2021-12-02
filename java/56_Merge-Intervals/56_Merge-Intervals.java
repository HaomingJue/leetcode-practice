class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> list = new ArrayList<>();
        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
        boolean flag = false;
        for (int i = 0; i < intervals.length; i++) {
            int[] temp = intervals[i];
            while (i < intervals.length && intervals[i][0] <= temp[1]) {
                flag = true;
                temp[1] = Math.max(intervals[i][1], temp[1]);
                i++;
            }
            if (flag) {
                i--;
                flag = false;
            }
            list.add(temp);
        }
        return list.toArray(new int[list.size()][2]);
    }
}