class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] currChars = strs[i].toCharArray();
            Arrays.sort(currChars);
            String currStr = new String(currChars);
            if (map.containsKey(currStr)) {
                map.get(currStr).add(strs[i]);
            } else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(currStr, list);
            }
        }
        List<List<String>> ret = new ArrayList<>();
        ret.addAll(map.values());
        return ret;
    }
}