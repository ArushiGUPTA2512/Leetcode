class Solution {
        private int getValue(String s) {
        int num = 0;
        for (char ch : s.toCharArray()) {
            num = num * 10 + (ch - 'a');
        }
        return num;
    }

    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return getValue(firstWord) + getValue(secondWord) == getValue(targetWord);

    }
}