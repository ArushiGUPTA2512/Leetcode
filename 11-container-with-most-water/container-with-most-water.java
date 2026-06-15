class Solution{
    public int maxArea(int height[]){
        int lp = 0, rp = height.length-1;
        int maxWater = 0;
        while(lp < rp){
            int width = rp - lp;
            int ht = Math.min(height[lp], height[rp]);
            int area = width * ht;
            maxWater = Math.max(maxWater, area);
            if(height[lp] < height[rp])
                lp++;
            else
                rp--;
        }
        return maxWater;
    }
}


//Brute force : Time limit exceed(TLE)--> O(n^2) --> (10^5)^2
// class Solution {
//     public int maxArea(int[] height) {
//       int maxWater = 0;
//       for(int i=0; i<height.length; i++){
//         for(int j=i+1; j<height.length; j++){
//             int w = j-i;
//             int h = Math.min(height[i], height[j]);
//             int area = w*h;
//             maxWater = Math.max(maxWater, area);
//         }
//       }  
//       return maxWater;
//     }
// }