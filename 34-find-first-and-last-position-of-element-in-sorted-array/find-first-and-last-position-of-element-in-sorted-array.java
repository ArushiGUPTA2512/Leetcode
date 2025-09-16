class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[] = new int[2];
        int first = binarySearch(nums, target, true);
        int last = binarySearch(nums, target, false);
        res[0] = first;
        res[1] = last;
        return res;

    }
    static int binarySearch(int arr[], int target, boolean isFirst){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                ans = mid;
                if(isFirst){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else if(arr[mid]< target)
                start = mid+1;
            else
                end = mid-1;
        }
        return ans;
    }
/*class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{findFirst(nums, target), findLast(nums, target)};
    }
    
    private int findFirst(int[] nums, int target) {
        int left = 0, right = nums.length - 1, first = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            if (nums[mid] == target) first = mid;
        }
        return first;
    }
    
    private int findLast(int[] nums, int target) {
        int left = 0, right = nums.length - 1, last = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            if (nums[mid] == target) last = mid;
        }
        return last;
    }*/
}