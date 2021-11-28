class Solution {
    public void sortColors(int[] nums) {
        quickSort(nums, 0, nums.length - 1);    
    }
    
    private void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            int pi = partition(nums, low, high);
            quickSort(nums, low, pi - 1);
            quickSort(nums, pi + 1, high);
        }
    }
    
    private int partition(int[] nums, int low, int high) {
        int pi = low;
        int pivot = nums[high];
        for (int i = low; i < high; i++) {
            if (nums[i] < pivot) {
                int temp = nums[pi];
                nums[pi] = nums[i];
                nums[i] = temp;
                pi++;
            }
        }
        int temp = nums[pi];
        nums[pi] = nums[high];
        nums[high] = temp;
        return pi;
    }
}