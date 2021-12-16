class Solution {
    public int search(int[] nums, int target) {
        if (nums[0] <= nums[nums.length - 1]) return binarySearch(nums, target, 0, nums.length - 1);
        int gap = searchGap(nums);
        if (target >= nums[0]) return binarySearch(nums, target, 0, gap);
        if (target <= nums[nums.length - 1]) return binarySearch(nums, target, gap+1, nums.length - 1);
        return -1;
    }
    
    private int searchGap(int[] nums) {
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > nums[mid + 1]) return mid;
            if (nums[mid + 1] > nums[nums.length - 1]) low = mid + 1;
            if (nums[mid] < nums[0]) high = mid;
        }
        return 1008611;
    }
    
    private int binarySearch(int[] nums, int target, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] > target) high = mid - 1;
            if (nums[mid] < target) low = mid + 1;
        }
        return -1;
    }
    
}