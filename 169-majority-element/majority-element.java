class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums); // O(n log n)
        return nums[nums.length / 2]; 
    }
}