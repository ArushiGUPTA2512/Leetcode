/*class Solution {
    public int reverse(int x) {
        int r=0;
        // int n=x;
      while(x!=0)  {
        int d=x%10;
         if(r > Integer.MAX_VALUE/10 || r < Integer.MIN_VALUE/10){
            return 0;
         }
        r*=10+d;
        x/=10;
      }
      return r;
      /*if(x<0){
        r=(-1)*r;
        return r;
        
      }
      else{
        // r=(-1)*r;
        return r;
      }
      }
      }*/
      
      class Solution {
    public int reverse(int x) {
        int r = 0;
        while (x != 0) {
            int d = x % 10;  // Extract the last digit of x
            // Check for overflow before updating r
            if (r > Integer.MAX_VALUE / 10 || r < Integer.MIN_VALUE / 10) {
                return 0;
            }
            r = r * 10 + d;  // Append the digit to r
            x /= 10;  // Remove the last digit from x
        }
        return r;  // Return the reversed integer
    }
}

