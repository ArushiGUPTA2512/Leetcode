class Solution {
    public int mySqrt(int x) {
         if (x == 0 || x == 1) return x; // Base cases

        int left = 1, right = x, ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Avoid overflow
            if (mid <= x / mid) { // Instead of mid * mid to prevent overflow
                ans = mid; // Store potential answer
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return ans; 
    }
}