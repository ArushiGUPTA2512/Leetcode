class Solution{
    public static boolean isPalindrome(String s){
        int left = 0, right = s.length()-1;
        while(left < right){
            if(!Character.isLetterOrDigit(s.charAt(left)))
                left++;
            else if(!Character.isLetterOrDigit(s.charAt(right)))
                right--;
            else if(Character.toLowerCase(s.charAt(left)) == Character.toLowerCase(s.charAt(right))){
                left++;
                right--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}

// class Solution {
//     public static boolean isPalindrome(String s) {
//         int left = 0, right = s.length() - 1;

//         while (left < right) {
//             while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
//                 left++;
//             }
//             while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
//                 right--;
//             }

//             if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
//                 return false;
//             }

//             left++;
//             right--;
//         }

//         return true;
//     }
// }


    // public boolean isPalindrome(String s) {
    //    int n = s.length();
    //    String str1 = "";
    //    for (char ch : s.toCharArray()) {
    //        if (Character.isLetterOrDigit(ch)) {
    //            str1 += Character.toLowerCase(ch);
    //        }
    //    }
    //    String str2 = str1;
    //    StringBuilder sb = new StringBuilder(str1);
    //    str1 = sb.reverse().toString();

    //    return str1.equals(str2);
    // }
