class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
         HashSet<Integer> window = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                window.remove(nums[i - k - 1]); // Maintain window of size k
            }
            if (!window.add(nums[i])) {
                return true; // Duplicate found within range k
            }
        }

        return false;
        /*HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int prevIndex = map.get(nums[i]);
                if (i - prevIndex <= k) {
                    return true;
                }
            }
            map.put(nums[i], i); // Update the index of the current element
        }
        
        return false;*/
    }
}