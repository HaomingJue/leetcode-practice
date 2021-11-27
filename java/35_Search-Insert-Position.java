class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length;
        int mid;
        if (nums[nums.length - 1] < target) return nums.length;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] < target) low = mid + 1;
            if (nums[mid] > target) high = mid - 1;
        }
        return low;
    }
}