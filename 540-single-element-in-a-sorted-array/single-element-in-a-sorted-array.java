class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int count,pos=0;
        for(int i=0;i<n-1;i+=2){
            if(nums[i]!=nums[i+1]){
                //count=0;
                 return nums[i];
                //break;
            }
        }
        return nums[n-1];
    }
}