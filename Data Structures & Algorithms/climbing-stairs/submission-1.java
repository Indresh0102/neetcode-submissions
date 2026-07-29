class Solution {
    int[] dp = new int[46];
    public int climbStairs(int n) {
        this.dp = new int[46];
        Arrays.fill(this.dp,-1);
        return dfs(n);
    }
    public int dfs(int n){
        if(n==0 || n==1){
            return 1;
        }
        if(this.dp[n]!=-1){
            return this.dp[n];
        }
        this.dp[n-1] = dfs(n-1);
        this.dp[n-2] = dfs(n-2);
        return this.dp[n-1]+this.dp[n-2];
    }
}
