class Solution {
    
    public int findKthLargest(int[] nums, int k) {
        quickSort(nums, 0, nums.length - 1);
        return nums[nums.length - k];
    }
    
    private void quickSort(int[] nums, int start, int end) {
        if (start < end) {
            int pi = partition(nums, start, end);
            quickSort(nums, start, pi - 1);
            quickSort(nums, pi + 1, end);
        }
    }
    
    private int partition(int[] nums, int start, int end) {
        int pivot = nums[end];
        int i = start;
        for (int j = start; j <= end - 1; j++) {
            if (nums[j] < pivot) {
                swap(nums, i, j);
                i++;
            }
        }
        swap(nums, i, end);
        return i;
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}