class Solution {
    public int findMin(int[] nums) {
        if (nums[0] < nums[nums.length - 1]) return nums[0];
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > nums[mid + 1]) return nums[mid + 1];
            if (nums[mid] < nums[nums.length - 1]) high = mid;
            if (nums[mid] > nums[nums.length - 1]) low = mid + 1;
        }
        return nums[0];
    }
}