class Solution {
    public void sortColors(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
    }

    private void mergeSort(int[] nums, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            mergeSort(nums, low, mid);
            mergeSort(nums, mid + 1, high);
            merge(nums, low, mid, high);
        }
    }

    private void merge(int[] nums, int low, int mid, int high) {
        int[] left = new int[mid - low + 1];
        int[] right = new int[high - mid];
        int i ,j, k;
        for (i = 0; i < left.length; i++) {
            left[i] = nums[low + i];
        }
        for (j = 0; j < right.length; j++) {
            right[j] = nums[mid + j + 1];
        }
        i = 0;
        j = 0;
        k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                nums[low + k] = left[i];
                i++;
                k++;
            }
            else {
                nums[low + k] = right[j];
                j++;
                k++;
            }
        }
        while (i < left.length) {
            nums[low + k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            nums[low + k] = right[j];
            j++;
            k++;
        }
    }
}