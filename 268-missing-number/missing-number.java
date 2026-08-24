class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int ans = n;
        for (int i = 0; i < n; i++) {
            ans ^= i;
            ans ^= nums[i];
        }
        return ans;
    }
}


/*class Solution {
    public int missingNumber(int[] nums) {
         int n = nums.length;
        int expectedSum = n * (n + 1) / 2;  
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;  
    }
}*/