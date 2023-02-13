package Array;

// tag:数组,动态规划
public class T121 {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        int a = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (prices[i] < a) {
                a = prices[i];
            }

            if (prices[i] - a > ans) {
                ans = prices[i] - a;
            }
        }

        return ans;
    }
}
