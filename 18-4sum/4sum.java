class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int first =0; first<n-3; first++){
            if(first > 0 && nums[first] == nums[first-1]) continue;
            for(int second = first+1; second<n-2; second++){
                if(second > first+1 && nums[second] == nums[second-1]) continue;
                long remTarget = (long)target - nums[first] - nums[second];
                int left = second+1, right = n-1;
                while(left < right){
                    int sum = nums[left] + nums[right];
                    if(sum == remTarget){
                        result.add(Arrays.asList(nums[first], nums[second], nums[left], nums[right]));
                        int prevLeft = nums[left], prevRight = nums[right];
                        while(left < right && nums[left] == prevLeft) left++;
                        while(left < right && nums[right] == prevRight) right--;
                    }
                    else if(sum < remTarget) left++;
                    else right--;
                }
            }
        }
        return result;
    }
}

//NAIVE APPROACH
// class Solution {
//    public List<List<Integer>> fourSum(int[] nums, int target) {
//        Set<List<Integer>> uniqueQuadruplets = new HashSet<>();
//        List<List<Integer>> result = new ArrayList<>();
//        int n = nums.length;
//        Arrays.sort(nums); 
//        for (int i = 0; i < n-3; i++) {
//            for (int j = i + 1; j < n-2; j++) {
//                for (int k = j + 1; k < n-1; k++) {
//                    for (int l = k + 1; l < n; l++) {
//                        long sum = (long) nums[i] + nums[j] + nums[k] + nums[l]; 
//                        if (sum == target) {
//                            uniqueQuadruplets.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
//                        }
//                    }
//                }
//            }
//        }
//        result.addAll(uniqueQuadruplets);
//        return result;
//    }
// }