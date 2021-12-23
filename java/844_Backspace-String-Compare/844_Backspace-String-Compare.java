class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1;
        int j = t.length() - 1;
        while (i >= 0 || j >= 0) {
            int count_i = 0, count_j = 0;
            while (i >= 0) {
                if (s.charAt(i) == '#') {
                    i--;
                    count_i++;
                }
                else if (count_i > 0) {
                    i--;
                    count_i--;
                }
                else break;
            }
            while (j >= 0) {
                if (t.charAt(j) == '#') {
                    j--;
                    count_j++;
                } 
                else if (count_j > 0) {
                    j--;
                    count_j--;
                }
                else break;
            }
            if ( ((i < 0)&&(j >= 0)) || ((j < 0)&&(i >= 0))) return false;
            if (i >= 0 && j >= 0 && s.charAt(i) != t.charAt(j)) return false;
            i--; 
            j--;
        }
        return true;
    }
}