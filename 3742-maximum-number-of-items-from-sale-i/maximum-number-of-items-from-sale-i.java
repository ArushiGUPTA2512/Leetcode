class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n = items.length;
        int[] benefit = new int[n];

        for (int i = 0; i < n; i++) {
            benefit[i] = 1;
            for (int j = 0; j < n; j++) {
                if (i != j && items[j][0] % items[i][0] == 0) {
                    benefit[i]++;
                }
            }
        }

        int neg = -1000000000;
        int[] dp0 = new int[budget + 1];
        Arrays.fill(dp0, neg);
        dp0[0] = 0;

        int ans = 0;

        for (int price = 1500; price >= 1; price--) {
            int[] dp1 = new int[budget + 1];
            Arrays.fill(dp1, neg);

            for (int i = 0; i < n; i++) {
                if (items[i][1] != price) continue;

                int cost = price;
                int value = benefit[i];

                for (int j = budget; j >= cost; j--) {
                    if (dp0[j - cost] != neg) {
                        dp1[j] = Math.max(dp1[j], dp0[j - cost] + value);
                    }

                    if (dp1[j - cost] != neg) {
                        dp1[j] = Math.max(dp1[j], dp1[j - cost] + value);
                    }
                }
            }

            for (int j = 0; j <= budget; j++) {
                if (dp1[j] != neg) {
                    ans = Math.max(ans, dp1[j] + (budget - j) / price);
                }
            }

            for (int j = 0; j <= budget; j++) {
                dp0[j] = Math.max(dp0[j], dp1[j]);
            }
        }

        return ans;
    }
}
