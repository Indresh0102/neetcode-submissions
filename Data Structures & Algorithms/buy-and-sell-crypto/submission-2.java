class Solution {
    public int maxProfit(int[] prices) {
        int l=0,r=0,maxp=0;
        while(r<prices.length)
        {
            if(prices[r]>prices[l])
            {
                maxp = Math.max(maxp,prices[r]-prices[l]);
                r++;
            }
            else{
                l=r;
                r++;
            }
        }
        return maxp;
    }
}
