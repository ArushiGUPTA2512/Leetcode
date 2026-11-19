
class Solution {
    public long countNonDecreasingSubarrays(int[] nums, int k) {
        int n = nums.length;

        Deque<Integer> dq = new ArrayDeque<>();

        long cost = 0;
        long ans = 0;

        int right = n - 1;

        for (int left = n - 1; left >= 0; left--) {

            int num = nums[left];

            while (!dq.isEmpty() &&
                   nums[dq.peekLast()] < num) {

                int idx = dq.pollLast();

                int end = dq.isEmpty()
                        ? right + 1
                        : dq.peekLast();

                cost += (long) (num - nums[idx])
                        * (end - idx);
            }

            dq.offerLast(left);

            while (cost > k) {

                int idx = dq.peekFirst();

                cost -= (long) (nums[idx] - nums[right]);

                if (idx == right) {
                    dq.pollFirst();
                }

                right--;
            }

            ans += right - left + 1;
        }

        return ans;
    }
}
