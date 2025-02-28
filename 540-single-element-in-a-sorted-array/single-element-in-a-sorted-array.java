class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            
            // Ensure mid is even for checking pairs
            if (mid % 2 == 1) {
                mid--;
            }

            // If nums[mid] == nums[mid + 1], the single element is on the right half
            if (nums[mid] == nums[mid + 1]) {
                left = mid + 2;
            } else {
                right = mid;
            }
        }

        return nums[left]; // Left will point to the single element
    }
}



/*class Solution {
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
}*/