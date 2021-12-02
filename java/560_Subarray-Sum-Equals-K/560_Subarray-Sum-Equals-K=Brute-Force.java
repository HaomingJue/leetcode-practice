class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int target = k;
            int j = i;
            while (j < nums.length) {
                target -= nums[j];
                if (target == 0) count++;
                j++;
            } 
        }
        return count;
    }
}