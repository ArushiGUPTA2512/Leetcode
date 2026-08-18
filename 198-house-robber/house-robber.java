// class Solution {
//     public int rob(int[] nums) {
//         int prev1 = 0, prev2 = 0;
//         for(int i=0; i<nums.length; i++){
//             int take = nums[i] + prev2;
//             int skip = prev1;
//             int curr = Math.max(take, skip);
//             prev2 = prev1;
//             prev1 = curr;
//         }
//         return prev1;
//     }
// }

//O(n)
class Solution{
    public int rob(int nums[]){
        int n = nums.length;
        if(n==1)
            return nums[0];
        int dp[] = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for(int i=2; i<n; i++)
            dp[i] = Math.max(dp[i-1], dp[i-2]+nums[i]);
        return dp[n-1];
    }
}