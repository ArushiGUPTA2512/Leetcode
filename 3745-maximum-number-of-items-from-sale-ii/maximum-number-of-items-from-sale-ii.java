class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n = items.length;

        Arrays.sort(items, (a, b) -> Integer.compare(a[1], b[1]));

        int maxFactor = 0;
        for (int[] item : items) {
            maxFactor = Math.max(maxFactor, item[0]);
        }

        int[] freq = new int[maxFactor + 1];

        for (int[] item : items) {
            freq[item[0]]++;
        }

        for (int i = 1; i <= maxFactor; i++) {
            for (int j = 2 * i; j <= maxFactor; j += i) {
                freq[i] += freq[j];
            }
        }

        int minPrice = items[0][1];
        int remaining = budget;
        int answer = 0;

        for (int[] item : items) {
            int factor = item[0];
            int price = item[1];

            if ((long) price > 2L * minPrice) {
                break;
            }

            int freeCount = freq[factor] - 1;
            int take = Math.min(freeCount, remaining / price);

            answer += 2 * take;
            remaining -= take * price;
        }

        answer += remaining / minPrice;
        return answer;
    }
}