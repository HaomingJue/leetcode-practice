class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        while (i >=0 && j >=0) {
            int temp = num1.charAt(i--) - '0' + num2.charAt(j--) - '0' + carry;
            carry = temp / 10;
            temp = temp % 10;
            sb.append(temp);
        }
        while (i >=0) {
            int temp = num1.charAt(i--) - '0' + carry;
            carry = temp / 10;
            temp = temp % 10;
            sb.append(temp);
        }
        while (j >=0) {
            int temp = num2.charAt(j--) - '0' + carry;
            carry = temp / 10;
            temp = temp % 10;
            sb.append(temp);
        }
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }                    
}