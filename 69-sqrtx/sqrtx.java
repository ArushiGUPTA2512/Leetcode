class Solution {
    public int mySqrt(int x) {
         if (x == 0) return 0; // Base case

        long y = x; // Start with x as the initial guess
        while (y * y > x) {
            y = (y + x / y) / 2; // Newton's formula
        }
        return (int) y; 
    }
}