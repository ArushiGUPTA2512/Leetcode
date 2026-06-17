class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        while(true){
            slow = nums[slow];
            fast = nums[nums[fast]];
            if(slow == fast)
                break;
        }
        slow = nums[0];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}

// O(N)  Space: O(N)
// class Solution {
//     public int findDuplicate(int[] nums) {
//         int n = nums.length;
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for(int i=0; i<n; i++){
//             map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
//             if(map.get(nums[i]) == 2)
//                 return nums[i];
//         }
//         return -1;
//     }
// }

//O(N^2)  space: O(1)
// class Solution {
//     public int findDuplicate(int[] nums) {
//         int n = nums.length;
//         for(int i=0; i<n; i++){
//             for(int j = i+1; j<n; j++){
//                 if(nums[i] == nums[j])
//                     return nums[i];
//             }
//         }
//         return -1;
//     }
// }