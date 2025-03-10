class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();
        
        // Reverse the words and append them to StringBuilder
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }
        
        // Remove the extra trailing space and return the result
        return reversed.toString().trim();
    }
}