class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        int maxDiff = 0;
        int[] diff = new int[n];

        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            maxDiff = Math.max(maxDiff, diff[i]);
        }

        long[] freq = new long[maxDiff + 1];
        for (int d : diff) {
            freq[d]++;
        }

        long operations = (long) k1 + k2;
        for (int d = maxDiff; d > 0 && operations > 0; d--) {
            long take = Math.min(freq[d], operations);

            freq[d] -= take;
            freq[d - 1] += take;
            operations -= take;
        }

        long answer = 0;
        for (int d = 1; d <= maxDiff; d++) {
            answer += freq[d] * d * d;
        }
        return answer;
    }
}