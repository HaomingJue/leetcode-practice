class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;
        HashMap<Character, String> charMap = new HashMap<>();
        HashMap<String, Character> wordsMap = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (!charMap.containsKey(pattern.charAt(i)) && !wordsMap.containsKey(words[i])) {
                charMap.put(pattern.charAt(i), words[i]);
                wordsMap.put(words[i], pattern.charAt(i));
            }
            if (wordsMap.containsKey(words[i])) {
                if (!charMap.containsKey(pattern.charAt(i))) return false;
                if (!words[i].equals(charMap.get(pattern.charAt(i)))) return false;

            }
            if (charMap.containsKey(pattern.charAt(i))) {
                if (!wordsMap.containsKey(words[i])) return false;    
                if (pattern.charAt(i) != wordsMap.get(words[i])) return false;

            }
        }
        return true;
    }
}