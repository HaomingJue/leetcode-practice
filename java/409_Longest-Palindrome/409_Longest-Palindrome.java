class Solution {
    public int longestPalindrome(String s) {
        int[] characters = new int[58];
        for (int i = 0; i < s.length(); i++) {
            characters[s.charAt(i) - 'A']++;
        }
        int even = 0;
        int odd = 0;
        for (int j = 0; j < 58; j++) {
            if (characters[j] > 0) {
                if (characters[j] % 2 == 0) even += characters[j];
                else {
                    even += characters[j] - 1; 
                    odd += 1;
                }
            }
        }
        return odd > 0 ? even + 1 : even;
    }
}