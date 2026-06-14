//Moore's alg.
class Solution{
    public int majorityElement(int nums[]){
        int n = nums.length;
        int freq = 0, ans = 0;
        for(int i=0; i<n; i++){
            if(freq == 0)
                ans = nums[i];
            if(ans == nums[i])
                freq++;
            else
                freq--;
        }
        return ans;
    }
}
// class Solution {
//     public int majorityElement(int[] nums) {
//         int candidate = nums[0], count = 1; 
        
//         for (int i = 1; i < nums.length; i++) {
//             if (nums[i] == candidate) {
//                 count++;
//             } else {
//                 count--;
//                 if (count == 0) {
//                     candidate = nums[i];
//                     count = 1;
//                 }
//             }
//         }
//         return candidate;
//     }
// }
 
 //Brute force

// class Solution {
//     public int majorityElement(int nums[]){
//         int n = nums.length;
//         for(int ele: nums){
//             int freq = 0;
//             for(int val: nums){
//                 if(ele == val)
//                     freq++;
//             }
//             if(freq > n/2)
//                 return ele;
//         }
//         return -1;
//     }
// }

// optimize(Sorting)

// class Solution{
//     public int majorityElement(int nums[]){
//         int n = nums.length;
//         Arrays.sort(nums);
//         int freq = 1, ans = nums[0];
//         for(int i=1; i<n; i++){
//             if(nums[i] == nums[i-1])
//                 freq++;
//             else{
//                 freq = 1;
//                 ans = nums[i];
//             }
//             if(freq > n/2)
//                 return ans;
//         }
//         return ans;
//     }
// }