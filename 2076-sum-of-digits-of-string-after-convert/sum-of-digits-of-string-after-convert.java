class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray())
            sb.append(c - 'a' +1);
        String num = sb.toString();
        for(int t=0; t<k; t++){
            int sum = 0;
            for(char digit: num.toCharArray())
                sum += digit -'0';
            num = String.valueOf(sum);
        }
        return Integer.parseInt(num);
    }
}