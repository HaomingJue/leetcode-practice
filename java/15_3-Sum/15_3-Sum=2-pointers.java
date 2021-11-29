class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length <= 2) return new ArrayList<List<Integer>>();
        ArrayList<List<Integer>> ret = new ArrayList<>();
        Arrays.sort(nums);    
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int k = nums.length - 1;
            int target = -nums[i];
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (nums[j] == nums[j - 1] && j > i + 1) continue;
                if (k <= j) break;
                while(nums[j] + nums[k] >= target && j < k) {
                    if (nums[j] + nums[k] == target) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        ret.add(list);
                        break;
                    }
                    k--;
                    while(k > j && k < nums.length - 1 && nums[k] == nums[k + 1]) {
                        k--;
                    }
                }
            }

        }
        return ret;
    }
}