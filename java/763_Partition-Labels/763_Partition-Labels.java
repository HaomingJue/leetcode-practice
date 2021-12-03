class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> ret = new LinkedList<>();
        int[] last = new int[26];
        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
        }
        int start = 0, end = -1;
        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, last[s.charAt(i) - 'a']);
            if (end == i) {
                ret.add(end - start + 1);
                start = end + 1;
            }
        }
        return ret; 
    }
}