class Solution {
    public int[][] kClosest(int[][] points, int k) {
        HashMap<int[], Integer> map = new HashMap<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (map.get(a) - map.get(b)));
        for (int[] point : points) {
            map.put(point, point[0] * point[0] + point[1] * point[1]);
        }
        for (int[] point : points) {
            pq.add(point);
        }
        int[][] ans = new int[k][2];
        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll();
        }
        return ans;
    }
}