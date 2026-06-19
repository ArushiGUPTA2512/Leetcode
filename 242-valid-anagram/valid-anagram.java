class Solution{
    public boolean isAnagram(String s, String t){
        int n1 = s.length();
        int n2 = t.length();
        if(n1 != n2)
            return false;
        int count[] = new int[26];
        for(int i=0; i<n1; i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for(int i=0; i<26; i++){
            if(count[i] != 0)
                return false;
        }
        return true;
    }
}

// class Solution {
//    public boolean isAnagram(String s, String t) {
//        int n1 = s.length();
//        int n2 = t.length();
//        if (n1 != n2) return false;


//        HashMap<Character, Integer> m1 = new HashMap<>();
//        HashMap<Character, Integer> m2 = new HashMap<>();


//        for (char ch : s.toCharArray()) {
//            m1.put(ch, m1.getOrDefault(ch, 0) + 1);
//        }


//        for (char ch : t.toCharArray()) {
//            m2.put(ch, m2.getOrDefault(ch, 0) + 1);
//        }


//        return m1.equals(m2);
//    }
// }

// class Solution {
//     public boolean isAnagram(String s, String t) {
//         if (s.length() != t.length()) {
//             return false;
//         }
        
//         char[] sArray = s.toCharArray();
//         char[] tArray = t.toCharArray();
        
//         Arrays.sort(sArray);
//         Arrays.sort(tArray);
        
//         return Arrays.equals(sArray, tArray);
//     }
// }