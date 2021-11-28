class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int[] ret = new int[nums.length];
        boolean zero = false;
        int zeroIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (!zero) {
                    zeroIndex = i;
                    zero = true;
                    continue;
                }
                else {
                    return new int[nums.length];
                }
            }
            product *= nums[i];
        }
        if (zero) {
            ret[zeroIndex] = product;
            return ret;
        }
        for (int i = 0; i < nums.length; i++) {
            ret[i] = product / nums[i];
        }
        return ret;
    }
}