class Solution {
    HashMap<Integer, Integer> map;
    
    class FrequencyComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer a, Integer b) {
            return map.getOrDefault(b,0) - map.getOrDefault(a, 0);
        }
    }
    
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(new FrequencyComparator());
        map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        for (Integer key : map.keySet()) {
            pq.add(key);
        }
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll();
        }
        return ans;
    }
}