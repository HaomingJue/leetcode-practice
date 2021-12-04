class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";
        
        int[] n1 = new int[num1.length()];
        int[] n2 = new int[num2.length()];
        int[] result = new int[n1.length + n2.length];
        
        for (int i = 0; i < n1.length; i++) {
            n1[i] = num1.charAt(i) - '0';
        } 
        for (int i = 0; i < n2.length; i++) {
            n2[i] = num2.charAt(i) - '0';
        }
        
        int last = result.length - 1;
        for (int i = n2.length - 1; i >= 0; i--) {
            int k = last;
            for (int j = n1.length - 1; j >= 0; j--) {
                int value = n1[j] * n2[i];
                result[k] += value % 10;
                result[k-1] += value / 10;
                if (result[k] >= 10) {
                    result[k -1] += result[k] / 10;
                    result[k] = result[k] % 10;
                }
                k--;
            }
            last--;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (result[i] == 0) i++;
        while (i < result.length) {
            sb.append((char)((int)'0' + result[i++]));
        }
        return sb.toString();
    }
}



//     1 2 3
//     4 5 6
// -----------
//     7 3 8
//   6 1 5
// 4 9 2
// -----------
// 5 6 0 8 8