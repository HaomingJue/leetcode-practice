class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length <= 2) return new ArrayList<List<Integer>>();
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> addedSet = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int low = i + 1, high = nums.length - 1;
            while (low < high) {
                if (nums[i] + nums[low] + nums[high] == 0) {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[low]);
                    list.add(nums[high]);
                    if (!addedSet.contains(list)) {
                        addedSet.add(list);
                        ans.add(list);
                    }
                    low++;
                    high--;
                }
                else {
                    if (nums[i] + nums[low] + nums[high] > 0) high--;
                    else if (nums[i] + nums[low] + nums[high] < 0) low++;
                }
            }
        }
        return ans;
    }
}