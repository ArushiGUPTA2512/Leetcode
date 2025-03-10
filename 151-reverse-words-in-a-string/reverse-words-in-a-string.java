class Solution {
    public String reverseWords(String s) {
       String[] words = s.trim().split("\\s+");

        // Use StringBuilder with initial capacity to avoid resizing
        StringBuilder reversed = new StringBuilder(s.length());

        // Append words in reverse order
        for (int i = words.length - 1; i > 0; i--) {
            reversed.append(words[i]).append(" ");
        }
        reversed.append(words[0]); // Append last word without trailing space

        return reversed.toString();
    }
}