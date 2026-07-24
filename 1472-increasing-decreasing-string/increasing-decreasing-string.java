class Solution {
    public String sortString(String s) {
       int[] freq = new int[26];

        // Count frequency of each character
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        StringBuilder ans = new StringBuilder();
        while (ans.length() < s.length()) {
            // Smallest to largest
            for (int i = 0; i < 26; i++) {
                if (freq[i] > 0) {
                    ans.append((char)(i + 'a'));
                    freq[i]--;
                }
            }

            // Largest to smallest
            for (int i = 25; i >= 0; i--) {
                if (freq[i] > 0) {
                    ans.append((char)(i + 'a'));
                    freq[i]--;
                }
            }
        }

        return ans.toString(); 
    }
}