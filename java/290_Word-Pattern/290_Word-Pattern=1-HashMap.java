class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        HashMap<Character, String> map = new HashMap<>();
        if (words.length != pattern.length()) return false;
        for (int i = 0; i < words.length; i++) {
            if (!map.containsKey(pattern.charAt(i))) {
                if (map.containsValue(words[i])) {
                    return false;
                }
                else {
                    map.put(pattern.charAt(i), words[i]);
                }
            }
            if (!words[i].equals(map.get(pattern.charAt(i)))) return false;
        }
        return true;
    }
}