class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        
        for (int i = 0; i < n; i++) { // Iterate through all elements, including the last one
            int num = nums[i];
            int count = 0;
            
            for (int j = 0; j < n; j++) { // Count occurrences of nums[i] in the array
                if (nums[j] == num)
                    count++;
            }
            
            if (count == 1)  // If the number appears only once, return it
                return num;
        }
        
        return -1;  // Default return value (should never reach here)
    }
}
