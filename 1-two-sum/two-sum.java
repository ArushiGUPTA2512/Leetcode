class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            map.put(nums[i], i);
        }
        
        return new int[0] ; 
        /*int n=nums.length;
        int t[]=new int[2];
       for(int i=0;i<n-1;i++)
       {
        for(int j=i+1;j<n;j++)
        {
            if(nums[i]+nums[j]==target){
                t[0]=i;
                t[1]=j;
            }

        }
       } 
       return t;*/
    }
}

