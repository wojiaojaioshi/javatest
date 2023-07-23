public class 卖卖股票 {
    public int maxProfit(int[] prices) {
        int minx=0;
        int maxv=Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if(prices[minx]>prices[i])minx=i;
            maxv=Math.max(maxv, prices[i]-prices[minx]);
        }
        return maxv;
    }
}
