class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char res = binarySearchCeil(letters, target);
        return res;
    }

    static char binarySearchCeil(char letters[], char target){
        int ans = 0;
        int start = 0;
        int end = letters.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
             if(letters[mid] <= target)
                start = mid+1;
            else{
                ans = letters[mid];
                end = mid-1;
            }
        }
        return (ans == 0)?letters[0]:(char)ans;
    }
}