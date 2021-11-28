class Solution {
    public void sortColors(int[] nums) {
        int ct0 = 0, ct1= 0, ct2 = 0;
        for (int n : nums) {
            if (n == 0) ct0++;
            if (n == 1) ct1++;
            if (n == 2) ct2++;
        }
        int i = 0;
        while (ct0 > 0) {
            ct0--;
            nums[i++] = 0;
        }
        while (ct1 > 0) {
            ct1--; 
            nums[i++] = 1;
        }
        while (ct2 > 0) {
            ct2--;
            nums[i++] = 2;
        }     
    }
}