/*
121. Best time to buy and sell stock.

https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/?envType=study-plan-v2&envId=top-interview-150

*/

class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 1) return 0;

        int currentMin = prices[0];
        int ans = 0;

        for(int i = 1; i < prices.length; i++) {
            if(prices[i] < currentMin) {
                currentMin = prices[i];
            } else {
                ans = Math.max(ans, prices[i] - currentMin);
            }
        }

        return ans;
    }
}
