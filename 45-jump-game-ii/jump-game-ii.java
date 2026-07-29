class Solution {
    public int jump(int[] nums) {
        int jumps = 0, end = 0, maxReach = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            maxReach = Math.max(maxReach, i + nums[i]);

            if (i == end) {
                jumps++;
                end = maxReach;
            }
        }
        return jumps;
    }
}