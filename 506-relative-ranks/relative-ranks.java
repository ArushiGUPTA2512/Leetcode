class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] ans = new String[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(score[i], i);
        }
        Arrays.sort(score);
        for (int i = n - 1; i >= 0; i--) {

            int index = map.get(score[i]);
            int rank = n - i;

            if (rank == 1)
                ans[index] = "Gold Medal";
            else if (rank == 2)
                ans[index] = "Silver Medal";
            else if (rank == 3)
                ans[index] = "Bronze Medal";
            else
                ans[index] = String.valueOf(rank);
        }

        return ans;
    }
}