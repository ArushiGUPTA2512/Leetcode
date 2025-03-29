class Solution {
    public String largestNumber(int[] nums) {
         String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }
        
        // Sort the array using a custom comparator
        Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a + b));
        
        // If the largest element is "0", return "0"
        if (strNums[0].equals("0")) {
            return "0";
        }
        
        // Build the largest number
        StringBuilder result = new StringBuilder();
        for (String num : strNums) {
            result.append(num);
        }
        
        return result.toString();
    }
}