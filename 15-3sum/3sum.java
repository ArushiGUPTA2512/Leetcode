//Two pointer approach
class Solution{
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0; i<n-2; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            int target = -nums[i];
            int left = i+1, right = n-1;
            while(left<right){
                int sum = nums[left]+nums[right];
                if(sum == target){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while(left < right && nums[left] == nums[left+1])
                        left++;
                    while(left < right && nums[right] == nums[right-1])
                        right--;
                    left++;
                    right--; 
                }
                else if(sum < target)
                    left++;
                else
                    right--;
            }
        }
        return result;
    }
}

//TLE(Brute force)
// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         int n = nums.length;
//         List<List<Integer>> ans = new ArrayList<>();
//         Set<List<Integer>> set = new HashSet<>();
//         for(int i=0; i<n; i++){
//             for(int j=i+1; j<n; j++){
//                 for(int k=j+1; k<n; k++){
//                     if(nums[i] + nums[j] + nums[k] == 0){
//                         List<Integer> trip = Arrays.asList(nums[i], nums[j], nums[k]);
//                         Collections.sort(trip);
//                         if(!set.contains(trip)){
//                             set.add(trip);
//                             ans.add(trip);
//                         }
//                     }
//                 }
//             }
//         }
//         return ans;
//     }
// }