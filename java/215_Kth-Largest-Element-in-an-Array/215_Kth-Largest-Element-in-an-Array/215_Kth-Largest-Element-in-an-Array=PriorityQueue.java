class Solution {
    
    public class IntegerComparator implements Comparator<Integer> {
        
        @Override
        public int compare(Integer a, Integer b) {
            return b - a;
        }
    }
    
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> pq = new PriorityQueue<>(new IntegerComparator());
        for (int n : nums) {
            pq.add(n);
        }
        for (int i = 0; i < k - 1; i++) {
            pq.poll();
        }
        return pq.poll();
    }
}