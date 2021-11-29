class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length <= 2) return new ArrayList<List<Integer>>();
        
        HashSet<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            HashSet<Integer> occurrance = new HashSet<>();
            int target = -nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (occurrance.contains(target - nums[j])) {
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(-nums[i]-nums[j]);
                    set.add(temp);
                }
                else {
                    occurrance.add(nums[j]);
                }
            }
        }
        return new ArrayList<List<Integer>>(set);
    }
}