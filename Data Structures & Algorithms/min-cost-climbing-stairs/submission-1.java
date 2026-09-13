class Solution {
    
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length+1];
        Arrays.fill(dp,-1);
        dp[0]=cost[0];
        dp[1]=cost[1];
        return cost(cost.length,cost, dp);
        
    }
    public int cost(int idx, int[] list, int[] dp){
        if(idx==0||idx==1) return list[idx];
        if(dp[idx]!=-1) return dp[idx];
        int left = cost(idx-1, list, dp);
        int right = cost(idx-2, list, dp);
        
        if(idx<list.length){
            dp[idx] = Math.min(left+list[idx],right+list[idx]);
            return dp[idx];
        }
        dp[idx]= Math.min(left,right);
        return dp[idx];
    }
}
