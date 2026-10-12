class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        map.put(0, -1);
        for(int i=0; i<nums.length; i++){
            prefixSum = (prefixSum + nums[i])%k;
            if(map.containsKey(prefixSum)){
                if(i - map.get(prefixSum) >= 2)
                    return true;
            }
            else{
                map.put(prefixSum, i);
            }
        }
        return false;
    }
}