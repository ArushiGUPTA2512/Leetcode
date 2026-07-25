class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] charFreq = new int[26];
        for (char ch : chars.toCharArray()) {
            charFreq[ch - 'a']++;
        }

        int sum = 0;

        for (String word : words) {

            int[] wordFreq = new int[26];
            for (char ch : word.toCharArray()) {
                wordFreq[ch - 'a']++;
            }
            boolean valid = true;
            for (int i = 0; i < 26; i++) {
                if (wordFreq[i] > charFreq[i]) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                sum += word.length();
            }
        }

        return sum;
    }
}