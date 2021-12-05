class Solution {
    public String longestPalindrome(String s) {
        int len = 0;
        int start = 0, end = 0;
        for (int i = 0; i  s.length(); i++) {
            int lenOdd = expand(s, i, i);
            int lenEven = expand(s, i, i+1);
            len = Math.max(lenOdd, lenEven);
            if (len  end - start) {
                start = i - (len - 1)  2;
                end = i + len  2;
            }
        }
        return s.substring(start, end + 1);
    }
    
    private int expand(String s, int left, int right) {
        int l = left, r = right;
        while(left = 0 && right  s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        right -= 1;
        left += 1;
        return right - left + 1;
    }
}