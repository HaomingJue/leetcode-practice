class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int i = 0, j = 0;
        ArrayList<int[]> ans = new ArrayList<>();
        while (i < firstList.length && j < secondList.length) {
            int[] arr = new int[2];
            arr[0] = Math.max(firstList[i][0], secondList[j][0]);
            arr[1] = Math.min(firstList[i][1], secondList[j][1]);
            if  (arr[0] <= arr[1]) {
                ans.add(arr);
            }
            if (firstList[i][1] < secondList[j][1]) i++;
            else j++;
        }
        return ans.toArray(new int[ans.size()][]);
    }
}