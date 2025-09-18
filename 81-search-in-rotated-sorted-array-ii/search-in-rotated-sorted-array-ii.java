class Solution {
    public boolean search(int[] nums, int target) {
         int left = 0, right = nums.length - 1;
         boolean ans = false;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) return true;
            // if start, mid and end are at same index then we will trim down
            if(nums[left] == nums[mid] && nums[mid]==nums[right]){
                left++;
                right--;
            }
            // left side is sorted
            else if (nums[left] <= nums[mid]) {
                //can ans be found in left side
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1; 
                } else {
                    left = mid + 1;
                }
            }
            else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1; 
                } else {
                    right = mid - 1; 
                }
            }
        }

        return ans; 
    }
}
