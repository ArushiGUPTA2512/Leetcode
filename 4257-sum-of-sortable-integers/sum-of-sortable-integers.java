class Solution {
    public int sortableIntegers(int[] nums) {
        int n = nums.length;
        int answer = 0;

        for (int k = 1; k <= n; k++) {
            if (n % k != 0) {
                continue;
            }

            boolean valid = true;
            int prevMax = Integer.MIN_VALUE;

            for (int start = 0; start < n; start += k) {
                int end = start + k;
                int descents = 0;
                int min = nums[start];
                int max = nums[start];

                for (int i = start; i < end; i++) {
                    min = Math.min(min, nums[i]);
                    max = Math.max(max, nums[i]);

                    if (i > start && nums[i - 1] > nums[i]) {
                        descents++;
                    }
                }

                // Include the circular boundary
                if (nums[end - 1] > nums[start]) {
                    descents++;
                }

                // Block must be rotatable into sorted order
                if (descents > 1 || prevMax > min) {
                    valid = false;
                    break;
                }

                prevMax = max;
            }

            if (valid) {
                answer += k;
            }
        }

        return answer;
    }
}