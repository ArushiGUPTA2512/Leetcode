//O(n^2)

class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        String rev = new StringBuilder(s).reverse().toString();
        int dp[][] = new int[n+1][n+1];
        for(int i=1; i<=n; i++){
            for(int j =1; j<=n; j++){
                if(s.charAt(i-1) == rev.charAt(j-1))
                    dp[i][j] = 1+dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[n][n]; 
    }
}

//O(n)--> More optimized
// class Solution {
//     public int longestPalindromeSubseq(String s) {
//         int n = s.length();
//         String rev = new StringBuilder(s).reverse().toString();
//         int[] dp = new int[n + 1];
//         for (int i = 1; i <= n; i++) {
//             int diagonal = 0;
//             for (int j = 1; j <= n; j++) {
//                 int temp = dp[j];
//                 if (s.charAt(i - 1) == rev.charAt(j - 1)) {
//                     dp[j] = diagonal + 1;
//                 } else {
//                     dp[j] = Math.max(dp[j], dp[j - 1]);
//                 }
//                 diagonal = temp;
//             }
//         }
//         return dp[n];
//     }
// }