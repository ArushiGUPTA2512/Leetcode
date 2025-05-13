class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";

        char[] hexChars = "0123456789abcdef".toCharArray();
        StringBuilder sb = new StringBuilder();

        while (num != 0) {
            int hexDigit = num & 0xf;
            sb.append(hexChars[hexDigit]);
            num >>>= 4; 
        }

        return sb.reverse().toString();  
    }
}