class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) return new int[] {-1, -1};
        int[] ans = new int[2];
        ans[0] = findStart(nums, target);
        ans[1] = findEnd(nums, target);
        return ans;
    }
    
    private int findStart(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        if (nums[low] == target) return low;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < target && nums[mid + 1] > target) return -1;
            if (nums[mid] < target && nums[mid + 1] == target) return mid+1;
            if (nums[mid + 1] < target) low = mid + 1;
            if (nums[mid] >= target) high = mid;
        }
        return -1;
    }
    
    private int findEnd(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        if (nums[high] == target) return high;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < target && nums[mid + 1] > target) return -1;
            if (nums[mid] == target && nums[mid + 1] > target) return mid;
            if (nums[mid + 1] <= target) low = mid + 1;
            if (nums[mid] > target) high = mid;
        }
        return -1;
    }
}