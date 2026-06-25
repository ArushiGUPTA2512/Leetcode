class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        backtrack(candidates, target, 0, cur, result);
        return result;
    }

    private void backtrack(int candidates[], int target, int start, List<Integer> cur, List<List<Integer>> result){
        if(target == 0){
            result.add(new ArrayList<>(cur));
            return;
        } 
        for(int i=start; i<candidates.length; i++){
            if(target<candidates[i])
                break;
            cur.add(candidates[i]);
            backtrack(candidates, target-candidates[i], i, cur, result);
            cur.remove(cur.size()-1);
        }
    }
}