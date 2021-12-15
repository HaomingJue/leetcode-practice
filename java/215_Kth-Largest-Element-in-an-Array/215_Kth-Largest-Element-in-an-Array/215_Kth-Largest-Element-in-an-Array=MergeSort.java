class Solution {
    
    public int findKthLargest(int[] nums, int k) {
        mergeSort(nums, 0, nums.length - 1);
        return nums[nums.length - k];
    }
    
    private void mergeSort(int[] nums, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            mergeSort(nums, low, mid);
            mergeSort(nums, mid+1, high);
            merge(nums, low, mid, mid + 1, high); 
            
        }
    }
    
    private void merge(int[] nums, int l1, int h1, int l2, int h2) {
        int[] nums1 = new int[h1 - l1 + 1];
        int[] nums2 = new int[h2 - l2 + 1];
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = nums[l1 + i];
        } 
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = nums[l2 + i];
        } 
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            nums[l1 + k++] = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
        }
        while (i < nums1.length) {
            nums[l1 + k++] = nums1[i++];
        }
        while (j < nums2.length) {
            nums[l1 + k++] = nums2[j++];
        }
    }
}