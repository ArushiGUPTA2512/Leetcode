class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer> set = new HashSet<>();
        int n = grid.length;
        int repeated = -1, actualSum = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                actualSum += grid[i][j];
                if(set.contains(grid[i][j]))
                    repeated = grid[i][j];
                set.add(grid[i][j]);
            }
        }
        int expSum = (n*n)*(n*n + 1)/2;
        int missing = expSum + repeated - actualSum;
        return new int[]{repeated, missing};
    }
}


// class Solution {
//     public int[] findMissingAndRepeatedValues(int[][] grid) {
//         HashSet<Integer> set = new HashSet<>();
//         int n = grid.length;
//         int repeated = -1, missing = -1;
//         for(int i=0; i<n; i++){
//             for(int j=0; j<n; j++){
//                 if(set.contains(grid[i][j]))
//                     repeated = grid[i][j];
//                 set.add(grid[i][j]);
//             }
//         }
//         for(int i=1; i<=n*n; i++){
//             if(!set.contains(i)){
//                 missing = i;
//                 break;
//             }
//         }
//         return new int[]{repeated, missing};
//     }
// }