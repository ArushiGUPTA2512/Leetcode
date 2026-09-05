class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int maxSum = nums[0], currMax = nums[0];
        int minSum = nums[0], currMin = nums[0];
        for(int i=0; i<nums.length; i++){
            totalSum += nums[i];
            if(i>0){
                currMax = Math.max(nums[i], currMax + nums[i]);
                maxSum = Math.max(maxSum, currMax);
                currMin = Math.min(nums[i], currMin + nums[i]);
                minSum = Math.min(minSum, currMin);
            }
        }
        if(maxSum < 0)
            return maxSum;
        return Math.max(maxSum, totalSum - minSum);
    }
}