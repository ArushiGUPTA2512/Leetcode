class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        HashMap<Integer, Integer> firstIndex = new HashMap<>();
        HashMap<Integer, Integer> lastIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];
            count.put(num, count.getOrDefault(num, 0) + 1);

            if (!firstIndex.containsKey(num)) {
                firstIndex.put(num, i);
            }
            lastIndex.put(num, i);
        }

        int degree = 0;
        for (int freq : count.values()) {
            degree = Math.max(degree, freq);
        }

        int ans = nums.length;
        for (int num : count.keySet()) {

            if (count.get(num) == degree) {
                int length = lastIndex.get(num) - firstIndex.get(num) + 1;
                ans = Math.min(ans, length);
            }
        }
        return ans;
    }
}