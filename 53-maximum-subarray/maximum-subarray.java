// Kadane's Approach
class Solution{
    public int maxSubArray(int nums[]){
        int maxSum = Integer.MIN_VALUE, curSum = 0;
        for(int i=0; i<nums.length; i++){
            curSum += nums[i];
            maxSum = Math.max(maxSum, curSum);
            if(curSum < 0)
                curSum = 0;
        }
        return maxSum;
    }
}

//Brute force

// class Solution {
//     public int maxSubArray(int[] nums) {
//         int maxSum =0;
//         for(int i = 0; i<nums.length; i++){
//             int curSum = 0;
//             for(int j=i; j<nums.length; j++){
//                 curSum += nums[j];
//                 maxSum = Math.max(maxSum, curSum);
//             }
//         }
//         return maxSum;
//     }
// }