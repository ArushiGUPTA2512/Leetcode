class Solution {
    public int subarraySum(int[] nums, int k) {
       int n = nums.length;
       HashMap<Integer, Integer> map = new HashMap<>();
       map.put(0, 1);
       int preSum = 0, ans = 0;
       for(int i=0; i<n; i++){
        preSum += nums[i];
        if(map.containsKey(preSum-k)){
            ans += map.get(preSum - k);
        }
        map.put(preSum, map.getOrDefault(preSum, 0)+1);
       } 
       return ans;
    }
}

// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         int n = nums.length;
//         int count = 0;
//         for(int i=0; i<n; i++){
//             int sum = 0;
//             for(int j=i; j<n; j++){
//                 sum+= nums[j];
//                 if(sum == k)
//                     count++;
//             }
//         }
//         return count;
//     }
// }