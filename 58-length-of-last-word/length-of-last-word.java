class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0, i = s.length() - 1;
        
        // Ignore trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        
        // Count the length of the last word
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }
        
        return length;
    }
}

// class Solution {
//     public int lengthOfLastWord(String s) {
//         String[] words = s.trim().split(" ");
//         return words[words.length - 1].length();
//     }
// }