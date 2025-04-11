class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num <= 1) {
            return false;
        }

        int sum = 1; 
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum += i;
                int otherDivisor = num / i;
                if (otherDivisor != i) {
                    sum += otherDivisor;
                }
            }
        }

        return sum == num; 
    } 
}