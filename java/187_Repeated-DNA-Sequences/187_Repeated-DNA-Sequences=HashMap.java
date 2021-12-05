class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ret = new ArrayList<>();
        HashMap<String, Boolean> map = new HashMap<>();
        for (int i = 0; i <= s.length() - 10; i++) {
            String curr = s.substring(i, i + 10);
            if (map.containsKey(curr)) {
                if (map.get(curr)) {
                    ret.add(curr);
                    map.put(curr, false);
                }
            }
            else {
                map.put(curr, true);
            }
        }
        return ret;
    }
}