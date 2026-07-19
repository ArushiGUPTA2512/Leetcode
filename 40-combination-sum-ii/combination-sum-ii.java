class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        backtracks(candidates, target, 0, cur, result);
        return result;
    }

    private void backtracks(int candidates[], int target, int start, List<Integer> cur, List<List<Integer>> result){
        if(target == 0){
            result.add(new ArrayList<>(cur));
            return;
        }
        for(int i=start; i<candidates.length; i++){
            if(start < i && candidates[i] == candidates[i-1])
                continue;
            if(target < candidates[i])
                break;
            cur.add(candidates[i]);
            backtracks(candidates, target-candidates[i], i+1, cur, result);
            cur.remove(cur.size()-1);
        }
    }
}