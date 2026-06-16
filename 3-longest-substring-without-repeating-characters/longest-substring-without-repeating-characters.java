class Solution {
     public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int right = 0, left =0;
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;
        while(right < n){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                maxLength = Math.max(maxLength, right-left+1);
                right++;
            }
            else{
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxLength;
    }
}

// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int maxLength = 0;
//         for(int i=0; i<s.length(); i++){
//             HashSet<Character> set = new HashSet<>();
//             for(int j=i; j<s.length(); j++){
//                 if(set.contains(s.charAt(j)))
//                     break; 
//                 set.add(s.charAt(j));
//                 maxLength = Math.max(maxLength, j-i+1);
//             }
//         }
//         return maxLength;
//     }
// }